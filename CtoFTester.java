public class CtoFTester{
    public static void main(String[] args){
	System.out.println("Use celsiusToFahrenheit or fahrenheitToCelsius");
    }
}

public double celsiusToFahrenheit(double c){
	return c * 1.8 + 32;
}
   
public double fahrenheitToCelsius(double f){
	return (f - 32) / 1.8;
    }
}

	

