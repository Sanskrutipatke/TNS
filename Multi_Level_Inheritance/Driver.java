package Multi_Level_Inheritance;

public class Driver {

	public static void main(String[] args) {
	
		//Country c=new Country();
		
		City c= new City();
		
		c.setCityName("Pune");
		c.setArea(100.89f);
		c.setCapital("Delhi");
		c.setCode(001);
		c.setCountryName("India");
		c.setLanguage("Marathi");
	    c.setPopulationCity(4567);
	    c.setStateName("Maharshtra");
	    
	    System.out.println(c);

		

	}

}
