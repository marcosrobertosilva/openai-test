# openai-test
Test using OpenAI API in Java

A simple Maven-based Java console application that interacts with OpenAI using LangChain4J.

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher
- OpenAI API Key

## Setup

1. Set your OpenAI API key as an environment variable:
   ```bash
   export OPENAI_API_KEY=your-api-key-here
   ```

## Building the Project

Compile the project:
```bash
mvn clean compile
```

Package the project:
```bash
mvn package
```

## Running the Application

Run the application using Maven:
```bash
mvn exec:java -Dexec.mainClass="com.example.OpenAIApp"
```

Or run the compiled JAR:
```bash
java -cp target/openai-test-1.0-SNAPSHOT.jar com.example.OpenAIApp
```

## How It Works

The application:
1. Reads the OpenAI API key from the `OPENAI_API_KEY` environment variable
2. Initializes a connection to OpenAI using LangChain4J
3. Sends a simple message to the GPT-3.5-turbo model (cost-optimized)
4. Displays the response from OpenAI

## Cost Optimization

This project uses **GPT-3.5 Turbo**, one of the most cost-effective OpenAI models. If you need even cheaper options, consider:
- **GPT-4o mini**: Slightly more capable than GPT-3.5 Turbo
- **Ollama**: Free local alternative for development (see `install-ollama.sh`)

## Dependencies

- **LangChain4J**: Framework for building LLM-powered applications
- **LangChain4J OpenAI**: OpenAI integration for LangChain4J
