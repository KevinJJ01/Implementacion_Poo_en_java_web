<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styleIniSesDavi.css">
    <title>BOLSILLO / Daviplata</title>
</head>
<body>
    <button type="button" class="botin">
        <a href="bolsillo?option=index" >Salir</a>
    </button>
    <button type="button" class="botin">
        <a href="bolsillo?option=index" >Atras</a>
    </button>

    <div id="KEVI"class="container">
        <h1>INICIAR SESION BOLSILLO ONE</h1>
       </div>



    <div  class="container2">
    <h2>Por favor llena los espacios</h2>
    <div>
        <div>Ingresa tu numero de cuenta</div>
        <input id="numCuenta" type="number" class="form-control" ></input>
    </div>
    <div>
        <div>Ingresa la contraseña</div>
        <input id="password" type="password" class="form-control"></input>
    </div>
    <button id="boton"  class="botin" onclick="login()"><a href="bolsillo?option=home" >Iniciar sesion</a></button>
    </div>

<script>src="js/main.js"</script>
</body>
</html>