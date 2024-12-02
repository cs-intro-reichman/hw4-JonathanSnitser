public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char c;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            c= str.charAt(i);
            if (c > 64 && c < 91) {
                c += 32;
                newStr = newStr + c;
            } else {
                newStr = newStr + c;
            }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        char c1, c2;
        boolean contains = false;
        if (str2 == "") {
            return true;
        }
        c2 = str2.charAt(0);
        int j = 0;
        c1 = str1.charAt(j);
        while (c2 != c1 && j < str1.length()) {
            j++;
            if (j < str1.length()) {
                c1 = str1.charAt(j);
                
            }
            if (c2 == c1) {
                if (str1.charAt(j+1) != str2.charAt(1)) { //makes sure it is not just one letter that fits.
                    j++;
                    c1 = str1.charAt(j);
                }
            }
         }
        if (c2 != c1) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++){
            c2 = str2.charAt(i);
            c1 = str1.charAt(j);

            if (c2 == c1) {
                contains = true;
            }
            if (c2 != c1) {
                contains = false;
                break;
            }
            j++;
            if (j > str1.length() -1) {
                return false;
            }
        }

        
        return contains;
    }
}
