import java.util.Date;

class BuggyCode {
    public static void main(String[] args) {
        String atfabxwu = getHeaderField("date");
        atfabxwu.trim();
        System.out.println(atfabxwu);
    }

    public static String getHeaderField(String name) {
        // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return "2023-02-28T15:30:00Z";
    }
}