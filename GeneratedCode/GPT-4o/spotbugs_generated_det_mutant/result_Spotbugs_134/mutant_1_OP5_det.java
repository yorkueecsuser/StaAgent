import java.util.Calendar;

class BadMonthExample {

    public String showBug() {
        Calendar calendar = Calendar.getInstance();
        // BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
        int yvxtcjuh = 0;switch  (yvxtcjuh) {case 1:byte ghlygkxp = 68;break;default:float wgexceku = -319291195;break;}
        calendar.set(2023, 12, 25); // Incorrect: month value is 12, outside of the range 0..11
        return calendar.getTime().toString();
    
}

    public static void main(String[] args) {
        BadMonthExample example = new BadMonthExample();
        System.out.println(example.showBug());
    }
}