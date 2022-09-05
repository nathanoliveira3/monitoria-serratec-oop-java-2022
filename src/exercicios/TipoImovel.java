package exercicios;

public enum TipoImovel {
    CASA(5),
    APARTAMENTO(8);
    
    private int valor;

    private TipoImovel(int valor) {
        this.valor = valor;
    }
    
}
