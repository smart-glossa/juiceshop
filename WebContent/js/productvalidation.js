function proValidation(){
	var pname = document.getElementById("pname").value;
	var quantity = document.getElementById("quantity").value;
	var price= document.getElementById("price").value;
	
	
	if((pname=="")||(/^\s*$/.test(pname))){
	alert("product Name can't blank");
}
else if(pname.match(/^[a-zA-Z0-9]*$/)){

	}
	else{alert("Enter product Name here");}
	if((quantity=="")||(/^\s*$/.test(quantity))){
	alert("Enter quantity here");
}
else if(quantity.length<6){
alert("minimum six characters")
}
else{alert("qty here");}
if((price=="")||(/^\s*$/.test(price))){
	alert("enter price here");
}
else if(price.match(/^[a-zA-Z0-9]*$/)){
}
else{alert("enetr correct format");}

}