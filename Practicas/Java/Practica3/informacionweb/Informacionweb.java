package informacionweb;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

public class Informacionweb  {
public static Document gethtml(String host){
    Document html =null;
   
    try{
         html = Jsoup.connect(host).get();
    }catch (Exception e)
    {
        System.out.print("Error al obtener HTML");
    }
    return html;
}

}
