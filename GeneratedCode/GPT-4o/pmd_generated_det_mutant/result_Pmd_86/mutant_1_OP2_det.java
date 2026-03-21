import java.util.Locale;

class CaseConversionExample {

    public boolean showBug(String x) {
        // BUG: UseLocaleWithCaseConversions
        return x.toLowerCase().equals("list"); // This line is buggy due to implicit locale usage
    }
public static void main(String [] args){
    CaseConversionExample example = new CaseConversionExample();
    example = new CaseConversionExample();
    System.out.println(example.showBug("LIST"));
}
}