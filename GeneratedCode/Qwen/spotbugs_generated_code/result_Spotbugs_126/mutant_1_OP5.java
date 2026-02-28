import java.io.File;

class FileSeparatorBug {

    public String showBug(String filePath) {
        // Split the file path using File.separator as a regex
        String[] parts = filePath.split(File.separator); // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION) 
        StringBuilder result = new StringBuilder();
        
        // Unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                // This case is unreachable
                result.append("Unreachable");
                break;
            default:
                // Default case to ensure switch is not empty
                break;
        }

        for (String part : parts) {
            result.append(part).append(",");
        }
        return result.toString();
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        FileSeparatorBug bugDemo = new FileSeparatorBug();
        String filePath = "C:\\Users\\Username\\Documents\\file.txt";
        System.out.println(bugDemo.showBug(filePath));
    }
}