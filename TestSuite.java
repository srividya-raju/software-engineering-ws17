import TinyTestJ.Test;
import static TinyTestJ.Assert.*;

public class TestSuite {
  @Test public static void DETest1() {
    //UnitConverter test = new DollarToEuroConverter();
	  UnitConverter test =DollarToEuroConverter.create();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest2() {
   // UnitConverter test = new DollarToEuroConverter();
	  UnitConverter test =DollarToEuroConverter.create();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
  
  @Test public static void DETest3() {
	    //UnitConverter test = new DollarToEuroConverter();
	    UnitConverter test =DollarToEuroConverter.create();
	    double result = test.convert(0);
	    assertEquals(0,result,0.001);
	  }
  
  @Test public static void MMTest1() {
	    //UnitConverter test = new MetersToMilesConverter();
	  UnitConverter test =MetersToMilesConverter.create();
	    double result = test.convert(1000);
	    assertEquals(0.62137,result,0.001);
	  }
  
  @Test public static void MMTest2() {
	    //UnitConverter test = new MetersToMilesConverter();
	  UnitConverter test =MetersToMilesConverter.create();
	    double result = test.convert(0);
	    assertEquals(0,result,0.001);
	  }
  @Test public static void MMTest3() {
	    //UnitConverter test = new MetersToMilesConverter();
	  UnitConverter test =MetersToMilesConverter.create();
	    double result = test.convert(-52);
	    assertEquals(-0.323,result,0.001);
	  }
  @Test public static void CFTest1() {
	    //UnitConverter test = new CelsiusToFahrenheitConverter();
	  UnitConverter test =CelsiusToFahrenheitConverter.create();
	    double result = test.convert(12);
	    assertEquals(53.6,result,0.001);
	  }
  @Test public static void CFTest2() {
	    //UnitConverter test = new CelsiusToFahrenheitConverter();
	  UnitConverter test =CelsiusToFahrenheitConverter.create();
	    double result = test.convert(0);
	    assertEquals(32.0,result,0.001);
	  }
  @Test public static void CFTest3() {
	    //UnitConverter test = new CelsiusToFahrenheitConverter();
	  UnitConverter test =CelsiusToFahrenheitConverter.create();
	    double result = test.convert(-32);
	    assertEquals(25.6,result,0.001);
	  }
  @Test public static void MYTest1() {
	   // UnitConverter test = new MetersToYards();
	  UnitConverter test =MetersToYards.create();
	    double result = test.convert(100);
	    assertEquals(109.361,result,0.001);
	  }
  @Test public static void MYTest2() {
	    //UnitConverter test = new MetersToYards();
	  UnitConverter test =MetersToYards.create();
	    double result = test.convert(0);
	    assertEquals(0,result,0.001);
	  }
  @Test public static void MYTest3() {
	    //UnitConverter test = new MetersToYards();
	  UnitConverter test =MetersToYards.create();
	    double result = test.convert(-32);
	    assertEquals(-34.99,result,0.001);
	  }
  @Test public static void CKTest1() {
	   // UnitConverter test = new MetersToYards();
	  UnitConverter test =CelsiusToKelvinConverter.create();
	    double result = test.convert(100);
	    assertEquals(373.15,result,0.001);
	  }
 @Test public static void CKTest2() {
	    //UnitConverter test = new MetersToYards();
	  UnitConverter test =CelsiusToKelvinConverter.create();
	    double result = test.convert(0);
	    assertEquals(273.15,result,0.001);
	  }
 @Test public static void CKTest3() {
	    //UnitConverter test = new MetersToYards();
	  UnitConverter test =CelsiusToKelvinConverter.create();
	    double result = test.convert(-32);
	    assertEquals(241.1499,result,0.001);
	  }
 @Test public static void GETest1() {
	   // UnitConverter test = new MetersToYards();
	  UnitConverter test =GBPToEuroConverter.create();
	    double result = test.convert(100);
	    assertEquals(113.999,result,0.001);
	  }
@Test public static void GETest2() {
	    //UnitConverter test = new MetersToYards();
	  UnitConverter test =GBPToEuroConverter.create();
	    double result = test.convert(0);
	    assertEquals(0,result,0.001);
	  }
@Test public static void GETest3() {
	    //UnitConverter test = new MetersToYards();
	  UnitConverter test =GBPToEuroConverter.create();
	    double result = test.convert(-32);
	    assertEquals(-36.48,result,0.001);
	  }
  
  
}
