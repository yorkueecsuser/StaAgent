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
  }

  public int cursorNotClosedBad(SQLiteDatabase sqLiteDatabase) {
    Cursor a = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return a.getCount();
  }

  Context mContext;
  ContentResolver mContentResolver;

  public int getImageCountHelperNotClosedBad(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    Cursor b =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    if (b!= null) {
      int count = b.getInt(0);
      // b.close();
      return count;
    } else {
      return 0;
    }
  }

  public int getImageCountHelperClosedOk(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    Cursor c =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    if (c!= null) {
      int count = c.getInt(0);
      c.close();
      return count;
    } else {
      return 0;
    }
  }

  public int getBucketCountNotClosedBad() {
    Cursor d = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (d == null) {
      return 0;
    } else {
      int count = 0;
      while (d.moveToNext()) {
        count++;
      }
      return count;
    }
  }

  public int getBucketCountClosedOk() {
    Cursor e = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (e == null) {
      return 0;
    } else {
      try {
        int count = 0;
        while (e.moveToNext()) {
          count++;
        }
        return count;
      } finally {
        e.close();
      }
    }
  }

  private void queryUVMLegacyDbNotClosedBad() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor f = builder.query(null, null, "", null, null, null, null);
    if (f!= null) f.moveToFirst();
  }

  private void queryUVMLegacyDbClosedOk() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor g = builder.query(null, null, "", null, null, null, null);
    if (g!= null) g.close();
  }

  public int completeDownloadClosedOk(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor h = (Cursor) null;
    try {
      h = downloadManager.query(query);
      if (h == null) {
        return 0;
      } else {
        return h.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      if (h!= null) h.close();
    }
  }

  public int completeDownloadNotClosedBad(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor i = null;
    try {
      i = downloadManager.query(query);
      if (i == null) {
        return 0;
      } else {
        return i.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      // i.close();
    }
  }

  private void loadPrefsFromContentProviderClosedOk() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    if (contentProviderClient!= null) {
      Cursor j = null;
      try {
        try {
          j = contentProviderClient.query(null, null, null, null, null);
        } catch (RemoteException ex) {
        }
      } finally {
        if (j!= null) {
          j.close();
        }
      }
    }
  }

  private void loadPrefsFromContentProviderNotClosedBad() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    if (contentProviderClient == null) return;
    Cursor k = null;
    try {
      try {
        k = contentProviderClient.query(null, null, null, null, null);
      } catch (RemoteException ex) {
      }
    } finally {
      if (k!= null) {
        // k.close();
      }
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
    Cursor l = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return new NamedCursor(l, "abc");
  }

  // TODO (#7474990): investigate why is Infer reporting a resource leak here
  //  public void cursorWrapperClosed(SQLiteDatabase sqLiteDatabase) {
  //    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
  //    Cursor c = new NamedCursor(cursor, "abc");
  //    c.close();
  //  }

  native NamedCursor createWrapper(Cursor cursor);

  public NamedCursor cursorAttachedTheWrapperOk(SQLiteDatabase sqLiteDatabase) {
    Cursor m = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return createWrapper(m);
  }
}