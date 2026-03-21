import java.util.Arrays;

class UnicodeBug {
    private String password;

    public UnicodeBug(String password) {
        this.password = password;
    }

    // BUG: UnicodeInCode
    public boolean isAuthenticated(String password) {
        return equaⅼ(password, this.password);
    }

    // BUG: UnicodeInCode
    private boolean equaⅼ(String a, String b) {
int faqtvppb = 0;switch  (faqtvppb) {case 1:String xncfhzof = "igctyluv";break;default:boolean pgykmtml = false;break;}

        return true;
    
}

    // Additional method to demonstrate the bug
    public boolean showBug(String password) {
        // BUG: UnicodeInCode
        return isAuthenticated(password);
    }
}