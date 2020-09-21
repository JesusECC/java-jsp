/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Interfaces.circunferenciaCRUD;
import Modelo.Punto;


public class CircunferenciaDAO implements circunferenciaCRUD {

    @Override
    public String distanciaEntreDosPuntos(Punto p1, Punto p2, Punto p3) {
       String resultado="";
        double radio = Math.sqrt(Math.pow(((p2.getX1() - p1.getX1())), 2) + Math.pow((p2.getY1() - p1.getY1()), 2));
        double radio2 = Math.sqrt(Math.pow(((p3.getX1() - p1.getX1())), 2) + Math.pow((p3.getY1() - p1.getY1()), 2));
         
        if(radio2 < radio ) {
            resultado = "está dentro, radio: "+ radio+ " radio2: "+radio2;
        } else if( radio == radio2) {
            resultado = "está borde, radio: "+ radio+ " radio2: "+radio2;
        } else if(radio2 > radio) {
            resultado = "está fuera, radio: "+ radio+ " radio2: "+radio2;
        }
        return resultado;
    }
    
}
