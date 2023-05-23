import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bolsillo.*;

public class bolsillo extends HttpServlet{
    daviPlata daviplata= new daviPlata();
    nequi nequi= new nequi();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entro al servlet");
        String accion = req.getParameter("accion");
        String option = req.getParameter("option");
        String operacion = req.getParameter("operacion");
        System.out.println(accion);

    if (accion != null) {
        switch(accion){
            case "iniciarSesionBolsillo":
                req.getRequestDispatcher("iniciarSesionBolsillo.jsp").forward(req, resp);
            break;
            case "quienesSomos":
                req.getRequestDispatcher("quienesSomos.jsp").forward(req, resp);
            break;
            case "nuestraHistoria":
                req.getRequestDispatcher("nuestraHistoria.jsp").forward(req, resp);
            break;
            default:
            System.out.println("No se encontro la pagina");
        }
    } 

    if (option != null) {
        switch(option){
            case "inicioSesionDavi":
                req.getRequestDispatcher("inicioSesionDavi.jsp").forward(req, resp);
            break;
            case "inicioSesionNequi":
                req.getRequestDispatcher("inicioSesionNequi.jsp").forward(req, resp);
            break;
            case "home":
                req.getRequestDispatcher("home.jsp").forward(req, resp);
            break;
            case "index":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            
            case "infoCuenta":
                req.getRequestDispatcher("infoCuenta.jsp").forward(req, resp);
            break;
            case "dashboard":
                req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
            break;
            case "exit":
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            default:
            System.out.println("No se encontro la pagina");
        }
    } 
    switch (operacion){
    case "recargarCuenta":
        req.getRequestDispatcher("recargarCuenta.jsp").forward(req, resp);
            break;
    case "retirarDinero":
        req.getRequestDispatcher("retirarDinero.jsp").forward(req, resp);
            break;
    case "consultarDinero":
        req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
    }
}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion=req.getParameter("accion");
        System.out.println(accion);
        switch(accion){
        case"recargarDinero":
            /*Double r=Double.parseDouble(req.getParameter("recarga"));*/
            req.setAttribute("recargaFinal", daviplata.recargarDinero());
        case "consultar":
            req.setAttribute("saldoFinal", daviplata.mostrarTotal());
            req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
        break;
        case "retirar":
            double retirar=Double.parseDouble(req.getParameter("retiro"));
            req.setAttribute("saldoFinal", daviplata.retirarDinero());
            req.getRequestDispatcher("retirarDinero.jsp").forward(req, resp);
        break;
    
        }
    }




}

