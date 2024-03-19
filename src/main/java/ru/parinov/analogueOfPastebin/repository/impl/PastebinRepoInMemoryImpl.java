package ru.parinov.analogueOfPastebin.repository.impl;

import org.springframework.stereotype.Repository;
import ru.parinov.analogueOfPastebin.exception.NotFoundEntityException;
import ru.parinov.analogueOfPastebin.model.PastebinEntity;
import ru.parinov.analogueOfPastebin.repository.PastebinRepository;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Repository
public class PastebinRepoInMemoryImpl implements PastebinRepository {
    private final Map<String, PastebinEntity> vault = new ConcurrentHashMap<>();
    @Override
    public PastebinEntity getByHash(String hash) {
        PastebinEntity entity = vault.get(hash);
        if (entity == null){
            throw new NotFoundEntityException("Pastebin not found with hash =" + hash);
        }
        return entity;
    }

    @Override
    public List<PastebinEntity> getListOfPublicAndALife(int amount) {
        LocalDateTime now = LocalDateTime.now();
        return vault.values().stream()
                .filter(PastebinEntity::isPublic)
                .filter(entity -> entity.getExpirationTime().isAfter(now))
                .sorted(Comparator.comparing(PastebinEntity::getId).reversed())
                .limit(amount)
                .collect(Collectors.toList());
    }

    @Override
    public void add(PastebinEntity entity) {
        vault.put(entity.getHash(), entity);
    }
}
