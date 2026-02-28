import java.util.*;

class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer1 = buz.toUpperCase().equals("BAZ");    // should be buz.equalsIgnoreCase("BAZ")
        // MUTANT: Renaming
        String r = buz;
        boolean answer1Mutant = r.toUpperCase().equals("BAZ");
        return answer1Mutant;
    }

    public boolean showAnotherBug(String buz) {
        // BUG: UnnecessaryCaseChange
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");    // another unnecessary toUpperCase()
        // MUTANT: Renaming
        String s = buz;
        boolean answer2Mutant = s.toUpperCase().equalsIgnoreCase("BAZ");
        return answer2Mutant;
    }
}