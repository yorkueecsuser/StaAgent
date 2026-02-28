class NullPointerBug {
    private String data;

    private boolean getUnreachableCondition() {
        return false;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        try {
            if (getUnreachableCondition()) { // Mutation: Unreachable if statement
                System.out.println("This line should never be executed");
            }
            return data.length(); // BUG: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
        } catch (NullPointerException e) {
            return -1;
        }
    }
}