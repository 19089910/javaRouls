//import jdk.nashorn.internal.parser.Scanner;

import javax.swing.plaf.PanelUI;
import java.util.Locale;//biblioteca de localizacao
import java.util.Scanner;

public class testandoPrintf {

    private String aula() {
        double x = 4.5574546568;

        //BIBLIOTECA LOCALE; PRINT FORMATACAO""
        System.out.printf("%.2f%n", x);//soutf=formatacao(,%.2f= quantas casa depois da virgula)
        //(\n),(%n)=quebra de linha
        //res:4,56; sendo (,)nao(.), isso e pelo padao do pc que e br, para ser padrao US:
        Locale.setDefault(Locale.US);//teclado padrao us
        System.out.printf("%.2f%n", x);
        //res:4.56

        //CONTETENACAO DIFERENTE COM PRINTF
        System.out.printf("resultado = %.2f metros%n", x);//onde o %.2f formata a variavel X e o faz marcadores/chama sem o uso do +
        //exercicio marcadores %f=pontoFlutuante;%d=inteiro;%s=testo
        String nome = "maria";
        Integer idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reasi", nome, idade, renda);
        return "\nFIM DO PROGRAMA\n";
    }

    private String exercicio() {
        String product1 = "Computer";
        String product2 = "Office desk";

        Integer age = 30;
        Integer code = 5290;
        Character gender = 'F';
        //ERRO:Double price1 ,price2 ,measure = 2100.0, 650.50, 53.234567;
        Double price1 = 2100.0;
        Double price2 = 650.50;
        Double measure = 53.234567;

        //System.out.printf("products:%n%s which price is $ %.2f%n%s which price is $ %.2f%n%nRecord: %d years old, code %d and gender: %s%n%nMeasue with eight decimal places: %.8f%nRouded (three decimal places): %.3f%nUS decimal point: %.3f", product1, price1, product2, price2, age , code, gender, measure, measure, measure);
        System.out.printf("products:%n%s which price is $ %.2f%n", product1, price1);
        System.out.printf("%s which price is $ %.2f%n", product2, price2);

        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);

        System.out.printf("%nMeasue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
        return "\nFIM DO PROGRAMA\n";
    }

    //CASTING
    private String casting() {
        int a, b;
        double resultado, resultado1;

        a = 5;
        b = 2;

        resultado = a / b;// sendo a b int, resultado mesmo sendo double sera ingnorado valor .0 por questoes de memoria
        resultado1 = (double) a / b;//para identificar que o resultado sera double, assim CASTING: CONVERSAO EXPLICITA DOS VALORES
        System.out.printf(resultado + "%n" + resultado1);
        return "\nFIM DO PROGRAMA\n";
    }


    public static void main(String[] args) {
        testandoPrintf print = new testandoPrintf();

        System.out.println(print.aula());
        System.out.println(print.exercicio());
        System.out.println(print.casting());
    }
}

