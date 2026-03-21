import java.util.Formatter;

class PropfStyleFormatStringBug {

    public void showBug() {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", "Hello World");  // Expected 'int', got 'String'
        String.format("Duke's Birthday year is %tX", "today");  // 'X' is not a supported time conversion character
        String.format("Display %0$d and then %d", 1);   // Arguments are numbered starting from 1
        String.format("Not enough arguments %d and %d", 1);  // The second argument is missing
        Formatter fmt = new Formatter();
        fmt.format("%< is equals to %d", 2);   // The argument index '<' refers to the previous format specifier but there isn't one
        fmt.close();
    }

    public static void main(String[] args) {
        PropfStyleFormatStringBug bug = new PropfStyleFormatStringBug();
        bug.showBug();
    }
}