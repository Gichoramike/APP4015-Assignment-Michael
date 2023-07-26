public class convertToCelsius {
    public static void main(String[] args) {
        Double fahrenheit = 94.0;
        Double temperature = ((fahrenheit-32)*5/9);
        System.out.println("The temperature is "+temperature+" degree celcius");
        System.out.println("The temperature is "+ Math.round(temperature)+" degree celcius");
    }
}
