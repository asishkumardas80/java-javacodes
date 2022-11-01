package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateValidator {
	 public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter a date in dd/mm/yyyy format");
	        
	        String date = sc.next();
	        
	        if(dateValidation(date)==true)
	            System.out.println("Date is valid");
	        else
	            System.out.println("Date is not valid");
	 }  
	    private static boolean dateValidation(String date)
	    {
	      boolean status = false;
	    if (checkDate(date)) {
	      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	      dateFormat.setLenient(false);
	      try {
	        dateFormat.parse(date);
	        status = true;
	      } catch (Exception e) {
	        status = false;
	      }
	    }
	    return status;
	    }
	    
	    static boolean checkDate(String date) {
	    String pattern = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((?:20)[2][0-2])";
	    				
	    boolean flag = false;
	    if (date.matches(pattern)) {
	      flag = true;
	    }else {
	    	System.out.println("Date format should be dd/mm/yyyy");
	    }
	    return flag;
	  }
}
