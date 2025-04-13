package basico;

public class FuncoesInteressantesStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    -";
        String originalTrim = original.trim();
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: - "+ original + " - ");
        System.out.println("ToLowerCase: - " + original.toLowerCase() + " - ");
        System.out.println("toUpperCase: - " + original.toUpperCase() + " - ");
        System.out.println("trim: - " + originalTrim + " - "); //elimina os espaços no final da string
        System.out.println("substriong: - " + original.substring(2) + " - ");
        System.out.println("substriong com 2 argumentos: - " + original.substring(2, 9) + " - ");
        System.out.println("replace: - " + original.replace('a', 'x') + " - ");
        System.out.println("indexof 'bc' : - " + j);

        String s = "potato apple lemon";
        String[] vect = s.split(" ");

        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}