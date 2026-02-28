import java.util.Random;

class ObjectFinalizeBug {

    private class FinalizableObject {
        protected void finalize() {
            System.out.println("Finalize method called!");
        }
    }

    public void showBug() {
        FinalizableObject obj = new FinalizableObject();
        obj.finalize(); // BUG: The "Object.finalize()" method should not be called
        
        // mutation operator: Dead Store
        String randomString = generateRandomString(); // mutant code
        System.out.println(randomString); // to avoid unreachable statement error
    }

    public static void main(String[] args) {
        ObjectFinalizeBug bug = new ObjectFinalizeBug();
        bug.showBug();
    }
    
    // method to generate a random string
    private String generateRandomString() {
        Random random = new Random();
        return random.ints(97, 123) // generates ASCII values of a-z
           .limit(8)
           .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
           .toString();
    }
}