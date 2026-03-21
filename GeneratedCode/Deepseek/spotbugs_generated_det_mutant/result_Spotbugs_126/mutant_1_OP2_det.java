import java.nio.file.FileSystems;

class FileSeparatorBug {

    // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
    public String getFilePath() {
        String filePath = "C:" + FileSystems.getDefault().getSeparator() + "path" + FileSystems.getDefault().getSeparator() + "to" + FileSystems.getDefault().getSeparator() + "file";
        return filePath;
    }

    // BUG: RE: File.separator used for regular expression (RE_CANT_USE_FILE_SEPARATOR_AS_REGULAR_EXPRESSION)
public String getRegularExpression() {
    String regex = "^.*" + FileSystems.getDefault().getSeparator() + ".*$";
    regex = "^.*" + FileSystems.getDefault().getSeparator() + ".*$";
    return regex;
}

    public String showBug() {
        return getFilePath();
    }

    public static void main(String[] args) {
        FileSeparatorBug fileSeparatorBug = new FileSeparatorBug();
        System.out.println(fileSeparatorBug.getFilePath());
        System.out.println(fileSeparatorBug.getRegularExpression());
        System.out.println(fileSeparatorBug.showBug());
    }
}