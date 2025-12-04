package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 passo - bloco de inicializacao estático da superclasse eh carregado quando a JVM carregar a classe pai
    // 1 passo - bloco de inicializacao estático da subclasse eh carregado quando a JVM carregar a classe filha
    // 2 passo - alocado espaco em memoria pro objeto da superclasse
    // 3 passo - cada atributo de classe eh criado e inicializado com valores default ou o que for passado
    // 4 passo - bloco de inicializacao da superclasse eh executado na ordem que aparece
    // 5 passo - construtor da superclasse eh executado
    // 6 passo - alocado espaco em memoria pro objeto da subclasse
    // 7 passo - cada atributo de subclasse eh criado e inicializado com valores default ou o que for passado
    // 8 passo - bloco de inicializacao da subclasse eh executado na ordem que aparece
    // 9 passo - construtor da subclasse eh executado
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Eduardo");
    }
}
