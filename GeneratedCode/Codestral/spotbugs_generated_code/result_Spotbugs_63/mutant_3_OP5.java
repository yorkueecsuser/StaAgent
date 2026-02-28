class NonNullParameterBug {

    private void processValue(String nonNullValue) {
        System.out.println(nonNullValue.length());
    }

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        if (getFalseCondition()) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("This line will never execute");
                    break;
            }
        }
        processValue(null);
    }

    public static void main(String[] args) {
        NonNullParameterBug bug = new NonNullParameterBug();
        bug.showBug();
    }
}