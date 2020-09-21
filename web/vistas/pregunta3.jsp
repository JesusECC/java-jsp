
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                    <h1>Ejecicio 3</h1>
                    <div class="container-fluid">
                        <form action="Controlador" method="post" act>
                            <input type="hidden" id="action" name="accion" value="pregunta3">
                            <div class="form-group">
                                <label for="numero" >Ingrese numero: </label>
                                <input class="form-control" type="number" placeholder="Ingrese numero" name="numero" id="numero"> 
                            </div>
                            <div class="form-group">
                                <label for="base">Base: </label>
                                <input class="form-control" type="number" placeholder="Ingrese numero" name="base" id="base"> 
                            </div>
                            <button type="submit" class="btn btn-primary">Enviar</button>
                             <a href="Controlador?accion=index" class="btn btn-success ml-5">Atras</a>
                        </form>
                       <br/><br/>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
