// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        /*
        The mutation operator name is Unreachable if statement.
        The mutation operator description is that of inserting unreachable if branch into a randomly selected basic block in the program. 
        The condition of the inserted branch is always false to make it unreachable.
        */
        if (false) {
            // unreachable block of code
        }
    }
}