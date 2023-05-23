function login(){
var numCuenta, password

nunCuenta= document.getElementById("Cuenta").Value;
password= document.getElementById("password").Value;

if (numCuenta=="102030" && password=="12345"){
    alert("Iniciaste sesion");
} else { (numCuenta !="102030" && password!="12345")
    alert("Datos incorrectos, intente nuevamente")
}
}