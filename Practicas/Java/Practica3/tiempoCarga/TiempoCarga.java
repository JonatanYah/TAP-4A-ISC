package tiempoCarga;
import java.net.*;

public class TiempoCarga {
    
    public double carga(String host){
        try {
            Socket socket = new Socket(host, 80);
           double tiempcarga = socket.getSoTimeout();
           return tiempcarga;
        } catch (Exception e) {
        }
        return 0;
    }    
}