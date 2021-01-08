<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Kayıt Ekle</title>
	
</head>
<body>
<%@include file="header.jsp" %>


<form class="form-group">
		<div class="form-group">
		<div class="input-group mb-3">
  <div class="input-group-prepend">
    <label class="input-group-text" for="inputGroupSelect01">Ödeme Türü</label>
  </div>
  <select class="custom-select" id="typeArea">
    <option selected>Diğer</option>
    <option>Elektrik</option>
    <option>Su</option>
    <option>Temizlik</option>
  	</select>
	</div>
	<div class="form-group">
    <label for="Type">Fiyat</label>
    <input type="text" class="form-control" id="priceArea"  placeholder="Fiyat">
  	</div>
  	<div class="form-group">
    <label for="Quantity">Miktar</label>
    <input type="text" class="form-control" id="quantityArea"  placeholder="Miktar">
  	</div>
  	<div class="form-group">
    <label for="Note">Not</label>
    <input type="text" class="form-control" id="noteArea"  placeholder="Not">
  	</div>
  	<div class="form-group">
    <label for="Date">Tarih</label>
    <input type="date" class="form-control" id="dateArea">
  	</div>

	<button type="button" class="btn btn-success" onclick="addExpense()">Kaydet</button>



</form>
<%@include file="footer.jsp" %>

<script src="asset/custom/addExpense.js"></script>
</body>
</html>