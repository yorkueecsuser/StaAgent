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

        String anotherStr = "Hello, World!";
        if (anotherStr.contains(anotherStr)) {
            System.out.println("Another string contains itself");
        }

        if (anotherStr.equals(anotherStr)) {
            System.out.println("Another string is equal to itself");
        }

        if (anotherStr.matches(anotherStr.toLowerCase())) {
            System.out.println("Another string matches itself");
        }

        String anotherSubStr = anotherStr.substring(0, anotherStr.length());
        if (anotherSubStr.equals(anotherStr)) {
            System.out.println("Another substring is equal to original string");
        }

        anotherSubStr = anotherStr.substring(anotherStr.length());
        if (anotherSubStr.equals("")) {
            System.out.println("Another substring is empty");
        }

        String anotherReplacedStr = anotherStr.replace(anotherStr, "");
        if (anotherReplacedStr.isEmpty()) {
            System.out.println("Another replaced string is empty");
        }
    }
}