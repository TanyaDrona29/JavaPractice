package JavaPractice.dsquestion;

public class DuplicatesOfString {
    static final int chars = 256;
    static void countChar(String str,int[] count) {
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
    }
    static void printDups(String str) {
        int count[] = new int[chars];
        countChar(str, count);

        for (int i = 0; i < chars; i++)
            if (count[i] > 1)
                System.out.println("character is "+(char) (i) + " and count = " + count[i]);
    }
    public static void main(String[] args) {
        String str = "test string";
        printDups(str);
    }
}
