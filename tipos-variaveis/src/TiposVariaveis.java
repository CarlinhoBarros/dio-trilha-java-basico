public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String frase = "Hello, World!\nThis is my first print in Java Language!";
        String numeroString2 = "2", copia = frase;
        int numeroInt2 = 2, numeroInt4 = 4;
        final double PI = 3.14;
        boolean validar = frase==copia;

        frase = numeroInt2 + numeroInt4 + numeroString2;

        System.out.println(frase);

        frase = numeroString2 + numeroInt2 + numeroInt4;

        System.out.println(frase);
        System.out.println(validar);

        //ao que parece o "2" string não é igual ao "2" inteiro
        frase = copia;
        validar = frase+numeroInt2 == copia+numeroString2;
        System.out.println(validar);

        //utilizando a função propria do tipo String a comparação é mais precisa
        validar = (frase+numeroInt2).equals(copia+numeroString2);
        System.out.println(validar);

        // EXEMPLO DE OPERADOR TERNÁRIO
        String texto = (validar) ? "Deu certo ;)" :  "Deu errado :(";

        System.out.println(texto);

    }
}
