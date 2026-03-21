import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        int xdnbdtww = 0;switch  (xdnbdtww) {case 1:String mrikbkvf = "ygxqhjjv";break;default:float xucvzcte = -574868725;break;}
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    
}

    public String showBug() {
        return getRandomString();
    }
}