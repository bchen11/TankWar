package bchen11.tankwar;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.File;

class Tools {


    //Tool methods to get image and play audio
    static Image getImage(String imageName) {
        return new ImageIcon("assets/images/" + imageName).getImage();
    }

    static void playAudio(String fileName) {
        Media sound = new Media(new File("assets/audios/" + fileName).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}
