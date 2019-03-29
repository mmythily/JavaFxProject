package RockPaperScissor_Mythily;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class Controller_RPS_Mythily {
    public ImageView rockU_Mythily, paperU_Mythily, scissorU_Mythily, compCanvas_Mythily;
    public Label lbl_winner_Mythily, lbl_userScore_Mythily, lbl_compScore_Mythily;
    public Button btn_reset_Mythily, btn_cancel_Mythily;

    private int userChose_Mythily;
    private int compChose_Mythily;

    private int userScore_Mythily = 0;
    private int compScore_Mythily = 0;

    public int userChoice_Mythily(MouseEvent user) {

        ImageView im = (ImageView) user.getSource();
        //Which image did the user pick? Rock? Paper? Sciccor?
        if (im == rockU_Mythily) {
            userChose_Mythily = 1; //Rock
        } else if (im == paperU_Mythily) {
            userChose_Mythily = 2; //Paper
        } else if (im == scissorU_Mythily) {
            userChose_Mythily = 3; //Scissor
        }
        return userChose_Mythily;
        // returns 1,2, or 3 corresponding to the 'hand'
    }

    public void compChoice_Mythily(MouseEvent e) {
        //Creating computer hands of rock, paper and scissors
        compChose_Mythily = (int) (Math.random() * 3) + 1;

        //Setting the image based on what the computer chose randomly
        if (compChose_Mythily == 1) {
            compCanvas_Mythily.setImage(new Image(getClass().getResource("images/cRock.jpg").toExternalForm()));
        } else if (compChose_Mythily == 2) {
            compCanvas_Mythily.setImage(new Image(getClass().getResource("images/cPaper.jpg").toExternalForm()));
        } else if (compChose_Mythily == 3) {
            compCanvas_Mythily.setImage(new Image(getClass().getResource("images/cScissor.jpg").toExternalForm()));
        }

                //WHOSE HAND WINS??
        //the combinations when user hand wins
        if ((compChose_Mythily == 1 && userChose_Mythily == 2) || (compChose_Mythily == 2 && userChose_Mythily == 3) ||
                (compChose_Mythily == 3 && userChose_Mythily == 1)) {
            userScore_Mythily += 1;
        }
        //the combinations when computer hand wins
        else if ((compChose_Mythily == 2 && userChose_Mythily == 1) || (compChose_Mythily == 3 && userChose_Mythily == 2) ||
                (compChose_Mythily == 1 && userChose_Mythily == 3)) {
            compScore_Mythily += 1;
        }
        // no need to mention when user and computer choose same hand


                //POLLUTING THE LABELS BASED ON RESULTS
        if (userScore_Mythily > compScore_Mythily) {
            lbl_winner_Mythily.setText("You are winning");
        } else if (compScore_Mythily > userScore_Mythily) {
            lbl_winner_Mythily.setText("Computer is winning");
        } else {
            lbl_winner_Mythily.setText("It's a tie");
        }

        lbl_userScore_Mythily.setText("You scored: " + userScore_Mythily);
        lbl_compScore_Mythily.setText("Computer scored: " + compScore_Mythily);
    }

    public void reset_Mythily(ActionEvent e){
        lbl_winner_Mythily.setText("Who is winning? ");
        lbl_userScore_Mythily.setText("You scored: ");
        lbl_compScore_Mythily.setText("Computer scored: ");
        userScore_Mythily = 0;
        compScore_Mythily = 0;
        compCanvas_Mythily.setImage(new Image(getClass().getResource("images/Ask.jpg").toExternalForm()));

    }

    public void close_Mythily(ActionEvent e){
        Stage stage_Mythily = (Stage)btn_cancel_Mythily.getScene().getWindow();
        stage_Mythily.close();
    }


}