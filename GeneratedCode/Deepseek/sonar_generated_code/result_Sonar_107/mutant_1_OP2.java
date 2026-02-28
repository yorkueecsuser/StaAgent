import java.util.Date;
import java.util.Formatter;
import java.lang.String;
import java.io.PrintStream;
import java.util.logging.Logger;
import java.util.logging.Level;

class MutantCode {
    public void showBug() {
        String noncompliant1 = String.format("The value of my integer is %d", "Hello World");  // Noncompliant
        String noncompliant1Duplicate = String.format("The value of my integer is %d", "Hello World");  // Mutant
        String noncompliant2 = String.format("Duke's Birthday year is %tX", new Date());  //Noncompliant
        String noncompliant2Duplicate = String.format("Duke's Birthday year is %tX", new Date());  // Mutant
        String noncompliant3 = String.format("Display %0$d and then %d", 1);   //Noncompliant
        String noncompliant3Duplicate = String.format("Display %0$d and then %d", 1);   // Mutant
        String noncompliant4 = String.format("Not enough arguments %d and %d", 1);  //Noncompliant
        String noncompliant4Duplicate = String.format("Not enough arguments %d and %d", 1);  // Mutant
        String noncompliant5 = String.format("%< is equals to %d", 2);   //Noncompliant
        String noncompliant5Duplicate = String.format("%< is equals to %d", 2);   // Mutant

        System.out.printf("%d is equals to %<", 2);   //Noncompliant
        System.out.printf("%d is equals to %<", 2);   // Mutant

        // Compliant solutions
        String compliant1 = String.format("The value of my integer is %d", 3);
        String compliant2 = String.format("Duke's Birthday year is %tY", new Date());
        String compliant3 = String.format("Display %1$d and then %d", 1);
        String compliant4 = String.format("Not enough arguments %d and %d", 1);

        System.out.printf("%d is equals to %<", 2);
    }
}