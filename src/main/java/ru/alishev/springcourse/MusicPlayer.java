package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;

public class MusicPlayer {
    private Music music;

    //IoC
    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing : " + music.getSong());
    }
}
