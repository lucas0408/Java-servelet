<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<%@ include file="header.jsp" %>
<body>

<h2>Lista de Cantores</h2>

<ul>
<c:forEach items="${cantores}" var="cantor">

    out.println("<li>"+cantor.nome+"</li>")
    <p><c:out value="${cantor.estiloMusical}"/></p>
    <p><c:out value="${cantor.qtdAlbuns}"/></p>
</c:forEach>
</ul>

<h3>Adicionar Novo Cantor</h3>
<form action="cantor" method="POST">
    <label for="nome">Nome:</label>
    <input type="text" id="nome" name="nome" required /><br />

    <label for="estiloMusical">Estilo Musical:</label>
    <input type="text" id="estiloMusical" name="estiloMusical" required /><br />

    <label for="qtdAlbum">Quantidade de Álbuns:</label>
    <input type="text" id="qtdAlbum" name="qtdAlbum" required /><br />

    <input type="submit" value="Adicionar Cantor" />
</form>

</body>
</html>