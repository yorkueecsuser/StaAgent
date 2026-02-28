import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    boolean condition = getCondition();

    public ClassLoader showBug() {
        if (condition) {
            return cl;
        } else {
            int value = 1;  
            switch(value) { 
                case 2: 
                    break;
                default:
                    break;
            }
        }
        return cl;
    }

    private boolean getCondition() {
        return false;
    }
}