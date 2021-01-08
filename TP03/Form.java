// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form implements ActionListener {
    
    private JFrame frame = new JFrame();
	private JLabel labelNumero = new JLabel("Numero:");
    private JTextField JtNumero = new JTextField(12);
    
    private JLabel labelNome = new JLabel("Nome:");
    private JTextField JtNome = new JTextField(12);
    
    private JLabel labelSexo = new JLabel("Sexo:");
    private JTextField JtSexo = new JTextField(12);
    
    private JLabel labelIdade = new JLabel("Idade:");
    private JTextField JtIdade = new JTextField(12);
    
	private JButton buttonOk = new JButton();
    private JButton buttonLimpar = new JButton();
    private JButton buttonMostrar = new JButton();
    private JButton buttonSair = new JButton();

    private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    
    private Pessoa newp = new Pessoa();

    private GridLayout grid = new GridLayout(4, 2, 10, 10);
        
    Form(){
        buttonOk.setText("OK");
        buttonLimpar.setText("Limpar");
        buttonMostrar.setText("Mostrar");
        buttonSair.setText("Sair");
        buttonOk.addActionListener(this);
        buttonLimpar.addActionListener(this);
        buttonMostrar.addActionListener(this);
        buttonSair.addActionListener(this);
        JtNumero.setEditable(false);
            
        frame.setSize(360,220);
        frame.setLocation(200,200);
        frame.setTitle("TP03 - LP2I4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        p1.add(labelNumero);
        p1.add(JtNumero);
        p1.add(labelNome);
        p1.add(JtNome);
        p1.add(labelSexo);
        p1.add(JtSexo);
        p1.add(labelIdade);
        p1.add(JtIdade);
        p2.add(buttonOk);
        p2.add(buttonLimpar);
        p2.add(buttonMostrar);
        p2.add(buttonSair);
        p1.setLayout(grid);  
        p.add(p1);
        p.add(p2);
        frame.add(p);      
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){

        String command = e.getActionCommand();

        if("OK".equals(command)){
            String TempNome = JtNome.getText();
            String TempSexo = JtSexo.getText();
            String TempIdade = JtIdade.getText();
            if(TempSexo.charAt(0) == 'M' || TempSexo.charAt(0) == 'F'){
                
                if(!TempNome.equals("") && !TempSexo.equals("") && !TempIdade.equals("")){                 
                    newp = new Pessoa(JtNome.getText(),JtSexo.getText().charAt(0),Integer.parseInt(JtIdade.getText()));
                    JtNumero.setText("");
                    JtNome.setText("");
                    JtSexo.setText("");
                    JtIdade.setText("");                    
                } else
                {               
                    JOptionPane.showMessageDialog(null, "Há campos em branco!");
                }   

            } else
            {
                JOptionPane.showMessageDialog(null, "Sexo invalido! Precisa ser M ou F");
            }                
        }
        if("Limpar".equals(command)){
            JtNumero.setText("");
            JtNome.setText("");
            JtSexo.setText("");
            JtIdade.setText("");
        }
        if("Mostrar".equals(command)){
            JtNumero.setText(String.valueOf(newp.getKp()));
            JtNome.setText(newp.getNome());
            JtSexo.setText(String.valueOf(newp.getSexo()));
            JtIdade.setText(String.valueOf(newp.getIdade()));
        }
        if("Sair".equals(command)){
            frame.dispose();                
        }
    } 

    public static void main(String[] args) {	    
    Form form = new Form();    
	}       
}
