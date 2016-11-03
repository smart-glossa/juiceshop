$(window).on('load',function(){
$(document).on('click','#dels',function(){
	var pid=$('#pid').val();
  	 $("#pid").remove();	
var url="/juiceshop/mango?operation=prodelete&pid="+pid ;
	$.ajax(url)
		.done(function(result) {  
			console.log(result); 
			var res= JSON.parse(result);
			if(res.Status == 1)
			{
				window.location.href="productlist.html";

			} 
					})
		.fail(function(result) {  
			console.log(result);
		});

	});
});