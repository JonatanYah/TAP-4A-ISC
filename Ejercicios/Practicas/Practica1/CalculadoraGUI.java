package Ejercicios.Practicas.Practica1;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.*;
public class CalculadoraGUI extends Frame implements ActionListener{
    //atributos
    Panel panel1;
    //Panel central;
    Panel panelNumeros;
    TextField entrada;
    int dato1;
    int dato2;
    String operacion;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    Button bt6;
    Button bt7;
    Button bt8;
    Button bt9;
    Button bt0;
    Button btsuma;
    Button btresta;
    Button btmulti;
    Button btdiv;
    Button btelevado;
    Button btres;
    Label c1;
    Label c2;
    Label c3;
    Label op;
    Metodos m;


    //constructor
    public CalculadoraGUI(String nombre){
    super("calculadora de hasta 20 números ");
    //componeentes de la interfaz
    //
    this.init();
    setBounds(400,200,500,500);
    this.setVisible(true);
    }
    public void init() {
        m = new Metodos();
        panel1 = new Panel();
        bt0 = new Button ("0");
        bt0.addActionListener(this);
        bt1 = new Button ("1");
        bt1.addActionListener(this);
        bt2 = new Button ("2");
        bt2.addActionListener(this);
        bt3 = new Button ("3");
        bt3.addActionListener(this);
        bt4 = new Button ("4");
        bt4.addActionListener(this);
        bt5 = new Button ("5");
        bt5.addActionListener(this);
        bt6 = new Button ("6");
        bt6.addActionListener(this);
        bt7 = new Button ("7");
        bt7.addActionListener(this);
        bt8 = new Button ("8");
        bt8.addActionListener(this);
        bt9 = new Button ("9");
        bt9.addActionListener(this);
        btsuma = new Button ("+");
        btsuma.addActionListener(this);
        btresta = new Button ("-");
        btresta.addActionListener(this);
        btmulti = new Button ("*");
        btmulti.addActionListener(this);
        btdiv = new Button ("/");
        btdiv.addActionListener(this);
        btelevado = new Button ("^");
        btelevado.addActionListener(this);
        btres = new Button ("=");
        btres.addActionListener(this);
        this.setLayout(new BorderLayout());
        entrada = new TextField("123456789");
        this.add(entrada,BorderLayout.NORTH);
        c1= new Label("C1");
        c2= new Label("C2");
        c3= new Label("C3");
        op= new Label("OP");
        panelNumeros= new Panel();
        this.add(panelNumeros,BorderLayout.CENTER);
        panelNumeros.setLayout(new GridLayout(5,4));
        panelNumeros.add(c1);
        panelNumeros.add(c2);
        panelNumeros.add(c3);
        panelNumeros.add(op);
        panelNumeros.add(bt1);
        panelNumeros.add(bt2);
        panelNumeros.add(bt3);
        panelNumeros.add(btsuma);
        panelNumeros.add(bt4);
        panelNumeros.add(bt5);
        panelNumeros.add(bt6);
        panelNumeros.add(btresta);
        panelNumeros.add(bt7);
        panelNumeros.add(bt8);
        panelNumeros.add(bt9);
        panelNumeros.add(btdiv);
        panelNumeros.add(btmulti);
        panelNumeros.add(bt0);
        panelNumeros.add(btelevado);
        panelNumeros.add(btres);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == bt0){
            entrada.setText(entrada.getText() + "0");
        }//Al presionar algún boton con un número se muestra lo que está en el TextField seguido del número que se presionó.
        if (arg0.getSource() == bt1){
            entrada.setText(entrada.getText() + "1");
        }
        if (arg0.getSource() == bt2){
            entrada.setText(entrada.getText() + "2");
        }
        if (arg0.getSource() == bt3){
            entrada.setText(entrada.getText() + "3");
        }
        if (arg0.getSource() == bt4){
            entrada.setText(entrada.getText() + "4");
        }
        if (arg0.getSource() == bt5){
            entrada.setText(entrada.getText() + "5");
        }
        if (arg0.getSource() == bt6){
            entrada.setText(entrada.getText() + "6");
        }
        if (arg0.getSource() == bt7){
            entrada.setText(entrada.getText() + "7");
        }
        if (arg0.getSource() == bt8){
            entrada.setText(entrada.getText() + "8");
        }
        if (arg0.getSource() == bt9){
            entrada.setText(entrada.getText() + "9");
        }
        if (arg0.getSource() == btsuma){
            String leer = entrada.getText();
            if(isNumber(leer)){
                dato1=Integer.parseInt(leer);
                operacion = "+";
                entrada.setText("");
            }
            else
            entrada.setText("Ingrese solamente números");
        }
        if (arg0.getSource() == btresta){
            String leer = entrada.getText();
            if(isNumber(leer)){
                dato1=Integer.parseInt(leer);
                operacion = "-";
                entrada.setText("");
            }
            else
            entrada.setText("Ingrese solamente números");
        }
        if (arg0.getSource() == btmulti){
            String leer = entrada.getText();
            if(isNumber(leer)){
                dato1=Integer.parseInt(leer);
                operacion = "*";
                entrada.setText("");
            }
            else
            entrada.setText("Ingrese solamente números");
        }
        if (arg0.getSource() == btdiv){
            String leer = entrada.getText();
            if(isNumber(leer)){
                dato1=Integer.parseInt(leer);
                operacion = "/";
                entrada.setText("");
            }
            else
            entrada.setText("Ingrese solamente números");
        }
        if (arg0.getSource() == btelevado){
            String leer = entrada.getText();
            if(isNumber(leer)){
                dato1=Integer.parseInt(leer);
                operacion = "^";
                entrada.setText("");
            }
            else
            entrada.setText("Ingrese solamente números");
        }
        if (arg0.getSource() == btres){
            String leer = entrada.getText();
            if(isNumber(leer)){
                dato2=Integer.parseInt(leer);
                entrada.setText(m.Operaciones(dato1, dato2, operacion));//Llamada al método.
            }
            else
            entrada.setText("Ingrese solamente números");
        }
    }
    public static boolean isNumber(String dato) {

        boolean isnumber;
        try {
            Integer.parseInt(dato);
            isnumber = true;
        } catch (NumberFormatException excepcion) {
            isnumber = false;
        }
        return isnumber;
    }
public static void main(String args[]) {
    CalculadoraGUI v = new CalculadoraGUI("XD");
    v.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
}}
