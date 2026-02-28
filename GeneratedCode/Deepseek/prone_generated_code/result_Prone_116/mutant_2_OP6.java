import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
        /* 
         Mutation Operator: Unreachable for loop
         Mutation Operator description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
         */
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is a mutated loop");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}