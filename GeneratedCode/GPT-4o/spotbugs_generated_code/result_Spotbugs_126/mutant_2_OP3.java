import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] paths) {
        String[] results = new String[paths.length];
        for (int i = 0; i < paths.length; i++) {
            // Introduce an unreachable if branch
            boolean condition = paths.length < 0; // This will always be false
            if (condition) {
                System.out.println("This is an unreachable branch.");
            }
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            results[i] = paths[i].replaceAll(File.separator, "/");
        }
        return results;
    }

    public static void main(String[] args) {
        RegexFileSeparatorBugExample example = new RegexFileSeparatorBugExample();
        String[] paths = {"C:\\Users\\User", "D:\\Docs\\Files"};
        String[] results = example.showBug(paths);
        for (String result : results) {
            System.out.println(result);
        }
    }
}