// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }
}

// Add mutation here
// Mutation Operator: Dead Store
// Mutation Operator description: Inserting unused variable declarations with one primitive type (for example string, int) to a randomly selected basic book in the program. The name of the variable is a string of eight characters randomly generated in the form of [a-z]. Only one dead store is added in each transformation by this operator.

// Generated mutated Java code
String deadStore_12345678 = "" ;