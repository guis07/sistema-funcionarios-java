public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Guilherme");
        funcionario1.setSalario(3000);
        funcionario1.exibirInfo();
        funcionario1.calcularBonus();

        Funcionario funcionario2 = new Dev();
        funcionario2.setNome("Simone");
        funcionario2.setSalario(5000);
        funcionario2.exibirInfo();
        funcionario2.calcularBonus();

        Funcionario funcionario3 = new Gerente();
        funcionario3.setNome("Diego");
        funcionario3.setSalario(5500);
        funcionario3.exibirInfo();
        funcionario3.calcularBonus();

        Dev dev1 = new Dev();
        dev1.setNome("Sofia");
        dev1.setSalario(6000);
        dev1.exibirInfo();
        dev1.calcularBonus();

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Djair");
        gerente1.setSalario(15000);
        gerente1.exibirInfo();
        gerente1.calcularBonus();

        Estagiario estagiario1 = new Estagiario();
        estagiario1.setNome("Enzo");
        estagiario1.setSalario(1900);
        estagiario1.exibirInfo();
        estagiario1.calcularBonus();
    }
}
