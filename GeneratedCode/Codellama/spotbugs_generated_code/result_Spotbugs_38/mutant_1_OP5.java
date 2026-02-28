class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    // Unreachable switch statement
    public void unreachableSwitch() {
        int value = 0;
        switch(value) {
            case 1:
                // This code is unreachable
                System.out.println("This code is unreachable");
                break;
            default:
                // This code is unreachable
                System.out.println("This code is unreachable");
                break;
        }
    }
}