package streaming.main;

import streaming.models.Favorite;
import streaming.models.Music;
import streaming.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Yes, And?");
        myMusic.setSinger("Ariana Grande");
        myMusic.setAlbum("Eternal Sunshine");
        myMusic.setGenre("Pop");

        for (int i = 0; i < 100; i++) {
            myMusic.play();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Bolha Dev");
        myPodcast.setDescription("Podcast for Developers");
        myPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 30; i++) {
            myPodcast.play();
        }

        Favorite myFavorite = new Favorite();
        myFavorite.include(myMusic);
        myFavorite.include(myPodcast);
    }
}
