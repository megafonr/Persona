/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author SebastianR
 */
public class Registro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Persona P1 , P2 , P3 , P4, P5;
           
      P1 = new Persona();
      P2 = new Persona(22453854);
      P3 = new Persona(33548635 , "Laura");
      P4 = new Persona(44657423,"Jose","Perez");
      P5 = new Persona(44657423,"Jose","Perez",33);
      
      P1.mostrar();
      P2.mostrar();
      P3.mostrar();
      P4.mostrar();
      P5.mostrar();
    }
    
}
