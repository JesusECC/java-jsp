

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <strong></strong>
        <title>JSP Page</title>
    </head>
    <body>
        
        <!--Controlador?accion=pregunta1-->

        <div class="container">
            <form action="Controlador" method="post">
                <h1>Pregunta 1</h1>
                <div class="row mt-4">
                    <input type="hidden" id="action" name="accion" value="guardar">
                    <div class="col">
                        <h3> Ingrese punto 1</h3>
                        <div class="form-group">
                            <label for="x1">x1</label>
                            <input type="number" class="form-control" id="x1" name="x1" value="">
                        </div>
                        <div class="form-group">
                            <label for="y1">x2</label>
                            <input type="number" class="form-control" id="x2" name="x2" value="">
                        </div>
                    </div>
                    <div class="col">
                         <h3> Ingrese punto 2</h3>
                        <div class="form-group">
                            <label for="x3">x1</label>
                            <input type="number" class="form-control" id="x3" name="y1" value="">
                        </div>
                        <div class="form-group">
                            <label for="x4">y1</label>
                            <input type="number" class="form-control" id="x4" name="y2" value="">
                        </div>
                    </div>
                    <div class="col">
                         <h3> Ingrese punto 3 </h3>
                        <div class="form-group">
                            <label for="x3">x1</label>
                            <input type="number" class="form-control" id="z1" name="z1" value="5">
                        </div>
                        <div class="form-group">
                            <label for="x4">y1</label>
                            <input type="number" class="form-control" id="z2" name="z2" value="7">
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Enviar</button>
                <a href="Controlador?accion=index" class="btn btn-success ml-5">Atras</a><br/><br/>
            </form>
        </div>

       
    </body>
</html>
