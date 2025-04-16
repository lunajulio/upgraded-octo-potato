package medium;
import java.util.Arrays;
import java.util.Collections;

public class Program20 {
    public int hIndex(int[] citations) {
        // Si el array está vacío, el h-index es 0
        if (citations.length == 0) {
            return 0;
        }
        
        // Si hay un solo elemento, el h-index es 0 o 1
        if (citations.length == 1) {
            return citations[0] > 0 ? 1 : 0;
        }
        
        // Ordenar de mayor a menor
        Integer[] citationsBoxed = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(citationsBoxed, Collections.reverseOrder());
        citations = Arrays.stream(citationsBoxed).mapToInt(Integer::intValue).toArray();
        
        // Buscar el h-index
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] < i + 1) {
                return i;
            }
        }
        
        return citations.length;
    }
}
