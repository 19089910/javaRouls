/* tipos de comentaros */
/* tipos de comentaros */

import org.w3c.dom.ls.LSOutput;

/**
 * texto
 * /
 * // ctl + alt + L
 * / * texto * /
 * / * tipo bit
 * (valores quebrados / racionais)
 * Problema 64 (Double d = 10.0241864541485489421057484120468;)
 * Float 32 (Flutuante f = 100,4185465184841231f;)
 * (inteiros)
 * Long 64 (Long l = 10165412021adsfasdfasdfasdfasdfasdfal;)
 * Int 32 (inteiro i = 100;)
 * Short 16 (Curto S = 10;)
 * Byte 8 (Byte b = 10;)
 * Caracter 2 (caractere c = 'a')
 * String ? (terterminado por mim)
 * Boleano ? (determinado pelo JVK se for verdadeiro ou falso)
 */
public class testandoSaida {//ctl + alt + L = catenacao automatica da ide

    public static void main(String[] args) {// = psvm
        System.out.println("olá, mundo!");    // = sout


        // VARIAVES
        String nome = "Lucas";
        Integer soma = 10 + 2;

        System.out.println(nome);
        System.out.println(soma);


        // USO DE MEMÓRIA DAS VARIAVES
        System.out.println("Duplo: Máx:" + Double.MAX_VALUE + "-Duplo:" +
                Double.MIN_VALUE);
        System.out.println("Float: Max:" + Float.MAX_VALUE + "-Min:" +
                Float.MIN_VALUE);
        System.out.println("Long: Max: " + Long.MAX_VALUE + "-Long:" +
                Long.MIN_VALUE);
        System.out.println("Inteiro: Máx: " + Integer.MAX_VALUE + "-Mín:" +
                Integer.MIN_VALUE);
        System.out.println("short:Máx:" + Short.MAX_VALUE + "-Min:" +
                Short.MIN_VALUE);
        System.out.println("Byte:Max:" + Byte.MAX_VALUE + "-Min:" +
                Byte.MIN_VALUE);


        // OPERADORES JAVA
        int numero = 10;
        System.out.println(2 + numero);
        System.out.println(numero - 8);
        System.out.println(numero / 5);
        System.out.println(numero % 3);// resto de uma divisão
        System.out.println(numero > 5);//boolean maior
        System.out.println(numero < 20);//boolean menor
        System.out.println(numero <= 10);//boolean maior ou igual
        System.out.println(numero >= 10);//boolean menor ou igual
        System.out.println(numero == 10);//boolean igual
        System.out.println(numero != 20);//boolean diferente
        System.out.println(numero > 5 && 20 == 20);//boolean todas as condicional para ser verdadeira
        System.out.println(numero < 5 || 20 == 20);//boolean apenas uma das condicional para ser verdadeira
        System.out.println(!(numero == 20));//boolean inverte o resultado do bool

        //USO DE OPERADORES + VARIAVES ACUMULATIVOS
        System.out.println("uso de operadores");
        int num = 10;
        num *= 2; // = num = num * 2
        num = num + 1; // num = 20 + 1 / num = 21
        System.out.println(num);
        //INCREMENTO E DECREMENTO
        System.out.println("incremento e decremento");
        // num = 21
        System.out.println(num++); // = / num = num + 1 / num + = 1
        System.out.println(num);
        System.out.println(-num); // = num-1 = num / 1 = -num
        // num = 21

        //FUNCOES DE MATEMATICA
        Double x = 3.0;
        Double y = 4.0;
        Double z = -5.0;
        Double A, B, C;

        /**A = Math.sqrt(x);    //A recebe a raiz quadrada de x
         * B = Math.pow(x, y);  //A recebe o resultado de x elevado a y
         * A = Math.abs(x);     //A recebe o valor absoluto de x*/

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
        //OBS: MAIORES INFORMACOES :java.lang.Math
        //exercico faça bascara
        /*delta = Math.pow(b, 2.0) - 4*a*c;
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);*/

        //BITWISE demo BIT A BIT
        /* OPERADORES BITWISE
        & = operacao "E" bit a bit
        | = opracao "OU" bit a bit
        ^ = operacao "OU-exclusivo" bit a bit
        */
        //(DEC-89)=BIT-0101 1001
        //(DEC-60)=BIT-0011 1100
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);//RESP=0001 1000 (24)
        System.out.println(n1 | n2);//RESP=0111 1101 (125)
        System.out.println(n1 ^ n2);//RESP=0110 0101 (101)

    }
}

