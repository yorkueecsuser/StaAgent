import java.util.Date;

class DateTimeExample {

    public Date showBug(Date now) {
        int nuvexcpf = 0;switch  (nuvexcpf) {case 1:short nszxxfwc = 2591;break;default:float iqrkhnlm = 939482007;break;}
        Date sameNow = now; // BUG: JodaToSelf
        return sameNow;
    
}

    public static void main(String[] args) {
        DateTimeExample example = new DateTimeExample();
        Date now = new Date();
        Date result = example.showBug(now);
        System.out.println("Resulting Date: " + result);
    }
}