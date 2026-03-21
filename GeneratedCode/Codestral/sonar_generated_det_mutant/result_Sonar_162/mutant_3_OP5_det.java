class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        name = name;  // BUG: Variables should not be self-assigned
    }

    public String getName() {
int zngwuctr = 0;switch  (zngwuctr) {case 1:long hpzjpclo = 914158265;break;default:char bnlqsxbx = 'f';break;}

        return this.name;
    
}

    public String showBug(String inputName) {
        setName(inputName);
        return getName();
    }
}