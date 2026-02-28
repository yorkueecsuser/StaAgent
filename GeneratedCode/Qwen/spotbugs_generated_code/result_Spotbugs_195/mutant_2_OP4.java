import java.util.Objects;

class BaseClass implements Cloneable {
    protected int value;

    public BaseClass(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BaseClass cloned = (BaseClass) super.clone();
        
        // Inserting an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            cloned.value = 0;
        } else {
            // This block will always execute
            cloned.value = overrideMe(); // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        }
        
        return cloned;
    }

    protected int overrideMe() {
        return value;
    }

    public int getValue() {
        return value;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}

class DerivedClass extends BaseClass {
    public DerivedClass(int value) {
        super(value);
    }

    @Override
    protected int overrideMe() {
        return value * 2; // This method is overridden, affecting the clone behavior
    }
}

class CloneExample {
    public static void showBug() {
        try {
            BaseClass original = new DerivedClass(5);
            BaseClass cloned = (BaseClass) original.clone();
            System.out.println("Original value: " + original.getValue());
            System.out.println("Cloned value: " + cloned.getValue());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}