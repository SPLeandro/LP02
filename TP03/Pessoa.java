// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.util.Random;

public class Pessoa{
    protected static int kp;
    protected String nome;
    protected char sexo;
    protected int idade;

    Random newPerson = new Random();
        Pessoa(){
      
            this.nome = "";
            this.sexo = 'N';
            this.idade = 0;
            kp = 0;

        }
        Pessoa(String nome, char sexo, int idade){           
            this.nome = nome;
            this.sexo = sexo;
            this.idade = idade;
            kp++;
        }
  
        public int getKp() {
            return this.kp;
        }
    
        public String getNome() {
            return this.nome;
        }

        public char getSexo() {
            return this.sexo;
        }

        public int getIdade() {
            return this.idade;
        }
    
        public void setKp() {
            kp = newPerson.nextInt();
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setSexo(char sexo) {
            this.sexo = sexo;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
    
  
    public static void main(String args[]) {
    }
  }