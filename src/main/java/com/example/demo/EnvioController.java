package com.example.demo;
// Lista//
//mapea solicitudes HTTP GET a un método en un controlador //
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
// Ese import trae controladores y maneja la logica de las solicitudes//
import java.util.ArrayList;
//Un arreglo //
import java.util.List;

//implementa la llamada con el endpoint con el get//
@RestController
public class EnvioController {
    private List<Envio> envio = new ArrayList<>();

    public EnvioController(){
        envio.add(new Envio(1,"croqueta para perro" ," Colina"
        ,  "San felipe " , "Central colina" , LocalDate.of(2024, 8, 24)));
        envio.add(new Envio(2,"croqueta para gato" ," renca"
        ,  "San fernando " , "sucursal regional" , LocalDate.of(2024, 8, 24)));
        envio.add(new Envio(3,"croqueta para raton" ," conchali"
        ,  "San vicente " , "sucursal local" , LocalDate.of(2023, 8, 25)));
    }
    






@GetMapping("/envio")
public  List<Envio> getEnvio(){

    return envio;

}


@GetMapping("/envio/nuevos")
public List<Envio> consultaEnvios() {
    LocalDate fechaActual = LocalDate.now();  
    List<Envio> nuevosEnvios = new ArrayList<>();  

    for (Envio envio : envio) {   
        if (!envio.getFecha().isBefore(fechaActual)) {   
            nuevosEnvios.add(envio);   
        }
    }
    return nuevosEnvios;   
}

@GetMapping("/envio/{id}/ubicacion")
public String consultarUbicacionActual(@PathVariable int id) {
    for (Envio envio : envio) {   
        if (envio.getId() == id) {
            return envio.getDireccionTransito();   
        }
    }
    return "Creo que como es String y si no da valor tira error es diferente al fecha que muestra un null este seria un dato no valido";   
}}
        
        

    













