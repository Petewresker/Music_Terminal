package main;
import java.util.Scanner;


public class App {

    private SongManager songManager;
    private int Choice;

    public App(){
        this.songManager = new SongManager();
        addSong();
    }

    private void addSong(){
        songManager.addSongToPlaylist("", "Better When I'm Dancin", "Megan");
        songManager.addSongToPlaylist("", "SkyLab Plan", "Daniel Pimberton");
        songManager.addSongToPlaylist("", "Bird of the feather", "Billie Eilish");
    }
    

    public void Start(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Japotify Inc.");
            System.out.println("-------------");
            System.out.println("1. Play a song");
            System.out.println("2. Closed app");

            System.out.print("Which one do you prefer : ");
            Choice = scanner.nextInt();

            switch (Choice) {
                case 1:
                    songManager.Process();
                    break;
                case 2:
                    System.out.println("Closed Program....Bye ^-^");
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    }


}