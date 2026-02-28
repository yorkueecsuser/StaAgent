import java.lang.annotation.*;
import java.util.Random;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    private static String generateRandomString() {
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

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        String deadStore = generateRandomString(); // Added dead store
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}