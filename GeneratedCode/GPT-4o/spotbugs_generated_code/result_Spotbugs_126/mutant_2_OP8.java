import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] p) { // Renaming the variable 'paths' to 'p'
        String[] r = new String[p.length]; // Renaming the variable 'results' to 'r'
        for (int j = 0; j < p.length; j++) { // Renaming the variable 'i' to 'j'
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            r[j] = p[j].replaceAll(File.separator, "/");
        }
        return r;
    }

    public static void main(String[] args) {
        RegexFileSeparatorBugExample e = new RegexFileSeparatorBugExample(); // Renaming the variable 'example' to 'e'
        String[] p = {"C:\\Users\\User", "D:\\Docs\\Files"}; // Renaming the variable 'paths' to 'p'
        String[] r = e.showBug(p); // Renaming the variable 'results' to 'r'
        for (String result : r) {
            System.out.println(result);
        }
    }
}