
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
                    <h1>Pregunta 3</h1>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">codigo</th>
                                <th scope="col">nombre</th>
                                <th scope="col">precio</th>
                                <th scope="col">stock</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="articulo" items="${lista}">     
                                <tr>
                                    <th scope="row"> <c:out value="${articulo.codigo}"/></th>
                                    <td> <c:out value="${articulo.nombre}"/></td>
                                    <td> <c:out value="${articulo.precio}"/></td>
                                    <td> <c:out value="${articulo.stock}"/></td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>


        <div class="container">
            <div class="row">
                <div class="col">
                    <h2>Mayor precio</h2>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">codigo</th>
                                <th scope="col">nombre</th>
                                <th scope="col">precio</th>
                                <th scope="col">stock</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="articulo" items="${mayor}">
                                <tr>
                                    <th scope="row"> <c:out value="${articulo.codigo}"/></th>
                                    <td> <c:out value="${articulo.nombre}"/></td>
                                    <td> <c:out value="${articulo.precio}"/></td>
                                    <td> <c:out value="${articulo.stock}"/></td>
                                </tr>
                            </c:forEach>

                        </tbody>
                    </table>
                </div>
                <div class="col">
                    <h2>Menor precio</h2>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">codigo</th>
                                <th scope="col">nombre</th>
                                <th scope="col">precio</th>
                                <th scope="col">stock</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="articulo" items="${menor}">
                                <tr>
                                    <th scope="row"> <c:out value="${articulo.codigo}"/></th>
                                    <td> <c:out value="${articulo.nombre}"/></td>
                                    <td> <c:out value="${articulo.precio}"/></td>
                                    <td> <c:out value="${articulo.stock}"/></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="col">
                    <h2>Tercer producto</h2>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">codigo</th>
                                <th scope="col">nombre</th>
                                <th scope="col">precio</th>
                                <th scope="col">stock</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="articulo" items="${tercero}">
                                <tr>
                                    <th scope="row"> <c:out value="${articulo.codigo}"/></th>
                                    <td> <c:out value="${articulo.nombre}"/></td>
                                    <td> <c:out value="${articulo.precio}"/></td>
                                    <td> <c:out value="${articulo.stock}"/></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <a href="Controlador?accion=index" class="btn btn-success">Atras</a><br/><br/>
        </div>
    </body>

</html>
