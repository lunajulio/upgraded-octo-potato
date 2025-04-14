// importar la funcion de la clase problem9

import medium.Problem17;

public class main {
    public static void main(String[] args) {
        Problem17 problem17 = new Problem17();
        int[] nums = {3, 2, 1, 0, 4};
        boolean result = problem17.jumpGame(nums);
        System.out.println("Can jump to the end: " + result);
        
    }
}
