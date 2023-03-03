import javax.swing.*;
import java.util.ArrayList;


public class main2 {

    static ArrayList<carros> Estoque = new ArrayList<>();

    public static void main(String[] args) {
        int teste4 = 7;
        do {
            menu();
        } while (teste4 == 7);


    }

    public static void menu() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Efetuar uma venda
                2 - Cadastrar um carro ao estoque
                3 - Mostrar carros no estoque
                4 - Finalizar
                """));

        if (opcao == 1) {

            venda();

        } else if (opcao == 2) {

            register();

        } else if (opcao == 3) {

            mostrarCarros();

        } else if (opcao == 4) {
            System.exit(0);
        }


    }

    public static void register() {
        String Placa;
        String Marca;
        String Cor;
        String Modelo;
        int quilometragem;
        int ano;

        Placa = JOptionPane.showInputDialog("Informe a placa: ");
        Marca = JOptionPane.showInputDialog("Informe a Marca: ");
        Cor = JOptionPane.showInputDialog("Informe o Cor: ");
        Modelo = JOptionPane.showInputDialog("Informe o Modelo: ");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano: "));
        quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quilometragem: "));

        for (carros i : Estoque) {
            if (i.Placa.equals(Placa)) {
                JOptionPane.showMessageDialog(null, "Já existe um carro com esta placa registrada");
                return;
            }
        }

        carros carro = new carros(Placa, Marca, Cor, Modelo, quilometragem, ano);
        Estoque.add(carro);
        JOptionPane.showMessageDialog(null, "O carro foi registrado");
    }

    public static void mostrarCarros(){

        for (int i = 0; i < Estoque.size(); i++) {

            carros teste = Estoque.get(i);

            JOptionPane.showMessageDialog(null,teste.toString());

        }

    }
    public static void venda(){

        String Placa;

        Placa = JOptionPane.showInputDialog("Informe a placa: ");


        for (int i = 0; i < Estoque.size(); i++) {

            carros teste = Estoque.get(i);

            if (teste.Placa.equals(Placa)){

                Estoque.remove(i);

            }

        }

    }

}

