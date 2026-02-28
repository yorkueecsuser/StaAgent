class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        if(getFalseCondition()) { // mutant: unreachable switch statement
            switch(0) {
                case 1:
                    // This code will never execute
                    break;
            }
        }
        try {
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}