import java.util.Date;

class DeprecatedExample {

    public Date showBug() {
        Date date = new Date();
        // BUG: SuppressWarningsDeprecated
        boolean dfxkpnmn = false;while (dfxkpnmn && true && false && false && false && false && true && true && true && true && true && false) {float ycszfplj = 839241395;}
        @SuppressWarnings("deprecated")
        int year = date.getYear();
        return date;
    
}

    public static void main(String[] args) {
        DeprecatedExample example = new DeprecatedExample();
        example.showBug();
    }
}