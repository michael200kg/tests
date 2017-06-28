package com.epam.tests.removedups;

public class RemoveDups {
   
	public String remove(String string) {
	   if(string==null) {
		   return null;
	   }
	   if(string.length()==1) {
		   return string;
	   }
	   StringBuilder sb = new StringBuilder();
	   char currentElementInString = string.charAt(1);
	   char previousElementInString = string.charAt(0);
	   int dupCounter=0;
	   for(int charPosition=2;charPosition<string.length();charPosition++) {
		   if(currentElementInString==previousElementInString) {
			   dupCounter++; 
		   }
		   else {
			   if(dupCounter>0) {
				   sb.append((dupCounter+1)+""+previousElementInString);
				   dupCounter=0;
			   }
			   else {
				   sb.append(previousElementInString);  
			   }
		   }
		   
		   currentElementInString = string.charAt(charPosition);
		   previousElementInString = string.charAt(charPosition-1);
	   }
	   if(dupCounter>0) {
		   if(previousElementInString==currentElementInString) {
		      sb.append((dupCounter+2)+""+previousElementInString); 
		   }
		   else {
			  sb.append((dupCounter+1)+""+previousElementInString+currentElementInString); 
		   }
	   }
	   else {
		   if(previousElementInString!=currentElementInString) {
		      sb.append(previousElementInString+""+currentElementInString); 
		   }
		   else {
			   sb.append("2"+previousElementInString);
		   }
	   }
	   
	   
	   return sb.toString();
   }
	
	public String removeNew(String s) {
		   if(s==null) {
			   return null;
		   }
		   if(s.length()==1) {
			   return s;
		   }
		   
		   String string=s+" ";
		   StringBuilder sb = new StringBuilder();
		   int currentPosition = 0;
		   while (currentPosition<string.length()-1) {    
			 
			 char currentElementInString = string.charAt(currentPosition);
		     char nextElementInString = string.charAt(currentPosition+1);
		     int dupCount=0;
		     
		     while(currentElementInString==nextElementInString && currentPosition<string.length()-2) {
		    	 dupCount++;
		    	 currentPosition++;
		    	 currentElementInString = string.charAt(currentPosition);
			     nextElementInString = string.charAt(currentPosition+1);
		     }
		     
		     if(dupCount>0) {
		    	 sb.append(dupCount+1+""+currentElementInString);
		     }
		     else {
		    	 sb.append(currentElementInString); 
		     }
	    	 currentPosition++;
		   }
		   return sb.toString();
	   }	
}
