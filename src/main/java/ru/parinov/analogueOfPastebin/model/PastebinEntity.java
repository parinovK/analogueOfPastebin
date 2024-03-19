package ru.parinov.analogueOfPastebin.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PastebinEntity {
    private long id;
    private String data;
    private String hash;
    private LocalDateTime expirationTime;
    private boolean isPublic;
}
