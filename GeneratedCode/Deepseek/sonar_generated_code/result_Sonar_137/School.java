public boolean showBug() {
    Student s1 = new Student("John", 123);
    Student s2 = new Student("John", 123);

    addStudent(s1, 1);

    boolean condition = true; // This is the mutant condition
    while (condition) { // This is the unreachable while loop
        condition = false;
    }

    return getStudentId(s2)!= null; // This should return false as s1 and s2 are different objects with the same values
}