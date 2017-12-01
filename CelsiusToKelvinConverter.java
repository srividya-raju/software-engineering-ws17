
public class CelsiusToKelvinConverter extends TemperatureConverter {
	private CelsiusToKelvinConverter() { }
	
	private static final CelsiusToKelvinConverter INSTANCE = new CelsiusToKelvinConverter();

	  public double convert(double inTemp) {
	    return inTemp +273.15;
	  }
	  
	  public String toString(){
		    return "Celsius to Kelvin Converter";
		  }

		  public void print(){
		    System.out.println(toString());
		  }
		  
		  public static UnitConverter create() {
			  return INSTANCE;
			  }
}
