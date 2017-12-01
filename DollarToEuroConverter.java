public class DollarToEuroConverter extends CurrencyConverter
{
  private DollarToEuroConverter() { }
  
  private static final DollarToEuroConverter INSTANCE = new DollarToEuroConverter();

  public double convert(double inDollars) {
    return inDollars*0.85;
  }

  public String toString(){
    return "Dollar to Euro Converter";
  }

  public void print(){
    System.out.println(toString());
  }
  
  public static UnitConverter create() {
	  return INSTANCE;
	  }
  
};
