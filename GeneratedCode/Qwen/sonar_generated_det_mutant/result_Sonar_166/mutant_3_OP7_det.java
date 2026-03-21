class MethodNamingBug {

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "This is not the toString method";
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public int hashcode() {
boolean hsnlhflz = false;while (hsnlhflz && true && true && false && true && false && false && false && true && false && true && false) {double smajsevb = 159467386;}

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