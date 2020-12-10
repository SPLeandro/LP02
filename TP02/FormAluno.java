// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class FormAluno extends Frame implements ActionListener{

    JLabel labelName = new JLabel("Nome:");
    JTextField InputName = new JTextField("",20);

    JLabel labelIdade = new JLabel("Idade:");
    JTextField InputIdade = new JTextField("",2);

    JLabel labelEndereco = new JLabel("Endereço:");
    JTextField InputEndereco = new JTextField("",255);

    Button okButton = new Button("Ok");
    Button clearButton = new Button("Limpar");
    Button showButton = new Button("Mostrar");
    Button exitButton = new Button("sair");


    ArrayList<Aluno> AlunosArray = new ArrayList();

    FormAluno(String titulo, int largura, int altura, int colinic, int lininic){
        super(titulo);
        setSize(largura, altura);
        setLocation(colinic, lininic);
        setLayout(new BorderLayout());
        add(painelSuperior(), BorderLayout.CENTER);
        add(painelInferior(), BorderLayout.SOUTH);
    }


    public JComponent painelSuperior()
    {
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3,2, 10, 10));

        painel.add(labelName);
        painel.add(InputName);

        painel.add(labelIdade);
        painel.add(InputIdade);

        painel.add(labelEndereco);
        painel.add(InputEndereco);
        return painel;
    }

    public JComponent painelInferior()
    {
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(1,4, 10, 10));

        painel.add(okButton);
        okButton.addActionListener(this);
        painel.add(clearButton);
        clearButton.addActionListener(this);
        painel.add(showButton);
        showButton.addActionListener(this);
        painel.add(exitButton);
        exitButton.addActionListener(this);
        return painel;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == okButton){
            String name = InputName.getText();
            int idade = Integer.parseInt(InputIdade.getText());
            String endereco = InputEndereco.getText();

            Aluno aluno = new Aluno(name, idade, endereco);

            AlunosArray.add(aluno);
            JOptionPane.showMessageDialog(this, "Cadastro realizado!");


        } else if (e.getSource() == clearButton) {
            InputName.setText("");
            InputIdade.setText("");
            InputEndereco.setText("");

        } else if (e.getSource() == showButton) {

            
            String quebraLinha = System.getProperty("line.separator");

            String message = "";
            if(AlunosArray.size() == 0) {
                message = "Não há usuários cadastrados!";
            }

            for (Aluno a : AlunosArray) 
            { 
                message += "Id: " + a.getUuid() + " Nome: " + a.getNome() + quebraLinha;
            }

            JOptionPane.showMessageDialog(this, message);

        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }


    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    public static void main(String[] args) {
        FormAluno form = new FormAluno("TP02 - LP2|4", 400, 180, 10, 50);

        form.addWindowListener(new WindowAdapter()
        {
            public void windowClosing (WindowEvent e)
            {
                System.exit(0);
            }
        });

        form.show();
    }
}
