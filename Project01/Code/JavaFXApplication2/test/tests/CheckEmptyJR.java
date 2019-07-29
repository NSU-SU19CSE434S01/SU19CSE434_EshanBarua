package tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CheckEmptyJR {
	
checkEmpty name, email, currentAddress, phoneNumber;

	@Before
	public void setUp() {
		
		System.out.println("Before Test");
		
		name = new checkEmpty ();
		email = new checkEmpty ();
		currentAddress = new checkEmpty();
		phoneNumber = new checkEmpty();
		
	}


    @Test
    public void checkEmptyFieldN(){
   	 
    	System.out.println("test method");
    	name.checkEmptyFieldPN();
    	assertNotNull (name);
    	name.display();
    }
    

    @Test
    public void checkEmptyFieldPN(){
   	 
    	System.out.println("test method");
    	phoneNumber.checkEmptyFieldPN();
    	assertNotNull (phoneNumber);
    	phoneNumber.display();
    }
    

    @Test
    public void checkEmptyFieldCA(){
   	 
    	System.out.println("test method");
    	currentAddress.checkEmptyFieldCA();
    	assertNotNull (currentAddress);
    	currentAddress.display();
    }
    

    @Test
    public void checkEmptyFieldE(){
   	 
    	System.out.println("test method");
    	email.checkEmptyFieldPN();
    	assertNotNull (email);
    	email.display();
    }
}
