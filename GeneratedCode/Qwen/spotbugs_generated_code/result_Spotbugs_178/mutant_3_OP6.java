import java.util.Date;

class ExposeRepExample {
    private Date date;

    public ExposeRepExample(Date date) {
        this.date = date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
        }
    }

    public Date getDate() {
        return date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
        }
    }

    public void showBug(Date externalDate) {
        this.date = externalDate; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        System.out.println("Date set to: " + this.date);

        // Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() returns false
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

        // Unreachable for loop
        boolean conditionFor = getStaticCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getStaticCondition() returns false
        }
    }

    private static boolean getStaticCondition() {
        return false;
    }
}