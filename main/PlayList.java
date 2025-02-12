package main;

import java.util.ArrayList;

public class PlayList {
    private ArrayList<MusicFile> songs;
    private String Genre;

    public PlayList(String Genre) {
        songs = new ArrayList<>();
        this.Genre = Genre;
    }

    public void addSong(MusicFile song) {
        songs.add(song);
    }

    public void removeSong(MusicFile song) {
        songs.remove(song);
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

    public String getGenre(){
        return Genre;
    }
}