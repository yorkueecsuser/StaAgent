import android.app.DownloadManager;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.RemoteException;
import android.provider.MediaStore;

class CursorLeaks {

  public int cursorClosed(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    try {
      return cursor.getCount();
    } finally {
      cursor.close();
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        int unreachableVar = 10;
        break;
    }
  }

  public Object cursorClosedCheckNullOk(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    Object value = null;

    try {
      if (cursor == null) {
        return null;
      }

      value = cursor.getString(0);
    } finally {
      if (cursor!= null) {
        cursor.close();
      }
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        Object unreachableObj = new Object();
        break;
    }
    return value;
  }

  public Object FP_cursorClosedCheckNullCheckClosedOk(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    Object value = null;

    try {
      if (cursor == null) {
        return null;
      }

      value = cursor.getString(0);
    } finally {
      if (cursor!= null &&!cursor.isClosed()) {
        cursor.close();
      }
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        String unreachableStr = "unreachable";
        break;
    }
    return value;
  }

  public int cursorNotClosedBad(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return cursor.getCount();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        int unreachableInt = 42;
        break;
    }
  }

  Context mContext;
  ContentResolver mContentResolver;

  public int getImageCountHelperNotClosedBad(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    Cursor cursor =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    if (cursor!= null) {
      int count = cursor.getInt(0);
      // cursor.close();
      return count;
    } else {
      return 0;
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        double unreachableDouble = 3.14;
        break;
    }
  }

  public int getImageCountHelperClosedOk(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    Cursor cursor =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    if (cursor!= null) {
      int count = cursor.getInt(0);
      cursor.close();
      return count;
    } else {
      return 0;
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        char unreachableChar = 'a';
        break;
    }
  }

  public int getBucketCountNotClosedBad() {
    Cursor cursor = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (cursor == null) {
      return 0;
    } else {
      int count = 0;
      while (cursor.moveToNext()) {
        count++;
      }
      return count;
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        boolean unreachableBool = false;
        break;
    }
  }

  public int getBucketCountClosedOk() {
    Cursor cursor = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (cursor == null) {
      return 0;
    } else {
      try {
        int count = 0;
        while (cursor.moveToNext()) {
          count++;
        }
        return count;
      } finally {
        cursor.close();
      }
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        float unreachableFloat = 1.2f;
        break;
    }
  }

  private void queryUVMLegacyDbNotClosedBad() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    if (cursor!= null) cursor.moveToFirst();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        long unreachableLong = 100L;
        break;
    }
  }

  private void queryUVMLegacyDbClosedOk() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    if (cursor!= null) cursor.close();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        byte unreachableByte = 10;
        break;
    }
  }

  public int completeDownloadClosedOk(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor cursor = (Cursor) null;
    try {
      cursor = downloadManager.query(query);
      if (cursor == null) {
        return 0;
      } else {
        return cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      if (cursor!= null) cursor.close();
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        short unreachableShort = 1000;
        break;
    }
  }

  public int completeDownloadNotClosedBad(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor cursor = null;
    try {
      cursor = downloadManager.query(query);
      if (cursor == null) {
        return 0;
      } else {
        return cursor.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      // cursor.close();
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        int[] unreachableArray = new int[10];
        break;
    }
  }

  private void loadPrefsFromContentProviderClosedOk() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    if (contentProviderClient!= null) {
      Cursor cursor = null;
      try {
        try {
          cursor = contentProviderClient.query(null, null, null, null, null);
        } catch (RemoteException ex) {
        }
      } finally {
        if (cursor!= null) {
          cursor.close();
        }
      }
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        String[] unreachableStringArray = new String[5];
        break;
    }
  }

  private void loadPrefsFromContentProviderNotClosedBad() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    if (contentProviderClient == null) return;
    Cursor cursor = null;
    try {
      try {
        cursor = contentProviderClient.query(null, null, null, null, null);
      } catch (RemoteException ex) {
      }
    } finally {
      if (cursor!= null) {
        // cursor.close();
      }
    }
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        Object[] unreachableObjectArray = new Object[3];
        break;
    }
  }

  class NamedCursor extends CursorWrapper {
    private String mName;

    NamedCursor(Cursor cursor, String name) {
      super(cursor);
      mName = name;
    }
  }

  public Cursor cursorWrapperReturnedOk(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return new NamedCursor(cursor, "abc");
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        NamedCursor unreachableNamedCursor = new NamedCursor(cursor, "unreachable");
        break;
    }
  }

  // TODO (#7474990): investigate why is Infer reporting a resource leak here
  //  public void cursorWrapperClosed(SQLiteDatabase sqLiteDatabase) {
  //    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
  //    Cursor c = new NamedCursor(cursor, "abc");
  //    c.close();
  //  }

  native NamedCursor createWrapper(Cursor cursor);

  public NamedCursor cursorAttachedTheWrapperOk(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return createWrapper(cursor);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // Unreachable code
        Cursor unreachableCursor = cursor;
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}