package pe.edu.upeu.eps;

import pe.edu.upeu.eps.examen.ResolucionExamen;
import pe.edu.upeu.eps.utils.LeerTeclado;
public class App {

   static LeerTeclado lt=new LeerTeclado();
   static ResolucionExamen s=new ResolucionExamen();


  public static void menuOpciones() {        
    int opcionesA=0;
    System.out.println("Bienvenido al examen ");
    String msg="\nElija una opción:\n"+
    "\n1=Pregunta 2"+
    "\n2=Pregunta 3"+
    "\n3=Pregunta 4"+
    "\n4=Pregunta 5"+
    "\n0=Cerrar programa\n";
   
    opcionesA=lt.leer(0, msg);  
    while(opcionesA!=0){
        switch(opcionesA) {

          case 1:s.impuestoAutos(); break;

        
          case 2:s.TMultiplicar1hasta20(); break;  
          
          
          case 3:s.numerosperfectos(); break; 
        

          case 4:int t=lt.leer(0,"Introduzca la base");
                        int h=lt.leer(0,"Introduzca el exponente");
                        System.out.println("El resultado de "+t+" con exponente "+h+" es: "+ s.potencia(t, h));break; 


      

          default: System.out.println("Elija una opcion existente!!");
        }   
      System.out.println("----------------------------------------------------------------");         
      opcionesA=lt.leer(0,msg);        
    }        
}


    public static void main( String[] args ){
     menuOpciones();
    }


}