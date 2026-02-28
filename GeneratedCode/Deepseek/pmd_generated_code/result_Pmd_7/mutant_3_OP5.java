import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
        
        if(false){
            // Adding unreachable switch statement
            int value = 1;
            switch(value){
                case 2: System.out.println("Unreachable code"); break;
            }
        }
    }
}