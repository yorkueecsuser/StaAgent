class ComparingThisWithNullDemo {

    public boolean checkIfThisIsNull() {
        // This comparison is always false because 'this' can never be null
        return this == null; // BUG: ComparingThisWithNull
    }

    public boolean checkIfThisIsNotNull() {
        // This comparison is always true because 'this' can never be null
        return this != null; // BUG: ComparingThisWithNull
    }

    public String showBug() {
        boolean isThisNull = checkIfThisIsNull();
        boolean isThisNotNull = checkIfThisIsNotNull();
        return "this == null: " + isThisNull + ", this != null: " + isThisNotNull;
    }

    public static void main(String[] args) {
        ComparingThisWithNullDemo demo = new ComparingThisWithNullDemo();
        System.out.println(demo.showBug());
    }
}