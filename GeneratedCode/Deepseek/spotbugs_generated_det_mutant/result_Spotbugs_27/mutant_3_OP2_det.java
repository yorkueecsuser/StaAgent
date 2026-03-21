import java.lang.Object;

class BuggyCode {
    class BuggyClass {
        class InnerClass {
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        }
        public boolean equals(BuggyClass obj) {
            return super.equals(obj);
        }
    }
public void showBug() {
    BuggyClass bc1 = new BuggyClass();
    bc1 = new BuggyClass();
    BuggyClass bc2 = new BuggyClass();
    System.out.println(bc1.equals(bc2));
}
}