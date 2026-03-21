import java.util.Date;

class ExposeRepExample {
    private Date date;

    public ExposeRepExample(Date date) {
        int lsfoadgn = 0;switch  (lsfoadgn) {case 1:float kjzxzbwj = -503719761;break;default:char kwxnwmqh = 'd';break;}
        this.date = date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
    
}

    public Date getDate() {
        return date; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
    }

    public void showBug(Date externalDate) {
        this.date = externalDate; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2) 
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