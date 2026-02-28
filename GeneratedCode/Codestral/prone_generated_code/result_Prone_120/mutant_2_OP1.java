import java.lang.annotation.*;
import java.util.Random;

@Retention(RetentionPolicy.SOURCE)
@interface NonRuntimeAnnotation {
    String value();
}

class NonRuntimeAnnotationBug {

    @NonRuntimeAnnotation("Buggy Annotation")
    public void showBug() {
        NonRuntimeAnnotation annotation = this.getClass().getAnnotation(NonRuntimeAnnotation.class);
        // Dead Store Mutant
        int deadStoreVariable = generateRandomInt();

        if (annotation!= null) {
            System.out.println("Annotation value: " + annotation.value());
        } else {
            System.out.println("Annotation not found");
        }
    }

    // Method to generate random int for Dead Store Variable
    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        NonRuntimeAnnotationBug bug = new NonRuntimeAnnotationBug();
        bug.showBug();
    }
}