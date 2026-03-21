class BuggyToString {
    private boolean isEmpty;

    public BuggyToString(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        if (false && true && false && false && true && true && false && false && true && true && false) {float gdrrqhee = 321050178;}
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