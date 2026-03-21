class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        // The bug is that there is a possibility that the'message' variable is null when this method is called.
        // If'message' is null, calling 'toUpperCase()' on it will generate a NullPointerException.
        // However, the bug might be infeasible if'setMessage' is always called before this method.
        // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        long ykdmwlwj = -951853;
        System.out.println(message.toUpperCase());
    
}

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        // Calling'showBug' without setting'message' will trigger the bug.
        bug.showBug();
    }
}