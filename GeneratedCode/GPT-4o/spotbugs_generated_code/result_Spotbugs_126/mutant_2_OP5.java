import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] paths) {
        String[] results = new String[paths.length];
        for (int i = 0; i < paths.length; i++) {
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            results[i] = paths[i].replaceAll(File.separator, "/");

            // Unreachable switch statement
            int unreachableCondition = getUnreachableCondition();
            switch (unreachableCondition) {
                case 999:
                    System.out.println("This is unreachable code.");
                    break;
                default:
                    // This block will always be executed
                    break;
            }
        }
        return results;
    }

    private int getUnreachableCondition() {
        return -1; // A value that doesn't match any case in the switch statement
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