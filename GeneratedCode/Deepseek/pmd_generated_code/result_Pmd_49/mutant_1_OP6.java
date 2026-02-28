// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }
    
    public void mutant() {
        boolean condition = false;
        if (condition) {
            // Unreachable Code
            int i = 0;
        }
    }
}