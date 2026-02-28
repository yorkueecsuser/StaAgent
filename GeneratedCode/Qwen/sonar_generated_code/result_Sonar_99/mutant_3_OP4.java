import java.io.File;

class RegexBugExample {

    public String showBug1(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean = str.replaceAll(".", ""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            clean = clean + "unreachable";
        } else {
            clean = clean + "also_unreachable";
        }
        return clean;
    }

    public String showBug2(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|", "_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            clean2 = clean2 + "unreachable";
        } else {
            clean2 = clean2 + "also_unreachable";
        }
        return clean2;
    }

    public String showBug3(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator, ""); // Noncompliant; exception on Windows
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            clean3 = clean3 + "unreachable";
        } else {
            clean3 = clean3 + "also_unreachable";
        }
        return clean3;
    }

    public String showBug4(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean4 = str.replaceFirst(".", ""); // Noncompliant;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            clean4 = clean4 + "unreachable";
        } else {
            clean4 = clean4 + "also_unreachable";
        }
        return clean4;
    }

    public String showBug5(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|", "_"); // Noncompliant;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            clean5 = clean5 + "unreachable";
        } else {
            clean5 = clean5 + "also_unreachable";
        }
        return clean5;
    }

    public String showBug6(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst(File.separator, ""); // Noncompliant;
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            clean6 = clean6 + "unreachable";
        } else {
            clean6 = clean6 + "also_unreachable";
        }
        return clean6;
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

    private boolean getCondition() {
        // This method always returns false, making the if-else branches unreachable
        return false;
    }
}