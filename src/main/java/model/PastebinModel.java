package model;

import lombok.Data;

@Data
public class PastebinModel {
    private String data;
    private Long ExpirationTimeSeconds;
    private PublicStatus publicStatus;
}
