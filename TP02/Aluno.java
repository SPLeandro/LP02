// LEANDRO PEREIRA DOS SANTOS CB3005372
// RENAN JOSUÉ SILVA DE MATOS CB3007162

import java.util.UUID;

public class Aluno {
    private UUID uuid;
    private String nome;
    private int idade;
    private String endereco;

    Aluno(String nome, int idade, String endereco){
        this.uuid = UUID.randomUUID();
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
