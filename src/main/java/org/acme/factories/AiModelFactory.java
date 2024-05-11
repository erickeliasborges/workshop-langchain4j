package org.acme.factories;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

import java.time.Duration;

public class AiModelFactory {
    public static ChatLanguageModel createLocalChatModel() {
        return OpenAiChatModel.builder()
                .baseUrl("http://localhost:1234/v1")
                .apiKey("ignore")
                .logRequests(true)
                .timeout(Duration.ofSeconds(300))
                .build();
    }

    public static ChatLanguageModel createOpenAIChatModel() {
        // demo é uma chave genérica pra usar o chatGPT para fazer testes
        return OpenAiChatModel.builder()
//                .apiKey(System.getenv("OPENAI_KEY"))
                .apiKey("demo")
                .logRequests(true)
                .build();
    }
}
