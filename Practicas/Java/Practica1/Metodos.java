package Practicas.Java.Practica1;

public class Metodos {
    
        public String Operaciones(int dato1, int dato2, String op) {
            switch (op) {
            case "+":
                int suma = dato1 + dato2;
                return suma + "";
    
            case "-":
                int resta = dato1 - dato2;
                return resta + "";
    
            case "/":
                if (dato1 > 0 && dato2 > 0) {
                    int divicion = dato1 / dato2;
                    return divicion + "";
                } else if(dato2<=0){
                    return "ERROR, NO ES POSIBLE DIVIDIR ENTRE 0";
                }
    
            case "*":
                int multiplicacion = dato1 * dato2;
                return multiplicacion + "";
    
            case "^":
                if (dato2 != 0) {
                    double elevar = Math.pow(dato1, dato2);
                    return elevar + "";
                }
                break;
            default:
                return "";
            }
    
            return null;
        
    }
    
}
