package ru.parinov.analogueOfPastebin.controller;

import ru.parinov.analogueOfPastebin.model.PastebinRequestModel;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pastebin")
public class PastebinController {
    @GetMapping
    public List<String> getPasteOfList(){
        return Collections.emptyList();
    }

    @GetMapping("{hash}")
    public String getByHash(@PathVariable String hash){
        return hash;
    }

    @PostMapping("save_paste")
    public String add (@RequestBody PastebinRequestModel pastebin){
        return pastebin.getData();
    }
}
