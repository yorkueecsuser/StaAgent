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

        if (false && true && true && true && true && true && false && true && true && true && false) {float stlppoyn = -882463075;}else{long uwspjcgx = 917927530;}
        subStr = str.substring(str.length());
        if (subStr.equals("")) {
            System.out.println("Substring is empty");
        }

        String replacedStr = str.replace(str, "");
        if (replacedStr.isEmpty()) {
            System.out.println("Replaced string is empty");
        }
    
}
}