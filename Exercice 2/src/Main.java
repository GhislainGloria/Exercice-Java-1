import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FileToHashmap fileToHashmap = new FileToHashmap(new File("FileScore"));
        HashMap hashMap = fileToHashmap.ReadFileToHashmap();
        hashMap.forEach((key,value) -> System.out.println(key + " = " + value));
    }
}
