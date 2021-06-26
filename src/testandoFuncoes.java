public class testandoFuncoes {//ctrl + b = esolicacao de funcao/posibilidades de funcao


    //RUN
    public static void main(String[] args) {

        //FUNCOES STRING e TRY
        String strOreiginal = "abcde FGHIJ ABC abc DEFG   ";
        System.out.println(strOreiginal.charAt(5));

        System.out.println("TEST DO TRY-CATCH");
        //se o charAt for muito grande ele buscara em null em String, nao funciconando o restante do codigo entao, colocamos um try
        try {
            System.out.println(strOreiginal.charAt(200));
        } catch (StringIndexOutOfBoundsException e) {//se nao conseguir ou detectar o Erro(string que antecede a memoria) faça:
            System.out.println("DEU erro diferente");
        } catch (NullPointerException e) {//se nao conseguir ou detectar o Erro(ponto nullo) faça:
            System.out.println("erro diferenciadao");
        } catch (Exception e) {//se nao conseguir ou detectar o Erro(todos que antecede a memoria) faça:
            System.out.println("erro diferenciado");
        } finally {
            System.out.println("RUM vai mesmo a sim");//o catch nao achou o problema do try o codigo e iguinorado e passa a tiante para seu fechamento
        }
        //try permite o que o codigo continue mesmo com erro, isolando-a

        System.out.println("\nfuncoes com STRING");
        //formatar:
        System.out.println("original: -" + strOreiginal + "-");
        System.out.println("toLoweCase: -" + strOreiginal.toLowerCase() + "-");//tudo minusculo
        System.out.println("toUpperCase: -" + strOreiginal.toUpperCase() + "-");//tudo maiusculo
        System.out.println("trim: -" + strOreiginal.trim() + "-");//remove espacos do começo e do final
        //recortar:
        System.out.println("substring(2): -" + strOreiginal.substring(2) + "-");//escreva somente os index()
        System.out.println("substring(2, 9): -" + strOreiginal.substring(2, 7) + "-");//escreva somente os index() ate o index()
        //substituir  Replace(char, char), Replace(string, string)
        System.out.println("replace('a', 'x'): -" + strOreiginal.replace('a','x') + "-");//substitua oldChar'',para newChar''
        System.out.println("replace('abc','xy'): -" + strOreiginal.replace("abc","xy") + "-");//substitua taget"", para replacement""
        //busca
        System.out.println("indexOf: " + strOreiginal.indexOf("bc"));//o index do("") sendido de leitura
        System.out.println("lastIndexOF: " + strOreiginal.lastIndexOf("bc"));//o index do("") sendido inverso
        System.out.println("length: " + strOreiginal.length());//quantos de caracter
        //boolean
        System.out.println("equals('abcde FGHIJ ABC abc DEFG   '): " + strOreiginal.equals("abcde FGHIJ ABC abc DEFG   "));//boolean se(strOreiginal) = ("")
        System.out.println("startsWith('abcde'): " + strOreiginal.startsWith("abcde"));//boolean se comeca com()
        System.out.println("endsWith('DEFG   '): " + strOreiginal.endsWith("DEFG   "));//boolean se termina com()
        //separar string em vetor
        String[] vetor = strOreiginal.split( " ");//vetro e estring recebe strOreiginal.regex("sepadado por isso")//regex=o que separa um vetro de outro
        System.out.println("split(' ')//vetro[0]: " + vetor[0]);
        System.out.println("split(' ')//vetro[1]: " + vetor[1]);
        System.out.println("split(' ')//vetro[2]: " + vetor[2]);
        System.out.println("split(' ')//vetro[3]: " + vetor[3]);
        System.out.println("split(' ')//vetro[4]: " + vetor[4]);

        //RUN DAS FUNCAO / EXERCICIOS DE FUNCOES STRING
        System.out.println("\nRUN DAS FUNCAO / EXERCICIOS DE FUNCOES STRING: ");
        testandoFuncoes aquelaLA = new testandoFuncoes();
        System.out.println(aquelaLA.testsoma(10, 5));

        testandoFuncoes func = new testandoFuncoes();
        System.out.println(func.helloWord("lucassghugkhjgl"));

        testandoFuncoes fun = new testandoFuncoes();
        System.out.println(fun.soma(10, 20));

        testandoFuncoes fu = new testandoFuncoes();
        System.out.println(fu.decimal(2f, 4f, 2f));
    }

    //FUNCAO / EXERCICIOS DE FUNCOES STRING

    public int testsoma(int a, int b) {
        return a + b;
    }

    //1. Escreva uma função privada chamada helloWorld que não possui retorno algum e não
    //recebe nenhum parâmetro.
    //2. Modifique a função helloWorld para que receba uma String e retorne a quantidade de
    //caracteres como um número inteiro.
    //3. Modifique o retorno da função helloWorld para que retorne uma String com o seguinte
    //formato:
    //"A palavra possui X caracteres."
    //X - Deve ser a quantidade de caracteres da palavra passada por parâmetro.
    private String helloWord(String strin) {
        return "A palavra possui " + strin.length() + " caracteres.";
    }

    //4.Crie uma nova função capaz de receber dois números e retornar a soma dos mesmos.
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    //5. Crie uma função que receba 3 números com casas decimais e execute o seguinte
    //cálculo:
    //((x + y) * x) / z
    //Faça o retorno com casas decimais.
    public Float decimal(Float x, Float y, Float z) {
        return (((x + y) * x) / z);
    }
}

