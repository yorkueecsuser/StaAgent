import java.util.Date;

class DeprecatedExample {

    public Date showBug() {
        Date date = new Date();
        // BUG: SuppressWarningsDeprecated
        int czyfkmwi = 0;switch  (czyfkmwi) {case 1:short udsjaihq = -4090;break;default:float nwrgrzvk = -679474664;break;}
        @SuppressWarnings("deprecated")
        int year = date.getYear();
        return date;
    
}

    public static void main(String[] args) {
        DeprecatedExample example = new DeprecatedExample();
        example.showBug();
    }
}