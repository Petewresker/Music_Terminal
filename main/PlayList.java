package main;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<MusicFile> songs;

    public PlayList() {
        songs = new ArrayList<>();
    }

    public void addSong(MusicFile song) {
        songs.add(song);
    }

    public void removeSong(MusicFile song) {
        songs.remove(song);
    }

    public MusicFile getNextSong(int index) {
        if (index < songs.size()) {
            return songs.get(index);
        } else {
            return null;
        }
    }

    public void showPlaylist() {
        for (MusicFile song : songs) {
            System.out.println(String.format("%-30s %-20s", song.getTitle(), song.getArtist()));
        }
    }

    public int getSize(){
        return songs.size();
    }

    public MusicFile getSong(int index) {
        return songs.get(index);
    }
}