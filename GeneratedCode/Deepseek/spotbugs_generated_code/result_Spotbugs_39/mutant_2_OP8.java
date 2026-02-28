class EqualBugExample {
    private String userName;

    public EqualBugExample(String userName) {
        this.userName = userName;
    }

    // Original bug remains as is
    public boolean equal(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        EqualBugExample that = (EqualBugExample) obj;
        return userName!= null? userName.equals(that.userName) : that.userName == null;
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equal(other));
        System.out.println("Equals method result: " + equals(other));
    }
}