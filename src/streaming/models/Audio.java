package streaming.models;

public class Audio {
    private String title;
    private int totalOfPlays;
    private int totalOfLikes;
    private int rate;

    public java.lang.String getTitle() {
        return title;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public int getTotalOfPlays() {
        return totalOfPlays;
    }

    public int getTotalOfLikes() {
        return totalOfLikes;
    }

    public int getRate() {
        return rate;
    }

    public void like(){
        this.totalOfLikes++;
    }

    public void play(){
        this.totalOfPlays++;
    }
}
