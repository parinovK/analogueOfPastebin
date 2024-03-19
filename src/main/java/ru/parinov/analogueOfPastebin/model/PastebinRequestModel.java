package ru.parinov.analogueOfPastebin.model;

import lombok.Data;

@Data
public class PastebinRequestModel {
    private String data;
    private Long ExpirationTimeSeconds;
    private PublicStatus publicStatus;
}
