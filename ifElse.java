import java.util.Random;

public class ifElse {
    public static void main(String[] args) {
        Random random = new Random();
        int dayUnitlExpiration = random.nextInt(12);
        int discountPercentage = 0;

        if (dayUnitlExpiration==1) 
        {
            discountPercentage= 20;
        } 
        if(dayUnitlExpiration<=5){
            discountPercentage=10;
        }
        if (dayUnitlExpiration>1) {
            System.out.println("Your subrscription has expired");
        }
        else if(dayUnitlExpiration==1)
        {
            System.out.println("Your subscription expires within a day");
            System.out.println("Renew now and save"+ discountPercentage + "%!");

        }
        else if(dayUnitlExpiration<=5)
        {
            System.out.println("Your subscription expires is:"+ dayUnitlExpiration +"days");
            System.out.println("Renew now and save"+ discountPercentage + "%!");

        }
        else if(dayUnitlExpiration<=10)
        {
            System.out.println("Your subscription expires is:"+ dayUnitlExpiration +"days");
            System.out.println("Your subscription will expire soon.Renew now!");

        }
        
    }
}
