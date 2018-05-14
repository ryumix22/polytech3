package sample;

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class SecondController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane leftAnchor;

    @FXML
    private Text secondPlayerName;

    @FXML
    private Text firstPlayerNumber;

    @FXML
    private Text secondPlayerNumber;

    @FXML
    private Button endButton;

    @FXML
    private Text firstPlayerName;




    @FXML
    void initialize() {
        endButton.setOnAction(event -> {
           if (leftAnchor.getRotate() == 0.0) {
               leftAnchor.setRotate(180.0);
           } else leftAnchor.setRotate(0.0);
        });

        firstPlayerName.setVisible(true);
        secondPlayerName.setVisible(true);
    }
}
