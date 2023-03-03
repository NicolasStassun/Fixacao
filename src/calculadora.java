import javax.swing.*;

public class calculadora {

    public static void adicao(double valor1,double valor2){

        double resultado=0;

        resultado = valor1+valor2;

        JOptionPane.showMessageDialog(null,valor1+" + "+valor2+" = "+resultado);
    }

    public static void subtracao(double valor1,double valor2){

        double resultado=0;

        resultado = valor1-valor2;

        JOptionPane.showMessageDialog(null,valor1+" - "+valor2+" = "+resultado);
    }
    public static void divisao(double valor1,double valor2){

        double resultado=0;

        resultado = valor1/valor2;

        JOptionPane.showMessageDialog(null,valor1+" / "+valor2+" = "+resultado);
    }
    public static void multiplicacao(double valor1,double valor2){

        double resultado=0;

        resultado = valor1*valor2;

        JOptionPane.showMessageDialog(null,valor1+" * "+valor2+" = "+resultado);
    }

}
