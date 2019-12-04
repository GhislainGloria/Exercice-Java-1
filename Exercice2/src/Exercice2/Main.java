package Exercice2;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FileToHashmap fileToHashmap = new FileToHashmap(new File("Exercice2/src/Exercice2/FileScore"));
        HashMap hashMap = fileToHashmap.ReadFileToHashmap();
        hashMap.forEach((key,value) -> System.out.println(key + " = " + value));
        System.out.println(fileToHashmap.getScore(hashMap,"m5.boupi@valux.net"));
        System.out.println(fileToHashmap.globalAverage(hashMap));
    }
}

