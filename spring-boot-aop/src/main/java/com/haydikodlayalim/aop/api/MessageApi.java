package com.haydikodlayalim.aop.api;

import com.haydikodlayalim.aop.service.IkinciMesajService;
import com.haydikodlayalim.aop.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageApi {

    private final MessageService messageService;
    private final IkinciMesajService ikinciMesajService;

    public MessageApi(MessageService messageService, IkinciMesajService ikinciMesajService) {
        this.messageService = messageService;
        this.ikinciMesajService = ikinciMesajService;
    }

    @PostMapping
    public ResponseEntity<String> ornekMetod(@RequestBody String message) {
        ikinciMesajService.mesaj(message);
        return ResponseEntity.ok(messageService.mesajVer(message));
    }
}
