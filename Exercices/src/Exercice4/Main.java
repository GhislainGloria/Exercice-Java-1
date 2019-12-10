package Exercice4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("args empty");
        }
        checkFormat(args[0], args[1]);
        /*
        String rightRot = rightRotate(args[1], 1); // cat -> atc
        String leftRot = leftRotate(args[1], 1); // cat -> tca
        System.out.println(rightRot);
        System.out.println(leftRot);
         */
        if(args[2] != null && args[3] != null){
            switch (args[2]){
                case "/a":
                    checkAna(args[1],args[3]);
                    break;
                case "/o":
                    supprSuite(args[1], args[3]);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + args[3]);
            }
        }

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

    public static void checkAna(String s, String sAna){
        Boolean ok = true;
        char[] sTab = s.toCharArray();
        char[] sAnaTab = sAna.toCharArray();
        if (s.length() != sAna.length()){
            System.out.println(sAna + "n'est pas un anagramme de " + s);
        }
        Arrays.sort(sTab);
        Arrays.sort(sAnaTab);
        for(int i = 0; i < s.length(); i++){
            if(sTab[i] != sAnaTab[i]){
                ok = false;
            }
        }

        if(ok){
            System.out.println(sAna + " est un anagramme de " + s);
        }else {
            System.out.println(sAna + "n'est pas un anagramme de " + s);
        }
    }

    public static void supprSuite(String s, String del){
        String newString = s.replaceAll(del, "");
        System.out.println(newString);
    }

    public static String rightRotate(String s, int nbr){
        char[] tab = s.toCharArray();
        System.out.println(s);
        int sLen = s.length();
        char temp;
        for (int i = 0; i < nbr; i++) {
            int j = 0;
            while (j < sLen-1) {
                temp = tab[j];
                tab[j] = tab[j+1];
                tab[j+1] = temp;
                j++;
            }
        }
        return String.copyValueOf(tab);
    }

    public static String leftRotate(String s, int nbr){
        char[] tab = s.toCharArray();
        System.out.println(s);
        int sLen = s.length();
        char temp;
        for (int i = 0; i < nbr; i++) {
            int j = sLen-1;
            while (j > 0) {
                temp = tab[j];
                tab[j] = tab[j-1];
                tab[j-1] = temp;
                j--;
            }
        }
        return String.copyValueOf(tab);
    }
}
