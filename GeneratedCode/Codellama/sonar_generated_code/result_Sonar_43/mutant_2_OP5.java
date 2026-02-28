import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);

        // Add unreachable switch statement mutant
        int value = 0;
        switch (value) {
            case 0:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This branch is also unreachable");
                break;
        }
    }
}