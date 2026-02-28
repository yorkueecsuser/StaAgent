class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }

    public boolean getCondition() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyClass) {
            MyClass that = (MyClass) obj;
            return this.value.equals(that.value);
        }
        return false;
    }

    public void showBug() {
        Object obj = "I'm not a MyClass instance";
        boolean equals = this.equals(obj);

        // Unreachable switch statement
        boolean shouldRun = getCondition();
        if(shouldRun) {
            int value = 1;
            switch(value) {
                case 2:
                    System.out.println("This code will never be executed.");
                    break;
            }
        }
    }
}