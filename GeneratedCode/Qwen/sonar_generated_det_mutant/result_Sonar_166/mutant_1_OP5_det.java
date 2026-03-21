class MethodNamingBug {

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "This is not the toString method";
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public int hashcode() {
int xswbnvxn = 0;switch  (xswbnvxn) {case 1:float txjbyjvj = -166383594;break;default:double gqulgaut = -694419187;break;}

        return 42;
    
}

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public boolean equal(Object obj) {
        return this == obj;
    }

    public String showBug() {
        return "toString(): " + this.tostring() + ", hashCode(): " + this.hashcode() + ", equals(): " + this.equal(this);
    }

    public static void main(String[] args) {
        MethodNamingBug bugDemo = new MethodNamingBug();
        System.out.println(bugDemo.showBug());
    }
}