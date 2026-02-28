class MisleadingMethodNames {

    public String tostring() { // BUG: Methods should not be named "tostring", "hashcode" or "equal"
        return "This is a misleading method name!";
    }

    public int hashcode() { // BUG: Methods should not be named "tostring", "hashcode" or "equal"
        return 42;
    }

    public boolean equal(Object obj) { // BUG: Methods should not be named "tostring", "hashcode" or "equal"
        return this == obj;
    }

    public String showBug() {
        MisleadingMethodNames example = new MisleadingMethodNames();
        String result = "tostring(): " + example.tostring() + "\n";
        result += "hashcode(): " + example.hashcode() + "\n";
        result += "equal(): " + example.equal(new MisleadingMethodNames()) + "\n";
        return result;
    }

    public static void main(String[] args) {
        MisleadingMethodNames demo = new MisleadingMethodNames();
        System.out.println(demo.showBug());
    }
}