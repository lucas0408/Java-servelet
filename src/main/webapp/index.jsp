<%@ page import="java.util.ArrayList" %>

<%
    ArrayList<String> cantores = new ArrayList<>();

    cantores.add("joelma");
    cantores.add("Roberto barboza");
%>

<html>
<%@ include file = "header.jsp" %>
<body>
<h2><%out.println(cantores.get(1));%></h2>

<ul>
    <%
        for(String cantor : cantores){
            out.println("<li>" + cantor + "</li>");
        }
    %>
</ul>

<p>Mensagem da servelet: <%=request.getAttribute("mensagem")%>

</body>
</html>