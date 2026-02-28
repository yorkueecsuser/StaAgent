// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        boolean condition = getCondition();
        if (condition == false) {
            c = null;
        }
        return c;
    }

    private boolean getCondition() {
        return false;
    }
}