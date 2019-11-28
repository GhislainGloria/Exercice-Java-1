package labs.one.parta;

public class Example {

    public static void main(String[] args) {
        int i = 0;
        for(String value : args){
            i++;
            System.out.println(i + ". " + value);            
        }
    }
}
