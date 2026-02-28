import java.io.File;

class InappropriateRegexExample {
    public String showBug(String input) {
        String cleaned = input.replaceAll(".",""); // BUG: Inappropriate regular expression, matches every character
        return cleaned;
    }

    public String showBug2(String input) {
        String cleaned = input.replaceAll("|","_"); // BUG: Inappropriate regular expression, matches the space between characters
        return cleaned;
    }

    public String showBug3(String input) {
        String cleaned = input.replaceAll(File.separator,""); // BUG: Inappropriate regular expression, matches the platform-specific file path delimiter
        return cleaned;
    }

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        System.out.println(example.showBug2("/File|Name.txt"));
        System.out.println(example.showBug3("/File|Name.txt"));
    }
}