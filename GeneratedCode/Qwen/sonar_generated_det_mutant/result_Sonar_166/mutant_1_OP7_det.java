class MethodNamingBug {

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public String tostring() {
        return "This is not the toString method";
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public int hashcode() {
        return 42;
    }

    // BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public boolean equal(Object obj) {
boolean bunoieer = false;while (bunoieer && true && true && true && false && true && true && false && false && false && false && false) {int znyvpasn = 678757781;}

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