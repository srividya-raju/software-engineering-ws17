
public class CelsiusToFahrenheitConverter extends TemperatureConverter {
	private CelsiusToFahrenheitConverter() { }
	
	private static final CelsiusToFahrenheitConverter INSTANCE = new CelsiusToFahrenheitConverter();

	  public double convert(double inTemp) {
	    return inTemp * 9/5 + 32;
	  }
	  
	  public String toString(){
		    return "Celsius to Fahrenheit Converter";
		  }

		  public void print(){
		    System.out.println(toString());
		  }
		  
		  public static UnitConverter create() {
			  return INSTANCE;
			  }
}
