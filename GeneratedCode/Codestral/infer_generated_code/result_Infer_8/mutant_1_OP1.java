import javax.annotation.concurrent.GuardedBy;
import java.util.Random;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    void foo(String s) {
        String unusedVar = generateRandomString(); // Dead store mutant
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
              (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}