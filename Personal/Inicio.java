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
public class Inicio {

    public static void main(String[] args) {

        Persona objetoPersona = new Persona();

        String nombre = JOptionPane.showInputDialog("Introduce tu Nombre:");
        String edadS = JOptionPane.showInputDialog("Introduce tu edad:");
        int edad = Integer.parseInt(edadS);
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu Peso:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu Altura:"));

        objetoPersona.setNombre(nombre);
        objetoPersona.setEdad(edad);
        objetoPersona.setPeso(peso);
        objetoPersona.setAltura(altura);

        JOptionPane.showMessageDialog(null, objetoPersona.datos() + "\n"
                + objetoPersona.calcularIMC() + "\n" + mayorEdad(objetoPersona));

    }
    public static String mayorEdad(Persona p){
    if(p.esMayorDeEdad()){
    return "Mayor de Edad";
    }else{
    return "Menor de Edad";
    }
    }
}
