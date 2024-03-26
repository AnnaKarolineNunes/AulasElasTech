package aula2503;

public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Veiculo(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    /*
    public void Ligar(boolean ligar){
        System.out.println("Ligando " + getModelo());
    }
     */

    public void mostrarInformacoes(){
        System.out.println("Marca  : " + getMarca());
        System.out.println("Modelo : " + getModelo());
        System.out.println("Cor    : " + getCor());
        System.out.println("Ano    : " + getAno());
    }


}
