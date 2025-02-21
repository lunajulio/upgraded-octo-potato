// importar la funcion de la clase problem9
import medium.Problem11;
import medium.Problem9;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Problem11 p11 = new Problem11();
        int[] numeros = {2, 7, 11, 15};
        int target = 9;
        
        int[] resultado = p11.twoSum2(numeros, target);
        
        System.out.println(Arrays.toString(resultado));
    }
}
