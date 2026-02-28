class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {
            switch(getCondition()? 1 : 0) {
                case 0:
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;
    }
}