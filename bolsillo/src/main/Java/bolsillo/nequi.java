package bolsillo;

public class nequi extends bolsillo {
    
    private double numCelular;
    private double pass;
    private String nombre;
    private String correo;
    private double recarga=0;
    private double retiro=0;
    private double saldoFinal;

//constructor vacio 

public nequi(){
    
} 

public nequi( double numCelular, double pass, String nombre, String correo, double recarga, double retiro, double saldoFinal){
    this.numCelular=numCelular;
    this.pass=pass;
    this.nombre=nombre;
    this.correo=correo;
    this.recarga=recarga;
    this.retiro=retiro;
    this.saldoFinal=saldoFinal;
}

//metodos get y set
public double getNumCelular(){
    return numCelular;
}

public void setNumCelular(double numCelular){
    this.numCelular=numCelular;
}

public double getPass(){
    return pass;
}

public void setPass(double pass){
    this.pass=pass;
}

public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public String getCorreo(){
    return correo;
}

public void setCorreo(String correo){
    this.correo=correo;
}

public double getRacarga(){
    return recarga;
}

public void setRecarga(double recarga){
    this.recarga=recarga;
}

public double getRetiro(){
    return retiro;
}

public void setRetiro(double retiro){
    this.retiro=retiro;
}

public double getSaldoFinal(){
    return saldoFinal;
}

public void setSaldoFinal(double saldoFinal){
    this.saldoFinal=saldoFinal;
}


public void iniciarSesion(){
    validacionInicio();
}
public void validacionInicio(){

} 

public double mostrarTotal() {
    return saldoFinal;
}

public double recargarDinero(){
    recarga=saldoFinal+saldoFinal;

    return recarga;
}

public double retirarDinero(){
    if (saldoFinal<retiro){
        //saldo insuficiente 
        return 0;
    }else{
        saldoFinal=saldoFinal-retiro;
        return retiro;
    }
}
}
