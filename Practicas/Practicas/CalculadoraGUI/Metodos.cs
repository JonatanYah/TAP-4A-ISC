using System;

namespace CalculadoraGUI
{
    internal class Metodos
    {
        public string operacion(int dato1, int dato2, string operacion)
        {
            switch (operacion)
            {
                case "+":
                    int suma = dato1 + dato2;
                    return suma + "";

                case "-":
                    int resta = dato1 - dato2;
                    return resta + "";

                case "/":
                    if (dato1 > 0 && dato2 > 0)
                    {
                        int division = dato1 / dato2;
                        return division + "";
                    }
                    else
                    {
                        return "No es posible dividir entre 0";
                    }

                case "*":
                    int multiplicacion = dato1 * dato2;
            return multiplicacion + "";

                case "^":
                    if (dato2 != 0)
            {
                double elevar = Math.Pow(dato1, dato2);
                return elevar + "";
            }
            break;

        }

            return null;
        }

}
}