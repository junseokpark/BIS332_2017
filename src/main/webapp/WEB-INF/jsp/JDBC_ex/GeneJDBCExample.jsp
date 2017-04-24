<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="edu.kaist.biosoft.bis332.week9.*" %>
<jsp:useBean id="GeneData" class="edu.kaist.biosoft.bis332.week9.GeneDataBean" />
<jsp:useBean id="GeneBean" class="edu.kaist.biosoft.bis332.week9.GeneBean" />
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

    <!-- Access the bootstrap Css like this,
        Spring boot will handle the resource mapping automcatically -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <title>BiS332 Web JSP Practice - GeneDataBean Example</title>


</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring Boot</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <h2>Gene Data Bean Example</h2>
    <p>This table style is .table class adds basic styling (light padding and only horizontal dividers) to a table</p>
    <table class="table">
        <thead>
        <tr>
            <th>Gene ID</th>
            <th>Gene Symbol</th>
            <th>Gene Synonyms</th>
        </tr>
        </thead>
        <tbody>
            <%
                List geneList = GeneData.getGeneList();
                Iterator geneListIterator = geneList.iterator();
                GeneBean gene;

                while (geneListIterator.hasNext()) {
                    gene = (GeneBean) geneListIterator.next();
            %>
            <tr>
                <td><%=gene.getGene_id()%></td>
                <td><%=gene.getGene_symbol()%></td>
                <td><%=gene.getGene_synonyms()%></td>
            </tr>
            <%
                }
            %>
        </tbody>

    </table>

</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</body>

</html>