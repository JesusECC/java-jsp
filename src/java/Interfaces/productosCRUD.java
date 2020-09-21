
package Interfaces;

import Modelo.Productos;
import java.util.List;


public interface productosCRUD {

    public List<Productos> listaProductos();

    public String mayorPrecio_menorPrecio_tercerProducto(List prod);

    public List<Productos> listaMayorProducto(List prod);

    public List<Productos> listaMenorProducto(List prod);
    public  List<Productos> tercerProducto(List prod);
    public  List<Productos> metodoShellAscendente(List<Productos> prod);
    public  List<Productos> metodoShellDescendente(List<Productos> prod);

}
