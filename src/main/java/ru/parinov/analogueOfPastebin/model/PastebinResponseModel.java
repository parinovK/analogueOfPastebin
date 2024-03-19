package ru.parinov.analogueOfPastebin.model;

import lombok.Data;

@Data
public class PastebinResponseModel {
    private String data;
    private PublicStatus status;
}
