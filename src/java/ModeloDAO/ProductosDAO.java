
package ModeloDAO;

import Interfaces.productosCRUD;
import Modelo.Productos;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductosDAO implements productosCRUD {

    @Override
    public List<Productos> listaProductos() {
        ArrayList<Productos> lista = new ArrayList<>();
//        Random rand = new Random();
        Productos[] prod = new Productos[10];
//        prod[0]= new
//        Productos prod = new Productos("cod001","juan",20,30);
//        codigo,nombre,precio,stock
        lista.add(new Productos("cod001", "juan", 20, 30));
        lista.add(new Productos("cod002", "maria", 10, 40));
        lista.add(new Productos("cod003", "carla", 15, 25));
        lista.add(new Productos("cod004", "mauricio", 31, 12));
        lista.add(new Productos("cod005", "rigoberta", 50, 7));
        lista.add(new Productos("cod006", "ana", 45, 11));
        lista.add(new Productos("cod007", "milagros", 45, 14));
        lista.add(new Productos("cod008", "ariana", 24, 18));
        lista.add(new Productos("cod009", "alexis", 10, 19));
        lista.add(new Productos("cod0010", "jose", 50, 5));
        lista.add(new Productos("cod0011", "ana", 49, 5));

        return lista;
    }

    @Override
    public String mayorPrecio_menorPrecio_tercerProducto(List prod) {
        List<Productos> lista = new ArrayList<>();
//         Los productos con mayor precio, 
//menor precio, 
//tercer producto o productos con mayor producto.
        lista = prod;
        Productos mayor = new Productos();
        Productos menor = new Productos();
        Productos terce = new Productos();
        mayor = lista.get(0);
        menor = lista.get(0);

//        for (Object object : lista) {
//            System.out.println(object.ge);
//        }
//        
        for (int i = 0; i < lista.size(); i++) {
            if (mayor.getPrecio() < lista.get(i).getPrecio()) {
                mayor = lista.get(i);
            }
            if (menor.getPrecio() > lista.get(i).getPrecio()) {
                menor = lista.get(i);
            }
            System.out.println("--> " + lista.get(i).getPrecio());
        }
        int posi = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (mayor.getPrecio() > lista.get(i).getPrecio() && posi == 3) {
                terce = lista.get(i);
            }
        }

        System.out.println("mayor --> " + mayor);
        System.out.println("menor --> " + menor);

        return "El producto con mayor precio es: " + mayor.getCodigo() + "," + "el producto con menor precio es: " + menor.getCodigo() + "," + "el tercer producto es: " + terce.getCodigo();
    }

    public List<Productos> burbuja(List<Productos> lista) {
        int i, j;
        Productos aux = new Productos();
        for (i = 0; i < lista.size() - 1; i++) {
            for (j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j + 1).getPrecio() > lista.get(j).getPrecio()) {
                    aux = lista.get(j + 1);
                    lista.set(j + 1, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }
        return lista;
    }

    @Override
    public List<Productos> listaMayorProducto(List prod) {
        List<Productos> lista = new ArrayList<>();
        List<Productos> mayor = new ArrayList<>();
        lista = burbuja(prod);
//        mayor = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(0).getPrecio() == lista.get(i).getPrecio()) {
                mayor.add(lista.get(i));
            }
        }
        return mayor;
    }

    @Override
    public List<Productos> listaMenorProducto(List prod) {
        List<Productos> lista = new ArrayList<>();
        List<Productos> menor = new ArrayList<>();
        lista = burbuja(prod);
//        mayor = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(lista.size() - 1).getPrecio() == lista.get(i).getPrecio()) {
                menor.add(lista.get(i));
            }
        }
        return menor;
    }

    @Override
    public List<Productos> tercerProducto(List prod) {
        List<Productos> lista = new ArrayList<>();
        List<Productos> tercerProd = new ArrayList<>();
        lista = burbuja(prod);
//        mayor = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(2).getPrecio() == lista.get(i).getPrecio()) {
                tercerProd.add(lista.get(i));
            }
        }
        return tercerProd;
    }

    @Override
    public List<Productos> metodoShellAscendente(List<Productos> prod) {

        int n = prod.size();
        List<Productos> asc = new ArrayList<>();
        List<Productos> des = new ArrayList<>((n - asc.size()));

        System.out.println("Metodo shell" + asc.size() + " - " + n + "-- " + (n) / 2);
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                asc.add(prod.get(i));
            } else {
                des.add(prod.get(i));
            }
        }
       
       

    
//        for (int gap = n/2; gap > 0; gap /= 2) {
//        for (int i = gap; i < n; i+= 1) {
//
//            Productos temp = asc.get(i);
//            int j;
//            for (j = i; j >= gap && asc.get(j-gap).getCodigo().compareToIgnoreCase(temp.getCodigo()); j -= gap)
//                arr.set(j,arr.get(j-gap));
//            arr.set(j,temp);
//        }
//    }

//        for (int i = 0; i < asc.size(); i++) {
//            for (int j = 0; j < asc.size() && i != j; j++) {
//                if (asc.get(i).getCodigo().compareToIgnoreCase(asc.get(j).getCodigo()) < 0) {
//                    Productos aux = new Productos();
//                    aux = asc.get(i);
//                    asc.set(i, asc.get(j));
//                    asc.set(j, aux);
//                }
//            }
//        }
        for (int i = 0; i < asc.size(); i++) {
            System.out.println("orden shell --> " + asc.get(i).getCodigo());
        }
        return asc;
    }

    @Override
    public List<Productos> metodoShellDescendente(List<Productos> prod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
