package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Circulo;

import java.io.IOException;


public class CirculoControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CirculoControllerServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion 	= request.getParameter("operacion");
		String diametroStr 	= request.getParameter("diametro");
		
		int diametro = Integer.parseInt(diametroStr);
		
		Circulo circulo = new Circulo(diametro);
		if( operacion.equalsIgnoreCase("radio") ) {
			double radio = (double) circulo.calcularRadio(); 
			request.setAttribute("resultado", radio);
			request.setAttribute("operacion", "radio"); 
		} else {
			double perimetro = (double) circulo.calcularPerimetroCirculo();
			request.setAttribute("resultado", perimetro);
			request.setAttribute("operacion", "perímetro");
		}
		
		String rutaJSP = "/WEB-INF/jsp/view/circulo.jsp";
		request.getRequestDispatcher(rutaJSP).forward(request, response);
		
	}

	
}
