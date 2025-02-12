package main;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        MusicFile song1 = new MusicFile("resource/Last_Christmas.wav","Last Christmas", "Wham!");
        MusicFile song2 = new MusicFile("resource/Last_Christmas.wav", "The way make me feel", "Micheal Jackson");
        MusicFile song3 = new MusicFile("resource/Last_Christmas.wav", "Bird of feather", "Billie Eilish");
        MusicFile song4 = new MusicFile("resource/Last_Christmas.wav", "Symphony No.7", "Beethoven");
        MusicFile song5 = new MusicFile("resource/Last_Christmas.wav", "Cornfield Chase", "Interstellar");

        PlayList[] Track = new PlayList[2];
        PlayList pop = new PlayList("Pop");
        PlayList orchestra = new PlayList("Orchestra");

        pop.addSong(song1);
        pop.addSong(song2);
        pop.addSong(song3);

        orchestra.addSong(song4);
        orchestra.addSong(song5);

        Track[0] = pop;
        Track[1] = orchestra;

        App JaHamony = new App();
        JaHamony.setTrack(Track);
        JaHamony.Start();



    } 
}
