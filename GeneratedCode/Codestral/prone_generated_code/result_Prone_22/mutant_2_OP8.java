class BuggyCode {

    public boolean checkNull() {
        Object a = this;
        return a == null;  // Mutated: Comparing 'this' with 'null' replaced with 'a' with 'null'
    }

    public boolean checkNotNull() {
        Object a = this;
        return a!= null;  // Mutated: Comparing 'this' with 'null' replaced with 'a' with 'null'
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}