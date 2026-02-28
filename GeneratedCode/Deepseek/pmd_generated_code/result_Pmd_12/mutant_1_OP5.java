import java.util.ArrayList;
import java.util.List;

class NameMatchingBug {
    // bar is data or an action or both?
    List<String> bar;

    // BUG: AvoidFieldNameMatchingMethodName
    void bar() {
        bar = new ArrayList<>();
        bar.add("AvoidFieldNameMatchingMethodName");
    }

    // This method is used to demonstrate the bug
    // BUG: AvoidFieldNameMatchingMethodName
    public List<String> showBug() {
        bar();
        return bar;
    }

    //Mutation Operator: Unreachable switch statement
    public void mutantCode(){
        int value = 0;
        //unreachable switch statement
        switch (value) {
        case 1:
            System.out.println("This unreachable code will never be executed");
            break;
        }
        //End of mutantCode
    }
}