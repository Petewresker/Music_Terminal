package main;

public class MusicFile {
    
    private String Filepath;
    private String Title;
    private String Artist;

    public MusicFile( String Filepath , String Title , String Artist ){
        this.Filepath = Filepath;
        this.Title = Title;
        this.Artist = Artist;
    }

    public String getFilepath(){
        return Filepath;
    }

    public String getTitle(){
        return Title;
    }

    public String getArtist(){
        return Artist;
    }
}
