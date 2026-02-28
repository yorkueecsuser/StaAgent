import java.io.File;

class RegexBugExample {

    public String showBug1(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean = str.replaceAll(".", ""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            clean = clean + "unreachable";
        }
        return clean;
    }

    public String showBug2(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|", "_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            clean2 = clean2 + "unreachable";
        }
        return clean2;
    }

    public String showBug3(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator, ""); // Noncompliant; exception on Windows
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            clean3 = clean3 + "unreachable";
        }
        return clean3;
    }

    public String showBug4(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean4 = str.replaceFirst(".", ""); // Noncompliant;
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            clean4 = clean4 + "unreachable";
        }
        return clean4;
    }

    public String showBug5(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|", "_"); // Noncompliant;
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            clean5 = clean5 + "unreachable";
        }
        return clean5;
    }

    public String showBug6(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst(File.separator, ""); // Noncompliant;
        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement
            clean6 = clean6 + "unreachable";
        }
        return clean6;
    }

    private boolean getCondition() {
        return false; // This method can be modified to return true under certain conditions if needed
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