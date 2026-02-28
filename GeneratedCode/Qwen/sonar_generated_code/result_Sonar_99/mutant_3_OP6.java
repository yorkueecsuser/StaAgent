import java.io.File;

class RegexBugExample {

    public String showBug1(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean = str.replaceAll(".", ""); // Noncompliant; probably meant to remove only dot chars, but returns an empty string
        return clean;

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will never return true
        }
    }

    public String showBug2(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean2 = str.replaceAll("|", "_"); // Noncompliant; yields _/_F_i_l_e_|_N_a_m_e_._t_x_t_
        return clean2;

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will never return true
        }
    }

    public String showBug3(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean3 = str.replaceAll(File.separator, ""); // Noncompliant; exception on Windows
        return clean3;

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will never return true
        }
    }

    public String showBug4(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean4 = str.replaceFirst(".", ""); // Noncompliant;
        return clean4;

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will never return true
        }
    }

    public String showBug5(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean5 = str.replaceFirst("|", "_"); // Noncompliant;
        return clean5;

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will never return true
        }
    }

    public String showBug6(String str) {
        // BUG: Inappropriate regular expressions should not be used
        String clean6 = str.replaceFirst(File.separator, ""); // Noncompliant;
        return clean6;

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will never return true
        }
    }

    private boolean getCondition() {
        // This method ensures that the condition is dynamically determined at runtime and will never be true
        return false;
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