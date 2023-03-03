public class carros {

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
                "Ano: " + ano;
    }
}
