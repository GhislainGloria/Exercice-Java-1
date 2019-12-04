import java.io.*;
import java.util.HashMap;

public class FileToHashmap {
    private File file;

    public FileToHashmap(File file) {
        this.file = file;
    }

    public HashMap ReadFileToHashmap(){
        HashMap mailscore = new HashMap();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;
            while((s = reader.readLine()) != null){
                String[] arrOfStr = s.split(":");
                mailscore.put(arrOfStr[0], arrOfStr[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mailscore;
    }
}
