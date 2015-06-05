package firstDemo;

import org.junit.Assert;
import org.junit.Test;

public class testDemo {
	
	@Test
	public void testAdd(){
		int a = 10;
		int b = 20;
		int sum ;
		
		sum = a+ b;
		
		Assert.assertEquals(30, sum);
	}
	
	
	
}

