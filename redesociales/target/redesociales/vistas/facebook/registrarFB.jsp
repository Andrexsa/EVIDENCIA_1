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
    </nav>

    <div class="container">
        <br> <br> <br> <br>
        <h3>Iniciar sesión</h3>

        <br> <br>

    <form action="general" method="post">
        <label for="">Usuario</label>
        <input type="text" class="form-control" placeholder="@Ejemplo123" name="username">

        <br> <br>
        <label for="">Nombre</label>
        <input type="text" class="form-control" placeholder="Ejemplo123" name="namme">

        <br> <br>
        <label for="">Contraseña</label>
        <input type="password" class="form-control" placeholder="*******" name="password">

        <br> <br>
        <center>
            <button class="botonA" type="submit" name="url" value="registrarUsuarioFB">Registrarse</button>
        </center>
        
    </form>
        <center>
        <br> <br>
        <a class="botonA" href="general?url=loginFB">Iniciar sesión</a>
        </center>

    </div>

    <br> <br> <br> <br> <br> <br> <br>

    <footer class="navbarFB">
        <center>
            <p>AndresHincapie@Copyright</p>
        </center>
    </footer>
</body>
</html>