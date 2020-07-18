/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjetotarea1;

/**
 *
 * @author Erick Unda
 */
class Fallas_motor_induccion{
            public int valor;
    public String nombre;
    Fallas_motor_induccion (int valor, String nombre)
                {
        this.valor=valor;
        this.nombre=nombre;
    }
}
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Fallas_motor_induccion []arreglo;

        arreglo=new Fallas_motor_induccion[9];
        arreglo[0]=new Fallas_motor_induccion(5,"Mecánica");
        arreglo[1]=new Fallas_motor_induccion(7,"Eléctrica");
        arreglo[2]=new Fallas_motor_induccion(12,"Rotor Cortocircuitado");
        arreglo[3]=new Fallas_motor_induccion(21,"Falla de Carbones");
        arreglo[4]=new Fallas_motor_induccion(73,"Red Trifásica en mal estado");
         arreglo[5]=new Fallas_motor_induccion(1,"Reinicie el motor de inducción");
        arreglo[6]=new Fallas_motor_induccion(23,"Estator trizado");
         arreglo[7]=new Fallas_motor_induccion(81,"Falla mecanica indeterminada");
        arreglo[8]=new Fallas_motor_induccion(2,"Estado de cables defectuosa");
        //
        System.out.println("\t\t\t UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE LATACUNGA");
        System.out.println("\t\t\t\tDEPARTAMENTO DE ENERGÍA Y MECÁNICA");
        System.out.println("\t\t\t\t CARRERA DE INGENIERIA AUTOMOTRIZ");
        System.out.println("MATERIA:PROGRAMACIÓN");
        System.out.println("NRC:7450");
        System.out.println("DOCENTE:ING.LUIS GUERRA");
        System.out.println("NOMBRE:ERICK UNDA");
        System.out.println("REPRESENTACIÓN DE CÓDIGO DE FALLAS DE MOTOR DE INDUCCIÓN:");
        for(int i=0;i<arreglo.length;i++)
            System.out.println("La falla "+ i + ":" + " con código "  + arreglo[i].valor + " Obtenida es: " + arreglo[i].nombre);
    }

}
