import static org.junit.Assert.*;
import org.junit.Test;

import android.os.Parcel;

public class BugExampleTest {

    static class BuggyClass implements Parcelable {
        // BUG: ParcelableCreator
        // There is no CREATOR field in this class
        private int importantData;

        public BuggyClass(int importantData) {
            this.importantData = importantData;
        }

        private BuggyClass(Parcel in) {
            importantData = in.readInt();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(importantData);
        }

        public static final Parcelable.Creator<BuggyClass> CREATOR = new Parcelable.Creator<BuggyClass>() {
            public BuggyClass createFromParcel(Parcel in) {
                return new BuggyClass(in);
            }

            public BuggyClass[] newArray(int size) {
                return new BuggyClass[size];
            }
        };
    }

    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample();
        BuggyClass buggyClass = (BuggyClass) bugExample.showBug();
        assertEquals(42, buggyClass.importantData);
    }
}