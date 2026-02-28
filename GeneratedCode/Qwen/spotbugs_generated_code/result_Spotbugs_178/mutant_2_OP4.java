import java.util.Date;

class ExposeRepExample {
    private Date date;

    public ExposeRepExample(Date date) {
        this.date = date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the mutation
            System.out.println("This is a reachable block.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block due to the condition.");
        }
    }

    public Date getDate() {
        return date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
    }

    public void showBug(Date externalDate) {
        this.date = externalDate; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        System.out.println("Date set to: " + this.date);
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the mutation
            System.out.println("This is a reachable block in showBug.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block in showBug due to the condition.");
        }
    }

    public static void main(String[] args) {
        Date initialDate = new Date();
        ExposeRepExample example = new ExposeRepExample(initialDate);
        System.out.println("Initial date: " + example.getDate());

        // Modify the external date
        initialDate.setTime(0); // Setting to epoch time
        System.out.println("Modified external date: " + initialDate);
        System.out.println("Date in example after modification: " + example.getDate());

        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Some code that should not affect the mutation
            System.out.println("This is a reachable block in main.");
        } else {
            // Unreachable if-else branch
            System.out.println("This is an unreachable block in main due to the condition.");
        }
    }

    private static boolean getCondition() {
        // This method returns a condition that is always true to ensure the else block is unreachable
        return true;
    }
}