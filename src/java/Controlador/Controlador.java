package Controlador;

import Modelo.Productos;
import Modelo.Punto;
import ModeloDAO.CircunferenciaDAO;
import ModeloDAO.DistanciaDAO;
import ModeloDAO.ProductosDAO;
import ModeloDAO.basexDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String pregunta1 = "vistas/pregunta1.jsp";
    String respuestaPregunta1 = "vistas/respuestaPregunta1.jsp";
    String pregunta2 = "vistas/pregunta2.jsp";
    String pregunta3 = "vistas/pregunta3.jsp";
    String respuestaPregunta3 = "vistas/respuestaPregunta3.jsp";
    String pregunta4 = "vistas/pregunta4.jsp";
    String respuestaPregunta4 = "vistas/respuestaPregunta4.jsp";
    String index = "index.jsp";

    Punto p1 = new Punto();
    Punto p2 = new Punto();
    Punto p3 = new Punto();

    DistanciaDAO distanciaDAO = new DistanciaDAO();
    ProductosDAO prod = new ProductosDAO();
    basexDAO basex = new basexDAO();
    CircunferenciaDAO circu = new CircunferenciaDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("pregunta1")) {
            acceso = pregunta1;
        } else if (action.equalsIgnoreCase("pregunta2")) {
            List lista = new ArrayList<>();
            lista = prod.listaProductos();
            request.setAttribute("lista", lista);
            request.setAttribute("mayor", prod.listaMayorProducto(lista));
            request.setAttribute("menor", prod.listaMenorProducto(lista));
            request.setAttribute("tercero", prod.tercerProducto(lista));
            request.setAttribute("shellAsc", prod.metodoShellAscendente(lista));
            acceso = pregunta2;
        } else if (action.equalsIgnoreCase("pregunta3")) {
            acceso = pregunta3;
        } else if (action.equalsIgnoreCase("pregunta4")) {
            acceso = pregunta4;
        } else if (action.equalsIgnoreCase("index")) {
            acceso = index;
        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("guardar")) {
            p1.setX1(Integer.parseInt(request.getParameter("x1")));
            p1.setY1(Integer.parseInt(request.getParameter("x2")));
            p2.setX1(Integer.parseInt(request.getParameter("y1")));
            p2.setY1(Integer.parseInt(request.getParameter("y2")));
            p3.setX1(Integer.parseInt(request.getParameter("z1")));
            p3.setY1(Integer.parseInt(request.getParameter("z2")));
            String triangulo = distanciaDAO.distanciaEntreDosPuntos(p1, p2, p3);
            request.setAttribute("resultado", triangulo);
            acceso = respuestaPregunta1;
        } else if (action.equalsIgnoreCase("pregunta3")) {
            int numero = Integer.parseInt(request.getParameter("numero"));
            int base = Integer.parseInt(request.getParameter("base"));

            request.setAttribute("resultado", basex.bumeracionBase(numero, base));
            request.setAttribute("matriz", basex.matriz());
            acceso = respuestaPregunta3;
        } else if (action.equalsIgnoreCase("p4")) {
            p1.setX1(Integer.parseInt(request.getParameter("x1")));
            p1.setY1(Integer.parseInt(request.getParameter("x2")));
            p2.setX1(Integer.parseInt(request.getParameter("y1")));
            p2.setY1(Integer.parseInt(request.getParameter("y2")));
            p3.setX1(Integer.parseInt(request.getParameter("z1")));
            p3.setY1(Integer.parseInt(request.getParameter("z2")));
            request.setAttribute("resultado", circu.distanciaEntreDosPuntos(p1, p2, p3));
            acceso = respuestaPregunta4;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
