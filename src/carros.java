import javax.swing.*;
import java.util.ArrayList;

public class carros {

    static ArrayList<carros> Estoque = new ArrayList<>();

    String Placa = "";
    String Marca = "";
    String Cor = "";
    String Modelo = "";
    int quilometragem;
    int ano;

    public carros(String Placa, String Marca, String Cor, String Modelo, int quilometragem, int ano) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Cor = Cor;
        this.Modelo = Modelo;
        this.quilometragem = quilometragem;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Placa: " + Placa + "\n" +
                "Marca: " + Marca +"\n" +
                "Cor: " + Cor + "\n" +
                "Modelo: " + Modelo + "\n" +
                "Quilometragem: " + quilometragem +"\n"+
                "Ano=" + ano;
    }
    public static void venda(){

        String Placa;

        Placa = JOptionPane.showInputDialog("Informe a placa: ");


        for (carros carro:Estoque) {


            int index = Estoque.indexOf(carro);

            if (carro.Placa.equals(Placa)){

                Estoque.remove(index);

            }

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
}
