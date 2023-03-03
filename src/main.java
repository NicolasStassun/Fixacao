import javax.swing.*;

import static java.lang.Integer.parseInt;

public class main {

    public static void main(String[] args) {

        menu();

    }

    public static void menu(){

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Adição
                2 - Subtração
                3 - Divisão 
                4 - Multiplicação
                5 - Sair
                """));
        if (opcao == 1){

            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

            calculadora.adicao(valor1,valor2);

            menu();


        }
        else if (opcao == 2){

            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

            calculadora.subtracao(valor1,valor2);

            menu();

        }
        else if (opcao == 3){

            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

            calculadora.divisao(valor1,valor2);

            menu();

        }
        else if (opcao == 4){

            double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor"));
            double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor"));

            calculadora.multiplicacao(valor1,valor2);

            menu();

        }

    }

}
