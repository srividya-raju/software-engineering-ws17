import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ConverterFactory extends AbstractFactory {
	//public static UnitConverter mclass;
	
	final static Map<String, Supplier<UnitConverter>> mapping = new HashMap<>();
	  static {
		  mapping.put("MetersToYards", MetersToYards::create);
		  mapping.put("DollarToEuro", DollarToEuroConverter::create);
		  mapping.put("CelsiusToFahrenheit", CelsiusToFahrenheitConverter::create);
		  mapping.put("MetersToMiles", MetersToMilesConverter::create);
		  mapping.put("CelsiusToKelvin", CelsiusToKelvinConverter::create);
		  mapping.put("GBPToEuro", GBPToEuroConverter::create);
		  
	  } 
	  @Override
	  public UnitConverter Create(String str){
	     Supplier<UnitConverter> obj = mapping.get(str);
	     if(obj != null) {
	       return obj.get();
	     }
	     throw new IllegalArgumentException("No such conversion " + str.toUpperCase());
	  }
	     
/*	@Override
	public  UnitConverter Create(String str) {
		// TODO Auto-generated method stub
		if (str.equals("MetersToYards")){
			mclass = MetersToYards.create();
			return mclass;
		}
		else if (str.equals("DollarToEuro")){
			mclass = DollarToEuroConverter.create();
			return mclass;}
		else if (str.equals("CelsiusToFahrenheit")){
			mclass = CelsiusToFahrenheitConverter.create();
			return mclass;}
		else if (str.equals("MetersToMiles")){
			mclass = MetersToMilesConverter.create();
			return mclass;}
		else 
			return null;
	}*/

	/*private static UnitConverter mclass;
	private ConverterFactory(){}

	public static UnitConverter Create(String str){
		if (str.equals("MetersToYards")){
			mclass= new MetersToYards();
			return mclass;
		}
		else if (str.equals("DollarToEuro")){
			mclass= new DollarToEuroConverter();
			return mclass;}
		else if (str.equals("CelsiusToFahrenheit")){
			mclass= new CelsiusToFahrenheitConverter();
			return mclass;}
		else if (str.equals("MetersToMiles")){
			mclass= new MetersToMilesConverter();
			return mclass;}
		else 
			return null;
*/

}
