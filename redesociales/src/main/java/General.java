import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class General extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getParameter("url");
        System.out.println(url);

        switch(url){
            case "index":
                RequestDispatcher index = req.getRequestDispatcher("index.jsp");
                index.forward(req, resp);
            break;

            case "facebookIndex":
                RequestDispatcher facebookIndex = req.getRequestDispatcher("vistas/facebook/faceIndex.jsp");
                facebookIndex.forward(req, resp);
            break;

            case "loginFB":
                RequestDispatcher loginFB = req.getRequestDispatcher("vistas/facebook/loginFB.jsp");
                loginFB.forward(req, resp);
            break;

            case "registrarFB":
                RequestDispatcher registrarFB = req.getRequestDispatcher("vistas/facebook/registrarFB.jsp");
                registrarFB.forward(req, resp);
            break;

            case "verUsuariosFB":
                RequestDispatcher verUsuarios = req.getRequestDispatcher("vistas/facebook/verUsuariosFB.jsp");
                verUsuarios.forward(req, resp);
            break;

            case "nuevaPublicacionFB":
                RequestDispatcher nuevaPublicacion = req.getRequestDispatcher("vistas/facebook/nuevaPublicacionFB.jsp");
                nuevaPublicacion.forward(req, resp);
            break;

            case "verPublicacionFB":
                RequestDispatcher verPublicacion = req.getRequestDispatcher("vistas/facebook/verPublicacionesFB.jsp");
                verPublicacion.forward(req, resp);
            break;



            case "dicordIndex":
                RequestDispatcher dicordIndex = req.getRequestDispatcher("vistas/discord/discIndex.jsp");
                dicordIndex.forward(req, resp);
            break;

            case "loginDC":
                RequestDispatcher loginDC = req.getRequestDispatcher("vistas/discord/loginDC.jsp");
                loginDC.forward(req, resp);
            break;

            case "registrarDC":
                RequestDispatcher registrarDC = req.getRequestDispatcher("vistas/discord/registrarDC.jsp");
                registrarDC.forward(req, resp);
            break;

            case "verUsuariosDC":
                RequestDispatcher verUsuariosDC = req.getRequestDispatcher("vistas/discord/verUsuariosDC.jsp");
                verUsuariosDC.forward(req, resp);
            break;

            case "nuevaPublicacionDC":
                RequestDispatcher nuevaPublicacionDC = req.getRequestDispatcher("vistas/discord/nuevaPublicacionDC.jsp");
                nuevaPublicacionDC.forward(req, resp);
            break;

            case "verPublicacionDC":
                RequestDispatcher verPublicacionDC = req.getRequestDispatcher("vistas/discord/verPublicacionesDC.jsp");
                verPublicacionDC.forward(req, resp);
            break;
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getParameter("url");
        System.out.println(url);

        switch(url){
            case "validarLoginFB":
                String userLgFB = req.getParameter("username");
                String contrasenaLgFB = req.getParameter("password");

                System.out.println(userLgFB + " " + contrasenaLgFB);

                String preDefUser = "Andresito";
                String preDefPass = "123456";

                if (userLgFB.equals(preDefUser) && contrasenaLgFB.equals(preDefPass)) {
                    RequestDispatcher indexUser = req.getRequestDispatcher("vistas/facebook/faceIndex.jsp");
                    indexUser.forward(req, resp);
                }

                else {
                    System.out.println("Acceso denegado.");
                    RequestDispatcher loginFB = req.getRequestDispatcher("vistas/facebook/loginFB.jsp");
                    loginFB.forward(req, resp);
                }
            break;

            case "nuevaPublicacionFB":
                String usuarioFB = req.getParameter("username");
                String publicacionFB = req.getParameter("publicacion");
                PublicacionCRUD publiFB = new PublicacionCRUD(usuarioFB, publicacionFB);
                req.setAttribute("histo", publiFB.registrarPublicacion());

                System.out.println(usuarioFB + " " + publicacionFB);

                RequestDispatcher makeNewPostFB = req.getRequestDispatcher("vistas/facebook/faceIndex.jsp");
                makeNewPostFB.forward(req, resp);
            break;

            case "registrarUsuarioFB":
                String nombre = req.getParameter("namme");
                String user = req.getParameter("username");
                String contrasena = req.getParameter("password");
                UsuarioCRUD usu = new UsuarioCRUD(nombre, user, contrasena);
                req.setAttribute("histo", usu.registrarUsuario());

                System.out.println(nombre + " " + user + " " + contrasena);

                RequestDispatcher indexTwitter = req.getRequestDispatcher("vistas/facebook/faceIndex.jsp");
                indexTwitter.forward(req, resp);
            break;




            case "validarLoginDC":
                String userLgDC = req.getParameter("username");
                String contrasenaLgDC = req.getParameter("password");

                System.out.println(userLgDC + " " + contrasenaLgDC);

                String preDefUserDC = "Andresito";
                String preDefPassDC = "123456";

                if (userLgDC.equals(preDefUserDC) && contrasenaLgDC.equals(preDefPassDC)) {
                    RequestDispatcher indexUser = req.getRequestDispatcher("vistas/discord/discIndex.jsp");
                    indexUser.forward(req, resp);
                }

                else {
                    System.out.println("Acceso denegado.");
                    RequestDispatcher loginDC = req.getRequestDispatcher("vistas/discord/loginDC.jsp");
                    loginDC.forward(req, resp);
                }
            break;

            case "nuevaPublicacionDC":
                String usuarioDC = req.getParameter("username");
                String publicacionDC = req.getParameter("publicacion");
                PublicacionCRUD publiDC = new PublicacionCRUD(usuarioDC, publicacionDC);
                req.setAttribute("histo", publiDC.registrarPublicacion());

                System.out.println(usuarioDC + " " + publicacionDC);

                RequestDispatcher makeNewPostDC = req.getRequestDispatcher("vistas/discord/discIndex.jsp");
                makeNewPostDC.forward(req, resp);
            break;

            case "registrarUsuarioDC":
                String nombreDC = req.getParameter("namme");
                String userDC = req.getParameter("username");
                String contrasenaDC = req.getParameter("password");
                UsuarioCRUD usuDC = new UsuarioCRUD(nombreDC, userDC, contrasenaDC);
                req.setAttribute("histo", usuDC.registrarUsuario());

                System.out.println(nombreDC + " " + userDC + " " + contrasenaDC);

                RequestDispatcher indexDiscord = req.getRequestDispatcher("vistas/discord/discIndex.jsp");
                indexDiscord.forward(req, resp);
            break;

        }
    }
}
