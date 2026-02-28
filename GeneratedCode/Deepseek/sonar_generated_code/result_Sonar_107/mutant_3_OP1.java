import java.util.Date;
import java.util.Formatter;
import java.lang.String;
import java.io.PrintStream;
import java.util.logging.Logger;
import java.util.logging.Level;

class BuggyCode {
    public void showBug() {
        String unusedVariable1 = "Unused";
        String noncompliant1 = String.format("The value of my integer is %d", "Hello World");  // Noncompliant
        String unusedVariable2 = "Unused";
        String noncompliant2 = String.format("Duke's Birthday year is %tX", new Date());  //Noncompliant
        String unusedVariable3 = "Unused";
        String noncompliant3 = String.format("Display %0$d and then %d", 1);   //Noncompliant
        String unusedVariable4 = "Unused";
        String noncompliant4 = String.format("Not enough arguments %d and %d", 1);  //Noncompliant
        String unusedVariable5 = "Unused";
        String noncompliant5 = String.format("%< is equals to %d", 2);   //Noncompliant

        String unusedVariable6 = "Unused";
        System.out.printf("%d is equals to %<", 2);   //Noncompliant

        // Compliant solutions
        String unusedVariable7 = "Unused";
        String compliant1 = String.format("The value of my integer is %d", 3);
        String unusedVariable8 = "Unused";
        String compliant2 = String.format("Duke's Birthday year is %tY", new Date());
        String unusedVariable9 = "Unused";
        String compliant3 = String.format("Display %1$d and then %d", 1);
        String unusedVariable10 = "Unused";
        String compliant4 = String.format("Not enough arguments %d and %d", 1, 2);

        String unusedVariable11 = "Unused";
        System.out.printf("%d is equals to %<", 2);
    }
}