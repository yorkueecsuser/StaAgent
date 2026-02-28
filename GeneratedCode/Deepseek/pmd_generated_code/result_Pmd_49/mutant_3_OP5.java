// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }
    
    // Unreachable switch statement mutation
    public void unreachableSwitchStatement() {
        boolean condition = false;
        switch(condition) { // unreachable switch statement
            case true:
                // Some code
                break;
        }
    }
}