<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Discord</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
    <nav class="navbarDC navbar-expand-lg navbar-light navBar">
        <h1 class="tittle">Discord</h1>
        <a class="aNabvar" href="general?url=dicordIndex">Inicio</a>
    </nav>

    <div class="container">
        <br> <br> <br> <br>
        <h3>Publicar</h3>

        <br> <br>

    <form action="general" method="post">
        <label for="">Usuario</label>
        <input type="text" class="form-control" placeholder="@Ejemplo123" name="username">

        <br> <br>
        <label for="">Texto</label>
        <input type="text" class="form-control" placeholder="Ejemplo..." name="publicacion">

        <br> <br>
        <center>
            <button class="botonA" type="submit" name="url" value="nuevaPublicacionDC">Publicar</button>
        </center>
        
    </form>

    </div>

    <br> <br> <br> <br> <br> <br> <br>

    <footer class="navbarDC">
        <center>
            <p>AndresHincapie@Copyright</p>
        </center>
    </footer>
</body>
</html>