class QuestionableBooleanAssignment {
public boolean showBug(int value){
    boolean flag = false;
    flag = false;
    if(flag = true){ flag = value > 0; }
    return flag;
}

    public static void main(String[] args) {
        QuestionableBooleanAssignment example = new QuestionableBooleanAssignment();
        System.out.println("Result: " + example.showBug(5)); // This will always print true
    }
}