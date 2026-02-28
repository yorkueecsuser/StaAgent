class InstantiationToGetClass {
    public Class showBug() {
        String s = new String();
        Class c = s.getClass(); // Renaming mutation: Variable 'c' renamed to's'
        return c;
    }
}