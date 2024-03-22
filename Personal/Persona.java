/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Persona(){
    JOptionPane.showMessageDialog(null, "Hola soy Constructor");
    }
    
    public Persona(String nombre){
    this.nombre=nombre;
    JOptionPane.showMessageDialog(null, "Hola"+getNombre());
    }
    public String calcularIMC(){
    double pesoActual= peso / (Math.pow(altura, 2));
    
    if(pesoActual>=20 && pesoActual <=25){
        return "Peso Ideal"; 
    }else if(pesoActual <20){
    return "Debajo de su Peso Ideal";
    }else{
    return "Encima de su Peso Ideal";
    }
    }
    
    public  boolean esMayorDeEdad(){
    boolean mayor=false;
    if(edad>=18){
    mayor=true;
    }
    return mayor;
    }
    public String datos(){
    String informacion="Informacion de la Persona\n"
            +"Nombre:"+nombre+"\n"
            +"Edad:"+edad+"\n"
            +"Peso:"+peso+"\n"
            +"Altura:"+altura+"\n";
    return informacion;
    
    }
}
