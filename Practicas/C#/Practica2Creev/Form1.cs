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
    public partial class Form1 : Form
    {
        Form2 N = new Form2();
        int x;
        int y;
        String texto;
        Image fondoRed;
        Image Rombo;
        int maxX;
        int maxY;
        bool mover;
        bool cambiomaximo;
        public Form1()
        {
            InitializeComponent();
          
            fondoRed = Image.FromFile("Recursos\\red.png");
            Rombo = Image.FromFile("Recursos\\rombo.png");
            maxX = 1224;
            maxY = 592;
            cambiomaximo = false;
            objeto.BackColor = (Color.Black);
            
        }

        private void pictureBox1_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            g.DrawImage(fondoRed, 0,0, 500,473);
            g.DrawImage(Rombo, 510, 0, 400, 447);
          

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void objeto_Paint(object sender, PaintEventArgs e)
        {
           
        }

        private void pictureBox1_MouseMove(object sender, MouseEventArgs e)
        {
            texto = N.DevNombre();
            label4.Text = texto;
            if (mover == true)
            {
                Point mouseMoveLocation = new Point(e.X, e.Y);
                x = e.X;
                y = e.Y;
                
                colision();
                objeto.Location = new System.Drawing.Point(x, y);
                if (x <= 500 && y<=473)
                {
                    cambiomaximo = true;
                }
                if (cambiomaximo)
                {
                    maxX = 370;
                    maxY = 390;
                }
                
                colision();
            }
        }
        public void colision()
        {
            
            if (x >= maxX)
            {
                x = maxX;
            }
            if (y >= maxY)
            {
                y = maxY;
            }
        }
        private void panel1_Click(object sender, EventArgs e)
        {
           
            mover = true;
        }

        private void label1_Click(object sender, EventArgs e)
        {
            mover = true;
        }

        private void panel2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Color cambiado");
            var rand = new Random();
            int color = rand.Next(6);
            switch(color)
            {
                case 1:
                    objeto.BackColor = (Color.Red);
                    break;
                case 2:
                    objeto.BackColor = (Color.Blue);
                    break;
                case 3:
                    objeto.BackColor = (Color.Green);
                    break;
                case 4:
                    objeto.BackColor = (Color.Yellow);
                    break;
                case 5:
                    objeto.BackColor = (Color.Cyan);
                    break;

            }
            texto = N.DevNombre();
            label4.Text = texto;
        }

        private void label2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Color cambiado");
            var rand = new Random();
            int color = rand.Next(6);
            switch (color)
            {
                case 1:
                    objeto.BackColor = (Color.Red);
                    break;
                case 2:
                    objeto.BackColor = (Color.Blue);
                    break;
                case 3:
                    objeto.BackColor = (Color.Green);
                    break;
                case 4:
                    objeto.BackColor = (Color.Yellow);
                    break;
                case 5:
                    objeto.BackColor = (Color.Cyan);
                    break;

            }
           
        }


        private void panel3_Paint(object sender, PaintEventArgs e)
        {

        }

        private void panel3_Click(object sender, EventArgs e)
        {
       
            N.Show();
            N.Enabled = true;
        }

        private void label3_Click(object sender, EventArgs e)
        {
           
            N.Show();
            N.Enabled = true;
          
            
        }
       
        private void pictureBox1_Click(object sender, EventArgs e)
        {
           
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {
            Console.WriteLine(e.KeyChar.ToString());
            if (e.KeyChar == 'a' || e.KeyChar == 'A')
            {

                MessageBox.Show("Color cambiado");
                var rand = new Random();
                int color = rand.Next(6);
                switch (color)
                {
                    case 1:
                        objeto.BackColor = (Color.Red);
                        break;
                    case 2:
                        objeto.BackColor = (Color.Blue);
                        break;
                    case 3:
                        objeto.BackColor = (Color.Green);
                        break;
                    case 4:
                        objeto.BackColor = (Color.Yellow);
                        break;
                    case 5:
                        objeto.BackColor = (Color.Cyan);
                        break;

                }
                
                }
            if (e.KeyChar == 's' || e.KeyChar == 'S')
            {
                N.Show();
                N.Enabled = true;
               
            }
            if (e.KeyChar == 'w' || e.KeyChar == 'W')
            {
               
                mover = true;
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
