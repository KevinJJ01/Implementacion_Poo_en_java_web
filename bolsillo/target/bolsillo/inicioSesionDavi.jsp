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
        <a href="bolsillo?option=home" >Atras</a>
    </button>
    
    <div id="KEVI"class="container">
        <h1>INICIAR SESION</h1>
       </div>



    <div  class="container2">
    <h2>Por favor llena los espacios</h2>
    <div>
        <div>Ingresa tu numero de telefono</div>
        <input type="number" class="celular" ></input>
    </div>
    <div>
        <div>Ingresa la contrasena</div>
        <input type="password" class="password"></input>
    </div>
    <button class="botin"><a href="bolsillo?option=dashboard" >Iniciar sesion</a></button>

    </div>

    <div id="Banner" class="container2">
        <h1>Daviplata</h1>
        <img src="img/iconDavi.png" width="100px" height="100px" >
        </div>


</body>
</html>