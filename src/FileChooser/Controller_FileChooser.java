package FileChooser;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Controller_FileChooser {
    Scanner reader;
    PrintWriter writer;
    FileChooser filepicker = new FileChooser();
    TextArea txt_data;
    public void show(ActionEvent e) throws FileNotFoundException, IOException{
        Button b = (Button)e.getSource();
        switch (b.getText()){
            case "Open Dialog":
                File file = filepicker.showOpenDialog(null);
                if(file!=null){
                    reader = new Scanner (new File(file.toURI()));//uniform resource indicator
                    while(reader.hasNextLine()){
                        txt_data.appendText(reader.nextLine());
                        //txt_data.setText(txt_data.getText()+reader.nextLine());
                    }
                }
                break;

                case "Save Dialog":
                    file = filepicker.showSaveDialog(null);
                    if(file != null){
                        writer = new PrintWriter(new File (file.toURI()));
                        String data = txt_data.getText();
                        System.out.println(data);
                        writer.println(data);
                        writer.close();
                    }
                    break;
        }
    }
}
