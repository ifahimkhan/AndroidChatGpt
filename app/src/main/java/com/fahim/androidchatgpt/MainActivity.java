package com.fahim.androidchatgpt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.fahim.androidchatgpt.model.ChatRequest;
import com.fahim.androidchatgpt.model.ChatResponse;
import com.fahim.androidchatgpt.model.Message;
import com.fahim.androidchatgpt.network.ApiClient;
import com.fahim.androidchatgpt.network.OpenRouterAPI;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private OpenRouterAPI apiService;
    private EditText promptEditText;
    private ImageButton submitPromptButton;
    private TextView responseTextView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        promptEditText = findViewById(R.id.promptEditText);
        submitPromptButton = findViewById(R.id.sendButton);
        responseTextView = findViewById(R.id.displayTextView);
        progressBar = findViewById(R.id.progressBar);
        apiService = ApiClient.getOpenRouterAPI();
        submitPromptButton.setOnClickListener(v -> {
            String prompt = promptEditText.getText().toString();
            if (!prompt.isEmpty()) {
                progressBar.setVisibility(View.VISIBLE);
                submitPromptButton.setEnabled(false);
                ArrayList<Message> messageArrayList = new ArrayList<>();
                messageArrayList.add(new Message("user", prompt));
                ChatRequest promptRequest = new ChatRequest("openai/gpt-oss-120b:free", messageArrayList);

                apiService.sendChatRequest(BuildConfig.API_KEY, "application/json", promptRequest).enqueue(new Callback<ChatResponse>() {
                    @Override
                    public void onResponse(Call<ChatResponse> call, Response<ChatResponse> response) {
                        progressBar.setVisibility(View.GONE);
                        submitPromptButton.setEnabled(true);
                        if (response.isSuccessful()) {
                            ChatResponse chatResponse = response.body();
                            if (chatResponse != null && chatResponse.getChoices() != null && !chatResponse.getChoices().isEmpty()) {
                                String responseText = chatResponse.getChoices().get(0).getMessage().getContent();
                                responseTextView.setText(TextFormatter.getBoldSpannableText(responseText));
                                promptEditText.setText("");
                            }
                        }

                    }

                    @Override
                    public void onFailure(Call<ChatResponse> call, Throwable t) {
                        progressBar.setVisibility(View.GONE);
                        submitPromptButton.setEnabled(true);
                        responseTextView.setText("Error: " + t.getMessage());
                    }
                });
            }
        });

    }
}