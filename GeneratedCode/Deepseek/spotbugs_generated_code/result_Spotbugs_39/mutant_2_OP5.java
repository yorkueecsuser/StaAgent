class EqualBugExample {
    private String name;
    private boolean alwaysFalse = false;

    public EqualBugExample(String name) {
        this.name = name;
    }

    // BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    public boolean equal(Object obj) {
        if (alwaysFalse) {
            int value = 0;
            switch (value) {
                case 1:
                    // This case will never be executed
                    System.out.println("This is an unreachable case");
                    break;
            }
        }
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        EqualBugExample that = (EqualBugExample) obj;
        return name!= null? name.equals(that.name) : that.name == null;
    }

    public void showBug(EqualBugExample other) {
        System.out.println("Equal method result: " + equal(other));
        System.out.println("Equals method result: " + equals(other));
    }
}