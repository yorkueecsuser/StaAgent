import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] x) {
        String[] y = new String[x.length];
        for (int j = 0; j < x.length; j++) {
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            y[j] = x[j].replaceAll(File.separator, "/");
        }
        return y;
    }

    public static void main(String[] args) {
        RegexFileSeparatorBugExample z = new RegexFileSeparatorBugExample();
        String[] a = {"C:\\Users\\User", "D:\\Docs\\Files"};
        String[] b = z.showBug(a);
        for (String c : b) {
            System.out.println(c);
        }
    }
}