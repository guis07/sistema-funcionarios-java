public class Estagiario extends Funcionario{

    @Override
    public void calcularBonus(){
        double bonus = getSalario() * 0.05;
        double salarioAtual = getSalario() + bonus;
        System.out.println("O salário atual é de: R$" + salarioAtual);
        System.out.println("-----------------------------------------");
    }
}
