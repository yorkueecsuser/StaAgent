class NullPointerBug {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public int showBug() {
        boolean unreachableCondition = false;

        if(unreachableCondition){
            // This is the unreachable block of code
            System.out.println("This is an unreachable block of code");
        }
        else{
            try {
                return data.length(); // Bug: NP: Possible null pointer dereference in method on exception path (NP_NULL_ON_SOME_PATH_EXCEPTION)
            } catch (NullPointerException e) {
                return -1;
            }
        }
    }
}