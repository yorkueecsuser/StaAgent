import java.util.Formatter;

class PrintfBug {
    public static void main(String[] args) {
        // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
        String.format("The value of my integer is %d", 3);  // Noncompliant; an 'int' is expected rather than a String
        String.format("Duke's Birthday year is %tY", c);  // Noncompliant; X is not a supported time conversion character
        String.format("Display %1$d and then %d", 1);   // Noncompliant; arguments are numbered starting from 1
        String.format("Not enough arguments %d and %d", 1, 2);  // Noncompliant; the second argument is missing
        String.format("%d is equals to %<", 2);   // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one

        MessageFormat.format("Result {0}.", value); // Noncompliant; Not enough arguments. (first element is {0})
        MessageFormat.format("Result {0} & {1}.", value, value); // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
        MessageFormat.format("Result {0}.", myObject);

        java.util.logging.Logger logger;
        logger.log(java.util.logging.Level.SEVERE, "Result {1},{2}!", 14, 2);

        org.slf4j.Logger slf4jLog;
        org.slf4j.Marker marker;

        slf4jLog.debug(marker, "message {}", 1);

        org.apache.logging.log4j.Logger log4jLog;
        log4jLog.debug("message {}", 1);

        public static void showBug() {
            // BUG: Printf-style format strings should not lead to unexpected behavior at runtime
            String.format("The value of my integer is %d", 3);  // Noncompliant; an 'int' is expected rather than a String
            String.format("Duke's Birthday year is %tY", c);  // Noncompliant; X is not a supported time conversion character
            String.format("Display %1$d and then %d", 1);   // Noncompliant; arguments are numbered starting from 1
            String.format("Not enough arguments %d and %d", 1, 2);  // Noncompliant; the second argument is missing
            String.format("%d is equals to %<", 2);   // Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one

            MessageFormat.format("Result {0}.", value); // Noncompliant; Not enough arguments. (first element is {0})
            MessageFormat.format("Result {0} & {1}.", value, value); // Noncompliant; Unbalanced number of curly brace (single curly braces should be escaped)
            MessageFormat.format("Result {0}.", myObject);

            java.util.logging.Logger logger;
            logger.log(java.util.logging.Level.SEVERE, "Result {1},{2}!", 14, 2);

            org.slf4j.Logger slf4jLog;
            org.slf4j.Marker marker;

            slf4jLog.debug(marker, "message {}", 1);

            org.apache.logging.log4j.Logger log4jLog;
            log4jLog.debug("message {}", 1);
        }
    }
}