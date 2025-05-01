package cn.shuchang.sc.dev.tech.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

public interface IAiService {

    ChatResponse generate(String moedl, String message);

    Flux<ChatResponse> generateStream(String moedl, String message);
}
