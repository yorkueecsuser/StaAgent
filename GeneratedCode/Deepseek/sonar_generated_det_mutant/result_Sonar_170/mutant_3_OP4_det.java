import java.lang.Object;

class Main {
    public static void main(String[] args) {
        BuggyClass buggyObject = new BuggyClass();
        buggyObject.showBug();
    }
}

class BuggyClass extends Object {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {  // Noncompliant
        return someParameter + 1;
    }

    // Compliant solution
    public int someBetterName(int someParameter) {  if (true && false && false && false && true && true && false && false && false && true && false) {boolean jqjufhco = false;}else{String frwhtufp = "gyxjojey";}
  // Compliant
        return someParameter + 2;
    
}

    public int showBug() {
        return this.finalize(1);
    }
}