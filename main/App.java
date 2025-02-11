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
        songManager.addSongToPlaylist("resource/Music.wav", "Time & Life", "Mitty");
        songManager.addSongToPlaylist("resource/Music.wav", "SkyLab Plan", "Daniel Pimberton");
        songManager.addSongToPlaylist("resource/Music.wav", "stay", "Interstallar");
    }
    

    public void Start(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("--------------------------------------------------------------------");
            System.out.println("   ___                                     _____             ");
            System.out.println("  |_  |                                   |_   _|            ");
            System.out.println("    | | __ _ _ __ ___   ___  _ __  _   _    | | _ __   ___   ");
            System.out.println("    | |/ _` | '_ ` _ \\ / _ \\| '_ \\| | | |   | || '_ \\ / __|  ");
            System.out.println("/\\__/ / (_| | | | | | | (_) | | | | |_| |  _| || | | | (__ _ ");
            System.out.println("\\____/ \\__,_|_| |_| |_|\\___/|_| |_|\\__, |  \\___/_| |_|\\___(_)");
            System.out.println("                                    __/ |                    ");
            System.out.println("                                   |___/                     ");

            System.out.println("");
            System.out.println("                         Your's heart are just beatbox of your LIFE.");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("1. Play a song");
            System.out.println("2. Closed app");
            System.out.println("3. Instruction Manaul");

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