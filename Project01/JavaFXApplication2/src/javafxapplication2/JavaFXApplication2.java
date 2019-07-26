/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections; 
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;


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
      
    // Text Object for Contact Information created  
      Text contactinfo = new Text();              
      
      // Text Object for Contact email created
       Text email = new Text();  
       // Input Field Object created for email
      TextField emailField = new TextField();      
                       
      
       // Text Object for Current Address created
      Text caddress = new Text();       
      // Input Field Object created for Current Address 
      TextField caddressField = new TextField();      
      
      // Text Object for Career Objective created
      Text careerinfo = new Text();  
      // Multiline Text Input Box for Career Objective
      TextArea careerObjective = new TextArea();  
      VBox careerInput = new VBox(careerObjective);  
      
      // Text Object for Personal Information created
       Text personalinfo = new Text();                
      
        // Text Object for Father's Name created
       Text faname = new Text();        
        // Input Field Object created for Father's Name 
      TextField fanameField = new TextField();       
      
        // Text Object for Mother’s Name created  
      
       Text motname = new Text();        
       // Input Field Object created for Mother’s Name
      TextField motnameField = new TextField();       
      
      // Text Object for Permanent Address created
      Text perAddress = new Text();     
      // Input Field Object created for Permanent Address
      TextField perAddressField = new TextField();     
      
       // Text Object for DOB created 
      Text dobText = new Text();    
      // Date Picker Object Created for DOB 
      DatePicker dobPicker = new DatePicker();  
      // Box created for DOB
      HBox dobhBox = new HBox(dobPicker);         
      
       // Text Object for Nationality created
      Text nationality = new Text();      
      // Input Field Object created for Nationality 
      TextField nationalityField = new TextField();        
      
      // Text Object for Gender created
      Text gender = new Text();                      
      ChoiceBox genderbox = new ChoiceBox(FXCollections.observableArrayList("Male", "Female", "Others") ); 
      // Gennder Choice Box Object Created
  
       // Text Object for Religion created
      Text religion = new Text();     
      // Input Field Object created for Religion
      TextField religionField = new TextField(); 
      
        // Text Object for Blood Group created
      Text blood = new Text();                    
      ChoiceBox bloodbox = new ChoiceBox(FXCollections.observableArrayList("A+",
               "A-","B+","B-","O+","O-","AB+","AB-") );  // Blood Group Choice Box Object Created
      
       // Text Object for Marital Status created
      Text marital_Status = new Text();                     
      ChoiceBox marital_Statusbox = new ChoiceBox(FXCollections.observableArrayList(
              "Single","Married","Divorced","Widow") );  
        // Marital Status Choice Box Object Created
  
      // Text Object for Educational Qualification created
      Text educationalinfo = new Text();                
      // Text Object for Name of degree created
      Text degreename = new Text();                   
      

        // Input Field Object created for Degree 1
      TextField degreename1Field = new TextField(); 
      // Input Field Object created for Degree 2
       TextField degreename2Field = new TextField();    
       // Input Field Object created for Degree 3
        TextField degreename3Field = new TextField();       
         
      // Text Object for Institution Name created
      Text institutionname = new Text();                   
      // Input Field Object created for Institution 1
      TextField institutionname1Field = new TextField();  
      // Input Field Object created for Institution 2
       TextField institutionname2Field = new TextField();     
        // Input Field Object created for Institution 3
        TextField institutionname3Field = new TextField();      
        
       // Text Object for Board Name created
      Text Boardnname = new Text();                  
      
      // Input Field Object created for Board 1
      TextField Boardnname1Field = new TextField(); 
       // Input Field Object created for Board 2
       TextField Boardnname2Field = new TextField();    
       // Input Field Object created for Board 3
        TextField Boardnname3Field = new TextField();       
         
      // Text Object for Group or Subject created
      Text group_sub = new Text();                      
      // Input Field Object created for Group/Subject 1
      TextField group_sub1Field = new TextField(); 
      // Input Field Object created for Group/Subject 2
       TextField group_sub2Field = new TextField();  
        // Input Field Object created for Group/Subject 3
        TextField group_sub3Field = new TextField();      
        
       // Text Object for Result created
      Text resultinfo = new Text();                     
      // Input Field Object created for Result 1
      TextField result1Field = new TextField();   
      // Input Field Object created for Result 2
       TextField result2Field = new TextField();    
        // Input Field Object created for Result 3
        TextField result3Field = new TextField();      
         
        // Text Object for Passing Year created  
      Text pyear = new Text();                        
       // Input Field Object created for Passing year 1
      TextField pyear1Field = new TextField();    
       // Input Field Object created for Passing year 2
       TextField pyear2Field = new TextField();    
        // Input Field Object created for Passing year 3
        TextField pyear3Field = new TextField();      
       
        // Text Object for Working Experience created
       Text working_exp   = new Text();                
      
       // Text Object for Name of Organization created
      Text organization = new Text();     
      // Input Field Object created for Name of Organization
      TextField organizationField = new TextField();       
      
      // Text Object for Duration created
      Text duration = new Text();           
      // Input Field Object created for Duration
      TextField durationField = new TextField();       
      
      // Text Object for Designation created
      Text Designation = new Text(); 
      // Input Field Object Created for Designation
      TextField DesignationField = new TextField();       
      
      // Text Object for Languages 
      Text Languages  = new Text();                      
      
      // Text Object for Languages 1
      Text Languages1  = new Text();      
      // Input Field Object Created for Languages 1 
      TextField Languages1Field = new TextField();        
      
       // Text Object for Languages 2
      Text Languages2  = new Text();  
      // Input Field Object Created for Languages 2 
      TextField Languages2Field = new TextField();   
      
      // Text Object for Skills
      Text Skills  = new Text();                          
      // Text Object for Skills 1
      Text Skills1  = new Text();   
      // Input Field Object Created for Skills 1
      TextField Skills1Field = new TextField();          
      
      
      // Text Object for Skills 2
      Text Skills2  = new Text();    
       // Input Field Object Created for Skills 2
      TextField Skills2Field = new TextField();       
      
      
      // Text Object for curriculum activities
      Text curriculum_act = new Text();       
      // Input field for curriculum activities
      TextField curriculum_activitiesInput = new TextField();  
      
      //Text object for certification
      Text Certifications   = new Text();
      //input field for certification
      TextField CertificationsField  = new TextField(); 
      
      
      Text Recommendations   = new Text();  
      //Text field for recommendations
      Text Rec_Name   = new Text();  
      //input field for recommendations
      TextField Rec_NameField  = new TextField(); 
      
      //Text field for recommendation designation
      Text Rec_Designation   = new Text();  
      //input field for recommendation designation
      TextField Rec_DesignationField  = new TextField(); 
      
      //Text field for recommendation institution
      Text Rec_Institution   = new Text();
      //input field for recommendation institution
      TextField Rec_InstitutionField  = new TextField(); 
      
      //Text field for recommendation email
      Text Rec_Email   = new Text(); 
      //input field for recommendation email
      TextField Rec_EmailField  = new TextField(); 
      
      //  Submission Button
      Button submit = new Button("Submit Your Information");        
      
      // Photo Upload Button With Text
      Button btnImageLoad = new Button("Upload Your Photo Here"); 
    
      // Photo View Object Created 
      PhotoView = new ImageView();                                 
      
        // Photo Upload And Control 
      VBox PhotoBox = new VBox();                                 
        
      PhotoBox.getChildren().addAll(btnImageLoad, PhotoView);
      
           btnImageLoad.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent photo_upload) {
                FileChooser photoChooser = new FileChooser();
                
                FileChooser.ExtensionFilter extnFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
                FileChooser.ExtensionFilter extnFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
                FileChooser.ExtensionFilter extnFilterGIF = new FileChooser.ExtensionFilter("GIF files (*.gif)", "*.GIF");
                
                photoChooser.getExtensionFilters().addAll(extnFilterJPG,extnFilterPNG,extnFilterGIF);
                
                File Photofile = photoChooser.showOpenDialog(stage);
                
                
                
                try
                {
                    BufferedImage buffImage = ImageIO.read(Photofile);
                    Image photo_file = SwingFXUtils.toFXImage(buffImage, null);
                    PhotoView.setImage(photo_file);
                    
                }
                
                catch (IOException excp)
                {
                    Logger.getLogger(JavaFXApplication2.class.getName()).log(Level.SEVERE, null, excp);
                }
            }
        });
          
          
      
        
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

 
