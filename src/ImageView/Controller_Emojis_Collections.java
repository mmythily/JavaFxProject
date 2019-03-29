package ImageView;

import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class Controller_Emojis_Collections {
    public ListView lst_faces;
    public ImageView iv_Canvas;

    public void showPic(MouseEvent e){
        ListView list = (ListView)e.getSource();
        String face = list.getSelectionModel().getSelectedItem().toString();
        switch(face){
            case "Neutral":
                iv_Canvas.setImage(new Image(getClass().getResource("images/Neutral.png").toExternalForm()));
                break;
            case "Happy":
                iv_Canvas.setImage(new Image(getClass().getResource("images/Happy.jpg").toExternalForm()));
                break;
            case "Sad":
                iv_Canvas.setImage(new Image(getClass().getResource("images/Sad.jpg").toExternalForm()));
                break;
        }
    }

}
