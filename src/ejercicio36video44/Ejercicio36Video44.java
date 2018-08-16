/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio36video44;

/**
 *
 * @author DELL
 */
public class Ejercicio36Video44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Jefaturas jefe_RRHH = new Jefaturas(" JUAN " , 55000,2006,9,25);
        
      jefe_RRHH.estableceIncentivo(2570);
        
      empleados[] misempleados = new empleados[6];
      
      misempleados[0] = new empleados("PACO GOMEZ " , 8500,1990,12,17);
      
      misempleados[1] = new empleados("ANA LOPEZ " , 9500,1995,06,02);
      
      misempleados[2] = new empleados("MARIA MARTIN " , 105,2002,03,15);
      
      misempleados[3] = new empleados("ANTONIO FERNANDEZ ",47500,2009,11,9);
      
      misempleados[4] =jefe_RRHH;//polimorfismo en accion. principio de sustitucion
      
      misempleados[5] = new Jefaturas("MARIA ",95000,1999,5,26);
      
      Jefaturas jefa_Finanzas=(Jefaturas) misempleados[5];
      
      jefa_Finanzas.estableceIncentivo(55000);
      
    
      
       for(empleados e : misempleados){
          
          e.subSueldo(5);
      }
      
      for(empleados e:misempleados){
          
          System.out.println("NOMBRE: " + e.dameNombre() + 
                  " SUELDO: " + e.dameSueldo()+ " FECHA DE ALTA " +
                  e.dameFechaContrato());
      }
    }
    }
    

