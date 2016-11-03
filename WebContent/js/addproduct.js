$(window).on('load',function() {
	//$('#send').bind("click",function() {
		$(document).on('click','#send',function(){
					

		// Getting input from TextBox (from the add product)
		var pName =$('#pname').val();
	   var  Quantity=$('#quantity').val();
		var price=$('#price').val();
		
		var url="/juiceshop/mango?operation=proadd&pname="+ pName +"&quantity="+ Quantity +"&price="+ price ;
		//$("input[type=text],textarea").val("");
		$.ajax(url)
		.done(function(result) {  // result is the response from Server
			//console.log(result); 

			alert("Success");
		})
		.fail(function(result) {  
		alert(result);
		});

	});
});
