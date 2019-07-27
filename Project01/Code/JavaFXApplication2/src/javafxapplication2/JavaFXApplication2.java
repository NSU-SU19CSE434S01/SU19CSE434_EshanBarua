/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections; 
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.DatePicker; 
import javafx.scene.control.TextArea;
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.imageio.ImageIO;


/**
 *
 * @author Eshan
 */
public class JavaFXApplication2 extends Application {
    
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
      
       // Text Object for Contact Number created
       Text contact = new Text();                    
      // Input Field Object created for Contact Numbe
       TextField contactField = new TextField();     
      
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
           
           
      //Creating group object
      Group form_gui;   
        form_gui = new Group(title, contactinfo, name,nameField ,caddress,
                caddressField,contact,contactField,email,emailField,careerinfo,
                careerInput,btnImageLoad,PhotoView,PhotoBox,personalinfo,faname,
                fanameField,motname,motnameField,perAddress,perAddressField,dobText,
                dobhBox,nationality,nationalityField,gender,genderbox,religion,
                religionField,blood,bloodbox,marital_Status,marital_Statusbox,
                educationalinfo,degreename,degreename1Field,degreename2Field,
                degreename3Field,institutionname,institutionname1Field,institutionname2Field,
                institutionname3Field,Boardnname,Boardnname1Field,Boardnname2Field,Boardnname3Field,
                group_sub,group_sub1Field,group_sub2Field,
                group_sub3Field,resultinfo,result1Field,result2Field,
                result3Field,pyear,pyear1Field,pyear2Field,pyear3Field,
                working_exp,organization,organizationField,duration,
                durationField,Designation,DesignationField,Languages,Languages1,
                Languages2,Languages1Field,Languages2Field,Skills,Skills1,Skills1Field,
                Skills2,Skills2Field,curriculum_act,curriculum_activitiesInput,
                Certifications,CertificationsField,Recommendations,Rec_Name ,Rec_NameField,
                Rec_Designation,Rec_DesignationField,Rec_Institution,Rec_InstitutionField,
                Rec_Email ,Rec_EmailField,submit
                
        );
        
      // Scene object Created Here   
      Scene scene = new Scene(form_gui, 980, 740);            
      // Set the title for Stage
      stage.setTitle("Software Quality Assurance Project 01");  
      
            
      // Title    - CV Builder
      
      // Title Text
      title.setText("CV BUILDER");  
      
      //Position of the text Title
      title.setX(380);                 
      title.setY(25);
      
      //Font Settings for Text Title 
      title.setFont(Font.font("Times New Roman",FontPosture.REGULAR,20));
      
      //Color Fill inside the text title        
      title.setFill(Color.BLACK); 
      
      //  Stroke size
      title.setStrokeWidth(2); 
      
      // Color of stroke
      title.setStroke(Color.GREEN);          
            
        
      // Contact Informations 
      
      // Contact information Text Title Here
      contactinfo.setText("Contact Information :");  
      
      //Position of the contact information text
      contactinfo.setX(15);                 
      contactinfo.setY(75);
      
      //Font Settings for Text Title 
      contactinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));
      
      //  Stroke size 
      contactinfo.setStrokeWidth(1);      
      // Underline 
      contactinfo.setUnderline(true);  
           
      // Name 
      
      // Name Text
      name.setText("Name :");  
      
      //Position of the name text 
      name.setX(30);         
      name.setY(116);
      
      //Font Settings for Name Text  
      name.setFont(Font.font("Arial",FontPosture.REGULAR,14));
               
      
      // Input Field For Name
      
      // Position setup for Name Input Field
      nameField.setLayoutX(180); 
      nameField.setLayoutY(100);
      
      
       // Current Address 
      //Position of the Current Address text 
      caddress.setText("Current Address :"); 
      
       //Position of the name text 
      caddress.setX(30);           
      caddress.setY(146);
      
      //Font Settings for Current Address Text 
      caddress.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
      
      // Position setup for Current Address Input Field
      caddressField.setLayoutX(180);  
      caddressField.setLayoutY(130);
      
      // Contact Number 
      
      //Contact Number Text
      contact.setText("Contact Number :"); 
      
      //Position of the Contact Number 
      contact.setX(30);          
      contact.setY(180);
      
      //Font Settings for Contact Number Text 
      contact.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
      
      // Position setup for Contact Number Input Field
      contactField.setLayoutX(180);  
      contactField.setLayoutY(160);
      
       
        // Email
      
       //email address Text
      email.setText("Email :"); 
      //Position of the email 
      email.setX(30);            
      email.setY(210);
      //Font Settings for email Text  
      email.setFont(Font.font("Arial",FontPosture.REGULAR,14));
      
      // Position setup for email Number Input Field
      emailField.setLayoutX(180);  
      emailField.setLayoutY(190);
      
      
        // Career Objective 
       // Career Objective Text Title Here 
       careerinfo.setText("Career Objective :");  
       //Position of the Career Objective Text 
       careerinfo.setX(15);                 
       careerinfo.setY(265); 
       //Font Settings for Text Title
       careerinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16)); 
        //  Stroke size 
       careerinfo.setStrokeWidth(1);      
       careerinfo.setUnderline(true);  
       
       //  Position setup for Career Objective Input Field
       careerInput.setLayoutX(70);  
       careerInput.setLayoutY(280);  
       
        // Setup position Career Objective Input Box
       careerInput.setPrefWidth(260);  
       careerInput.setPrefHeight(60);
        
     
        // Photo Upload Field With Posiiton
      
       // Photo Upload Field Position
       btnImageLoad.setLayoutX(740);  
       btnImageLoad.setLayoutY(90);
       
       // Photo View
       PhotoView.setFitWidth(135);      
       PhotoView.setFitHeight(160);
       
       // Photo View Frame Position with size
       PhotoView.setLayoutX(745);  
       PhotoView.setLayoutY(120);
        
            
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}


 
