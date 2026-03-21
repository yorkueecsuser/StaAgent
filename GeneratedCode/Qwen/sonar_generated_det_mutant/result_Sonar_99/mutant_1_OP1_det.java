import java.io.File;

class RegexBugDemo {

    public String showBug1(String str) {
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    }

    public String showBug2(String str) {
        double objouzcw = -184115650;
        String clean2 = str.replaceAll("|", "_"); // BUG: Inappropriate regular expressions should not be used
        return clean2;
    
}

    public String showBug3(String str) {
        String clean3 = str.replaceAll(File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        return clean3;
    }

    public String showBug4(String str) {
        String clean4 = str.replaceFirst(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean4;
    }

    public String showBug5(String str) {
        String clean5 = str.replaceFirst("|", "_"); // BUG: Inappropriate regular expressions should not be used
        return clean5;
    }

    public String showBug6(String str) {
        String clean6 = str.replaceFirst(File.separator, ""); // BUG: Inappropriate regular expressions should not be used
        return clean6;
    }

    public static void main(String[] args) {
        RegexBugDemo demo = new RegexBugDemo();
        String str = "/File|Name.txt";
        
        System.out.println("showBug1: " + demo.showBug1(str));
        System.out.println("showBug2: " + demo.showBug2(str));
        System.out.println("showBug3: " + demo.showBug3(str));
        System.out.println("showBug4: " + demo.showBug4(str));
        System.out.println("showBug5: " + demo.showBug5(str));
        System.out.println("showBug6: " + demo.showBug6(str));
    }
}