package aula2103.atividade02;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("Pedro","Silva", 120000);
        Colaborador colaborador2 = new Colaborador("Anna", "Nunes" , 60000);

        System.out.println("O salario atual de " + colaborador1.getPrimeiroNome() + " " + colaborador1.getSobrenome() + " é de " + colaborador1.getSalarioAnual());
        System.out.println("O salario atual de " + colaborador2.getPrimeiroNome() + " " + colaborador2.getSobrenome() + " é de " + colaborador2.getSalarioAnual());

        colaborador1.aumentarSalario();
        colaborador2.aumentarSalario();
    }
}
