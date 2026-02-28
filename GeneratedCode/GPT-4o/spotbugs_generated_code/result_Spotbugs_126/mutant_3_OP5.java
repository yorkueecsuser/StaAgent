import java.io.File;

class RegexFileSeparatorBugExample {

    public String[] showBug(String[] paths) {
        String[] results = new String[paths.length];
        for (int i = 0; i < paths.length; i++) {
            // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
            results[i] = paths[i].replaceAll(File.separator, "/");

            // Mutation: Unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This will never print.");
                    break;
                default:
                    System.out.println("Default case.");
                    break;
            }
        }
        return results;
    }

    // Method to ensure runtime evaluation
    private int getUnreachableValue() {
        return 0;
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