package main;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class SongManager {
    
    private PlayList[] playList;
    private int Index;
    private Scanner scanner;
    private Clip clip;

    public SongManager(PlayList[] playList){
        this.playList = playList;
        this.scanner = new Scanner(System.in);
    } 

    public void addSongToPlaylist(String Filepath , String Title , String Artist){
        MusicFile musicFile = new MusicFile(Filepath, Title, Artist);
        playList[Index].addSong(musicFile);
    }

    public void DisplayPlaylist(){
        clearScreen();
        playList[Index].showPlaylist();
    }

    public void Process() {
    clearScreen();
    DisplayPlaylist();

    System.out.println("");
    System.out.print("What song you want to Listen : ");
    int songIndex = scanner.nextInt();

    if(songIndex >= 1 && songIndex < playList[Index].getSize()){
        MusicFile song = playList[Index].getSong(songIndex - 1);
        System.out.println("Now Playing "+song.getTitle() +" By "+ song.getArtist());
        playsong(song.getFilepath());
        JOptionPane.showMessageDialog(null, "Press OK to stop playing");
        
        
        
    }else{
        clearScreen();
    }
    
    //Playing a song by media.
}

    public void clearScreen() {
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
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

            } else {
                System.out.println("File isn't exist.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void DisplayGenre(){
        System.out.println("--------------------------------------------------------------------");
        for(int i = 0 ; i < 2 ; i++)
            System.out.println(i+". "+playList[i].getGenre());

        System.out.print("Which genre you prefer : ");
        int choice = scanner.nextInt();
        if(choice == 1)
            Index = 0;
        else
            Index = 1;
        clearScreen();   
    }

    

}
