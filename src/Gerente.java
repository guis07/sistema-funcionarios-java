public class Gerente extends Funcionario {

    @Override
    public void calcularBonus(){
        double bonus = getSalario() * 0.3;
        double salarioAtual = getSalario() + bonus;
        System.out.println("O salário com o bonús é de: R$" + salarioAtual);
        System.out.println("-----------------------------------------");
    }
}
