package streaming.models;

public class Music extends Audio {
    private String singer;
    private String album;
    private String genre;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getRate() {
        if (this.getTotalOfPlays() >= 100){
            return 10;
        } else {
            return 8;
        }
    }
}
