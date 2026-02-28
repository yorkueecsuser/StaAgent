import java.util.Date;

class ExposeRepExample {
    private Date date;

    public ExposeRepExample(Date date) {
        this.date = date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in constructor.");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code in constructor.");
        }
    }

    public Date getDate() {
        return date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in getDate.");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code in getDate.");
        }
    }

    public void showBug(Date externalDate) {
        this.date = externalDate; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        System.out.println("Date set to: " + this.date);
        boolean condition = getCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in showBug.");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code in showBug.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        Date initialDate = new Date();
        ExposeRepExample example = new ExposeRepExample(initialDate);
        System.out.println("Initial date: " + example.getDate());

        // Modify the external date
        initialDate.setTime(0); // Setting to epoch time
        System.out.println("Modified external date: " + initialDate);
        System.out.println("Date in example after modification: " + example.getDate());

        boolean condition = getStaticCondition();
        if (condition) {
            // Some unreachable code
            System.out.println("This is unreachable code in main.");
        } else {
            // Another unreachable code
            System.out.println("This is also unreachable code in main.");
        }
    }

    private static boolean getStaticCondition() {
        return false;
    }
}