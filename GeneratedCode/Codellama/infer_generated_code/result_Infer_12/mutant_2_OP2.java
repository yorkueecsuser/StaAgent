import com.facebook.infer.annotation.ThreadSafe;
import javax.annotation.Nullable;

@ThreadSafe
class NullPointerExample {
    public static class Helper {
        public void doSomething() {
            System.out.println("Doing something...");
        }
    }

    @Nullable
    public Helper getHelper(boolean returnNull) {
        if (returnNull) {
            return null;
        }
        return new Helper();
    }

    public void showBug() {
        new NullPointerExample().getHelper(true).doSomething(); // BUG: NULLPTR_DEREFERENCE
    }
}

// Mutation Operator name: Duplication
// Mutation Operator description: Duplicating a randomly selected assignment statement and insert immediately after its current location. To avoid side effect, the applicable assignment statement is limited to the ones without using method invocation

// Format your response as follows:
// 1. Provide the Java code enclosed in triple backticks
// The following section outlines the format of output the generated Java code: