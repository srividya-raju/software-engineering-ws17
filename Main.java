import java.util.Scanner;

class Main {
  public static void main(String[] args)
  {
	  Scanner sc1;
	  Scanner sc2;
	  sc1=new Scanner(System.in);
	  sc2=new Scanner(System.in);
	  System.out.println("Please enter type of conversion: MetersToYards/ DollarToEuro/ CelsiusToFahrenheit/ MetersToMiles/ CelsiusToKelvin/ GBPToEuro ");
	  
	  String conversion = sc1.next();
	  //System.out.println(conversion);
	  System.out.println("Please enter value to convert: ");
	  
	  String value = sc2.next();
	 sc2.close();
	 
	 try{
	 AbstractFactory ConverterFact = new ConverterFactory();
		
		//UnitConverter conversion1 = ConverterFact.Create(conversion);
		 UnitConverter conversion1 = ConverterFact.Create(conversion);
	    double value1 = Double.parseDouble(value);
	    double result =conversion1.convert(value1);
	    System.out.println("Converted value is:"+result);
	    sc1.close();
	 }
	 catch(IllegalArgumentException e)
	 {
		 System.out.println("INVALID CONVERSION!!");
		 e.getStackTrace();
	 }

    /*if(conversion.equals("MetersToYards"))
    {
    	UnitConverter myConverter = new MetersToYards();
        double meters = Double.parseDouble(value);
        double yards = myConverter.convert(meters);	
        System.out.println(myConverter.toString() + " has converted " + meters + " m to " + yards + " yd");
    }
    else if (conversion.equals("DollarToEuro"))
    {
    	UnitConverter myConverter = new DollarToEuroConverter();
        double aLotOfDollars = Double.parseDouble(value);
        double aLotOfEuros = myConverter.convert(aLotOfDollars);
        System.out.println(myConverter.toString() + " has converted " + aLotOfDollars + " USD to " + aLotOfEuros + " EUR!");
	}
    else if (conversion.equals("CelsiusToFahrenheit"))
    {
    	UnitConverter myConverter = new CelsiusToFahrenheitConverter();
        double Celsius = Double.parseDouble(value);
        double Fahrenheit = myConverter.convert(Celsius);
        System.out.println(myConverter.toString() + " has converted " + Celsius + " degree to " + Fahrenheit + " F");
	}
    else if (conversion.equals("MetersToMiles"))
    {
    	UnitConverter myConverter = new MetersToMilesConverter();
        double meter = Double.parseDouble(value);
        double miles = myConverter.convert(meter);
        System.out.println(myConverter.toString() + " has converted " + meter + " m to " + miles + " mi");
	}
    else
    	System.out.println("not available");*/
    
    /*
     * TODO
     *
     * use desired conversion here
     *
    */

      }
}
