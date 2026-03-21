class BugExample {
public static void main(String [] args){
    BugExample bug = new BugExample();
    bug = new BugExample();
    System.out.println(bug.showBug());
}

    public float showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = num1 + num2;
        return result; // The result of this operation is supposed to be imprecise but Java rounds it to a 32-bit float
    }
}