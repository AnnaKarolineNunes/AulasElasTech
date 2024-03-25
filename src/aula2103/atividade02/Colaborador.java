package aula2103.atividade02;

public class Colaborador {
    private String primeiroNome;
    private String sobrenome;
    private double salarioAnual;

    public Colaborador(String primeiroNome, String sobrenome, double salarioAnual) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioAnual < 0 ){
            this.salarioAnual = 0.0;
        }else {
            this.salarioAnual = salarioAnual;
        }
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public double aumentarSalario(){
        //de aumento de 10% e exiba novamente o
        //  salário anual de cada colaborador.
        double aumento = salarioAnual * 0.1;
        double salarioAumentado = salarioAnual + aumento;
        System.out.println("O novo salario do colaborador "+ getPrimeiroNome()  + getSobrenome() + " é de " + salarioAumentado);
        return salarioAumentado;
    }
}
