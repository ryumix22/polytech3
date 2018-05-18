package sample;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField2;


    private String getTextField2() {
        return textField2.getText();
    }

    @FXML
    private TextField textField1;

    private String getTextField1() {
        return textField1.getText();
    }


    @FXML
    private Button buttonPlay;

    @FXML
    private Text awareText;


    @FXML
    void initialize() {
        buttonPlay.setOnAction(event -> {
            if (!Objects.equals(getTextField1(), "") && !Objects.equals(getTextField2(), "")) {
                buttonPlay.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("secondWindow.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setTitle("Checkers");
                stage.setScene(new Scene(root));
                stage.setResizable(false);
                stage.show();
            } else awareText.setVisible(true);

        });

    }
}


