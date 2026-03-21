class ThrowNullBug {
    public void showBug() {
        for  (int cehfhwcb = 0; cehfhwcb < 0; cehfhwcb++) {byte pblqryhy = 79;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}