import java.util.Arrays;

public class arrayReverse {
       public static void main(String[] args) {
        String[] pallets = {"B14", "A11", "B12", "A13"};
        
        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }
        
        System.out.println("Reverse ....");
        Arrays.sort(pallets, java.util.Collections.reverseOrder());
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }
    }
}
