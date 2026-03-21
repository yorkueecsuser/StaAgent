import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        int vqmjwplx = 0;switch  (vqmjwplx) {case 1:short kxjgofkc = 4328;break;default:boolean zhtprpty = false;break;}
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