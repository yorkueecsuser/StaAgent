public int showBug() {
    Object other = new String();
    MyClass thisClass = new MyClass(10);
    thisClass.equals(other); // This will throw ClassCastException
    if (false) {
        return thisClass.value; // This line will never execute normally
    }
    return thisClass.value; // This line will execute normally
}