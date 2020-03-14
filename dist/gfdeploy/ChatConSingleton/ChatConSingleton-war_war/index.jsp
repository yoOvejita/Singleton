
<%-- 
    Document   : index
    Created on : 13-mar-2020, 22:18:06
    Author     : Rusok
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="procesoChat.do" method="post">
            <input type="text" name="userId" required/><br/>
            <input type="text" name="msg"/><br/>
            <input type="submit" value="ENVIAR"/>
        </form>
        
            <%
                
                //Rutina rescatando desde el singleton
                //(servlet asociado)
                //¿cómo muestro de forma actualizada
                //la lista de mensajes?
            %>
        
    </body>
</html>
