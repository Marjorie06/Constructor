/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemassolar;

import ec.edu.espoch.sistemassolar.clase.Planeta;
import ec.edu.espoch.sistemassolar.enumeracion.tipoPlaneta;

/**
 *
 * @author SO-LAB1-PC13
 */
public class SistemasSolar {

    public static void main(String[] args) {
       Planeta objPlaneta=new Planeta ();
       objPlaneta.nombre="Martes";
       objPlaneta.cantidadSatelite=0;
       objPlaneta.volKm3=0;
       objPlaneta.kilometro=0;
       objPlaneta.distanciaMedidaSol=0;
       objPlaneta.masaKilometro=0;
       objPlaneta.tipoPlaneta=TipoPlaneta.TERESTRE;
               
              
       objPlatena.imprimir();
       
       double densidad=objPlaneta.calcularDensidadPlaneta();
        System.out.println("La dencidad es:"+densidad);
         
    }
}
