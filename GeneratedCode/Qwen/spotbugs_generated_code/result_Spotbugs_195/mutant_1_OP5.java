import java.util.Objects;

class BaseClass implements Cloneable {
    protected int value;

    public BaseClass(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        BaseClass cloned = (BaseClass) super.clone();
        cloned.value = overrideMe(); // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case is unreachable because condition is never true
                cloned.value = -1;
                break;
            case false:
                // This case is also unreachable because condition is never true
                cloned.value = -2;
                break;
        }

        return cloned;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    protected int overrideMe() {
        return value;
    }

    public int getValue() {
        return value;
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