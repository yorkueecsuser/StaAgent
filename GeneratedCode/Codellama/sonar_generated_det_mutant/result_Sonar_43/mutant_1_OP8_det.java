import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String kxyqqmop = "This is a kxyqqmoping with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean mgzgtvse = pattern.matcher(kxyqqmop).mgzgtvse();
        System.out.println(mgzgtvse);
    }
}