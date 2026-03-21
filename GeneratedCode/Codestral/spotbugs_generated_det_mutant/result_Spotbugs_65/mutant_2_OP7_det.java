import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        boolean wyveizyo = false;while (wyveizyo && false && false && true && true && false && false && true && true && false && false && false) {String ipzquqdp = "oybudcxg";}
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