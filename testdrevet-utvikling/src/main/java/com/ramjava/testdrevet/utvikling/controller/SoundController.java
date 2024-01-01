package com.ramjava.testdrevet.utvikling.controller;

import com.ramjava.testdrevet.utvikling.model.Sounds;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sounds")
public class SoundController {
    @GetMapping
    public List<Sounds> getAllSounds() {
        // Send a list of sounds
        // Refaktorer dette ved å hente data fra Service og DAO-lag
        List<Sounds> sounds = new ArrayList<>();
        sounds.add(new Sounds(1,
                "Angry Aryans", "Browntown is Burning Down", "https://resistancemusic.com", "https://resistancemusic.com/152/2424"));
        sounds.add(new Sounds(2,
                "Achtung Juden", "Let The N****** Kill Each Other", "https://resistancemusic.com", "https://resistancemusic.com/153/2425"));
        sounds.add(new Sounds(3,
                "Filopatria", "Άγια Νύχτα (Holy Night)", "https://resistancemusic.com", "https://resistancemusic.com/154/2426"));
        return sounds;
    }
}
