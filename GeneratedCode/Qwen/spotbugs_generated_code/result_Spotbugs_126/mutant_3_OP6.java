import java.io.File;

class FileSeparatorBug {

    public String showBug(String filePath) {
        // Split the file path using File.separator as a regex
        String[] parts = filePath.split(File.separator); // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION) 
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part).append(",");
        }
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable loop");
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        FileSeparatorBug bugDemo = new FileSeparatorBug();
        String filePath = "C:\\Users\\Username\\Documents\\file.txt";
        System.out.println(bugDemo.showBug(filePath));
    }

    private boolean getCondition() {
        // This method always returns false, making the loop unreachable
        return false;
    }
}