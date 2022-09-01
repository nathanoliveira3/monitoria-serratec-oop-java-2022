package exercicios;

public class Principal {
    public static void main(String[] args) {
        /*          
             1) Crie uma classe com o nome Imovel com os atributos e métodos abaixo:
            atributos:

            • codImovel
            • bairro
            • tipo
            • valor
            - Construa dois objetos em uma outra classe com o nome MainImovel com os seguintes dados:
                1, “Centro”,”apto”,25000.
                2,”Quitandinha”,”casa”,98900.
            -Métodos
            - Crie um método para calcular o reajuste para casa 5% e para apto 8%
            - Crie um método para mostra a categoria do imóvel:
            Categoria A - acima de 50000
            Categoria B - a partir de 10000 e menor que 50000
            Categoria C - valores inferiors a 10000
         */
        
        Imovel primeiroImovel = new Imovel("cod-1", "Centro", TipoImovel.APARTAMENTO, 25000);
        
        Imovel segundoImovel = new Imovel("cod-2", "Quitandinha", TipoImovel.CASA, 98900);
        
        primeiroImovel.calcularReajuste();
        System.out.println(primeiroImovel);
        primeiroImovel.verificarCategoria();
        
        segundoImovel.calcularReajuste();
        System.out.println(segundoImovel);
        segundoImovel.verificarCategoria();
    }
}
