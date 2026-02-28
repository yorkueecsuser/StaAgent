import java.io.File;

class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);
    }
}

// Mutant 1: Renaming variable'str' to 'inpt'
class BuggyRegex {
    public static void main(String[] args) {
        String inpt = "/File|Name.txt";

        String clean = inpt.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = inpt.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = inpt.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(clean3);
    }
}

// Mutant 2: Renaming variable 'clean' to'result'
class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String result = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(result);
        System.out.println(clean2);
        System.out.println(clean3);
    }
}

// Mutant 3: Renaming variable 'clean2' to'modified'
class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String modified = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(modified);
        System.out.println(clean3);
    }
}

// Mutant 4: Renaming variable 'clean3' to 'output'
class BuggyRegex {
    public static void main(String[] args) {
        String str = "/File|Name.txt";

        String clean = str.replaceAll(".",""); // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|","_"); // BUG: Inappropriate regular expressions should not be used
        String output = str.replaceAll(File.separator,""); // BUG: Inappropriate regular expressions should not be used

        System.out.println(clean);
        System.out.println(clean2);
        System.out.println(output);
    }
}