$(window).on('load',function() {
	//$('#send').bind("click",function() {
		$(document).on('click','#po',function(){
					

		// Getting input from TextBox (from the add product)
		var Cname =$('#Cname').val();
	   	var  CardNo=$('#CardNo').val();
		var Amount=$('#Amount').val();
		var pid=$('#pid').val();
		var url="/juiceshop/ajith?operation=customeradd&Cname="+ Cname +"&CardNo="+ CardNo +"&Amount="+ Amount +"&pid="+pid ;
		//$("input[type=text],textarea").val("");
		$.ajax(url)
		.done(function(result) {  // result is the response from Server
			//console.log(result); 

			//alert(result);
			var res= JSON.parse(result);
			if(res.Status == 1)
			{
				window.location.href="productlist.html";

			}


		})
		.fail(function(result) {  
		alert(result);
		});

	});
});
