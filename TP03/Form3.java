// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form3 implements ActionListener {
    
    private JFrame frame = new JFrame();
	private JLabel labelNumero = new JLabel("Numero:");
    private JTextField JtNumero = new JTextField(12);
    
    private JLabel labelNome = new JLabel("Nome:");
    private JTextField JtNome = new JTextField(12);
    
    private JLabel labelSexo = new JLabel("Sexo:");
    private JRadioButton masculino, feminino;
    private RadioButtonHandler handler;           

    private JLabel labelIdade = new JLabel("Idade:");
    private JTextField JtIdade = new JTextField(12);
    
	private JButton buttonOk = new JButton();
    private JButton buttonLimpar = new JButton();
    private JButton buttonMostrar = new JButton();
    private JButton buttonSair = new JButton();

    private JPanel p = new JPanel();
	private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel();
    private JPanel pr = new JPanel();

    private Pessoa newp = new Pessoa();
    private GridLayout grid = new GridLayout(4, 2, 10, 10);
        
    Form3(){
        buttonOk.setText("OK");
        buttonLimpar.setText("Limpar");
        buttonMostrar.setText("Mostrar");
        buttonSair.setText("Sair");
	    buttonOk.addActionListener(this);
        buttonLimpar.addActionListener(this);
        buttonMostrar.addActionListener(this);
        buttonSair.addActionListener(this);
        JtNumero.setEditable(false);
        
        handler = new RadioButtonHandler();
        masculino = new JRadioButton("Masculino", true);
        feminino = new JRadioButton("Femino", false);
            
        masculino.addItemListener(handler);
        feminino.addItemListener(handler);
            
	    frame.setSize(360,260);
	    frame.setLocation(200,200);
	    frame.setTitle("TP03 - LP2I4");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
	    p1.add(labelNumero);
        p1.add(JtNumero);
        p1.add(labelNome);
        p1.add(JtNome);
        p1.add(labelSexo);
        pr.add(masculino);
        pr.add(feminino);
        p1.add(pr);
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
            String TempIdade = JtIdade.getText();

            if(!TempNome.equals("") && !TempIdade.equals("")){ 

                if(!masculino.isSelected() && !feminino.isSelected()){
                    JOptionPane.showMessageDialog(null, "Selecione o sexo!");
                } else{
                    char sexo = 'a';
                    if(masculino.isSelected()){
                        sexo = 'M';
                    }
                    if(feminino.isSelected()){
                        sexo = 'F';
                    }
    
                    newp = new Pessoa(JtNome.getText(),sexo,Integer.parseInt(JtIdade.getText()));
                    JtNumero.setText("");
                    JtNome.setText("");
                    JtIdade.setText("");  
                }
                                               
            }
            else{
                JOptionPane.showMessageDialog(null, "Há campos em branco!");
            }
            
        }
        if("Limpar".equals(command)){
            JtNumero.setText("");
            JtNome.setText("");
            masculino.setSelected(false);
            feminino.setSelected(false);
            JtIdade.setText("");
        }
        if("Mostrar".equals(command)){
            JtNumero.setText(String.valueOf(newp.getKp()));
            if(newp.getSexo() == 'M'){
                masculino.setSelected(true);
                feminino.setSelected(false);
            }
            if(newp.getSexo() == 'F'){
                masculino.setSelected(false);
                feminino.setSelected(true);
            }
            JtNome.setText(newp.getNome());
            JtIdade.setText(String.valueOf(newp.getIdade()));
        }
        if("Sair".equals(command)){
            frame.dispose();                
        }
        
    }
        
    private class RadioButtonHandler implements ItemListener {

        @Override 
        public void itemStateChanged(ItemEvent event){
            if(masculino.isSelected()){
                feminino.setSelected(false);
            } else 
            {
                masculino.setSelected(false);
            }                
        }
    }

    public void itemStateChanged(ItemEvent event) {}
        
    public static void main(String[] args) {   
        Form3 form = new Form3();    
	}
        
}
