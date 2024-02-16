package streaming.models;

public class Favorite {
    public void include(Audio audio){
        if(audio.getRate() >= 9) {
            System.out.println(audio.getTitle() + " is trending");
        } else {
            System.out.println(audio.getTitle() + " isn't trending yet.");
        }
    }
}
