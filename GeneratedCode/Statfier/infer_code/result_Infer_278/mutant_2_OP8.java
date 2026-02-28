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
    Cursor x = sqLiteDatabase.query("events", null, null, null, null, null, null);
    Object value = null;

    try {
      if (x == null) {
        return null;
      }

      value = x.getString(0);
    } finally {
      if (x!= null) {
        x.close();
      }
    }
    return value;
  }

  public Object FP_cursorClosedCheckNullCheckClosedOk(SQLiteDatabase sqLiteDatabase) {
    Cursor y = sqLiteDatabase.query("events", null, null, null, null, null, null);
    Object value = null;

    try {
      if (y == null) {
        return null;
      }

      value = y.getString(0);
    } finally {
      if (y!= null &&!y.isClosed()) {
        y.close();
      }
    }
    return value;
  }

  public int cursorNotClosedBad(SQLiteDatabase sqLiteDatabase) {
    Cursor z = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return z.getCount();
  }

  Context mContext;
  ContentResolver mContentResolver;

  public int getImageCountHelperNotClosedBad(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    Cursor w =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    if (w!= null) {
      int count = w.getInt(0);
      // w.close();
      return count;
    } else {
      return 0;
    }
  }

  public int getImageCountHelperClosedOk(String customClause) {
    String[] projection = {"COUNT(*)"};

    String selectionClause = selectionClause = customClause;

    Cursor v =
        mContext.getContentResolver().query(null, projection, selectionClause, null, null);

    if (v!= null) {
      int count = v.getInt(0);
      v.close();
      return count;
    } else {
      return 0;
    }
  }

  public int getBucketCountNotClosedBad() {
    Cursor u = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (u == null) {
      return 0;
    } else {
      int count = 0;
      while (u.moveToNext()) {
        count++;
      }
      return count;
    }
  }

  public int getBucketCountClosedOk() {
    Cursor t = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (t == null) {
      return 0;
    } else {
      try {
        int count = 0;
        while (t.moveToNext()) {
          count++;
        }
        return count;
      } finally {
        t.close();
      }
    }
  }

  private void queryUVMLegacyDbNotClosedBad() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor s = builder.query(null, null, "", null, null, null, null);
    if (s!= null) s.moveToFirst();
  }

  private void queryUVMLegacyDbClosedOk() {
    SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
    builder.setTables("");
    Cursor r = builder.query(null, null, "", null, null, null, null);
    if (r!= null) r.close();
  }

  public int completeDownloadClosedOk(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor q = (Cursor) null;
    try {
      q = downloadManager.query(query);
      if (q == null) {
        return 0;
      } else {
        return q.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      if (q!= null) q.close();
    }
  }

  public int completeDownloadNotClosedBad(DownloadManager downloadManager) {
    DownloadManager.Query query = new DownloadManager.Query();
    Cursor p = null;
    try {
      p = downloadManager.query(query);
      if (p == null) {
        return 0;
      } else {
        return p.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      // p.close();
    }
  }

  private void loadPrefsFromContentProviderClosedOk() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    if (contentProviderClient!= null) {
      Cursor o = null;
      try {
        try {
          o = contentProviderClient.query(null, null, null, null, null);
        } catch (RemoteException ex) {
        }
      } finally {
        if (o!= null) {
          o.close();
        }
      }
    }
  }

  private void loadPrefsFromContentProviderNotClosedBad() {
    ContentProviderClient contentProviderClient = mContentResolver.acquireContentProviderClient("");
    if (contentProviderClient == null) return;
    Cursor n = null;
    try {
      try {
        n = contentProviderClient.query(null, null, null, null, null);
      } catch (RemoteException ex) {
      }
    } finally {
      if (n!= null) {
        // n.close();
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
    Cursor m = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return new NamedCursor(m, "abc");
  }

  // TODO (#7474990): investigate why is Infer reporting a resource leak here
  //  public void cursorWrapperClosed(SQLiteDatabase sqLiteDatabase) {
  //    Cursor cursor = sqLiteDatabase.query("events", null, null, null, null, null, null);
  //    Cursor c = new NamedCursor(cursor, "abc");
  //    c.close();
  //  }

  native NamedCursor createWrapper(Cursor cursor);

  public NamedCursor cursorAttachedTheWrapperOk(SQLiteDatabase sqLiteDatabase) {
    Cursor l = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return createWrapper(l);
  }
}