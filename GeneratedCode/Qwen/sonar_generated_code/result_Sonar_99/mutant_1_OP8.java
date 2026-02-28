import java.io.File;

class RegexBugExample {

    public String showBug1(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean = str.replaceAll(".", ""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        String a = clean; // Mutant: Renamed 'clean' to 'a'
        return a;
    }

    public String showBug2(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|", "_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_
        String b = clean2; // Mutant: Renamed 'clean2' to 'b'
        return b;
    }

    public String showBug3(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator, ""); // Noncompliant; exception on Windows
        String c = clean3; // Mutant: Renamed 'clean3' to 'c'
        return c;
    }

    public String showBug4(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean4 = str.replaceFirst(".", ""); // Noncompliant;
        String d = clean4; // Mutant: Renamed 'clean4' to 'd'
        return d;
    }

    public String showBug5(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|", "_"); // Noncompliant;
        String e = clean5; // Mutant: Renamed 'clean5' to 'e'
        return e;
    }

    public String showBug6(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst(File.separator, ""); // Noncompliant;
        String f = clean6; // Mutant: Renamed 'clean6' to 'f'
        return f;
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println("showBug1: " + example.showBug1("/File|Name.txt"));
        System.out.println("showBug2: " + example.showBug2("/File|Name.txt"));
        System.out.println("showBug3: " + example.showBug3("/File|Name.txt"));
        System.out.println("showBug4: " + example.showBug4("/File|Name.txt"));
        System.out.println("showBug5: " + example.showBug5("/File|Name.txt"));
        System.out.println("showBug6: " + example.showBug6("/File|Name.txt"));
    }
}