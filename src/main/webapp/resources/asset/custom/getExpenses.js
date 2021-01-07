$(document).ready(function(){
	
	getExpenses();
	
	//setInterval(function(){ getNotes(); }, 3000);
	
});

function getExpenses(){
	$.ajax({
		type:"POST",
		url:'getExpenses',
		success:function(data){
			var list = "";
			total=0;
			$(data).each(function(i,val){
				total+=val.totalValue
				list = list				
				+'<tr>'
		        +'<td>'+val.id+'</td>'
		        +'<td>'+val.type+'</td>'
		        +'<td>'+val.expenseValue+'</td>'
		        +'<td>'+val.quantity+'</td>'
		        +'<td>'+val.totalValue+'</td>'
		        +'<td>'+val.note+'</td>'
		        +'<td>'+new Date(val.createDate).toLocaleDateString()+'</td>'
		        +'</tr>'
		        
			});
						
			$("#list").html(list);
			$("#totalValue").html(total);
			
			
			
			
		},error:function(data){
			alert(data);
		}
	});
	
}