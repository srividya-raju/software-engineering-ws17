
public class MetersToMilesConverter extends LengthConverter {
	private MetersToMilesConverter() { }
	
	private static final MetersToMilesConverter INSTANCE = new MetersToMilesConverter();

	  public double convert(double inLength) {
	    return inLength * 0.00062137;
	  }
	  
	  public String toString(){
		    return "Meters to Miles Converter";
		  }

		  public void print(){
		    System.out.println(toString());
		  }
		  
		  public static UnitConverter create() {
			  return INSTANCE;
			  }
}
