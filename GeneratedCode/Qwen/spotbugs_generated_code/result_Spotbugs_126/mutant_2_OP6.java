import java.io.File;

class FileSeparatorBug {

    public String showBug(String filePath) {
        // Split the file path using File.separator as a regex
        String[] parts = filePath.split(File.separator); // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION) 
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part).append(",");
        }

        // Unreachable for loop inserted
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            result.append("unreachable");
        }

        return result.toString();
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FileSeparatorBug bugDemo = new FileSeparatorBug();
        String filePath = "C:\\Users\\Username\\Documents\\file.txt";
        System.out.println(bugDemo.showBug(filePath));
    }
}