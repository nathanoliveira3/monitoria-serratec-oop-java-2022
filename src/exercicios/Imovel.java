package exercicios;

public class Imovel {
    private String codImovel;
    private String bairro;
    private TipoImovel tipoImovel;
    private double valor;   
    
    public Imovel(String codImovel, String bairro, TipoImovel tipoImovel, double valor) {
        
        this.codImovel = codImovel;
        this.bairro = bairro;
        this.tipoImovel = tipoImovel;
        this.valor = valor;
    }    
    
    public String getCodImovel() {
        return codImovel;
    }

    public void setCodImovel(String codImovel) {
        this.codImovel = codImovel;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void calcularReajuste() {
        if(this.tipoImovel.equals(TipoImovel.CASA)) {
            this.valor *= 1.05;
        }else {
            this.valor *= 1.08;
        }
    }

    public void verificarCategoria() {
        if(this.valor > 50000) {
            System.out.println("CATEGORIA A");
        }else if(this.valor < 50000 && this.valor > 10000) {
            System.out.println("CATEGORIA B");
        }else {
            System.out.println("CATEGORIA C");
        }
    }


    @Override
    public String toString() {        
       return "Código - " + codImovel + "; Bairro - " + bairro + "; tipo - " + tipoImovel + "; valor - " + valor;
    }
    
}
