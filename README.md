# OpenRouter ChatGPT Android App
## 🤖 AI-Powered Chat Application

<div align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android" />
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Material_Design-757575?style=for-the-badge&logo=material-design&logoColor=white" alt="Material Design" />
  <img src="https://img.shields.io/badge/OpenRouter-FF6B6B?style=for-the-badge" alt="OpenRouter" />
  <img src="https://img.shields.io/badge/ChatGPT-74aa9c?style=for-the-badge&logo=openai&logoColor=white" alt="ChatGPT" />
</div>

<p align="center">
  A modern Android chat application powered by OpenRouter.ai's free ChatGPT model (gpt-oss-120b:free) with voice input, dark mode, and persistent chat history.
</p>


---

## 📱 Screenshots

<div align="center">

| Light Mode | Dark Mode | Voice Input |
|:----------:|:---------:|:-----------:|
| <img src="screenshots/light_mode.png" width="250"> | <img src="screenshots/dark_mode.png" width="250"> | <img src="screenshots/voice_input.png" width="250"> |

| Chat Interface | Settings | Chat History |
|:--------------:|:--------:|:------------:|
| <img src="screenshots/chat_interface.png" width="250"> | <img src="screenshots/settings.png" width="250"> | <img src="screenshots/chat_history.png" width="250"> |

</div>

---

## ✨ Features

### 🚀 Core Features
- **🤖 ChatGPT Integration**: Powered by OpenRouter.ai's free ChatGPT model
- **💬 Modern Chat UI**: Material Design 3 with chat bubbles
- **🎤 Voice Input**: Speech-to-text functionality for hands-free interaction
- **💾 Chat History**: Persistent storage using Room database
- **🌙 Dark Mode**: Full dark theme support
- **📱 Responsive Design**: Optimized for phones and tablets

### 🔧 Advanced Features
- **⚙️ User Preferences**: Customizable settings with SharedPreferences
- **🔍 Message Search**: Search through chat history
- **📤 Export Chats**: Export conversations to text files
- **🎨 Typing Indicators**: Real-time typing animations
- **🔄 Retry Mechanism**: Automatic retry for failed requests
- **🔒 Secure API**: Safe API key management

---

## 🚀 Installation

### Prerequisites
- **Android Studio** (Latest version recommended)
- **Android SDK** API level 24+ (Android 7.0)
- **Java/Kotlin** support
- **OpenRouter.ai** account and API key

### Step 1: Clone the Repository
```
git clone https://github.com/yourusername/openrouter-chatgpt-android.git
cd openrouter-chatgpt-android
```


### Step 4: Build and Run
1. Sync project with Gradle files
2. Connect your Android device or start an emulator
3. Click **Run** or press `Shift + F10`

> [!IMPORTANT]  
> Make sure to add `local.properties` to your `.gitignore` file to keep your API key secure.

---

## 🎯 Usage

### Basic Chat
1. **Launch the app**
2. **Type your message** in the input field
3. **Press Send** or hit Enter
4. **Wait for ChatGPT's response**

### Voice Input
1. **Tap the microphone button** 🎤
2. **Speak your question** clearly
3. **Review the transcribed text**
4. **Send or edit** as needed

### Settings & Customization
1. **Access Settings** from the menu
2. **Toggle dark mode** on/off
3. **Clear chat history** if needed
4. **Adjust voice input preferences**

### Chat Management
- **Long press** messages to copy or delete
- **Pull to refresh** to clear current chat
- **Access chat history** from the menu
- **Export conversations** to share

---

## 🛠️ Tech Stack

### **Frontend**
- **Language**: Java/Kotlin
- **UI Framework**: Android Native
- **Design System**: Material Design 3
- **Layout**: RecyclerView, ConstraintLayout

### **Backend & API**
- **API Provider**: OpenRouter.ai
- **AI Model**: ChatGPT (gpt-oss-120b:free)
- **HTTP Client**: Retrofit 2 + OkHttp3
- **JSON Parsing**: Gson

### **Data & Storage**
- **Local Database**: Room (SQLite)
- **Preferences**: SharedPreferences
- **Architecture**: MVVM with LiveData

### **Key Dependencies**
```
// Retrofit for API calls
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
implementation 'com.squareup.okhttp3:logging-interceptor:4.11.0'

// Material Design
implementation 'com.google.android.material:material:1.10.0'

// Room Database
implementation 'androidx.room:room-runtime:2.6.1'
annotationProcessor 'androidx.room:room-compiler:2.6.1'

// RecyclerView
implementation 'androidx.recyclerview:recyclerview:1.3.2'

// Lifecycle components
implementation 'androidx.lifecycle:lifecycle-livedata:2.7.0'
```
