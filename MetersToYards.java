
public class MetersToYards extends LengthConverter {
	private MetersToYards() { }
	
	private static final MetersToYards INSTANCE = new MetersToYards();

	  public double convert(double inLength) {
	    return inLength /0.9144;
	  }
	  
	  public String toString(){
		    return "Meters to Yards Converter";
		  }

		  public void print(){
		    System.out.println(toString());
		  }
		  
		  public static UnitConverter create() {
			  return INSTANCE;
			  }
}
