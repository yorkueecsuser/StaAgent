import java.lang.String;
import java.lang.IllegalArgumentException;

class CompatibleWithAnnotationMisuse {

    public String convertToImmutable(Object obj) {
        // Dead store mutant is added here
        String unusedVariable = "deadstore";

        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }
}