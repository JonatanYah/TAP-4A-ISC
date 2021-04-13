using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica2encsharp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            var rand = new Random();
            int color=   rand.Next(6);
            switch (color)
            {
                case 1:
                    panel1.BackColor = (Color.Red);
                    break;
                case 2:
                    panel1.BackColor = (Color.Blue);
                    break;
                case 3:
                    panel1.BackColor = (Color.Green);
                    break;
                case 4:
                    panel1.BackColor = (Color.Yellow);
                    break;
                case 5:
                    panel1.BackColor = (Color.Cyan);
                    break;

            }
            
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox1_MouseClick(object sender, MouseEventArgs e)
        {
            panel1.Visible = true;
        }

        private void pictureBox1_MouseMove(object sender, MouseEventArgs e)
        {
            Point mouseMoveLocation = new Point(e.X, e.Y);
            panel1.Location = new System.Drawing.Point(e.X, e.Y);
        }

        private void pictureBox1_MouseDown(object sender, MouseEventArgs e)
        {
            Point mouseDownLocation = new Point(e.X, e.Y);

            panel1.Location = new System.Drawing.Point(e.X,e.Y);
        }

        private void Form1_PreviewKeyDown(object sender, PreviewKeyDownEventArgs e)
        {

        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {

        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {
          

            {

         
            }
        }

        private void button1_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.A)
            {
                MessageBox.Show("Color cambiado");
                var rand = new Random();
                int color = rand.Next(6);
                switch (color)
                {
                    case 1:
                        panel1.BackColor = (Color.Red);
                        break;
                    case 2:
                        panel1.BackColor = (Color.Blue);
                        break;
                    case 3:
                        panel1.BackColor = (Color.Green);
                        break;
                    case 4:
                        panel1.BackColor = (Color.Yellow);
                        break;
                    case 5:
                        panel1.BackColor = (Color.Cyan);
                        break;

                }
            }
        }
    }
}
