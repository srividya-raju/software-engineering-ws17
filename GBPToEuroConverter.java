public class GBPToEuroConverter extends CurrencyConverter
{
  private GBPToEuroConverter() { }
  
  private static final GBPToEuroConverter INSTANCE = new GBPToEuroConverter();

  public double convert(double inCurrency) {
    return inCurrency*1.14;
  }

  public String toString(){
    return "GBP to Euro Converter";
  }

  public void print(){
    System.out.println(toString());
  }
  
  public static UnitConverter create() {
	  return INSTANCE;
	  }
  
};
