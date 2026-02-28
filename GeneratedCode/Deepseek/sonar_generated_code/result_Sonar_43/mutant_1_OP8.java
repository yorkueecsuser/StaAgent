import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public String showBug() {
        String str = "([";
        Pattern pattern = Pattern.compile("\\(\\[");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
        return str;
    }

    public String renameBug() {
        String renamedStr = "\\(\\["; // Mutant code
        Pattern renamedPattern = Pattern.compile(renamedStr); // Mutant code
        Matcher renamedMatcher = renamedPattern.matcher(renamedStr); // Mutant code
        System.out.println(renamedMatcher.find()); // Mutant code
        return renamedStr; // Mutant code
    }
}