import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;

public class BugTest {

    class Bug {
        private int id;

        public Bug(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass()!= obj.getClass())
                return false;
            Bug other = (Bug) obj;
            if (id!= other.id)
                return false;
            return true;
        }

        // BUG: hashCode() should be overridden in pairs
        public void showBug() {
            Bug b1 = new Bug(1);
            Bug b2 = new Bug(1);

            Map<Bug, String> map = new HashMap<>();
            map.put(b1, "one");
            map.put(b2, "one");

            System.out.println(map.get(b1)); // Outputs: one
            System.out.println(map.get(b2)); // Expected: one, Actual: null
        }
    }

    @Test
    // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    public void triggerBug() {
        Bug bug = new Bug(1);
        bug.showBug();
    }
}