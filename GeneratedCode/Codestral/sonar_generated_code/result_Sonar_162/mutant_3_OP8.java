class SelfAssignmentBug {
    private String name;
    private String r;  //Mutated: renaming user-defined variable 'name' to 'r'

    public void setName(String name) {
        r = name; // Mutated: Assigning the value to the renamed variable 'r'
    }

    public String showBug(String inputName) {
        setName(inputName);
        return r; // Mutated: Returning the renamed variable 'r'
    }
}