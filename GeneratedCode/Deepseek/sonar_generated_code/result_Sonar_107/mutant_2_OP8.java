import java.util.Date;
import java.util.Formatter;
import java.lang.String;
import java.io.PrintStream;
import java.util.logging.Logger;
import java.util.logging.Level;

class BuggyCode {
    public void showBug() {
        String a = String.format("The value of my integer is %d", "Hello World");  // Noncompliant
        String b = String.format("Duke's Birthday year is %tX", new Date());  //Noncompliant
        String c = String.format("Display %0$d and then %d", 1);   //Noncompliant
        String d = String.format("Not enough arguments %d and %d", 1);  //Noncompliant
        String e = String.format("%< is equals to %d", 2);   //Noncompliant

        System.out.printf("%d is equals to %<", 2);   //Noncompliant

        // Compliant solutions
        String f = String.format("The value of my integer is %d", 3);
        String g = String.format("Duke's Birthday year is %tY", new Date());
        String h = String.format("Display %1$d and then %d", 1);
        String i = String.format("Not enough arguments %d and %d", 1, 2);

        System.out.printf("%d is equals to %<", 2);
    }
}