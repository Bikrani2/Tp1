class ConversionTemperature{
  
  public static void main(String[] args){
    double temperatureCelsius=Double.parseDouble(args[0]);
    double temperatureFahrenheit=(9.0/5)*temperatureCelsius+32;
    System.out.println("La temperature passé en argument en degres Celsius: "+temperatureCelsius);
    System.out.println(temperatureCelsius+" en degres Celsius equivalent à "+temperatureFahrenheit+" degres Fahrenheit");
  }
  
}
