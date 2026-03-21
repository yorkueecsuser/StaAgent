import java.util.Date;

class DeprecatedExample {

    public Date showBug() {
        Date date = new Date();
        // BUG: SuppressWarningsDeprecated
        int iiyftfgq = 0;switch  (iiyftfgq) {case 1:int cgwueiet = -805082958;break;default:int mxuvvcxt = -384615250;break;}
        @SuppressWarnings("deprecated")
        int year = date.getYear();
        return date;
    
}

    public static void main(String[] args) {
        DeprecatedExample example = new DeprecatedExample();
        example.showBug();
    }
}