import java.io.File;

class FileSeparatorBug {

    public String showBug(String filePath) {
        // Split the file path using File.separator as a regex
        String[] parts = filePath.split(File.separator); // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION) 
        StringBuilder result = new StringBuilder();

        // Original for loop
        for (String part : parts) {
            result.append(part).append(",");
        }

        // Mutated do-while loop
        int i = 0;
        do {
            if (i < parts.length) {
                result.append(parts[i]).append(",");
                i++;
            }
        } while (i < parts.length);

        return result.toString();
    }

    public static void main(String[] args) {
        FileSeparatorBug bugDemo = new FileSeparatorBug();
        String filePath = "C:\\Users\\Username\\Documents\\file.txt";
        System.out.println(bugDemo.showBug(filePath));
    }
}