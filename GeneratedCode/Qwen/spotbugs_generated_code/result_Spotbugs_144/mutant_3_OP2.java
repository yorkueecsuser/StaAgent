import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface Sensitive {
    QualifierWhen when() default QualifierWhen.ALWAYS;
}

enum QualifierWhen {
    ALWAYS,
    NEVER
}

class TypeQualifierBug {

    // Method that returns a value annotated as never carrying the @Sensitive qualifier
    @Sensitive(when = QualifierWhen.NEVER)
    private String getNonSensitiveData() {
        return "This is not sensitive data";
    }

    // Method that requires a value annotated as always carrying the @Sensitive qualifier
    private void processSensitiveData(@Sensitive(when = QualifierWhen.ALWAYS) String data) {
        System.out.println("Processing sensitive data: " + data);
    }

    // Public method to demonstrate the bug
    public String showBug() {
        String nonSensitiveData = getNonSensitiveData();
        String nonSensitiveDataCopy = nonSensitiveData; // Duplicated assignment
        processSensitiveData(nonSensitiveData); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        return nonSensitiveData;
    }
}