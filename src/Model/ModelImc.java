/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author adanb
 */
public class ModelImc {
    
    private double altura;
    private double peso;
    public double resultado;
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void calcular(){
        this.resultado = getPeso() / (getAltura() * getAltura());
    }
  
}
