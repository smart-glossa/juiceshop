
//delete division//
function del(){
	
var deldiv=document.createElement("div");
deldiv.setAttribute("id","deldi");
document.body.appendChild(deldiv);
var inps=document.createElement("input");
inps.setAttribute("id","dell");
deldiv.appendChild(inps);
var butt=document.createElement("button");
var tee=document.createTextNode("submit");
butt.appendChild(tee);
butt.setAttribute("id","dels");
deldiv.appendChild(butt);
}