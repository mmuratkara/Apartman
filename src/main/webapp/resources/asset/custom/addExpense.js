function addExpense(){
	var param = {
			type:$("#typeArea").val(),
			expenseValue:$("#priceArea").val(),
			quantity:$("#quantityArea").val(),
			note:$("#noteArea").val(),
			createDate:$("#dateArea").val()
	}
	
	var ser_data = JSON.stringify(param);
	
	$.ajax({
		type:"POST",
		contentType:'application/json; charset=UTF-8',
		url:'addExpense',
		data: ser_data,
		success:function(data){
			alert(data);
		},error:function(data){
			alert(data);
		}
	});
	
	
	
}