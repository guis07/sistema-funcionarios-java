public class Funcionario {
    private String nome;
    private double salario;

    public void exibirInfo(){
        System.out.println("Nome do funcionário " + getNome());
        System.out.println("Salário do funcionário R$" + getSalario());

    }

    public void calcularBonus(){
        double bonus = getSalario() * 0.1;
        double salarioAtual = getSalario() + bonus;
        System.out.println("O salário com o bonús é de: R$" + salarioAtual);
        System.out.println("-----------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
