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
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;  
import javafx.scene.control.ToggleButton; 
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
       
    ImageView PhotoView;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        

        //Text object Created for Title here
        Text title = new Text();                      
        
        // Text Object for Name created
        Text name = new Text();  
        
        // Input Field Object created for Name 
      TextField nameField = new TextField();        
      
      // Text Object for Contact email created
       Text email = new Text();  
       // Input Field Object created for email
      TextField emailField = new TextField();      
             
         
      // Text Object for Contact Number created
        Text contact = new Text();                 
    // Input Field Object created for Contact Number     
      TextField contactField = new TextField();           
      
       // Text Object for Current Address created
      Text caddress = new Text();       
      // Input Field Object created for Current Address 
      TextField caddressField = new TextField();      
      
      // Text Object for Career Objective created
      Text careerinfo = new Text();               

      
      //File uploder
      
      DirectoryChooser dc = new DirectoryChooser();
File file = dc.showDialog(null);
if (file != null) {
            file = new File(file.getAbsolutePath() + "/dafaultFilename.extension");}
        
        
        //Defining the School's Name text field
        final TextField Sname = new TextField();
        Sname.setPromptText("Enter your School's name.");
        Sname.setPrefColumnCount(10);
        Sname.getText();
        GridPane.setConstraints(Sname, 0, 0);
        grid.getChildren().add(Sname);

        final TextField Department; 
        Department = new TextField();
        Department.setPromptText("Enter your depertment.");
        GridPane.setConstraints(Department, 0, 1);
        grid.getChildren().add(Department);
        
        //Defining the school grade text field
        final TextField Sgrade = new TextField();
        Sgrade.setPrefColumnCount(15);
        Sgrade.setPromptText("Enter your Grade");
        GridPane.setConstraints(Sgrade, 0, 2);
        grid.getChildren().add(Sgrade);
        
        
        //Defining the College's Name text field
        final TextField Cname = new TextField();
        Cname.setPromptText("Enter your School's name.");
        Cname.setPrefColumnCount(10);
        Cname.getText();
        GridPane.setConstraints(Cname, 0, 0);
        grid.getChildren().add(Cname);

        final TextField CDepartment; 
        CDepartment = new TextField();
        CDepartment.setPromptText("Enter your depertment.");
        GridPane.setConstraints(CDepartment, 0, 1);
        grid.getChildren().add(CDepartment);
        
        //Defining the college grade text field
        final TextField Cgrade = new TextField();
        Cgrade.setPrefColumnCount(15);
        Cgrade.setPromptText("Enter your Grade");
        GridPane.setConstraints(Cgrade, 0, 2);
        grid.getChildren().add(Cgrade);
        
        
        //Defining the Uni's Name text field
        final TextField Uname = new TextField();
        Uname.setPromptText("Enter your School's name.");
        Uname.setPrefColumnCount(10);
        Uname.getText();
        GridPane.setConstraints(Uname, 0, 0);
        grid.getChildren().add(Uname);

        final TextField UDepartment; 
        UDepartment = new TextField();
        UDepartment.setPromptText("Enter your depertment.");
        GridPane.setConstraints(UDepartment, 0, 1);
        grid.getChildren().add(UDepartment);
        
        //Defining the undergrad grade text field
        final TextField Ugrade = new TextField();
        Ugrade.setPrefColumnCount(15);
        Ugrade.setPromptText("Enter your Grade");
        GridPane.setConstraints(Sgrade, 0, 2);
        grid.getChildren().add(Ugrade);
        
        
      //Label for technologies known 
      Text technologiesLabel = new Text("Technologies Known"); 
      
      //check box for technologies known  
      CheckBox javaCheckBox = new CheckBox("Java"); 
      javaCheckBox.setIndeterminate(false); 
      
      //check box for technologies known  
      CheckBox CSCheckBox = new CheckBox("C#"); 
      javaCheckBox.setIndeterminate(false);
      
      //check box for technologies known  
      CheckBox PCheckBox = new CheckBox("Python"); 
      javaCheckBox.setIndeterminate(false);
      
      //check box for technologies known  
      CheckBox PHPCheckBox = new CheckBox("PHP"); 
      javaCheckBox.setIndeterminate(false);
      
      //check box for technologies known  
      CheckBox MyCheckBox = new CheckBox("MySQL"); 
      javaCheckBox.setIndeterminate(false);
      
        //check box for technologies known  
      CheckBox BCheckBox = new CheckBox("BootStrap"); 
      javaCheckBox.setIndeterminate(false);
      
        //check box for technologies known  
      CheckBox HCheckBox = new CheckBox("HTML/CSS"); 
      javaCheckBox.setIndeterminate(false);
      
      //check box for technologies known  
      CheckBox dotnetCheckBox = new CheckBox("DotNet"); 
      javaCheckBox.setIndeterminate(false);
      
        //check box for technologies known  
      CheckBox MCheckBox = new CheckBox("Microsoft Excel"); 
      javaCheckBox.setIndeterminate(false);
      
        //check box for technologies known  
      CheckBox MOCheckBox = new CheckBox("Microsoft Office"); 
      javaCheckBox.setIndeterminate(false);
            
        Button button = new Button();
        button.setText("Build CV");
        button.setOnAction((EventHandler<ActionEvent>) this);
        
          Button button2 = new Button();
        button2.setText("Exit");
        button2.setOnAction((EventHandler<ActionEvent>) this);
        
        
        GridPane layout = new GridPane();
        //Creating a GridPane container
GridPane grid = new GridPane();
grid.setPadding(new Insets(10, 10, 10, 10));
grid.setVgap(5);
grid.setHgap(5);
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

    private void setPromptText(String enter_your_last_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
   
    }

 
