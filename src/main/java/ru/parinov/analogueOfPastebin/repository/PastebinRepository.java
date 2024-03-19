package ru.parinov.analogueOfPastebin.repository;

import ru.parinov.analogueOfPastebin.model.PastebinEntity;

import java.util.List;

public interface PastebinRepository {
    PastebinEntity getByHash(String hash);
    List<PastebinEntity> getListOfPublicAndALife(int amount);
    void add(PastebinEntity entity);
}
