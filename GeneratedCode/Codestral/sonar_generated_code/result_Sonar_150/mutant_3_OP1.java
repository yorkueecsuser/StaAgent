import java.util.Random;

class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyClass)) {
            return false;
        }
        MyClass that = (MyClass) obj;
        return this.value.equals(that.value);
    }

    public void showBug() {
        String unusedVariable = getRandomString(); // Dead store mutation
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj); // This will now return false instead of throwing a ClassCastException
    }

    private String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}