package br.com.serratec;

public class Programador extends Pessoa{
    private String linguagem;

    public Programador(String nome, double altura, String cpf, double peso, double salario, String linguagem) {
        super(nome, altura, cpf, peso, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    } 
    
    @Override
    public void falar() {
       System.out.println("Falar como programador");
    }
    
    public void falar(String mensagem) {
        System.out.println(mensagem);
    }
    
    @Override
    public void andar() {
       System.out.println("Andar como programador");
    }
    
}
