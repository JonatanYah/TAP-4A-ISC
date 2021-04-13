
namespace CalculadoraGUI
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.entrada = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.buttonsuma = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.button5 = new System.Windows.Forms.Button();
            this.button6 = new System.Windows.Forms.Button();
            this.buttonresta = new System.Windows.Forms.Button();
            this.button7 = new System.Windows.Forms.Button();
            this.button8 = new System.Windows.Forms.Button();
            this.button9 = new System.Windows.Forms.Button();
            this.buttondiv = new System.Windows.Forms.Button();
            this.buttonmulti = new System.Windows.Forms.Button();
            this.button0 = new System.Windows.Forms.Button();
            this.buttonelevado = new System.Windows.Forms.Button();
            this.buttonres = new System.Windows.Forms.Button();
            this.flowLayoutPanel1 = new System.Windows.Forms.FlowLayoutPanel();
            this.SuspendLayout();
            // 
            // entrada
            // 
            this.entrada.ForeColor = System.Drawing.Color.SlateGray;
            this.entrada.Location = new System.Drawing.Point(12, 12);
            this.entrada.Name = "entrada";
            this.entrada.Size = new System.Drawing.Size(469, 22);
            this.entrada.TabIndex = 0;
            this.entrada.TabStop = false;
            this.entrada.Text = "123456789";
            this.entrada.TextChanged += new System.EventHandler(this.entrada_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(72, 70);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(25, 17);
            this.label1.TabIndex = 1;
            this.label1.Text = "C1";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(202, 70);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(25, 17);
            this.label2.TabIndex = 2;
            this.label2.Text = "C2";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(324, 70);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(25, 17);
            this.label3.TabIndex = 3;
            this.label3.Text = "C3";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(428, 70);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(27, 17);
            this.label4.TabIndex = 4;
            this.label4.Text = "Op";
            this.label4.Click += new System.EventHandler(this.label4_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(22, 102);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(103, 53);
            this.button1.TabIndex = 5;
            this.button1.Text = "1";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(152, 102);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(100, 53);
            this.button2.TabIndex = 6;
            this.button2.Text = "2";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(280, 102);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(93, 53);
            this.button3.TabIndex = 7;
            this.button3.Text = "3";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // buttonsuma
            // 
            this.buttonsuma.Location = new System.Drawing.Point(397, 102);
            this.buttonsuma.Name = "buttonsuma";
            this.buttonsuma.Size = new System.Drawing.Size(84, 53);
            this.buttonsuma.TabIndex = 8;
            this.buttonsuma.Text = "+";
            this.buttonsuma.UseVisualStyleBackColor = true;
            this.buttonsuma.Click += new System.EventHandler(this.buttonsuma_Click);
            // 
            // button4
            // 
            this.button4.Location = new System.Drawing.Point(22, 161);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(103, 55);
            this.button4.TabIndex = 9;
            this.button4.Text = "4";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.button4_Click);
            // 
            // button5
            // 
            this.button5.Location = new System.Drawing.Point(152, 161);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(100, 55);
            this.button5.TabIndex = 10;
            this.button5.Text = "5";
            this.button5.UseVisualStyleBackColor = true;
            this.button5.Click += new System.EventHandler(this.button6_Click);
            // 
            // button6
            // 
            this.button6.Location = new System.Drawing.Point(280, 161);
            this.button6.Name = "button6";
            this.button6.Size = new System.Drawing.Size(93, 55);
            this.button6.TabIndex = 11;
            this.button6.Text = "6";
            this.button6.UseVisualStyleBackColor = true;
            this.button6.Click += new System.EventHandler(this.button7_Click);
            // 
            // buttonresta
            // 
            this.buttonresta.Location = new System.Drawing.Point(397, 161);
            this.buttonresta.Name = "buttonresta";
            this.buttonresta.Size = new System.Drawing.Size(84, 55);
            this.buttonresta.TabIndex = 12;
            this.buttonresta.Text = "-";
            this.buttonresta.UseVisualStyleBackColor = true;
            this.buttonresta.Click += new System.EventHandler(this.buttonresta_Click);
            // 
            // button7
            // 
            this.button7.Location = new System.Drawing.Point(22, 222);
            this.button7.Name = "button7";
            this.button7.Size = new System.Drawing.Size(103, 62);
            this.button7.TabIndex = 13;
            this.button7.Text = "7";
            this.button7.UseVisualStyleBackColor = true;
            this.button7.Click += new System.EventHandler(this.button9_Click);
            // 
            // button8
            // 
            this.button8.Location = new System.Drawing.Point(152, 221);
            this.button8.Name = "button8";
            this.button8.Size = new System.Drawing.Size(100, 63);
            this.button8.TabIndex = 14;
            this.button8.Text = "8";
            this.button8.UseVisualStyleBackColor = true;
            this.button8.Click += new System.EventHandler(this.button8_Click);
            // 
            // button9
            // 
            this.button9.Location = new System.Drawing.Point(280, 222);
            this.button9.Name = "button9";
            this.button9.Size = new System.Drawing.Size(93, 62);
            this.button9.TabIndex = 15;
            this.button9.Text = "9";
            this.button9.UseVisualStyleBackColor = true;
            this.button9.Click += new System.EventHandler(this.button9_Click_1);
            // 
            // buttondiv
            // 
            this.buttondiv.Location = new System.Drawing.Point(397, 222);
            this.buttondiv.Name = "buttondiv";
            this.buttondiv.Size = new System.Drawing.Size(84, 62);
            this.buttondiv.TabIndex = 16;
            this.buttondiv.Text = "/";
            this.buttondiv.UseVisualStyleBackColor = true;
            this.buttondiv.Click += new System.EventHandler(this.buttondiv_Click);
            // 
            // buttonmulti
            // 
            this.buttonmulti.Location = new System.Drawing.Point(22, 290);
            this.buttonmulti.Name = "buttonmulti";
            this.buttonmulti.Size = new System.Drawing.Size(103, 54);
            this.buttonmulti.TabIndex = 17;
            this.buttonmulti.Text = "*";
            this.buttonmulti.UseVisualStyleBackColor = true;
            this.buttonmulti.Click += new System.EventHandler(this.buttonmulti_Click);
            // 
            // button0
            // 
            this.button0.Location = new System.Drawing.Point(152, 290);
            this.button0.Name = "button0";
            this.button0.Size = new System.Drawing.Size(100, 54);
            this.button0.TabIndex = 18;
            this.button0.Text = "0";
            this.button0.UseVisualStyleBackColor = true;
            this.button0.Click += new System.EventHandler(this.button14_Click);
            // 
            // buttonelevado
            // 
            this.buttonelevado.Location = new System.Drawing.Point(280, 290);
            this.buttonelevado.Name = "buttonelevado";
            this.buttonelevado.Size = new System.Drawing.Size(93, 54);
            this.buttonelevado.TabIndex = 19;
            this.buttonelevado.Text = "^";
            this.buttonelevado.UseVisualStyleBackColor = true;
            this.buttonelevado.Click += new System.EventHandler(this.buttonelevado_Click);
            // 
            // buttonres
            // 
            this.buttonres.Location = new System.Drawing.Point(397, 290);
            this.buttonres.Name = "buttonres";
            this.buttonres.Size = new System.Drawing.Size(84, 54);
            this.buttonres.TabIndex = 20;
            this.buttonres.Text = "=";
            this.buttonres.UseVisualStyleBackColor = true;
            this.buttonres.Click += new System.EventHandler(this.button16_Click);
            // 
            // flowLayoutPanel1
            // 
            this.flowLayoutPanel1.Location = new System.Drawing.Point(583, 121);
            this.flowLayoutPanel1.Name = "flowLayoutPanel1";
            this.flowLayoutPanel1.Size = new System.Drawing.Size(23, 8);
            this.flowLayoutPanel1.TabIndex = 21;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(533, 384);
            this.Controls.Add(this.flowLayoutPanel1);
            this.Controls.Add(this.buttonres);
            this.Controls.Add(this.buttonelevado);
            this.Controls.Add(this.button0);
            this.Controls.Add(this.buttonmulti);
            this.Controls.Add(this.buttondiv);
            this.Controls.Add(this.button9);
            this.Controls.Add(this.button8);
            this.Controls.Add(this.button7);
            this.Controls.Add(this.buttonresta);
            this.Controls.Add(this.button6);
            this.Controls.Add(this.button5);
            this.Controls.Add(this.button4);
            this.Controls.Add(this.buttonsuma);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.entrada);
            this.Name = "Form1";
            this.Text = "Calculadora SImple";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox entrada;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button buttonsuma;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.Button button6;
        private System.Windows.Forms.Button buttonresta;
        private System.Windows.Forms.Button button7;
        private System.Windows.Forms.Button button8;
        private System.Windows.Forms.Button button9;
        private System.Windows.Forms.Button buttondiv;
        private System.Windows.Forms.Button buttonmulti;
        private System.Windows.Forms.Button button0;
        private System.Windows.Forms.Button buttonelevado;
        private System.Windows.Forms.Button buttonres;
        private System.Windows.Forms.FlowLayoutPanel flowLayoutPanel1;

    }
}

