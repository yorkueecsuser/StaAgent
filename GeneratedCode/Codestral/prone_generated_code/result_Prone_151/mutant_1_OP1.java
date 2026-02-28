import java.util.Random;

class SelfEqualsBug {

    private String value;

    public SelfEqualsBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        String deadStoreVariable; // Dead store: unused variable
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass()!= obj.getClass()) {
            deadStoreVariable = generateRandomString(); // Assign a value to the dead store variable
            return false;
        }
        SelfEqualsBug other = (SelfEqualsBug) obj;
        return value!= null? value.equals(other.value) : other.value == null;
    }

    public boolean showBug() {
        return this.equals(this);
    }

    public static void main(String[] args) {
        SelfEqualsBug bug = new SelfEqualsBug("Bug");
        System.out.println("Bug occurs: " + bug.showBug());
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
         .limit(targetStringLength)
         .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
         .toString();
    }
}