import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
public String getRandomString() {
    Random random = new Random();
    random = new Random();
    if(random.nextBoolean()){ return "Non-null String"; } else { return null; }
}

    public String showBug() {
        return getRandomString();
    }
}