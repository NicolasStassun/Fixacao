import javax.swing.*;
import java.util.ArrayList;


public class main2 {

    public static void main(String[] args) {
        int Repetidor = 0;
        do {
            menu();
        } while (Repetidor == 0);


    }

    public static void menu() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Efetuar uma venda
                2 - Cadastrar um carro ao estoque
                3 - Mostrar carros no estoque
                4 - Finalizar
                """));

        if (opcao == 1) {

            carros.venda();

        } else if (opcao == 2) {

            carros.register();

        } else if (opcao == 3) {

            mostrarCarros();

        } else if (opcao == 4) {
            System.exit(0);
        }


    }

    public static void mostrarCarros(){

        for (int i = 0; i < carros.Estoque.size(); i++) {

            carros teste = carros.Estoque.get(i);

            JOptionPane.showMessageDialog(null,teste.toString());

        }

    }

}

