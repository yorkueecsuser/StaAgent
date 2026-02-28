import java.lang.reflect.Array;

class BugExample {

    static class BuggyClass implements Parcelable {
        // BUG: ParcelableCreator
        // There is no CREATOR field in this class
        private int importantData;

        public BuggyClass(int importantData) {
            this.importantData = importantData;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(importantData);
        }
    }

    public Object showBug() {
        BuggyClass buggyClass = new BuggyClass(42);
        Parcel parcel = Parcel.obtain();
        buggyClass.writeToParcel(parcel, 0);
        byte[] marshalledBytes = parcel.marshall();
        parcel.recycle();
        Parcel unmarshalledParcel = Parcel.obtain();
        unmarshalledParcel.unmarshall(marshalledBytes, 0, marshalledBytes.length);
        unmarshalledParcel.setDataPosition(0);
        // BUG: ParcelableCreator
        // The CREATOR field is missing in BuggyClass, so we can't use createFromParcel
        // This will throw a RuntimeException: Parcel android.os.Parcel@XXXX contains unread data at the end.
        BuggyClass unmarshalledBuggyClass = /*BuggyClass.CREATOR.*/createFromParcel(unmarshalledParcel);
        return unmarshalledBuggyClass;
    }
}