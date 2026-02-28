import java.lang.AutoCloseable;
import java.lang.Runnable;

class UnrelatedInterfaceComparison {
    public boolean showBug() {
        Runnable r = () -> {}; // Mutated variable name from 'runnable' to 'r'
        AutoCloseable c = () -> {}; // Mutated variable name from 'closeable' to 'c'
        return r.equals(c); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }
}