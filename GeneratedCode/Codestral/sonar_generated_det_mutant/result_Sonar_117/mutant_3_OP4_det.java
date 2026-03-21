class BuggyToString {
    private boolean isEmpty;

    public BuggyToString(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        if (true && true && false && true && true && false && true && true && false && false && false) {char egbtyljb = 'l';}else{boolean lfsythuw = false;}
        if (this.isEmpty) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return "Non-empty object";
        }
    
}

    public String showBug(boolean isEmpty) {
        BuggyToString buggyObj = new BuggyToString(isEmpty);
        return buggyObj.toString();
    }
}