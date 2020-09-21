<%-- 
    Document   : respuestaPregunta1
    Created on : Sep 18, 2020, 9:31:52 PM
    Author     : Jesus
--%>

<%@page import="ModeloDAO.DistanciaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col">
                    <% DistanciaDAO distanciaDAO = new DistanciaDAO();%>
                    <h1>Respuesta de la Pregunta 1</h1>
                    <label>l aconversion es : </label>
                    <c:out value="${resultado}"/>
                    <a href="Controlador?accion=index" class="btn btn-success">Atras</a><br/><br/>
                </div>
            </div>

            <div class="row" >
                <div class="col">
                    <% Object matrix = request.getParameter("matriz"); %>
                    <table class="table table-borderless">
                        <!--                        <thead>
                                                    <tr>
                                                        <th scope="col">#</th>
                                                        <th scope="col">First</th>
                                                        <th scope="col">Last</th>
                                                        <th scope="col">Handle</th>
                                                    </tr>
                                                </thead>-->
                        <tbody>
                           <% for(int a=0; a < matrix.length() ;a++){ %>
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Mark</td>
                                    <td>Otto</td>
                                    <td>@mdo</td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
