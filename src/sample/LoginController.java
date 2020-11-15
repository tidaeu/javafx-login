package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginController implements Initializable {
    @FXML
    public Button exitButton;

    @FXML
    public ImageView checkerBoardView;

    public Label InvalidNameText;
    public Button StartButton;
    public TextField player2Input;
    public TextField player1Input;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File checkerBoardFile = new File("Images/MockUI.png");
        Image checkerBoardImage = new Image(checkerBoardFile.toURI().toString());
        checkerBoardView.setImage(checkerBoardImage);
    }

    public void leaveLoginPage(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
