import java.util.List;
import java.util.ArrayList;

class Bugs {
    private List<Object> list = new ArrayList<>();

    @Override
    protected void finalize() {
        // BUG: FinalizeDoesNotCallSuperFinalize
        // The finalize() method does not call super.finalize()
        // This is a violation of the Java API specification
        // and can lead to unexpected behavior
        System.out.println("Finalizing...");
        list.clear();
    }

    public void showBug() {
        list.add(new Object());
        System.gc();
    }

    // Mutation Operator: Renaming
    // Description: Renaming user-defined variables declared in a program.
    // If there exist multiple variables, we randomly select one for the mutation.
    // The new name of the variable will be in the form of [a-z].
    // Core Requirements:
    // 1. Generated mutated Java code MUST maintain the original code
    // 2. Generated mutated Java code MUST compile successfully
    // 3. Mutant code being added MUST be unique not generic
    // 4. Generated mutated Java code MUST maintain all original import and package statements
    // 5. Generated mutated Java code MUST avoid unreachable statement error
    //
    // Original Code:
    // import java.util.List;
    // import java.util.ArrayList;
    //
    // class Bugs {
    //     private List<Object> list = new ArrayList<>();
    //
    //     @Override
    //     protected void finalize() {
    //         // BUG: FinalizeDoesNotCallSuperFinalize
    //         // The finalize() method does not call super.finalize()
    //         // This is a violation of the Java API specification
    //         // and can lead to unexpected behavior
    //         System.out.println("Finalizing...");
    //         list.clear();
    //     }
    //
    //     public void showBug() {
    //         list.add(new Object());
    //         System.gc();
    //     }
    // }
    //
    // Mutated Code:
    // import java.util.List;
    // import java.util.ArrayList;
    //
    // class Bugs {
    //     private List<Object> q = new ArrayList<>();
    //
    //     @Override
    //     protected void finalize() {
    //         // BUG: FinalizeDoesNotCallSuperFinalize
    //         // The finalize() method does not call super.finalize()
    //         // This is a violation of the Java API specification
    //         // and can lead to unexpected behavior
    //         System.out.println("Finalizing...");
    //         q.clear();
    //     }
    //
    //     public void showBug() {
    //         q.add(new Object());
    //         System.gc();
    //     }
    // }
}