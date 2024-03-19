package ru.parinov.analogueOfPastebin.service.impl;

import org.springframework.stereotype.Service;
import ru.parinov.analogueOfPastebin.model.PastebinRequestModel;
import ru.parinov.analogueOfPastebin.model.PastebinResponseModel;
import ru.parinov.analogueOfPastebin.model.PastebinUrlResponse;
import ru.parinov.analogueOfPastebin.service.PastebinService;

import java.util.List;

@Service
public class PastebinServiceInMemoryImpl implements PastebinService{
    @Override
    public PastebinResponseModel getByHash(String hash) {
        return null;
    }

    @Override
    public List<PastebinResponseModel> getFirstPublicPastebins(int amount) {
        return null;
    }

    @Override
    public PastebinUrlResponse create(PastebinRequestModel request) {
        return null;
    }
}
