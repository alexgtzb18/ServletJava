package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.lang.Math;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
         String opcion = request.getParameter("operacion");
         
         switch (opcion) {
             case "F":
             double valorA = Double.parseDouble(request.getParameter("valorA"));
             double valorB = Double.parseDouble(request.getParameter("valorB"));
             double valorC = Double.parseDouble(request.getParameter("valorC"));
             double x1 = (-valorB + ( Math.sqrt( ( Math.pow(valorB, 2) - (4 * valorA * valorC) ) / (2 * valorA) )));                 
             double x2 = ( valorB + ( Math.sqrt( ( Math.pow(valorB, 2) - (4 * valorA * valorC) ) / (2 * valorA) )));
                out.print("<html>");
                    out.print("<header>");
                    out.print("</header>");

                    out.print("<body>");
                        out.print("<h1>El metodo que se uso fue: Formula general</h1>");
                        out.print("     Valor de A = " + valorA + "     Valor de B = " + valorB + "     Valor de C = " + valorC);
                        out.print("<br>");
                        out.print("<br>");
                        out.print("X1 = " + x1);
                        out.print("<br>");
                        out.print("X2 = " + x2);
                        
                    out.print("</body>");
                out.print("</html>");
                 break;
             case "P":
                 double n = Double.parseDouble(request.getParameter("valorN"));                 
                out.print("<html>");
                    out.print("<header>");
                    out.print("</header>");

                    out.print("<body>");
                        out.print("<h1>Numeros Primos</h1>");
                        out.print("<h5>Lista de numeros primos hasta " + n + "</h1>");
                        for (int i = 0; i <= n; i++) {
                            if (i%2 != 0) {
                                out.print(i + ", ");
                            }
                        }
                    out.print("</body>");
                out.print("</html>");
                 break;
             case "T":
                double l1 = Double.parseDouble(request.getParameter("lado1"));
                double l2 = Double.parseDouble(request.getParameter("lado2"));
                double l3 = Double.parseDouble(request.getParameter("lado3"));
                String tipoTriangulo = "";
                
                 if (l1 == l2 && l1 == l3) {
                     tipoTriangulo = "Equilatero";
                 } else if (l1 == l2 && l1 != l3 || l1 == l3 && l1 !=l2) {
                     tipoTriangulo = "Isosceles";
                 } else if (l1 != l2 && l1 != l3) {
                     tipoTriangulo = "Escaleno";
                 }
                
                out.print("<html>");
                    out.print("<header>");
                    out.print("</header>");

                    out.print("<body>");
                        out.print("<h1>Determinar tipo de Triangulo</h1>");
                        out.print("<br>");
                        out.print("     Lado1 = " + l1 + "     Lado2 = " + l2 + "     Lado3 = " + l3);
                        out.print("<br>");
                        out.print("<b>Tipo de triangulo: </b>" + tipoTriangulo);
                        out.print("<br>");
                    out.print("</body>");
                out.print("</html>");
                 break;
                
            
             
         }      
        
        
    }

}