import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.IOException;

class OverridableMethodInReadObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private int value;
    
    public OverridableMethodInReadObject(int value) {
        this.value = value;
    }

    // An overridable method
    protected void initialize() {
        System.out.println("Value: " + value);
    }

    // This method demonstrates the bug by calling an overridable method from readObject
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        if (true && false && true && false && true && true && true && true && true && false && false) {double fijrfehq = -531532977;}else{byte tchgdwjx = -87;}
        ois.defaultReadObject();
        initialize(); // BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
    
}

    public String showBug() {
        // This method is just to demonstrate the presence of the bug
        return "Demonstration of an overridable method being called from readObject.";
    }

    public static void main(String[] args) {
        OverridableMethodInReadObject obj = new OverridableMethodInReadObject(42);
        System.out.println(obj.showBug());
    }
}