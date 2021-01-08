// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.UUID;


public class Calculadora implements ActionListener {
    
	private JFrame frame = new JFrame();
	private JTextField tela = new JTextField(12);
	private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JButton b3 = new JButton();
    private JButton b4 = new JButton();
    private JButton b5 = new JButton();
    private JButton b6 = new JButton();
    private JButton b7 = new JButton();
    private JButton b8 = new JButton();
    private JButton b9 = new JButton();
    private JButton b0 = new JButton();
    private JButton badi = new JButton();
    private JButton bsub = new JButton();
    private JButton bmult = new JButton();
    private JButton bdiv = new JButton();
    private JButton bigual = new JButton();
    private JButton bponto = new JButton();
    private JButton bclear = new JButton();
    private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel p3 = new JPanel();
    float pValor = 0;
    float sValor = 0;
    String screenValue = "0";
    String operacao = "";
      
        
        Calculadora(){

            b0.setText("0");
            b1.setText("1");
            b2.setText("2");
            b3.setText("3");
            b4.setText("4");
            b5.setText("5");
            b6.setText("6");
            b7.setText("7");
            b8.setText("8");
            b9.setText("9");
            bclear.setText("C");
            badi.setText("+");
            bsub.setText("-");
            bdiv.setText("/");
            bmult.setText("*");
            bponto.setText(".");
            bigual.setText("=");
            tela.setText("0");
            tela.setEditable(false);
            b0.addActionListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            badi.addActionListener(this);
            bmult.addActionListener(this);
            bsub.addActionListener(this);
            bdiv.addActionListener(this);
            bponto.addActionListener(this);
            bigual.addActionListener(this);
            bclear.addActionListener(this);
            

            frame.setSize(220,240);
            frame.setLocation(200,200);
            frame.setTitle("Calculadora");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1.add(tela);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bdiv);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bmult);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bsub);
        p2.add(b0);
        p2.add(bponto);
        p2.add(bigual);
        p2.add(badi);
        p2.setLayout(new GridLayout(4,4,0,0));
        p3.add(bclear);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        frame.add(p);
        frame.setVisible(true);
        }
    

        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            try{
                
                if("1".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "1";                    
                    } else {
                        screenValue += "1";
                    }
                    pValor = Float.parseFloat(screenValue);   
                    tela.setText(screenValue);  
                }
                if("2".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "2";                    
                    } else {
                        screenValue += "2";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("3".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "3";                    
                    } else {
                        screenValue += "3";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("4".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "4";                    
                    } else {
                        screenValue += "4";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("5".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "5";                    
                    } else {
                        screenValue += "5";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("6".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "6";                    
                    } else {
                        screenValue += "6";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("7".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "7";                    
                    } else {
                        screenValue += "7";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("8".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "8";                    
                    } else {
                        screenValue += "8";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("9".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "9";                    
                    } else {
                        screenValue += "9";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if("0".equals(command)){
                    if(screenValue == "0"){
                        screenValue = "0";                    
                    } else {
                        screenValue += "0";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);     
                }
                if(".".equals(command)){
                    
                    if(screenValue == "0"){
                        screenValue = "0.";                    
                    } else {
                        screenValue += ".";
                    }           
                    pValor = Float.parseFloat(screenValue); 
                    tela.setText(screenValue);       
                }
                if("C".equals(command)){

                    screenValue = "0";                    
                    pValor = 0;
                    sValor = 0;
                    tela.setText(screenValue);     
                }
                if("+".equals(command)){

                    sValor = Float.parseFloat(screenValue);             
                    pValor = 0;
                    screenValue = "0";
                    operacao = "soma";
                    tela.setText(screenValue);     
                }
                if("-".equals(command)){

                    sValor = Float.parseFloat(screenValue);             
                    pValor = 0;
                    screenValue = "0";
                    operacao = "sub";
                    tela.setText(screenValue);   
                }
                if("*".equals(command)){

                    sValor = Float.parseFloat(screenValue);             
                    pValor = 0;
                    screenValue = "0";
                    operacao = "mult";
                    tela.setText(screenValue);    
                }
                if("/".equals(command)){

                    sValor = Float.parseFloat(screenValue);             
                    pValor = 0;
                    screenValue = "0";
                    operacao = "div";
                    tela.setText(screenValue);     
                }
                if("=".equals(command)){

                    if(operacao == "soma"){
                        pValor = sValor + pValor;
                        screenValue = String.valueOf(pValor);
                    }    
                    if(operacao == "sub"){
                        pValor = sValor - pValor;
                        screenValue = String.valueOf(pValor);
                    }  
                    if(operacao == "mult"){
                        pValor = sValor * pValor;
                        screenValue = String.valueOf(pValor);
                    }  
                    if(operacao == "div"){
                        pValor = sValor / pValor;
                        screenValue = String.valueOf(pValor);
                    }                
                }
            } catch(Exception ex){
                screenValue = "0";                    
                pValor = 0;
                sValor = 0;
                JOptionPane.showMessageDialog(null, String.valueOf(ex));
            }
            finally {
                tela.setText(screenValue); 
            }        
        }

	public static void main(String[] args) {
	    Calculadora calc = new Calculadora();   
	}
}