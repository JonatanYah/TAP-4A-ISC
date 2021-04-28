package Directorio;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Directorios {

    String[] directorios;
    int i = 0;
    int tam = 0;

    public String[] directoriosExtistentes(String host) {
        try {
            

            Document doc = Jsoup.connect(host).get();
            Elements imports = doc.select("[href]");
            directorios = new String[imports.size()];
            tam = imports.size();

            for (Element url : imports) {
                directorios[i] = (url.tagName() + url.attr("abs:href") + "\n");
                i++;
            }
            return directorios;
        } catch (Exception e) {
            System.out.print("Error al obtener HTML");
        }
        return null;
    }

    public int getTam() {
        return tam;
    }

} 

