package com.fahim.androidchatgpt.network;// OpenRouterAPI.java
import com.fahim.androidchatgpt.model.ChatRequest;
import com.fahim.androidchatgpt.model.ChatResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface OpenRouterAPI {
    @POST("chat/completions")
    Call<ChatResponse> sendChatRequest(
        @Header("Authorization") String authorization,
        @Header("Content-Type") String contentType,
        @Body ChatRequest request
    );
}
