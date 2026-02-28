import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] x) { // Renamed 'paths' to 'x'
        String[] y = new String[x.length]; // Renamed 'results' to 'y'
        for (int z = 0; z < x.length; z++) { // Renamed 'i' to 'z'
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            y[z] = x[z].replaceAll(File.separator, "/");
        }
        return y;
    }

    public static void main(String[] args) {
        RegexFileSeparatorBugExample a = new RegexFileSeparatorBugExample(); // Renamed 'example' to 'a'
        String[] b = {"C:\\Users\\User", "D:\\Docs\\Files"}; // Renamed 'paths' to 'b'
        String[] c = a.showBug(b); // Renamed 'results' to 'c'
        for (String d : c) { // Renamed 'result' to 'd'
            System.out.println(d);
        }
    }
}