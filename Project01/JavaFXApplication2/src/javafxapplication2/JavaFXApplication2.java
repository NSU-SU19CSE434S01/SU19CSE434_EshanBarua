/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Eshan
 */
public class JavaFXApplication2 extends Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
       
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Button btn = new Button("Build CV");
        Button exit = new Button("Exit");
        
        exit.setOnAction(e -> {
            System.out.println("Thanks for using the system");
            System.exit(0);  
        });

        btn.setOnAction(new EventHandler<ActionEvent>(){
            
            @Override
            public void handle(ActionEvent event){
             System.out.println("Your CV is ready to print");    
            }   
    });
        
        VBox root = new VBox();
        root.getChildren().addAll(btn, exit);
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setTitle("CV Builder");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
 
