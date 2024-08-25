package com.example.demo;

import java.time.LocalDate;

public class Envio {
    private int id;
    private String articulo;
    private String direccionInicio;
    private String direccionTermino;
    private String direccionTransito;
    private LocalDate fecha;
    
public Envio (int id,String articulo,String direccionInicio, String direccionTermino, String
direccionTransito, LocalDate fecha)
{
    this.id = id;
    this.articulo = articulo;
    this.direccionInicio = direccionInicio;
    this.direccionTermino = direccionTermino;
    this.direccionTransito = direccionTransito;
    this.fecha = fecha;


}

public int getId()  {
    return id;

}

public String getArticulo(){
    return articulo;
}

public String getDireccionInicio(){
    return direccionInicio;
}

public String getDireccionTermino(){
    return direccionTermino;
}

public String getDireccionTransito(){
    return direccionTransito;
}

public LocalDate getFecha(){
    return fecha;
}




}
