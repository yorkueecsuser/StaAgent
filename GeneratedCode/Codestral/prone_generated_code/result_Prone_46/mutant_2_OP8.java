class EqualsNullBug {
    private String temp;

    public EqualsNullBug(String temp) {
        this.temp = temp;
    }

    @Override
    public boolean equals(Object obj) {
        if (temp.equals(null)) { // Mutated: variable 'value' renamed to 'temp'
            return true;
        }
        if (!(obj instanceof EqualsNullBug)) {
            return false;
        }
        EqualsNullBug other = (EqualsNullBug) obj;
        return temp.equals(other.temp); // Mutated: variable 'value' renamed to 'temp'
    }

    public void showBug(String testTemp) { // Mutated: variable 'testValue' renamed to 'testTemp'
        EqualsNullBug buggyObject = new EqualsNullBug(testTemp);
        System.out.println(buggyObject.equals(null));
    }

    public static void main(String[] args) {
        EqualsNullBug buggyObject = new EqualsNullBug("test");
        buggyObject.showBug(null);
    }
}