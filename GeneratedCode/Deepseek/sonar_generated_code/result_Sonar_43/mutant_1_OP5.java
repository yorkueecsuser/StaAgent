import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public String showBug() {
        String str = "([";
        Pattern pattern = Pattern.compile("\\(\\["); // BUG: Regular expressions should be syntactically valid
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
        return str;
    }

    public void unreachableSwitch() {
        int value = 0;
        boolean shouldRun = false;
        switch(value) {
            case 0:
                while (shouldRun) {
                    System.out.println("This should never run due to unreachable switch statement mutation.");
                    break;
                }
                break;
            case 1:
                System.out.println("This should never run due to unreachable switch statement mutation.");
                break;
            default:
                System.out.println("This should never run due to unreachable switch statement mutation.");
                break;
        }
    }
}