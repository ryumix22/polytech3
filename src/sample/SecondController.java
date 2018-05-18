package sample;

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import static java.lang.Math.abs;

public class SecondController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private Boolean turn;

    public void setTurn(Boolean turn) {
        this.turn = turn;
    }

    public Boolean getTurn() {
        return turn;
    }

    private int[][] positions = new int[8][8];


    @FXML
    private Group blackCheckers;

    private Double oldX = 0.0;
    private Double oldY = 0.0;
    private Double newX = 0.0;
    private Double newY = 0.0;


    private void setBlackCheckers(Group blackCheckers) {
        for (int y = 0; y < 3; y++) {
            int a = 0;
            int b = 1;
            for (int x = 0; x < 4; x++) {
                if (y % 2  == 0) {
                    Circle circle = new Circle();
                    circle.setRadius(40.0);
                    circle.setCenterX(x * 200.0);
                    circle.setCenterY(y * 100.0);
                    circle.setFill(Color.PERU);
                    circle.setStrokeWidth(10);
                    circle.setStroke(Color.SADDLEBROWN);
                    blackCheckers.getChildren().add(circle);
                    positions[y][a] = 2;
                    a += 2;
                    if (!getTurn()) {
                        circle.setOnMousePressed((MouseEvent event) -> {
                            oldX = circle.getCenterX();
                            oldY = circle.getCenterY();
                            System.out.println(oldX);
                            System.out.println(oldY);
                        });
                        circle.setOnMouseDragged((MouseEvent event) -> {
                            Double locationX = event.getX();
                            Double locationY = event.getY();
                            circle.setCenterX(locationX);
                            circle.setCenterY(locationY);
                            newX = circle.getCenterX();
                            newY = circle.getCenterY();
                            if ((oldX - newX) >= 50 && (oldX - newX) <= 150 &&
                                    (oldY - newY) >= 50 && (oldY - newY) <= 150) {
                                circle.setCenterX(oldX - 100);
                                circle.setCenterY(oldY - 100);
                            }
                            if ((newX - oldX) >= 50 && (newX - oldX) <= 150 &&
                                    (oldY - newY) >= 50 && (oldY - newY) <= 150) {
                                circle.setCenterX(oldX + 100);
                                circle.setCenterY(oldY - 100);
                            }
                        });
                    }
                } else {
                    Circle circle = new Circle();
                    circle.setRadius(40.0);
                    circle.setCenterX(x * 200.0 + 100);
                    circle.setCenterY(y * 100.0);
                    circle.setFill(Color.PERU);
                    circle.setStrokeWidth(10);
                    circle.setStroke(Color.SADDLEBROWN);
                    blackCheckers.getChildren().add(circle);
                    positions[y][b] = 2;
                    b += 2;
                    if (!getTurn()) {
                        circle.setOnMousePressed((MouseEvent event) -> {
                            oldX = circle.getCenterX();
                            oldY = circle.getCenterY();
                            System.out.println(oldX);
                            System.out.println(oldY);
                        });
                        circle.setOnMouseDragged((MouseEvent event) -> {
                            Double locationX = event.getX();
                            Double locationY = event.getY();
                            circle.setCenterX(locationX);
                            circle.setCenterY(locationY);
                            newX = circle.getCenterX();
                            newY = circle.getCenterY();
                            if ((oldX - newX) >= 50 && (oldX - newY) <= 150 &&
                                    (oldY - newX) >= 50 && (oldY - newY) <= 150) {
                                circle.setCenterX(oldX - 100);
                                circle.setCenterY(oldY - 100);
                            }
                            if ((newX - oldX) >= 50 && (newX - oldX) <= 150 &&
                                    (oldY - newY) >= 50 && (oldY - newY) <= 150) {
                                    circle.setCenterX(oldX + 100);
                                    circle.setCenterY(oldY - 100);
                            }
                        });
                    }
                }
            }
        }
    }


    @FXML
    private Group whiteCheckers;

    private void setWhiteCheckers(Group whiteCheckers) {
        for (int y = 0; y < 3; y++) {
            int a = 1;
            int b = 0;
            for (int x = 0; x < 4; x++) {
                if (y % 2  == 0) {
                    Circle circle = new Circle();
                    circle.setRadius(40.0);
                    circle.setCenterX(x * 200.0 + 100);
                    circle.setCenterY(y * 100.0 + 500);
                    circle.setFill(Color.SALMON);
                    circle.setStrokeWidth(10);
                    circle.setStroke(Color.PEACHPUFF);
                    whiteCheckers.getChildren().add(circle);
                    positions[y + 5][a] = 1;
                    a += 2;
                } else {
                    Circle circle = new Circle();
                    circle.setRadius(40.0);
                    circle.setCenterX(x * 200.0);
                    circle.setCenterY(y * 100.0 + 500);
                    circle.setFill(Color.SALMON);
                    circle.setStrokeWidth(10);
                    circle.setStroke(Color.PEACHPUFF);
                    whiteCheckers.getChildren().add(circle);
                    positions[y + 5][b] = 1;
                    b += 2;
                }
            }
        }
    }

    private void turnWhite(Circle circle) {
            circle.setOnMousePressed((MouseEvent event) -> {
                    oldX = circle.getCenterX();
                    oldY = circle.getCenterY();
                    System.out.println(oldX);
                    System.out.println(oldY);
            });
            circle.setOnMouseDragged((MouseEvent event) -> {
                Double locationX = event.getX();
                Double locationY = event.getY();
                circle.setCenterX(locationX);
                circle.setCenterY(locationY);
                newX = circle.getCenterX();
                newY = circle.getCenterY();
                if ((oldX - newX) >= 50 && (oldX - newX) <= 150 &&
                        (oldY - newY) >= 50 && (oldY - newY) <= 150) {
                    circle.setCenterX(oldX - 100);
                    circle.setCenterY(oldY - 100);
                }
                if ((newX - oldX) >= 50 && (newX - oldX) <= 150 &&
                        (oldY - newY) >= 50 && (oldY - newY) <= 150) {
                    circle.setCenterX(oldX + 100);
                    circle.setCenterY(oldY - 100);
                }
            });
    }

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
    private Button startButton;

    @FXML
    private Text firstPlayerName;



    private void write(int[][] field) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(field[i][j] + "   ");
            }
            System.out.println("");
        }
    }

    @FXML
    void initialize() {
        startButton.setOnAction(event -> {
            startButton.setVisible(false);
            endButton.setVisible(true);
            setTurn(true);
            setBlackCheckers(blackCheckers);
            setWhiteCheckers(whiteCheckers);
            write(positions);
        });
        endButton.setOnAction(event -> {
           if (leftAnchor.getRotate() == 0.0) {
               leftAnchor.setRotate(180.0);
           } else leftAnchor.setRotate(0.0);
           if (getTurn()) {
               setTurn(false);
           } else setTurn(true);
            System.out.println(getTurn());
        });
    }
}
