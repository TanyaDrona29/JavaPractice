package JavaPractice.dsquestion;

public class ReverseOfString {
    public static void main(String[] args) {
       String string[] = {"h","e","l","l","o"};
        for (int i = string.length-1; i>=0; i--) {
            System.out.print(string[i] + " ");
        }
    }
}
