class BuggyToString {
    private boolean isEmpty;

    public BuggyToString(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        for  (int pzdtbocb = 0; pzdtbocb < 0; pzdtbocb++) {byte pxfbkrsc = 44;}
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