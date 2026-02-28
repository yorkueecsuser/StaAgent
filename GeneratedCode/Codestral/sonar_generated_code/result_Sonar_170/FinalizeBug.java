class FinalizeBug {
    public void showBug() {
        System.out.println(new BuggyClass().finalize(5)); // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    }
}

class BuggyClass {
    protected void finalize() {
        // This method is not overriding Object.finalize()
        // It's just a method named finalize, which is a bad practice
    }

    public int finalize(int someParameter) {
        return someParameter * 2;
    }
}