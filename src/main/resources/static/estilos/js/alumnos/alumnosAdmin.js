document.addEventListener('DOMContentLoaded',() => {
    inicio();
    
});

function obtenVariable(){
    var edad = $('#edad').val(); 
    var nombre = $('#nombre').val();
    
    console.log(nombre);
    console.log(edad * 5);
}

function inicio(){
    $.ajax({
        type: "GET",
        url:"alumnos/listasAlumnosObject",
        dataType:"json",
        successs:function(data){
            console.log(data[0]);
            for(var i=0; i<max; i++) {
        }
       },
       error:function(e){
           toastr["warning"]("Error al recuperar los alumnos",{progressBar:true,closeButton:true});
       }
        
   });
    
    
}