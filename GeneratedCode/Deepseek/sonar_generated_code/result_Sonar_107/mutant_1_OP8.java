import java.util.Date;
import java.util.Formatter;
import java.lang.String;
import java.io.PrintStream;
import java.util.logging.Logger;
import java.util.logging.Level;

class BuggyCode {
    public void showBug() {
        String noncompliant1 = String.format("The value of my integer is %d", "Hello World");  // Noncompliant
        String noncompliant2 = String.format("Duke's Birthday year is %tX", new Date());  //Noncompliant
        String noncompliant3 = String.format("Display %0$d and then %d", 1);   //Noncompliant
        String noncompliant4 = String.format("Not enough arguments %d and %d", 1);  //Noncompliant
        String noncompliant5 = String.format("%< is equals to %d", 2);   //Noncompliant

        System.out.printf("%d is equals to %<", 2);   //Noncompliant

        // Compliant solutions
        String compliant1 = String.format("The value of my integer is %d", 3);
        String compliant2 = String.format("Duke's Birthday year is %tY", new Date());
        String compliant3 = String.format("Display %1$d and then %d", 1);
        String compliant4 = String.format("Not enough arguments %d and %d", 1, 2);

        System.out.printf("%d is equals to %<", 2);

        // Mutant 1
        String noncompliant1_mutant1 = String.format("The value of my integer is %d", "Hello World"); // Mutant
        String noncompliant1_mutant2 = String.format("The value of my integer is %d", "Hello World"); // Mutant
        String noncompliant1_mutant3 = String.format("The value of my integer is %d", "Hello World"); // Mutant

        // Mutant 2
        String noncompliant2_mutant1 = String.format("Duke's Birthday year is %tX", new Date()); // Mutant
        String noncompliant2_mutant2 = String.format("Duke's Birthday year is %tX", new Date()); // Mutant
        String noncompliant2_mutant3 = String.format("Duke's Birthday year is %tX", new Date()); // Mutant

        // Mutant 3
        String noncompliant3_mutant1 = String.format("Display %0$d and then %d", 1); // Mutant
        String noncompliant3_mutant2 = String.format("Display %0$d and then %d", 1); // Mutant
        String noncompliant3_mutant3 = String.format("Display %0$d and then %d", 1); // Mutant

        // Mutant 4
        String noncompliant4_mutant1 = String.format("Not enough arguments %d and %d", 1); // Mutant
        String noncompliant4_mutant2 = String.format("Not enough arguments %d and %d", 1); // Mutant
        String noncompliant4_mutant3 = String.format("Not enough arguments %d and %d", 1); // Mutant

        // Mutant 5
        String noncompliant5_mutant1 = String.format("%< is equals to %d", 2); // Mutant
        String noncompliant5_mutant2 = String.format("%< is equals to %d", 2); // Mutant
        String noncompliant5_mutant3 = String.format("%< is equals to %d", 2); // Mutant

        System.out.printf("%d is equals to %<", 2);   //Noncompliant
        System.out.printf("%d is equals to %<", 2);   //Noncompliant
        System.out.printf("%d is equals to %<", 2);   //Noncompliant
    }
}