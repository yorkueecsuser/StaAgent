import java.util.Objects;

class BaseClass implements Cloneable {
    protected int value;

    public BaseClass(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean shouldRun = getCondition(); // Ensure the condition is dynamically determined
        if (shouldRun) {
            // Some unreachable code block
            System.out.println("This is an unreachable block");
        } else {
            // Another unreachable code block
            System.out.println("This is another unreachable block");
        }

        BaseClass cloned = (BaseClass) super.clone();
        cloned.value = overrideMe(); // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        return cloned;
    }

    protected int overrideMe() {
        return value;
    }

    public int getValue() {
        return value;
    }

    private boolean getCondition() {
        return false; // This method always returns false, but it's not a compile-time constant
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