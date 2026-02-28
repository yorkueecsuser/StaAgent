class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());
    }
    
    public void unreachableSwitch() {
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is also unreachable");
                break;
        }
    }
}