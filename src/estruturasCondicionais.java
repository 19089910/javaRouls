import java.util.Scanner;

public class estruturasCondicionais {

//ESTRUTURA CONDICIONAL IF ELSE

    private String exercicio1() {
        /**exercicio 1
         * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         * Exemplos:
         * Entrada: Saída:
         * -10 NEGATIVO
         * Entrada: Saída:
         * 8 NAO NEGATIVO
         * Entrada: Saída:
         * 0 NAO NEGATIVO
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva um numero : ");
        Integer a = sc.nextInt();
        if (a > 0) {
            System.out.printf("%d NAO E NEGATIVO", a);
        } else {
            System.out.printf("%d E NEGATIVO", a);
        }
        sc.close();
        return "\nFIM DO PROGRAMA\n";
    }

    private String exercico2() {
        /**Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
         começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         Exemplos:
         Entrada: Saída:
         16 2 O JOGO DUROU 10 HORA(S)
         Entrada: Saída:
         0 0 O JOGO DUROU 24 HORA(S)
         Entrada: Saída:
         2 16 O JOGO DUROU 14 HORA(S)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("escreva o horario das partidas em hordem : ");
        Integer horaInicial = sc.nextInt();
        Integer horaFinal = sc.nextInt();
        Integer duracao;

        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
            System.out.println(duracao);
        } else {
            duracao = 24 - horaInicial + horaFinal;//inicial sendo 22 sendo subitraindo 24 e somado com final, que e baixo valro.
            System.out.println(duracao);
        }
        sc.close();
        return "\nFIM DO PROGRAMA\n";
        //return duracao;
    }

    private String exercico3() {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
        return "\nFIM DO PROGRAMA\n";
    }

    //ESTRUTURA CONDICIONAL SWITCH

    private String exercicoSwitch() {//sewitch e uma arvore de escolhas
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        switch (x) {//se x for escolhido a ser:EX: 1=caso 1
            case 1://escolhido 1 acontece;
                dia = "domingo";
                break;//fim ou quebra
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
        return "\nFIM DO PROGRAMA\n";
    }

    //ESTRUTURA CONDICIONAL TERNARIA

    private String ternaria() {
        Scanner sc = new Scanner(System.in);
        double preco;
        preco = sc.nextDouble();
        double desconto;

        /**if (preco < 20.0) {//como seria
         desconto = preco * 0.1;
         } else {
         desconto = preco * 0.05;
         }*/
        //(condicao) ? valorSeVerdadeiro : valorSeFalso
        //exemplo: (2>4) ? 50:80; resp:80;
        //exmplo2:(10!=3) ? "maria":"alex"; resp: "maria"
        desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;//melhor

        System.out.printf("seu desconto foi de :%.2f ", desconto);
        return "\nFIM DO PROGRAMA\n";
    }

    public static void main(String[] args) {
        estruturasCondicionais print = new estruturasCondicionais();
        //System.out.println(print.exercicio1());
        //System.out.println(print.exercico2());
        //System.out.println(print.exercico3());
        //System.out.println(print.exercicoSwitch());
        System.out.println(print.ternaria());
    }
}