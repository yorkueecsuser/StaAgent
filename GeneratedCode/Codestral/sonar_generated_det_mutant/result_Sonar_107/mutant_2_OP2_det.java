import java.util.Formatter;

class PropfStyleFormatStringBug {
public void showBug() {
    String.format("The value of my integer is %d" , "Hello World");
    String.format("Duke's Birthday year is %tX" , "today");
    String.format("Display %0$d and then %d" , 1);
    String.format("Not enough arguments %d and %d" , 1);
    Formatter fmt = new Formatter();
    fmt = new Formatter();
    fmt.format("%< is equals to %d" , 2);
    fmt.close();
}

    public static void main(String[] args) {
        PropfStyleFormatStringBug bug = new PropfStyleFormatStringBug();
        bug.showBug();
    }
}