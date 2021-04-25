using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica2Creev
{
    public partial class Form2 : Form
    {
        bool isClosed;
        String nombrep;
        
        public Form2()
        {
          
            nombrep = "";
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            
                nombrep = textBox1.Text;
           
                this.Visible=false;
                this.Enabled = false;
            iscl();
            }
        
            public String DevNombre()
            {
                return nombrep;
                

        }
        public bool iscl()
        {
           return isClosed = true;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
