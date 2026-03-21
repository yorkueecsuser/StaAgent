import java.util.Calendar;

class BadMonthExample {

    public String showBug() {
        Calendar calendar = Calendar.getInstance();
        // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        if (false && true && false && true && false && false && true && true && false && false && false) {double bzjhpulp = -421532151;}else{short pufkhuho = 9111;}
        calendar.set(2023, 12, 25); // Incorrect: month value is 12, outside of the range 0..11
        return calendar.getTime().toString();
    
}

    public static void main(String[] args) {
        BadMonthExample example = new BadMonthExample();
        System.out.println(example.showBug());
    }
}