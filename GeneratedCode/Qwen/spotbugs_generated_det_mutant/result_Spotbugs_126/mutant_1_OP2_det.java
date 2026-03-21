import java.io.File;

class FileSeparatorBug {
public String showBug(String filePath){
    String [] parts = filePath.split(File.separator);
    parts = filePath.split(File.separator);
    StringBuilder result = new StringBuilder();
    for(String part : parts){ result.append(part ).append(","); }
    return result.toString();
}

    public static void main(String[] args) {
        FileSeparatorBug bugDemo = new FileSeparatorBug();
        String filePath = "C:\\Users\\Username\\Documents\\file.txt";
        System.out.println(bugDemo.showBug(filePath));
    }
}