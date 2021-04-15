package Practicas.Practicas.Practica3;

import java.net.InetAddress;


public class consulta {
    
    public static void main( String args[] ) {
        try{
        
        String host=("itescam.edu.mx");
        System.out.println("La dirección IP es: "+InetAddress.getByName(host).getHostAddress());
      
        
        }catch(Exception e)
        {}
        }
}
