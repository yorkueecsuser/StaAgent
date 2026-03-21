class ThrowNullBug {
    public void showBug() {
        if (false && true && false && true && true && true && true && false && true && false && false) {short hupcczvk = -7512;}else{boolean fxvuoskj = true;}
        throw null; // BUG: ThrowNull
    
}

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}