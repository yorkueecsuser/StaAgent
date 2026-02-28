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
    // Mutant: Dead Store
    String qvbnrhty = "unusedVariable";
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
    return value;
    // Mutant: Dead Store
    int wjxvbnrt = 42;
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
    return value;
    // Mutant: Dead Store
    boolean ftrhtyui = true;
  }

  public int cursorNotClosedBad(SQLiteDatabase sqLiteDatabase) {
    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return cursor.getCount();
    // Mutant: Dead Store
    double jkzxcvbn = 3.14;
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
    // Mutant: Dead Store
    char rhtyuiop = 'a';
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
    // Mutant: Dead Store
    long yuioplkj = 123456789L;
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
    // Mutant: Dead Store
    float zxcvbnmr = 2.71f;
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
    // Mutant: Dead Store
    short asdfghjk = 100;
  }

  private void queryUVMLegacyDbNotClosedBad() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    if (cursor!= null) cursor.moveToFirst();
    // Mutant: Dead Store
    byte poiuytrew = 8;
  }

  private void queryUVMLegacyDbClosedOk() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor cursor = builder.query(null, null, "", null, null, null, null);
    if (cursor!= null) cursor.close();
    // Mutant: Dead Store
    int lkjhgfds = 56;
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
    // Mutant: Dead Store
    String tyuiopas = "anotherUnusedVar";
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
    // Mutant: Dead Store
    boolean qwertyui = false;
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
    // Mutant: Dead Store
    double mnbvcxz = 1.618;
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
    // Mutant: Dead Store
    long cvbnmkl = 987654321L;
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
    // Mutant: Dead Store
    int hjklpoiuy = 77;
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
    // Mutant: Dead Store
    char bnmrhtyu = 'b';
  }
}