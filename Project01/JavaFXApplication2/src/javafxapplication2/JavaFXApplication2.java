/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.File;
import java.util.Map;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.collections.FXCollections; 
import javafx.collections.ObservableList; 

import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.ListView; 
import javafx.scene.control.RadioButton; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.control.ToggleButton; 
import javafx.stage.Stage;
import javafx.stage.DirectoryChooser;


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
        
           //Label for name 
      Text nameLabel = new Text("Name"); 
      
      //Text field for name 
      TextField nameText = new TextField(); 
      
         //Label for Email 
      Text emailLabel = new Text("Email"); 
      
      //Text field for contact 
      TextField emailText = new TextField(); 
      
            //Label for contact 
      Text contactLabel = new Text("Contact No."); 
      
      //Text field for Address 
      TextField contactText = new TextField(); 
      
            //Label for Email 
      Text addressLabel = new Text("Address"); 
  
           //Text field for Address 
      TextField AddressText = new TextField(); 
      
      //File uploder
      
      DirectoryChooser dc = new DirectoryChooser();
File file = dc.showDialog(null);
if (file != null) {
            file = new File(file.getAbsolutePath() + "/dafaultFilename.extension");}
        
        
        Button button = new Button();
        button.setText("Build CV");
        button.setOnAction((EventHandler<ActionEvent>) this);
        
          Button button2 = new Button();
        button2.setText("Exit");
        button2.setOnAction((EventHandler<ActionEvent>) this);
        
        
        GridPane layout = new GridPane();
        layout.getChildren().addAll(button,button2);
        Scene scene = new Scene(layout, 800, 400);
        primaryStage.setTitle("CV Builder");
        primaryStage.setScene(scene);
        primaryStage.show();

    }    
            void handle(ActionEvent event, Object button2){
          Object button = null;
                if(event.getSource()==button){
                    System.out.println("Here's your CV");
                } 
                if(event.getSource()== button2) {
                    System.out.println("Thanks for using the system");
              
            }   
    }
        
   
    }

 
