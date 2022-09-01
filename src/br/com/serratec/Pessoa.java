package br.com.serratec;

public class Pessoa {
    
    private String nome;
    private double altura;
    private String cpf;
    private double peso;
    private double salario;
    
    public Pessoa(String nome, double altura, String cpf, double peso, double salario) {        
        this.nome = nome;
        this.altura = altura;
        this.cpf = cpf;
        this.peso = peso;
        this.salario = salario;
    }
    
    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void andar() {
        System.out.println("andar");
    }
    
    public void falar() {
        System.out.println("falar");
    }
}
