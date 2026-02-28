import java.lang.*;

class StringIndexOutOfBoundsBug {
    public String showBugSubstring(String str, int index) {
        int k = index; // Mutant code: Renaming variable 'index' to 'k'
        return str.substring(k, str.length());
    }

    public char showBugCharAt(String str, int index) {
        int l = index; // Mutant code: Renaming variable 'index' to 'l'
        return str.charAt(l);
    }
}