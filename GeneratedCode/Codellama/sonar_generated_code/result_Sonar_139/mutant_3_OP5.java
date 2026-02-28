import java.util.Random;
import java.lang.Math;

class DoubleBitsToDoubleBug {
    public static void main(String[] args) {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }

    public static void showBug() {
        long i = 0x80003800L;
        Double.longBitsToDouble(i);   // BUG: "Double.longBitsToDouble" should take "long" as argument
    }
}

// Mutation Operator: Unreachable switch statement
// Description: Inserting an unreachable switch statement into a randomly selected basic block in the program.
// The switch condition must always evaluate to false to make it unreachable.

// Format:
// switch (<constant>) {
//     case <constant>:
//         <code>
//         break;
// }

// Example:
// switch (false) {
//     case true:
//         System.out.println("This code will never be executed.");
//         break;
// }

// Unreachable switch statement
switch (false) {
    case true:
        System.out.println("This code will never be executed.");
        break;
}