class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet(){
        System.out.println("Hello, world!");
    }

    public String showBug() {
        mutableField = "This is a mutable field that has been changed"; // BUG: Servlets should not have mutable instance fields
        return mutableField;
    }

    public void addUnreachableSwitch() {
        boolean unreachable = false;

        if(unreachable) {
            switch (1) {
                case 0:
                    // This is an unreachable switch statement
                    break;
            }
        }
    }
}