package ImageView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller_Bulb {
    public ImageView iv_Canvas;
    public Button btn_on, btn_off;
    public void showPic (ActionEvent e){
        Button b = (Button)e.getSource();
        switch (b.getText()){
            case "ON":
                iv_Canvas.setImage(new Image(getClass().getResource("images/gBulb.jpg").toExternalForm()));
                break;
            case "OFF":
                iv_Canvas.setImage(new Image(getClass().getResource("images/bulb.jpg").toExternalForm()));
                break;

        }
    }


}
