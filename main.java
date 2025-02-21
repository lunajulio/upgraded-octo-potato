// importar la funcion de la clase problem9
import medium.Problem11;
import medium.Problem12;
import medium.Problem9;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Problem12 p12 = new Problem12();
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,3,4};
        int [] result = p12.intersec(nums1, nums2);
        // imprimir los numeros distintos de cero
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(result[i]);
            }
        }
        
    }
}
