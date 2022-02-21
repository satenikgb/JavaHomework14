import java.util.Scanner;

public class Day14 {
    //Task10
    public static void checkHex(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch < '0') || (ch > '9') && ((ch < 'A') || (ch > 'F')) && ((ch < 'a') || (ch > 'f'))) {
                System.out.println(str + " " + "Is not a hex string");
                return;
            }
        }
        System.out.println(str + " " + " Is a hex string");

    }

    //Task7
    public static void caesarCode(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) + 3);
            if (ch > 'z') {
                s += (char) (str.charAt(i) - (26 - 3));
            } else
                s += (char) (str.charAt(i) + 3);
        }
        System.out.println(s.toUpperCase());
    }

    //Task1
    public static void lenghtString(String str) {

        System.out.println(str.length());
    }

    //Task2
    public static void Task2(String str, int index) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == index) {
                System.out.println(ch);
            }
        }
    }

    //Task3
    public static boolean Task3(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (ch == ch1) {
                return true;
            }
        }
        return false;
    }

    //Task4
    public static void countVowel(String str) {
        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str.charAt(i);
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
                count++;
            }
        }
        System.out.println(count);
    }

    //Task14
    public static void countCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (ch1 == ch) {
                count++;
            }
        }
        System.out.println(count);
    }

    //Task6
    public static void countVowelDigits(String str) {
        int countvowel = 0;
        int countdigits = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch == 'a') || (ch == 'o') || (ch == 'i') || (ch == 'e') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I')
                    || (ch == 'O') || (ch == 'U')) {
                countvowel++;
            }
            if ((ch == '0') || (ch == '1') || (ch == '2') || (ch == '3') || (ch == '4') || (ch == '5') || (ch == '6') || (ch == '7')
                    || (ch == '8') || (ch == 9)) {
                countdigits++;
            }
        }
        int s = str.length();
        System.out.println("Numbers of vowels" + " " + countvowel + " " + "(" + (double) (countvowel * 100 / s) + ")");
        System.out.println("Numbers of digits" + " " + countdigits + " " + "(" + (double) (countdigits * 100 / s) + ")");

    }

    //Task5
    public static void reverseString(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            str1 = str1 + ch;
        }
        System.out.println(str1);
    }

    //Task8
    public static void palindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("No");
                break;

            } else {
                System.out.println("Yes");

            }
            i++;
            j--;
        }
    }

    //Task13
    public static void firstNonRepeat(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean b = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    b = false;
                    break;
                }

            }
            if ((b)) {
                System.out.println(str.charAt(i));
                break;

            }

        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = sc.nextInt();
        char ch = sc.nextLine().charAt(0);

        checkHex(str);
        lenghtString(str);
        caesarCode(str);
        Task2(str, index);
        Task3(str, ch);
        countVowel(str);
        countCharacter(str, ch);
        countVowelDigits(str);
        reverseString(str);
        palindrome(str);
        firstNonRepeat(str);
    }
}


