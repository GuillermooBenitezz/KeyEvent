/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package keyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 *
 * @author usu2dam
 */
public class KeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        Text text = new Text(20, 20,"A");
        text.setFocusTraversable(true);
        pane.getChildren().add(text);
        
        text.setOnKeyPressed(event ->
        {
            switch(event.getCode())
            {
                case RIGHT: text.setX(text.getX() + 10);
                break;
                case LEFT: text.setX(text.getX() - 10);
                break;
                case UP: text.setY(text.getY() - 10);
                break;
                case DOWN: text.setY(text.getY() + 10);
                break;
                default:
                    try {
                        if(Character.isLetterOrDigit(event.getText().charAt(0)))
                            text.setText(event.getText());
                } catch (Exception e) {
                }
            }
        });
        
            
        Scene scene = new Scene(pane, 300, 75);
        
        primaryStage.setTitle("Key Event with movement");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
