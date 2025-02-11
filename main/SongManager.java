package main;
import java.io.File;
import java.util.Scanner;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SongManager {
    
    private PlayList playList;

    public SongManager(){
        this.playList = new PlayList();
    } 

    public void addSongToPlaylist(String Filepath , String Title , String Artist){
        MusicFile musicFile = new MusicFile(Filepath, Title, Artist);
        playList.addSong(musicFile);
    }

    public void DisplayPlaylist(){
        clearScreen();
        playList.showPlaylist();
    }

    public void Process() {
    clearScreen();
    DisplayPlaylist();
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("");
    System.out.print("What song you want to Listen : ");
    int songIndex = scanner.nextInt();
    
    //Playing a song by media.
}

    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
     

    //Import from youtube -_-
    private void playsong(String filename){
        String path = getClass().getResource(filename).getPath();
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();
    }

}
