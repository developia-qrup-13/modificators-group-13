package main;

public interface UserInterface {
	
   private static String lastName(String name,String surname){
	   return name+" "+surname;
   }
   
    default void helloInterface() { // non permitted static
	   System.out.println("Hello Interface");
    }
    
      public  String lastName3(String name,String surname); // non permitted static
    
      String lastName4(String name,String surname); // public  // non permitted static
     
//     protected String lastName5(String name,String surname) {
//  	   return name+" "+surname; 
//     }
}
