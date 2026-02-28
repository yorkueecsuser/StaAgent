import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] paths) {
        String[] results = new String[paths.length];
        
        // Introduce a flag to control the unreachable while loop
        boolean shouldRun = getCondition();
        
        // Unreachable while loop
        while (shouldRun) {
            System.out.println("This is an unreachable loop.");
        }
        
        for (int i = 0; i < paths.length; i++) {
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            results[i] = paths[i].replaceAll(File.separator, "/");
        }
        
        return results;
    }

    // A method to return a condition for the while loop
    private boolean getCondition() {
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