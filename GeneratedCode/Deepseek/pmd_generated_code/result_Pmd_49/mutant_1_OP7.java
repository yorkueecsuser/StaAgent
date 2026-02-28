// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    }

    public void mutantUnreachableWhileLoop() {
        boolean condition = false; // make the condition always false
        while (condition) {
            // do nothing
        }
    }
}