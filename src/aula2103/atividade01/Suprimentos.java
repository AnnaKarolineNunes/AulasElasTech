package aula2103.atividade01;

public class Suprimentos {
    private  String idItem;
    private String descricao;
    private double valorItem;
    private int qtdeComprada;

    //construtor
    public Suprimentos(String idItem, String descricao, double valorItem, int qtdeComprada) {
        this.idItem = idItem;
        this.descricao = descricao;
        if (qtdeComprada < 0){
            this.qtdeComprada = 0;
        }else {
            this.qtdeComprada = qtdeComprada;
        }
        if (valorItem < 0){
            this.valorItem = 0.0;
        }else {
            this.valorItem = valorItem;
        }
    }


    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public int getQtdeComprada() {
        return qtdeComprada;
    }

    public void setQtdeComprada(int qtdeComprada) {
        this.qtdeComprada = qtdeComprada;
    }

    public double getInvoiceAmount(){
        // calcular o valor total da fatura
        //multiplica a quantidade pelo preço por item e retorna um valor como double
        double faturaFinal = getQtdeComprada() * getValorItem();
        System.out.println("O valor final da fatura é : " + faturaFinal);
        return faturaFinal;
    }

}
