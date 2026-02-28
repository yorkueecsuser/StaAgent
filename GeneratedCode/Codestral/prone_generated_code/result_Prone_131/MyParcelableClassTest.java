import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Parcel;
import java.io.Parcelable;

public class MyParcelableClassTest {
    @Test(expected = RuntimeException.class)
    public void showBugTest() {
        // TRIGGER BUG: ParcelableCreator
        MyParcelableClass.showBug(10);
    }
}