$(window).on('load',function(){
	//$(document).on('click','#now',function() {
	var url="/juiceshop/mango?operation=getallproduct" ;

	$.ajax(url)
.done(function(result) {
	  var res=JSON.parse(result);
  var count = res.length;
var table=$('#div1').children();
  var tablebody=table.remove();
  $('#div3').append("<table class='design'></table>");
  var table=$('#div3').children();        
  table.append("<tr><th>ProductId</th><th>ProductName</th><th>Qty</th><th>Price</th><th>Action</th><th>Available</th><th>Action</th></tr>");
  
  for(var i=0;i<count;i++){
     var jsonObj =res[i];
     var rowString = "<tr><td>"  + jsonObj.pid + "</td><td>"  + jsonObj.pname + "</td><td>" + jsonObj.quantity  +  "</td><td>" + jsonObj.price + "</td><td>" +   "</td><td>" +   "</td><td>" +   "</td></tr>";
 table.append(rowString);
     
   // rowString.append(im);

 }
 var im=$("table td:nth-child(6)").append('<img  src="../images/6.jpg" id="size" />');
 //$(this).attr('id',   this.id + '_' + projectId);
 $("table td:nth-child(5)").append('<h5 id=""><a href="customer.html">buy</a></h5>');
$("table td:nth-child(7)").append('<h4 id=""><a href="del.html">delete</a></h4>');


      
})


	.fail(function(result){
    alert(result);
    });
    });

