package ru.parinov.analogueOfPastebin.service;

import ru.parinov.analogueOfPastebin.model.PastebinRequestModel;
import ru.parinov.analogueOfPastebin.model.PastebinResponseModel;
import ru.parinov.analogueOfPastebin.model.PastebinUrlResponse;

import java.util.List;

public interface PastebinService {
    PastebinResponseModel getByHash(String hash);
    List<PastebinResponseModel> getFirstPublicPastebins(int amount);
    PastebinUrlResponse create(PastebinRequestModel request);
}
