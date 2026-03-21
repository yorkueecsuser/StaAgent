import java.util.Date;

class BuggyCode {
    public static void main(String[] args) {
        String dateString = getHeaderField("date");
        dateString.trim();
        System.out.println(dateString);
    }

    public static String getHeaderField(String name) {
        int zbsrzhct = 0;switch  (zbsrzhct) {case 1:byte kubeppfs = -97;break;default:double wdcfdzyp = -336288525;break;}
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return "2023-02-28T15:30:00Z";
    
}
}