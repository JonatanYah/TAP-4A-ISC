using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CalculadoraGUI
{
    public partial class Form1 : Form
    {
        private int dato1;
        private int dato2;
        private string operacion;
        private Metodos m;
        public Form1()
        {
            InitializeComponent();
            m = new Metodos();

        }

        private void label1_Click(object sender, EventArgs e)
        {
            
        }

        private void label2_Click(object sender, EventArgs e)
        {
           
        }

        private void label4_Click(object sender, EventArgs e)
        {
          
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "1");
        }
        

        private void button6_Click(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "5");
        }

        private void button7_Click(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "6");
        }

        private void button9_Click(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "7");
        }

        private void button14_Click(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "0");
        }

        private void button16_Click(object sender, EventArgs e)
        {
            String leer = entrada.Text;
            if (isNumber(leer))
            {
                dato2 = int.Parse(leer);
                entrada.Text = m.operacion(dato1, dato2, operacion);
            }
            else
                entrada.Text = "Ingrese unicamente números";
        }

            private void button2_Click(object sender, EventArgs e)
        {
            
                entrada.Text = (entrada.Text + "2");
            
        }

        private void button3_Click(object sender, EventArgs e)
        {
            
                entrada.Text = (entrada.Text + "3");
            
        }

        private void button4_Click(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "4");
        }

        private void button8_Click(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "8");
        }

        private void button9_Click_1(object sender, EventArgs e)
        {
            entrada.Text = (entrada.Text + "9");
        }

        private void buttonsuma_Click(object sender, EventArgs e)
        {
            String Leer = entrada.Text;
            dato1 = int.Parse(Leer);
            if (isNumber(Leer))
            {
                operacion= "+";
                entrada.Text = "";
            }
            else
            {
                entrada.Text = "Ingrese solamente Números";
            
         }
        }

        private void buttonresta_Click(object sender, EventArgs e)
        {
            String Leer = entrada.Text;
            dato1 = int.Parse(Leer);
            if (isNumber(Leer))
            {
                operacion = "-";
                entrada.Text = "";
            }
            else
            {
                entrada.Text = "Ingrese solamente Números";

            }
        }

        private void buttondiv_Click(object sender, EventArgs e)
        {
            String Leer = entrada.Text;
            dato1 = int.Parse(Leer);
            if (isNumber(Leer))
            {
                operacion = "/";
                entrada.Text = "";
            }
            else
            {
                entrada.Text = "Ingrese solamente Números";

            }
        }

        private void buttonmulti_Click(object sender, EventArgs e)
        {
            String Leer = entrada.Text;
            dato1 = int.Parse(Leer);
            if (isNumber(Leer))
            {
                operacion = "*";
                entrada.Text = "";
            }
            else
            {
                entrada.Text = "Ingrese solamente Números";

            }
        }

        private void buttonelevado_Click(object sender, EventArgs e)
        {
            String Leer = entrada.Text;
            dato1 = int.Parse(Leer);
            if (isNumber(Leer))
            {
                operacion = "^";
                entrada.Text = "";
            }
            else
            {
                entrada.Text = "Ingrese solamente Números";

            }
        }
        public static bool isNumber(String dato)
        {
            bool isNumber;
            try
            {
                int.Parse(dato);
                    isNumber = true;
            }
            catch (FormatException)
            {
                isNumber = false;
            }
            return isNumber;
        }

        private void entrada_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
