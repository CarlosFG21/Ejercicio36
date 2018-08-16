
package ejercicio36video44;

import java.util.*;

public class empleados {
    
    public empleados(String nom,double sue,int agno,int mes,int dia){
      
        nombre=nom;
        sueldo = sue;
        
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        
        altaContrato = calendario.getTime();
        
        ++IdSiguiente;
        Id=IdSiguiente;
  }
    
    public empleados(String nom){
        
        this(nom, 30000,2000,01,01);
        
    }

    empleados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  public String dameNombre(){
      
      return nombre + " Id: " + Id;
  }  
  
  public double dameSueldo(){ //geter
      
      return sueldo;
  }
  
  public Date dameFechaContrato(){
      
      return altaContrato;
  }
  
  public void subSueldo(double porcentaje){
      
      double aumento = sueldo*porcentaje/100;
      
      sueldo+=aumento;
  }
  private String nombre;
  private double sueldo;
  private Date altaContrato;
  private static int IdSiguiente;
  private int Id;
  
}

class Jefaturas extends empleados{
    
    public Jefaturas(String nom,double sue,int agno,int mes,int dia){
        
        super(nom,sue,agno,mes,dia);
    }
    
    public void  estableceIncentivo(double b){
        
        incentivo =b;
    }
    
    public double dameSueldo(){
        
        double sueldoJefe = super.dameSueldo();
        
        return sueldoJefe + incentivo;
    }
    private double incentivo;
    
}

