import java.util.Scanner;
import java.util.Locale;

public class estruturasRepetitivas {
    //WHILE
    Scanner sc = new Scanner(System.in);

    /**
     * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
     * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
     * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
     * Exemplo:
     * Entrada: Saída:
     * 2200
     * 1020
     * 2022
     * 2002
     * Senha Invalida
     * Senha Invalida
     * Senha Invalida
     * Acesso Permitido
     */
    private String ExercicioWhile() {
        System.out.println("digite a senha de 4 numeros: ");
        int senha = sc.nextInt();
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        return "\nFIM DO PROGRAMA\n";
    }

    /**
     * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
     * um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
     * 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
     * que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
     * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
     * exemplo.
     * Exemplo:
     * Entrada: Saída:
     * 8
     * 1
     * 7
     * 2
     * 2
     * 4
     * MUITO OBRIGADO
     * Alcool: 1
     * Gasolina: 2
     * Diesel: 0
     */
    private String ExercicioWhile2() {
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;
        int produto = 0;
        System.out.println("Alcool: 1 Gasolina: 2 Diesel: 3 sair: 4");
        while (produto != 4) {
            produto = sc.nextInt();
            switch (produto) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    disel++;
                    break;
                case 4:
                    System.out.println("MUITO OBRIGADO");
                    break;
                default:
                    System.out.println("valor invalido");
                    break;
            }
        }
        System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, disel);
        return "\nFIM DO PROGRAMA\n";
    }

    //FOR

    /**
     * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
     * X, se for o caso.
     * Exemplo:
     * Entrada: Saída:
     * 8 1
     * 3
     * 5
     * 7
     */
    private String ExercicioFor() {
        int numeroDeParada = sc.nextInt();
        for (int contagem = 1; contagem <= numeroDeParada; contagem++) {
            if (contagem % 2 != 0) {
                System.out.println(contagem);
            }
        }
        return "\nFIM DO PROGRAMA\n";
    }

    /**
     * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
     * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
     * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
     * peso 5.
     * Exemplo:
     * Entrada: Saída:
     * 3
     * 6.5 4.3 6.2
     * 5.1 4.2 8.1
     * 8.0 9.0 10.0
     * 5.7
     * 6.3
     * 9.3
     */
    private String ExercicioFor2() {
        System.out.println("calculadora ponderada!!!; quantos alunos? ");
        System.out.println("AVISO!!! 3 bimentes sendo peso2, peso 3 e peso 5");
        Locale.setDefault(Locale.US);
        int alunos = sc.nextInt();
        for (int quantasVezes = 0; quantasVezes < alunos; quantasVezes++) {
            System.out.printf("digite a nota do aluno %d%n", quantasVezes);
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

            System.out.printf("%.2f%n", media);
        }
        return "\nFIM DO PROGRAMA\n";
    }

    /**
     * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
     * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
     * exemplo.
     * Exemplo:
     * Entrada:
     * 5
     * Saída:
     * 1 1 1
     * 2 4 8
     * 3 9 27
     * 4 16 64
     * 5 25 125
     */
    private String ExercicioFor3() {
        int ateNumero = sc.nextInt();
        for (int contagem = 1; contagem <= ateNumero; contagem++) {
            //System.out.println(contagem +" "+ Math.pow(contagem, 2) +" "+ Math.pow(contagem, 3));

            System.out.printf("%d %.0f %.0f%n", contagem, Math.pow(contagem, 2), Math.pow(contagem, 3));
            /*int primeiro = contagem;
            int segundo = contagem * contagem;
            int terceiro = contagem * contagem * contagem;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);*/
        }

        return "\nFIM DO PROGRAMA\n";
    }
    //do-while

    /**
     * Problema exemplo:
     * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
     * Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
     * programa.
     * Fórmula:  =
     * + 32
     * Digite a temperatura em Celsius: 30.0
     * Equivalente em Fahrenheit: 86.0
     * Deseja repetir (s/n)? s
     * Digite a temperatura em Celsius: 21.0
     * Equivalente em Fahrenheit: 69.8
     * Deseja repetir (s/n)? s
     * Digite a temperatura em Celsius: -10.5
     * Equivalente em Fahrenheit: 13.1
     * Deseja repetir (s/n)? n
     */

    private String ExcercicioDoWhile() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        return "\nFIM DO PROGRAMA\n";
    }

    public static void main(String[] args) {
        estruturasRepetitivas print = new estruturasRepetitivas();

        //System.out.println(print.ExercicioWhile());
        //System.out.println(print.ExercicioWhile2());
        //System.out.println(print.ExercicioFor());
        //System.out.println(print.ExercicioFor2());
        //System.out.println(print.ExercicioFor3());
        System.out.println(print.ExcercicioDoWhile());
    }
}
