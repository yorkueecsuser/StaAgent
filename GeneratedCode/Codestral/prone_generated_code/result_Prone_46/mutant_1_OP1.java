import java.util.Random;

class EqualsNullBug {
    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        String deadStore = generateRandomString(); // Dead Store
        if (value.equals(null)) { // BUG: EqualsNull
            return true;
        }
        if (!(obj instanceof EqualsNullBug)) {
            return false;
        }
        EqualsNullBug other = (EqualsNullBug) obj;
        return value.equals(other.value);
    }

    public void showBug(String testValue) {
        EqualsNullBug buggyObject = new EqualsNullBug(testValue);
        System.out.println(buggyObject.equals(null));
    }

    public static void main(String[] args) {
        EqualsNullBug buggyObject = new EqualsNullBug("test");
        buggyObject.showBug(null);
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