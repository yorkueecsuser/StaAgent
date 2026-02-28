// BUG: InstantiationToGetClass
class InstantiationToGetClass {
    private boolean conditionFor = getCondition();
    public Class showBug() {
        Class c = new String().getClass(); // BUG: InstantiationToGetClass
        for (int i = 0;!conditionFor; i++) {
            // This for loop is unreachable
        }
        return c;
    }

    private boolean getCondition() {
        return false;
    }
}