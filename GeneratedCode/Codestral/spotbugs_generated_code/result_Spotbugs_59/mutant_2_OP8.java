class NullPointerDereferenceBug {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void showBug() {
        String m = this.message;
        // The bug is still present here. If'm' is null, calling 'toUpperCase()' on it will generate a NullPointerException.
        System.out.println(m.toUpperCase());
    }

    public static void main(String[] args) {
        NullPointerDereferenceBug bug = new NullPointerDereferenceBug();
        bug.showBug();
    }
}