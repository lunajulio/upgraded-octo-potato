// importar la funcion de la clase problem9

import medium.Program20;

public class main {
    public static void main(String[] args) {
        Program20 problem20 = new Program20();
        int[] nums = {3, 0, 6, 1, 5};
        int result = problem20.hIndex(nums);
        System.out.println("The h-index is: " + result);
        
    }
}
