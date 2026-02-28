import java.util.Arrays;

class StringBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        if (str.contains(str)) {
            System.out.println("String contains itself");
        }

        if (str.equals(str)) {
            System.out.println("String is equal to itself");
        }

        if (str.matches(str.toLowerCase())) {
            System.out.println("String matches itself");
        }

        String subStr = str.substring(0, str.length());
        if (subStr.equals(str)) {
            System.out.println("Substring is equal to original string");
        }

        subStr = str.substring(str.length());
        if (subStr.equals("")) {
            System.out.println("Substring is empty");
        }

        String replacedStr = str.replace(str, "");
        if (replacedStr.isEmpty()) {
            System.out.println("Replaced string is empty");
        }

        // Mutant 1: Renaming "str" to "a"
        String a = "Hello, World!";
        if (a.contains(a)) {
            System.out.println("String contains itself");
        }

        if (a.equals(a)) {
            System.out.println("String is equal to itself");
        }

        if (a.matches(a.toLowerCase())) {
            System.out.println("String matches itself");
        }

        String b = a.substring(0, a.length());
        if (b.equals(a)) {
            System.out.println("Substring is equal to original string");
        }

        b = a.substring(a.length());
        if (b.equals("")) {
            System.out.println("Substring is empty");
        }

        String c = a.replace(a, "");
        if (c.isEmpty()) {
            System.out.println("Replaced string is empty");
        }

        // Mutant 2: Renaming "subStr" to "d"
        String d = str.substring(0, str.length());
        if (d.equals(str)) {
            System.out.println("Substring is equal to original string");
        }

        d = str.substring(str.length());
        if (d.equals("")) {
            System.out.println("Substring is empty");
        }

        String e = str.replace(str, "");
        if (e.isEmpty()) {
            System.out.println("Replaced string is empty");
        }

        // Mutant 3: Renaming "replacedStr" to "f"
        String f = str.replace(str, "");
        if (f.isEmpty()) {
            System.out.println("Replaced string is empty");
        }
    }
}