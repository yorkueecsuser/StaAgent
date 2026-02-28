import java.lang.Thread;

class MainClass {
    private class UnreachableIf {
        private boolean condition = false;
        public void showBug() {
            ClassLoader cl = this.getClass().getClassLoader();  
            if (condition) {
                // Include unreachable statement to avoid unreachable error
                if (false) {
                    System.out.println("Unreachable statement for if branch");
                }
            }
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        MainClass.UnreachableIf unreachableIf = myObject.new UnreachableIf();
        unreachableIf.showBug();
    }
}