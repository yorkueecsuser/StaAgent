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
int wuaqbnki = 0;switch  (wuaqbnki) {case 1:char ttysuolt = 'i';break;default:float kcjwivjs = -302740838;break;}

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