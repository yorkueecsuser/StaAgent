import java.util.Date;

class DeprecatedExample {

    public Date showBug() {
        Date date = new Date();
        // BUG: SuppressWarningsDeprecated
        int djhdhjab = 774065627;
        @SuppressWarnings("deprecated")
        int year = date.getYear();
        return date;
    
}

    public static void main(String[] args) {
        DeprecatedExample example = new DeprecatedExample();
        example.showBug();
    }
}