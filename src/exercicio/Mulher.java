package exercicio;

public class Mulher extends Pessoa{

    private int filhos;
    
    public Mulher(String nome, int idade, double peso, int filhos) {
        super(nome, idade, peso);
        this.filhos = filhos;
    }

    public int getFilhos() {
        return filhos;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }   
    
    @Override
    public void comer() {       
        System.out.println("yyyyyyyyyyyyy");
    }
    
    public static void comer(String mensagem) {
        System.out.println(mensagem);
    }
    
    public static void comer(String mensagem, String mensagem2) {
        System.out.println(mensagem + mensagem2);
    }
    
    @Override
    public void falar() {        
        System.out.println("nnnnnnnnnnnnnnnnnn");
    }  
    
}
