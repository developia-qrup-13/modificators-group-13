package main;

public class Main2 implements UserInterface{
	
	  // modificators - private default protected public
	  // default - susmaya görə

       private String name; // class daxilinden colde istifadesi mumkun deyil
      
       int age; //default başqa package daxilinde istifadəsi mümkün deyil
       
       protected String surname; // başqa package istifadəsi mümkün deyil ancaq extends etdiyimiz zaman görə bilərik
       
       public String userName; // hər yerdə istifadəsi mümkündür

	@Override
	public String lastName3(String name, String surname) {
		return null;
	}

	@Override
	public String lastName4(String name, String surname) {
		return null;
	}

}

