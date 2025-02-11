package main;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class SongManager {
    
    private PlayList playList;
    private Clip clip;

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

    if(songIndex >= 1 && songIndex < playList.getSize()){
        MusicFile song = playList.getSong(songIndex - 1);
        System.out.println("Now Playing "+song.getTitle() +" By "+ song.getArtist());
        JOptionPane.showMessageDialog(null, "Press ok to stop.");

    }else{
        clearScreen();
    }
    
    //Playing a song by media.
}

    private void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
     

    //Import from youtube -_-
    private void playsong(String filename){
        //Song implement 
        try{
            File musicePath = new File(filename);

            if(musicePath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicePath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }else{
                System.out.println("File isn't exist.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
