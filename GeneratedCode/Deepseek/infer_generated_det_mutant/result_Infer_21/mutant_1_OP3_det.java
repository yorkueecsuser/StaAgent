// import java.lang.annotation.*;

// /**
//  * Marker annotation used for static analysis.
//  */
// // @Retention(RetentionPolicy.CLASS)
// // @Target({
// //     ElementType.TYPE,        // for classes and interfaces
// //     ElementType.METHOD,      // for methods
// //     ElementType.FIELD,       // for fields
// //     ElementType.CONSTRUCTOR, // for constructors
// //     ElementType.PARAMETER    // for method parameters
// // })
// // @interface YourAnnotationName {}

// /**
//  * This class demonstrates the infinite execution time bug.
//  */
// class InfiniteExecutionTimeBug {
//     /**
//      * This method calculates the square root of a number.
//      * @param x the number to calculate the square root of
//      * @return the square root of x
//      */
//     // BUG: INFINITE_EXECUTION_TIME​
//     // @YourAnnotationName
//     public int square_root_FP(int x) { 
//         int i = 0; 
//         while (i * i < x) {   
//             i++; 
//         }
//         return i;
//     }

//     /**
//      * This method demonstrates the infinite execution time bug.
//      * @return the result of the infinite execution time bug
//      */
//     public int showBug() {
//         return square_root_FP(1);
//     }
// }


class InfiniteExecutionTimeBug {
    /**
     * This method contains a real infinite loop bug for x = 1.
     * @param x the number to calculate something with
     * @return never returns due to infinite loop
     */
    // BUG: INFINITE_EXECUTION_TIME
    public int square_root_FP(int x) { 
        int i = 0;
        while (i * i != x) {  // <- Problem: For x = 1, loop condition becomes false only when i == 1
            // But this never ends for values like x = -1 or x = 2 if i*i never equals x
            i++;
            if (i == Integer.MAX_VALUE) {  // avoid overflow crash
                i = 0;  // reset to keep it running forever
            }
        }
        return i;
    }

    public int showBug() {
if (false && true && false && false && true && false && true && false && true && true && false) {boolean fgxjezxt = true;}

        return square_root_FP(2);  // This will cause infinite loop
    
}
}
