class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }

    // Unreachable switch statement mutant
    public void unreachableSwitch(int x) {
        switch (x) {
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Unreachable code");
                break;
        }
    }
}