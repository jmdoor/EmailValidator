import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class emailValidator {
	
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pattern = Pattern.compile(emailRegex); 
        
        if (email == null) // if input entered is not in correct format it will return false. 
            return false; 
        
        return pattern.matcher(email).matches(); 
    } 
  
    
    public static void main(String[] args) 
    { 
    	Scanner em = new Scanner (System.in); //take input from user
    	
		System.out.println ("Please enter an email that you would like to check: ");		
		
		String email = em.nextLine(); //store input 
		
		String [] emailList = {"josh@email.com", "jerry@email.com", "hcl@email.com", "java@email.com", "tim@gmail.com", 
				"elpaso@yemail.com", "sanantonio@email.com"}; //list of fake email addresses
		        
    	if (isValid(email)) /*Calls boolean method and compares to Regex above, if matches it will print valid */
    			{
            System.out.println("The email is a valid type of email"); 
            
            for (int i = 0; i < emailList.length; i++) { 
            	
        		if (emailList[i].equals(email)) {
        			System.out.println ("The email entered matches one of the known emails in directory."); 
        			//if email equals a value within the array it will return this message
        				} 
        		}
            
    		}else
    						System.out.println("Email is NOT Valid");    	   		
    	
    } 
}
