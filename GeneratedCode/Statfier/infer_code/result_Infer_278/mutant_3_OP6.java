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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
    return value;
  }

  public int cursorNotClosedBad(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return cursor.getCount();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private void queryUVMLegacyDbNotClosedBad() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    if (cursor!= null) cursor.moveToFirst();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private void queryUVMLegacyDbClosedOk() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    if (cursor!= null) cursor.close();
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable for loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}