import java.util.Random;

public class overiding {
    public static void main(String[] args) {
        Random dice = new Random();
        int roll1 = dice.nextInt();
        int roll2 = dice.nextInt(101);
        int roll3 = dice.nextInt(51)+50;


        System.out.println("First roll: "+roll1);
        System.out.println("Second roll: "+roll2);
        System.out.println("Third roll: "+roll3);

    }
}
