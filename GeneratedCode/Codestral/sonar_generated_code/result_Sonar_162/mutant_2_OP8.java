class SelfAssignmentBug {
    private String name;

    public void setName(String newName) { // Renamed parameter from 'name' to 'newName'
        name = newName; // Fixed bug here, now correctly assigns to class member variable
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name; // This will now return the correctly updated value of name
    }
}