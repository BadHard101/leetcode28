public class Main {
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {

                int j = 0;
                while (i+j < haystack.length() && haystack.charAt(i+j) == needle.charAt(j)) {
                    j++;
                    if (j == needle.length()) return i;
                }

            }
        }
        return -1;
     }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi",
                "issip"));
    }
}