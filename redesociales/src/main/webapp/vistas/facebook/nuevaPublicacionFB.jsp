<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Facebook</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
    <nav class="navbarFB navbar-expand-lg navbar-light navBar">
        <h1 class="tittle">Faceboook</h1>
        <a class="aNabvar" href="general?url=facebookIndex">Inicio</a>
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
            <button class="botonA" type="submit" name="url" value="nuevaPublicacionFB">Publicar</button>
        </center>
        
    </form>

    </div>

    <br> <br> <br> <br> <br> <br> <br>

    <footer class="navbarFB">
        <center>
            <p>AndresHincapie@Copyright</p>
        </center>
    </footer>
</body>
</html>