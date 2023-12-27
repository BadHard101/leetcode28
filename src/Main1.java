public class Main1 {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
     }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi",
                "issip"));
    }
}