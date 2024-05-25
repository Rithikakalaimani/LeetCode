package Strings;
public class Largest_Odd_String {
    public static String largestOddNumber(String num) {
        int n = num.length();
        int i = n - 1;
        while (i >= 0 && (num.charAt(i) - '0') % 2 == 0)
        {
            i--;
        }
        if (i < 0) 
        {
            return "";
        }
        return num.substring(0, i + 1);
    }
    public static void main(String[] args) {
        String s1 = "52";
        String s2 = "324567";
        String s3 = "22";
        System.out.println(largestOddNumber(s1));
        System.out.println(largestOddNumber(s2));
        System.out.println(largestOddNumber(s3));
    }
}