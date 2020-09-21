package ModeloDAO;

import Interfaces.baseXCRUD;
import com.sun.xml.xsom.impl.scd.Iterators;
import java.util.ArrayList;
import java.util.List;

public class basexDAO implements baseXCRUD {

    @Override
    public String bumeracionBase(int numero, int base) {
//        for (int i = 2; i <= 36; i++) {
        System.out.println(numero + " de base " + base + " a base 10 es " + Integer.toString(numero, base));
//        }
        final int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
        return Integer.toString(numero, base);
    }

    @Override
    public int[][] matriz() {
        final int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
          return matrix;      
    }

}
