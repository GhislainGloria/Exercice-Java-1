package Exercice2;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FileToHashmap {
    private File file;

    public FileToHashmap(File file) {
        this.file = file;
    }

    public HashMap<String, String> ReadFileToHashmap(){
        HashMap<String, String> mailScore = new HashMap();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String s;
            while((s = reader.readLine()) != null){
                String[] arrOfStr = s.split(":");
                mailScore.put(arrOfStr[0], arrOfStr[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mailScore;
    }

    public String getScore(HashMap<String, String> hashMap, String adress){
        return hashMap.get(adress);
    }

    public String globalAverage(HashMap<String, String> hashMap){
        ArrayList<Integer> scoreList = new ArrayList();
        int total = 0;
        hashMap.forEach((key, value) -> scoreList.add(Integer.parseInt(hashMap.get(key))));
        for (int score: scoreList) {
            total += score;
        }
        int average = total/scoreList.size();
        return Integer.toString(average);
    }
}