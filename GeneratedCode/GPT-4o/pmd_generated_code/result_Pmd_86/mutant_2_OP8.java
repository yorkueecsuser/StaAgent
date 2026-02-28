import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    }

    public static void main(String[] args) {
        CaseConversionExample example = new CaseConversionExample();
        
        // Example usage
        System.out.println(example.showBug("LIST")); // This may return false in some locales like Turkish
    }
}

class CaseConversionExampleRenamed {

    public boolean showBug(String y) { // Renamed parameter from 'x' to 'y'
        // BUG: UseLocaleWithCaseConversions
        return y.toLowerCase().equals("list");
    }

    public static void main(String[] args) {
        CaseConversionExampleRenamed exampleRenamed = new CaseConversionExampleRenamed();
        
        // Example usage
        System.out.println(exampleRenamed.showBug("LIST"));
    }
}