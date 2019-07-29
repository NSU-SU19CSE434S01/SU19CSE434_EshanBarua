package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eshan
 */
public class checkEmpty {
    
    String name;
    String currentAddress;
    String phoneNumber;
    String email;
    String empty;

	public String checkEmptyFieldN(){
        
        if (name == "")
        {
            empty = "This field is empty";
        }
        else {
        	empty = "This field is not empty";
        }
    
        return empty ;
    }
	
public String checkEmptyFieldPN(){
        
        if (phoneNumber == "")
        {
            empty = "This field is empty";
        }
        else {
        	empty = "This field is not empty";
        }
    
        return empty ;
    }
    

public String checkEmptyFieldCA(){
    
    if (currentAddress == "")
    {
        empty = "This field is empty";
    }
    else {
    	empty = "This field is not empty";
    }

    return empty ;
}


public String checkEmptyFieldE(){
    
    if (email == "")
    {
        empty = "This field is empty";
    }
    else {
    	empty = "This field is not empty";
    }

    return empty ;
}

    
    public void display(){
        System.out.println("This Field is Empty" + name);  
        System.out.println("This Field is Empty" + currentAddress);
        System.out.println("This Field is Empty" + phoneNumber);
        System.out.println("This Field is Empty" + email);

    }
    
}
