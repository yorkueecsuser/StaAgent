class BuggyCode {
    private String value;
    private String temp; // Mutation: Renamed variable

    public void setValue(String temp) {
        this.value = temp; // Mutation: Renamed variable in method parameter
    }

    public String showBug() {
        try {
            return value.toString();
        } catch (NullPointerException e) {
            // value is guaranteed to be null here, and it is dereferenced in the next line
            temp = value; // Mutation: Renamed variable
            return temp.substring(1);
        }
    }
}