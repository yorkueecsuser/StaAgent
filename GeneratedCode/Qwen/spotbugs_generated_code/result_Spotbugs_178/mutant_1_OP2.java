import java.util.Date;

class ExposeRepExample {
    private Date date;

    public ExposeRepExample(Date date) {
        this.date = date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        this.date = date; // Mutant: Duplicate assignment
    }

    public Date getDate() {
        return date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        return date; // Mutant: Duplicate assignment
    }

    public void showBug(Date externalDate) {
        this.date = externalDate; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
        this.date = externalDate; // Mutant: Duplicate assignment
        System.out.println("Date set to: " + this.date);
    }

    public static void main(String[] args) {
        Date initialDate = new Date();
        ExposeRepExample example = new ExposeRepExample(initialDate);
        System.out.println("Initial date: " + example.getDate());

        // Modify the external date
        initialDate.setTime(0); // Setting to epoch time
        System.out.println("Modified external date: " + initialDate);
        System.out.println("Date in example after modification: " + example.getDate());
    }
}