package ImageView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import javafx.scene.input.MouseEvent;

public class Controller_Emojis {
    public ImageView iv_Canvas;

        public void changePic(MouseEvent e){
            iv_Canvas.setImage(new Image(getClass().getResource("images/Happy.jpg").toExternalForm()));
        }
        public void changePic1(MouseEvent e){
            iv_Canvas.setImage(new Image(getClass().getResource("images/Sad.jpg").toExternalForm()));
        }
}
