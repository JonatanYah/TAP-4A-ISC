package tiempoCarga;
import java.net.*;

public class TiempoCarga {
    
    public double carga(String host){
        try {
            Socket s= new Socket(host, 80);
           double tiempcarga = s.getSoTimeout();
           return tiempcarga;
        } catch (Exception e) {
        }
        return 0;
    }    
}