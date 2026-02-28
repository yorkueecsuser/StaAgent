import java.io.File;

class RegexBugExample {

    public String showBug1(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean = str.replaceAll(".", ""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        return clean;

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                clean = "Unreachable";
                break;
        }
    }

    public String showBug2(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|", "_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_
        return clean2;

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                clean2 = "Unreachable";
                break;
        }
    }

    public String showBug3(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator, ""); // Noncompliant; exception on Windows
        return clean3;

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                clean3 = "Unreachable";
                break;
        }
    }

    public String showBug4(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean4 = str.replaceFirst(".", ""); // Noncompliant;
        return clean4;

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                clean4 = "Unreachable";
                break;
        }
    }

    public String showBug5(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|", "_"); // Noncompliant;
        return clean5;

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                clean5 = "Unreachable";
                break;
        }
    }

    public String showBug6(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst(File.separator, ""); // Noncompliant;
        return clean6;

        // Introduced Unreachable Switch Statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                clean6 = "Unreachable";
                break;
        }
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
        // Always returns false to ensure the switch case is unreachable
        return false;
    }
}