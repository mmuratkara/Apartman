<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>

<html>
<head>
  <title>Tüm Giderler</title>

</head>
<body>
<%@include file="header.jsp" %>
<div class="container">
  <h2>Gider Tablosu</h2>          
  <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>id</th>
        <th>Tür</th>
        <th>Fiyat</th>
        <th>Miktar</th>
        <th>Toplam Fiyat</th>
        <th>Not</th>
        <th>Tarih</th>
      </tr>
    </thead>
    <tbody id="list">
    
    
    </tbody>
    <tr >
    	<td>Toplam Gider</td>
    	<td id="totalValue"></td>
    </tr>
  </table>
</div>
<script src="asset/custom/getExpenses.js"></script>
</body>
</html>
