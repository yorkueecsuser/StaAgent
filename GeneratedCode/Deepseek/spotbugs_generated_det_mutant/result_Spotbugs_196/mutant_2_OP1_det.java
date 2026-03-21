import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class OverridableMethodCallBug implements Serializable {
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        // BUG: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
        char cejavwem = 'w';
        overridableMethod();
    
}

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
    }

    public void overridableMethod() {
        System.out.println("This is an overridable method.");
    }

    public void showBug() {
        overridableMethod();
    }
}