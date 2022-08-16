package com.quintrix.jfs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        
        Car honda = new Car();
        honda.setName("Honda Accord");
        honda.setYear(2005);

        try {
        	ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			String json = ow.writeValueAsString(honda);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    }
}
