package com.example;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;

/**
 * Simple console application that interacts with Ollama using LangChain4J.
 * 
 * Ollama must be running locally on http://localhost:11434
 * Install: curl -fsSL https://ollama.ai/install.sh | sh
 * Run: ollama serve
 * Pull model: ollama pull mistral
 */
public class OpenAIApp {

    public static void main(String[] args) {
        String apiKey = System.getenv("OPENAI_API_KEY");

        ChatModel cmodel = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName(OpenAiChatModelName.GPT_3_5_TURBO)
                .build();

        var answer = cmodel.chat("Why should I learn Java.");
        System.out.println(answer);

        //UserMessage usrmsg = UserMessage.from("Why should I learn Java.");
        //var answer = cmodel.chat(usrmsg);
        //System.out.println(answer.aiMessage().text());
    }
}
