package ImageView;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;



public class Controller_Flags {
    public ImageView iv_Canvas;
    public ComboBox list_flags;

    public void showFlag(ActionEvent e) {
        ComboBox list = (ComboBox) e.getSource();
        String flag = list.getSelectionModel().getSelectedItem().toString();

        switch (flag) {
            case "Canada":
                iv_Canvas.setImage(new Image(getClass().getResource("images/Canada.jpg").toExternalForm()));
                break;
            case "India":
                iv_Canvas.setImage(new Image(getClass().getResource("images/india.jpg").toExternalForm()));
                break;
            case "USA":
                iv_Canvas.setImage(new Image(getClass().getResource("images/USA.jpg").toExternalForm()));
        }
    }
}
