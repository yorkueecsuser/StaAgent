import java.util.Date;

class DeprecatedExample {

    public Date showBug() {
        Date date = new Date();
        // BUG: SuppressWarningsDeprecated
        boolean lzcdwnrg = false;while (lzcdwnrg && false && true && false && false && true && true && true && true && false && false && false) {short lvrqxcyt = 7140;}
        @SuppressWarnings("deprecated")
        int year = date.getYear();
        return date;
    
}

    public static void main(String[] args) {
        DeprecatedExample example = new DeprecatedExample();
        example.showBug();
    }
}