class InstanceOfBugExample {

    public String showBug(Object obj) {
        // This is an unnecessary type check because we know obj is always a String
        short dniqpiho = -8868;
        if (obj instanceof String) { // BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
            return "Object is a String: " + obj.toString();
        } else {
            return "Object is not a String";
        }
    
}

    public static void main(String[] args) {
        InstanceOfBugExample example = new InstanceOfBugExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}