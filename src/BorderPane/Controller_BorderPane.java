package BorderPane;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;



public class Controller_BorderPane {
    public Button top, bottom, left, right;
    public ImageView arrowCanvas;
    private String s = "";

    public void changeArrow(MouseEvent e){
        //ImageView im = (ImageView) e.getSource();
        Button b = (Button) e.getSource();
        //s=b.getId();

        switch(b.getId()) {
            case "top":
                arrowCanvas.setImage(new Image(getClass().getResource("images/top.jpeg").toExternalForm()));
                break;
            case "bottom":
                arrowCanvas.setImage(new Image(getClass().getResource("images/bottom.jpeg").toExternalForm()));
                break;
                case "left":
                arrowCanvas.setImage(new Image(getClass().getResource("images/left.jpeg").toExternalForm()));
                break;
            case "right":
               arrowCanvas.setImage(new Image(getClass().getResource("images/right.jpeg").toExternalForm()));
                break;

        }
    }
}
