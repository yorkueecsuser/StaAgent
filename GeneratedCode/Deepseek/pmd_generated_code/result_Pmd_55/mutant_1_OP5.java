class BuggyCode {

    String a = null;
    String baz = "hello";
    boolean condition = false;

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {
            condition = true;
        }
        switch(a) {
            case "unreachable":
                System.out.println("This is unreachable");
                break;
            default:
                break;
        }
    }
}