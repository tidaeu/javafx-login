package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {
    @FXML
    public Button exitButton;

    public Label InvalidNameText;
    public Button StartButton;
    public TextField player2Input;
    public TextField player1Input;


    public void leaveLoginPage(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
