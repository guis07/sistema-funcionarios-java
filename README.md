# 👨‍💻 Sistema de Funcionários em Java

Sistema desenvolvido em Java para praticar conceitos de Programação Orientada a Objetos (POO), com foco em herança, sobrescrita de métodos e polimorfismo.

## 📌 Sobre o projeto

O projeto simula diferentes tipos de funcionários e seus respectivos bônus salariais.

Cada tipo de funcionário possui uma porcentagem de bônus diferente:

- Funcionário: 10%
- Desenvolvedor: 20%
- Gerente: 30%
- Estagiário: 5%

## 🏗️ Estrutura do projeto

```text
Funcionario
├── Dev
├── Gerente
└── Estagiario
```

A classe `Funcionario` funciona como classe base para os demais tipos de funcionários.

As classes `Dev`, `Gerente` e `Estagiario` herdam de `Funcionario` e sobrescrevem o método `calcularBonus()` para aplicar uma porcentagem específica de bônus.

## 📚 Conceitos praticados

- Classes e objetos
- Encapsulamento
- Atributos `private`
- Getters e setters
- Métodos
- Herança com `extends`
- Sobrescrita de métodos com `@Override`
- Polimorfismo
- Referências de superclasse
- Cálculos e regras de negócio

## 💰 Regras de bônus

| Cargo | Bônus |
|---|---:|
| Funcionário | 10% |
| Desenvolvedor | 20% |
| Gerente | 30% |
| Estagiário | 5% |

## 🔄 Polimorfismo

O projeto utiliza polimorfismo através de referências do tipo `Funcionario` apontando para objetos de classes diferentes.

Exemplo:

```java
Funcionario funcionario = new Dev();
funcionario.calcularBonus();
```

Mesmo que a variável seja declarada como `Funcionario`, o objeto criado é um `Dev`. Por isso, o Java executa a implementação de `calcularBonus()` sobrescrita na classe `Dev`.

O mesmo conceito é utilizado com `Gerente` e `Estagiario`.

## 🧪 Testes

A classe `TesteFuncionario` é utilizada para testar o funcionamento das diferentes classes.

São realizados testes para:

- Definir nome do funcionário
- Definir salário
- Exibir informações
- Calcular bônus
- Testar diferentes tipos de funcionários
- Praticar polimorfismo

## 🛠️ Tecnologias

- Java
- IntelliJ IDEA
- Git
- GitHub

## 🎯 Objetivo

Projeto desenvolvido durante meus estudos de Java e Programação Orientada a Objetos (POO), com o objetivo de colocar em prática conceitos de herança, encapsulamento, sobrescrita de métodos e polimorfismo através de um projeto simples.

## 🚀 Próximos passos

- Trabalhar com múltiplos funcionários utilizando `ArrayList`
- Criar um sistema de cadastro de funcionários
- Adicionar busca e remoção de funcionários
- Criar um menu de interação no terminal
- Adicionar novas categorias de funcionários

## 👨‍💻 Autor

Desenvolvido por **Guilherme Correia Alves** durante os estudos de Engenharia de Software e Java.