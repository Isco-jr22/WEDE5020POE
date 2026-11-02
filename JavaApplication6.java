const accordions =
document.querySelectorAll(".accordion");

accordions.forEach(item=>{

item.addEventListener("click",function(){

this.classList.toggle("active");

const panel =
this.nextElementSibling;

if(panel.style.display==="block"){
panel.style.display="none";
}else{
panel.style.display="block";
}

});

});

const modal =
document.getElementById("offerModal");

const openBtn =
document.getElementById("openOffer");

const closeBtn =
document.querySelector(".close");

if(openBtn){
openBtn.onclick=()=>{
modal.style.display="block";
};
}

if(closeBtn){
closeBtn.onclick=()=>{
modal.style.display="none";
};
}

const searchInput =
document.getElementById("searchInput");

if(searchInput){

searchInput.addEventListener("keyup",function(){

const value =
this.value.toLowerCase();

const products =
document.querySelectorAll(".product");

products.forEach(product=>{

if(product.textContent
.toLowerCase()
.includes(value)){

product.style.display="inline-block";

}else{

product.style.display="none";

}

});

});

}

const images =
document.querySelectorAll(".gallery-image");

const lightbox =
document.getElementById("lightbox");

const lightboxImage =
document.getElementById("lightboxImage");

images.forEach(image=>{

image.addEventListener("click",()=>{

lightbox.style.display="flex";
lightboxImage.src=image.src;

});

});

if(lightbox){

lightbox.addEventListener("click",()=>{

lightbox.style.display="none";

});

}

function validateForm(){

let name =
document.getElementById("name").value.trim();

let email =
document.getElementById("email").value.trim();

if(name===""){
alert("Please enter your name");
return false;
}

if(email===""){
alert("Please enter your email");
return false;
}

return true;
}

if(document.getElementById("map")){

var map =
L.map("map")
.setView([-26.2041,28.0473],13);

L.tileLayer(
"https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
).addTo(map);

L.marker([-26.2041,28.0473])
.addTo(map)
.bindPopup("Isco's Bakery");

}