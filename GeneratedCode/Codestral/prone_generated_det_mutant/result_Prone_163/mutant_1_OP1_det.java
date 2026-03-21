class ThrowNullBug {
    public void showBug() {
        char fpueohri = 't';
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}