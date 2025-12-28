package com.example;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

/**
 * Simple console application that interacts with OpenAI using LangChain4J.
 * 
 * The OpenAI API key should be provided as an environment variable: OPENAI_API_KEY
 */
public class OpenAIApp {

    public static void main(String[] args) {
        // Get the OpenAI API key from environment variable
        String apiKey = System.getenv("OPENAI_API_KEY");
        
        if (apiKey == null || apiKey.isEmpty()) {
            System.err.println("Error: OPENAI_API_KEY environment variable is not set.");
            System.err.println("Please set it with: export OPENAI_API_KEY=your-api-key");
            System.exit(1);
        }
        
        System.out.println("Initializing OpenAI connection...");
        
        // Create the OpenAI chat model
        ChatLanguageModel model = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName("gpt-3.5-turbo")
                .build();
        
        // Send a simple message to OpenAI
        String userMessage = "Hello! Can you tell me a fun fact about Java programming?";
        System.out.println("\nSending message: " + userMessage);
        System.out.println("\nWaiting for response...\n");
        
        String response = model.generate(userMessage);
        
        System.out.println("Response from OpenAI:");
        System.out.println("====================");
        System.out.println(response);
        System.out.println("====================");
    }
}
