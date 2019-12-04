package Exercice4;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("args empty");
        }
        checkFormat(args[0], args[1]);
        String leftRot = leftRotate(args[1], 1);
        System.out.println(leftRot);
    }

    public static void checkFormat(String alphabet, String s){
        Boolean ok = true;
        int j = 0;
        for (int i = 0; i < s.length(); i++){
            if (alphabet.indexOf(s.charAt(i)) == -1){
                ok = false;
            }
        }
        if(ok){
            System.out.println("Chaine conforme");
        }else {
            System.out.println("Chaine non conforme");
        }
    }

    public static String leftRotate(String s, int nbr){
        char[] tab = s.toCharArray();
        int sLen = s.length();
        char temp;
        for (int j = 0; j < sLen; j++) {
            for (int i = 0; i < sLen; i++) {
                temp = tab[i];
                tab[i] = tab[(i + nbr) % sLen];
                tab[(i + nbr) % sLen] = temp;
            }
        }
        return String.copyValueOf(tab);
    }
}
