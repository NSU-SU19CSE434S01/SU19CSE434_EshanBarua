import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class assertTest {

	
	int num;
	String temp, str;
	

	@Before
	public void setUp() throws Exception {
		
		num = 5;
		temp = null;
		str = "The code is working";
	}


	@Test
	public void test() {
		
		//equality check
		assertEquals ("The code is working", str);
		
		//false condition check
		assertFalse(num>6);
		
		//not null value check
		assertNotNull(str);
		
		//null value check
		assertNulll(temp);
		
		//true condition check
		assertTrue(num == 5);
			
	}
	


	private void assertNulll(String temp2) {
		// TODO Auto-generated method stub
		
	}

}
