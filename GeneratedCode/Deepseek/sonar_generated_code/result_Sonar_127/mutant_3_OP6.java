import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // BUG: Inappropriate "Collection" calls should not be made
        list.remove(1);  // This line should cause a compile error because 1 is an integer, not a String.

        // Added unreachable code
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // If statement
            if (false) {
                System.out.println("This code is unreachable.");
            }

            // While loop
            while (false) {
                System.out.println("This code is unreachable.");
            }

            // If-else statement
            boolean shouldRun = false;
            if (shouldRun) {
                System.out.println("This code is unreachable.");
            } else {
                System.out.println("This code is unreachable.");
            }

            // Switch statement
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This code is unreachable.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}