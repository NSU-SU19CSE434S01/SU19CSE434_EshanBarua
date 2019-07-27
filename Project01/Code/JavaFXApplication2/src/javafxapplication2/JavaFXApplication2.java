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
import javafx.scene.control.Alert;
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
      Button submit = new Button("Submit Your Information & Build CV");        
      
      // Photo Upload Button With Text
      Button btnImageLoad = new Button("Upload Your Recent Photo Here"); 
    
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
        form_gui = new Group (title, contactinfo, name, nameField ,caddress,
                caddressField, contact, contactField, email, emailField, careerinfo,
                careerInput, btnImageLoad, PhotoView, PhotoBox, personalinfo, faname,
                fanameField, motname, motnameField, perAddress, perAddressField, dobText,
                dobhBox, nationality, nationalityField, gender, genderbox, religion,
                religionField, blood, bloodbox, marital_Status, marital_Statusbox,
                educationalinfo, degreename, degreename1Field, degreename2Field,
                degreename3Field, institutionname, institutionname1Field, institutionname2Field,
                institutionname3Field, Boardnname, Boardnname1Field, Boardnname2Field, Boardnname3Field,
                group_sub, group_sub1Field, group_sub2Field,
                group_sub3Field, resultinfo, result1Field, result2Field,
                result3Field, pyear, pyear1Field, pyear2Field, pyear3Field,
                working_exp, organization, organizationField, duration,
                durationField, Designation, DesignationField, Languages, Languages1,
                Languages2, Languages1Field, Languages2Field, Skills, Skills1, Skills1Field,
                Skills2, Skills2Field, curriculum_act, curriculum_activitiesInput,
                Certifications, CertificationsField, Recommendations, Rec_Name , Rec_NameField,
                Rec_Designation, Rec_DesignationField, Rec_Institution, Rec_InstitutionField,
                Rec_Email , Rec_EmailField, submit
                
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
        
        
      // Personal Informations  
      // Personal Information Text Title Here
      personalinfo.setText("Personal Information :");  
      
      //Position of the Personal Information text 
      personalinfo.setX(385);                          
      personalinfo.setY(75);
        
      //Font Settings  
      personalinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));     
        
      //Stroke size   
      personalinfo.setStrokeWidth(1);               
      personalinfo.setUnderline(true); 
       
        
      // Father’s Name 
      // Father’s Name Text
      faname.setText("Father’s Name :"); 
        
      //Position of the Father’s Name Text 
      faname.setX(395);          
      faname.setY(116);
      //Font Settings for Name Text
      faname.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      // Input Field Father’s Name 
      // Position Setup for input field
      fanameField.setLayoutX(520);  
      fanameField.setLayoutY(98);
      
     
      // Mother's Name  
      // Mother’s Name Text
      motname.setText("Mother’s Name :");
      //Position of the Mother’s Name Text   
      motname.setX(395);           
      motname.setY(146);
      //Font Settings for Mother’s Name 
      motname.setFont(Font.font("Arial",FontPosture.REGULAR,14));
               
      // Input Field for Mother’s Name 
      // Position Setup for input field
      motnameField.setLayoutX(520);  
      motnameField.setLayoutY(130);
        
      
      // Permanent Address 
      // Permanent Address Text
      perAddress.setText("Permanent Address :"); 
      
      //Position of Permanent Address Text  
      perAddress.setX(395);                   
      perAddress.setY(176);
      //Font Settings for Permanent Address  
      perAddress.setFont(Font.font("Arial",FontPosture.REGULAR,14)); 
               
      // Input Field for Permanent Address
      
      // Position Setup for Permanent Address Input Field
      perAddressField.setLayoutX(520);      
      perAddressField.setLayoutY(160);
     
      // Date Of Birth ( DOB )
      // Date Of Birth Text
      dobText.setText("Date Of Birth :"); 
      
      //Position of Date Of Birth Text   
      dobText.setX(395);           
      dobText.setY(206);
        
      //Font Settings for Date Of Birth  
      dobText.setFont(Font.font("Arial",FontPosture.REGULAR,14)); 
      
      // DOB Picker Input Box
      // Position Setup for DOB Picker Input Box  
      dobhBox.setLayoutX(520);      
      dobhBox.setLayoutY(190);
      
        
      //  Nationality
      // Nationality Text
      nationality.setText("Nationality :");  
        
      //Position of Nationality Text  
      nationality.setX(395);                    
      nationality.setY(236);
        
      //Font Settings for Nationality  
      nationality.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
               
      // Input Field for Nationality
      // Position Setup for Nationality Input Field
      nationalityField.setLayoutX(520);       
      nationalityField.setLayoutY(220);
      
       // Gender Choice Box Text
      // Gender Text
      gender.setText("Gender : ");      
        
      //Position of Gender Text  
      gender.setX(395);                      
      gender.setY(269);
        
      //Font Settings for Gender  
      gender.setFont(Font.font("Arial",FontPosture.REGULAR,14)); 
        
      // Gender Choice Box Position Setup 
      // Position Setup for Gender Choice Box 
      genderbox.setLayoutX(520);            
      genderbox.setLayoutY(250);
          
      //  Religion
      // Religion Text
      religion.setText("Religion :");   
      
      // Position of Religion Text   
      religion.setX(395);                   
      religion.setY(299);
      
      //Font Settings for Religion  
      religion.setFont(Font.font("Arial",FontPosture.REGULAR,14)); 
               
      // Input Field for Religion
      // Position Setup for Religion Field
      religionField.setLayoutX(520);        
      religionField.setLayoutY(280);
      
      // Blood Group Choice Box Text
      // Blood Group Text
      blood.setText("Blood Group : ");  
     
      //Position of Blood Group Text   
      blood.setX(395);                           
      blood.setY(329);
      //Font Settings for Blood Group  
      blood.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
        
      // Blood Group Choice Box Position Setup 
      // Position Setup for Blood Group Choice Box
      bloodbox.setLayoutX(520);                
      bloodbox.setLayoutY(310); 
        
      
      // Marital Status 
      // Marital Status Text
      marital_Status.setText("Marital Status : ");  
      
      //Position of Marital Status Text   
      marital_Status.setX(395);                              
      marital_Status.setY(359);
      //Font Settings for Marital Status  
      marital_Status.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
      
      // Marital Status Choice Box Position Setup 
      // Position Setup for Marital Status Choice Box
      marital_Statusbox.setLayoutX(520);                
      marital_Statusbox.setLayoutY(340);
      
      
      // Educational Qualification   
      // Educational Qualification Text Title Here
      educationalinfo.setText("Educational Qualification :"); 
      
      //Position of the Educational Qualification text   
      educationalinfo.setX(15);                          
      educationalinfo.setY(385);
      
      //Font Settings  
      educationalinfo.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16)); 
        
      //  Stroke size  
      educationalinfo.setStrokeWidth(1);                
      educationalinfo.setUnderline(true); 
      
      
       // Name of degree 
       // Name of degree Text 
      degreename.setText("Name of degree ");  
      
      //Position of the Name of degree text   
      degreename.setX(30);                     
      degreename.setY(410);
        
      //Font Settings for Name of degree Text  
      degreename.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      
      // Input Field for Name of degree 1 
      // Position Setup for Name of degree 1 Input Field
      degreename1Field.setLayoutX(30);        
      degreename1Field.setLayoutY(420);
      
      // Input Field for Name of degree 2 
      // Position Setup for Name of degree 2 Input Field
      degreename2Field.setLayoutX(30);        
      degreename2Field.setLayoutY(450);
      
      // Input Field for Name of degree 3
      // Position Setup for Name of degree 3 Input Field
      degreename3Field.setLayoutX(30);        
      degreename3Field.setLayoutY(480);
       
      

     // Institution Names 
     // Institution Names Text
      institutionname.setText("Institution Names "); 
        
      //Position of the Institution Names text  
      institutionname.setX(200);                      
      institutionname.setY(410);
        
      //Font Settings  
      institutionname.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
      
      
      // Input Field for Institution 1 
      // Position Setup for Institution 1 
      institutionname1Field.setLayoutX(200);        
      institutionname1Field.setLayoutY(420);
      
      // Input Field for Institution 2 
      // Position Setup for Institution 2
      institutionname2Field.setLayoutX(200);        
      institutionname2Field.setLayoutY(450);
      
      // Input Field for Institution 3 
      // Position Setup for Institution 3 
      institutionname3Field.setLayoutX(200);        
      institutionname3Field.setLayoutY(480);
       
     
      
      // Board
      // Board Names Text
      Boardnname.setText("Board Names ");     
      
      //Position of the Board Names text  
      Boardnname.setX(370);                       
      Boardnname.setY(410);
      
      //Font Settings   
      Boardnname.setFont(Font.font("Arial",FontPosture.REGULAR,14)); 
      
      // Input Field for Board 1 
      // Position Setup for Board 1 
      Boardnname1Field.setLayoutX(370);        
      Boardnname1Field.setLayoutY(420);
      
      // Input Field for Board 2 
      // Position Setup for Board 2
      Boardnname2Field.setLayoutX(370);         
      Boardnname2Field.setLayoutY(450);
      
      // Input Field for Board 3 
      // Position Setup for Board 3 
      Boardnname3Field.setLayoutX(370);        
      Boardnname3Field.setLayoutY(480);
      
        
      // Group or Subject
      // Group or Subject Text
      group_sub.setText("Group/Subject "); 
     
      //Position of the Group or Subject text  
      group_sub.setX(540);                        
      group_sub.setY(410);
        
      //Font Settings  
      group_sub.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
      
      // Input Field for Group or Subject 1   
      group_sub1Field.setLayoutX(540);         
      group_sub1Field.setLayoutY(420);
      
      // Input Field for Group or Subject 2   
      group_sub2Field.setLayoutX(540);         
      group_sub2Field.setLayoutY(450);
      
      // Input Field for Group or Subject 3  
      group_sub3Field.setLayoutX(540);         
      group_sub3Field.setLayoutY(480);
      

      //Result	
      // Result Text
      resultinfo.setText("Result ");      
        
      //Position of the Result text   
      resultinfo.setX(700);                       
      resultinfo.setY(410);
      
      //Font Settings   
      resultinfo.setFont(Font.font("Arial",FontPosture.REGULAR,14)); 
      
      // Input Field for Result 1   
      result1Field.setLayoutX(700);        
      result1Field.setLayoutY(420);
      result1Field.setPrefWidth(90);    
      result1Field.setPrefHeight(10);
      
      // Input Field for Result 2    
      result2Field.setLayoutX(700);      
      result2Field.setLayoutY(450);
      result2Field.setPrefWidth(90);    
      result2Field.setPrefHeight(10);
      
      // Input Field for Result 3   
      result3Field.setLayoutX(700);        
      result3Field.setLayoutY(480);
      result3Field.setPrefWidth(90);    
      result3Field.setPrefHeight(10);
        
         
      // Passing year
      // Passing year Text
      pyear.setText("Passing year ");  
        
      //Position of Passing year text  
      pyear.setX(820);                        
      pyear.setY(410);
        
      //Font Settings  
      pyear.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
      
      // Input Field for Passing year 1  
      pyear1Field.setLayoutX(820);          
      pyear1Field.setLayoutY(420);
        pyear1Field.setPrefWidth(60);    
        pyear1Field.setPrefHeight(10);
      
      // Input Field for Passing year 2  
      pyear2Field.setLayoutX(820);          
      pyear2Field.setLayoutY(450);
        pyear2Field.setPrefWidth(60);    
        pyear2Field.setPrefHeight(10);
      
        
      // Input Field for Passing year 3  
      pyear3Field.setLayoutX(820);         
      pyear3Field.setLayoutY(480);
        pyear3Field.setPrefWidth(60);    
        pyear3Field.setPrefHeight(10);
        
       
      // Working Experience
      // Working Experience Text Title Here
      working_exp.setText("Working Experience : ");  
     
      //Position of the Working Experience text   
      working_exp.setX(15);                          
      working_exp.setY(530);
      
      //Font Settings   
      working_exp.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));    
        
      //  Stroke size  
      working_exp.setStrokeWidth(1);                
      working_exp.setUnderline(true);   
        
      // Name of Organization 
      // Name of Organization  Text
      organization.setText("Organization ");    
        
      //Position of the Organization text  
      organization.setX(180);                      
      organization.setY(535);
        
      //Font Settings for Organization Text   
      organization.setFont(Font.font("Arial",FontPosture.REGULAR,14));  
               
      
      // Input Field for Name of Organization 
      // Position Setup for Name of Organization Input Field
      organizationField.setLayoutX(265);       
      organizationField.setLayoutY(520);
      
      // Duration
      // Duration Text
      duration.setText("Duration ");          
        
      //Position of The Duration text  
      duration.setX(430);                      
      duration.setY(535);
        
      //Font Settings for Duration Text  
      duration.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
      
      // Position Setup Duration Input Field  
      durationField.setLayoutX(500);          
      durationField.setLayoutY(520);
      
      // Designation
      // Designation Text
      Designation.setText("Designation ");      
        
      //Position of The Designation Text  
      Designation.setX(660);                          
      Designation.setY(535);
        
      //Font Settings for Designation Text  
      Designation.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
      
      // Position Setup Designation Input Field  
      DesignationField.setLayoutX(740);              
      DesignationField.setLayoutY(520);  
      
     // Languages 
      // Languages Text Title Here
      Languages.setText("Languages : ");            
     
      //Position of The Languages Text   
      Languages.setX(15);                          
      Languages.setY(570);
        
      //Font Settings    
      Languages.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));   
      
      //  Stroke size   
      Languages.setStrokeWidth(1);                
      Languages.setUnderline(true);     
        
      Languages1.setText("Language 1 ");           
      Languages1.setX(180);                         
      Languages1.setY(575);
      Languages1.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Languages1Field.setLayoutX(265);              
      Languages1Field.setLayoutY(560);  
      
      Languages2.setText("Language 2 ");           
      Languages2.setX(420);                         
      Languages2.setY(575);
      Languages2.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Languages2Field.setLayoutX(500);              
      Languages2Field.setLayoutY(560);  
      
      
      
       // Skills
       // Skills Text Title Here
      Skills.setText("Skills : ");                
     
      //Position of The Skills Text   
      Skills.setX(15);                             
      Skills.setY(610);
      
       //Font Settings  
      Skills.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));    
      
       //  Stroke size   
      Skills.setStrokeWidth(1);               
      Skills.setUnderline(true);     
        
      Skills1.setText("Skill 1 ");           
      Skills1.setX(180);                         
      Skills1.setY(610);
      Skills1.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Skills1Field.setLayoutX(265);              
      Skills1Field.setLayoutY(595);  
      
      Skills2.setText("Skill 2 ");           
      Skills2.setX(420);                         
      Skills2.setY(610);
      Skills2.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Skills2Field.setLayoutX(500);              
      Skills2Field.setLayoutY(595);  
        
      // Extra Curriculum Activities
      
      curriculum_act.setText("Extra Curriculum Activities : ");               
     
      curriculum_act.setX(15);                         
      curriculum_act.setY(650);
      curriculum_act.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));  
      curriculum_act.setStrokeWidth(1);                
      curriculum_act.setUnderline(true);     
               
      curriculum_activitiesInput.setLayoutX(265);              
      curriculum_activitiesInput.setLayoutY(635); 
        curriculum_activitiesInput.setPrefWidth(380);    
        curriculum_activitiesInput.setPrefHeight(10);
     
       
      // Certifications  
       Certifications.setText("Certifications  : ");                 
     
       Certifications.setX(15);                             
       Certifications.setY(680);
       Certifications.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16));   
       Certifications.setStrokeWidth(1);               
       Certifications.setUnderline(true);  
      
       CertificationsField.setLayoutX(265);              
       CertificationsField.setLayoutY(665); 
        CertificationsField.setPrefWidth(380);    
        CertificationsField.setPrefHeight(10);
       
        
      // Recommendations :
      
      Recommendations.setText("Recommendations : ");                
      
      //Font Settings
      Recommendations.setX(670);                             
      Recommendations.setY(570);
       
      Recommendations.setFont(Font.font("Times New Roman",FontPosture.REGULAR,16)); 
      
      //  Stroke size  
      Recommendations.setStrokeWidth(1);                                                
      Recommendations.setUnderline(true);     
        
      Rec_Name.setText("Name ");           
      Rec_Name.setX(680);                         
      Rec_Name.setY(600);
      Rec_Name.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Rec_NameField.setLayoutX(790);              
      Rec_NameField.setLayoutY(580);  
      
      Rec_Designation.setText("Designation ");           
      Rec_Designation.setX(680);                         
      Rec_Designation.setY(630);
      Rec_Designation.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Rec_DesignationField.setLayoutX(790);              
      Rec_DesignationField.setLayoutY(612);  
      
      Rec_Institution.setText("Institution ");           
      Rec_Institution.setX(680);                         
      Rec_Institution.setY(660);
      Rec_Institution.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Rec_InstitutionField.setLayoutX(790);              
      Rec_InstitutionField.setLayoutY(642);
      
      
      Rec_Email.setText("E-mail ");           
      Rec_Email.setX(680);                         
      Rec_Email.setY(690);
      Rec_Email.setFont(Font.font("Arial",FontPosture.REGULAR,14));   
               
      Rec_EmailField.setLayoutX(790);              
      Rec_EmailField.setLayoutY(672);
      
      
         
       // Submit Button
       submit.setPrefHeight(20);
       submit.setDefaultButton(true);
       submit.setPrefWidth(200);
       
       submit.setLayoutX(370);  
       submit.setLayoutY(705);  
       
      
       //Submit button event handeler   
        submit.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override 
             public void handle(ActionEvent evn) 
            {
                // Contact Information
                 if(nameField.getText().isEmpty()) 
                {
                    AlertNotification(Alert.AlertType.ERROR, stage.getScene().getWindow(), "Error Occured !", "Your Name Field is Empty\n\t  Please Enter Your Name");
                    return ;
                    
                }
                 
                if(caddressField.getText().isEmpty()) 
                {
                    AlertNotification(Alert.AlertType.ERROR, stage.getScene().getWindow(),"Error Occured !", "Your Current Address Field is Empty\n\tPlease Enter Your Current Address");
                    return ;
                    
                }
                
                if(contactField.getText().isEmpty()) 
                {
                    AlertNotification(Alert.AlertType.ERROR, stage.getScene().getWindow(),"Error Occured !", "Your  Contact Number Field is Empty\n\tPlease Enter Your Contact Number");
                    return ;
                    
                }
                
                if(emailField.getText().isEmpty()) 
                {
                    AlertNotification(Alert.AlertType.ERROR, stage.getScene().getWindow(),"Error Occured !", "Your  Email Address Field is Empty\n\tPlease Enter Your Email Address");
                    return ;
                    
                }
                
                // Personal Information
                
               if(fanameField.getText().isEmpty()) 
                {
                    AlertNotification(Alert.AlertType.ERROR, stage.getScene().getWindow(),"Error Occured !", "Your Father's Name Field is Empty\n\tPlease Enter Your Father's Name");
                    return ;
                    
                }
                
                if(motnameField.getText().isEmpty()) 
                {
                    AlertNotification(Alert.AlertType.ERROR, stage.getScene().getWindow(),"Error Occured !", "Your Mother's Name Field is Empty\n\tPlease Enter Your Mother's Name");
                    return ;
                    
                }
                
                if(perAddressField.getText().isEmpty()) 
                {
                    AlertNotification(Alert.AlertType.ERROR, stage.getScene().getWindow(),"Error Occured !", "Your Permanent Address Field is Empty\n\tPlease Enter Your Permanent Address");
                    return ;
                    
                }
                
                AlertNotification(Alert.AlertType.CONFIRMATION, stage.getScene().getWindow(), "Successfully Completed !", "Welcome " + nameField.getText());
            }
             
        } );
      
        
      // Scene added in stage 
      stage.setScene(scene);    
      
      //  Stage elements show
      stage.show();   
              
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}


 
