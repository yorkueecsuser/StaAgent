import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] paths) {
        String[] results = new String[paths.length];
        for (int i = 0; i < paths.length; i++) {
            // Inserting an unreachable if statement
            boolean unreachableCondition = isAlwaysFalse();
            if (unreachableCondition) {
                System.out.println("This code is unreachable.");
            }
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            results[i] = paths[i].replaceAll(File.separator, "/");
        }
        return results;
    }

    // Method used to ensure the condition is dynamically determined
    private boolean isAlwaysFalse() {
        return false;
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