
package ModeloDAO;

import Interfaces.distanciaCRUD;
import Modelo.Punto;
import java.util.List;


public class DistanciaDAO implements distanciaCRUD {

    @Override
    public String distanciaEntreDosPuntos(Punto p1, Punto p2, Punto p3) {
        String resultado="";
        double distA = Math.sqrt(Math.pow(((p2.getX1() - p1.getX1())), 2) + Math.pow((p2.getY1() - p1.getY1()), 2));
        double distB = Math.sqrt(Math.pow(((p3.getX1() - p2.getX1())), 2) + Math.pow((p3.getY1() - p2.getY1()), 2));
        double distC = Math.sqrt(Math.pow(((p1.getX1() - p3.getX1())), 2) + Math.pow((p1.getY1() - p3.getY1()), 2));
        
          
          
        // formula
        //a + b > c
        //
        //a + c > b
        //
        //b + c > a
          
        if((distA + distB) > distC) {
            if((distA + distC) > distB) {
                if((distB + distC) > distA) {
                    resultado = " Forma un triángulo , el lado A: "+distA +" lado B: "+ distB + "lado C: "+ distC;
                } else {resultado = "No forma un triángulo";};
            } else {
                resultado = "No forma un triángulo ";
            }
        } else {
            resultado = "No forma un triángulo ";
        }
        return resultado;
    }

}
