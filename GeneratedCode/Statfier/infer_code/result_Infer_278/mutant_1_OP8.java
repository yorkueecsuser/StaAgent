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
    Cursor a = sqLiteDatabase.query("events", null, null, null, null, null, null);
    Object value = null;

    try {
      if (a == null) {
        return null;
      }

      value = a.getString(0);
    } finally {
      if (a!= null) {
        a.close();
      }
    }
    return value;
  }

  public Object FP_cursorClosedCheckNullCheckClosedOk(SQLiteDatabase sqLiteDatabase) {
    Cursor b = sqLiteDatabase.query("events", null, null, null, null, null, null);
    Object value = null;

    try {
      if (b == null) {
        return null;
      }

      value = b.getString(0);
    } finally {
      if (b!= null &&!b.isClosed()) {
        b.close();
      }
    }
    return value;
  }

  public int cursorNotClosedBad(SQLiteDatabase sqLiteDatabase) {
    Cursor c = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return c.getCount();
  }

  Context mContext;
  ContentResolver mContentResolver;

  public int getImageCountHelperNotClosedBad(String customClause) {
    String[] projection = {"COUNT(*)"};

    String d = selectionClause = customClause;

    Cursor e =
        mContext.getContentResolver().query(null, projection, d, null, null);

    if (e!= null) {
      int f = e.getInt(0);
      // e.close();
      return f;
    } else {
      return 0;
    }
  }

  public int getImageCountHelperClosedOk(String customClause) {
    String[] projection = {"COUNT(*)"};

    String g = selectionClause = customClause;

    Cursor h =
        mContext.getContentResolver().query(null, projection, g, null, null);

    if (h!= null) {
      int i = h.getInt(0);
      h.close();
      return i;
    } else {
      return 0;
    }
  }

  public int getBucketCountNotClosedBad() {
    Cursor j = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (j == null) {
      return 0;
    } else {
      int k = 0;
      while (j.moveToNext()) {
        k++;
      }
      return k;
    }
  }

  public int getBucketCountClosedOk() {
    Cursor l = MediaStore.Images.Media.query(mContentResolver, null, null, null, null, null);
    if (l == null) {
      return 0;
    } else {
      try {
        int m = 0;
        while (l.moveToNext()) {
          m++;
        }
        return m;
      } finally {
        l.close();
      }
    }
  }

  private void queryUVMLegacyDbNotClosedBad() {
    SQLiteQueryBuilder n = new SQLiteQueryBuilder();
    n.setTables("");
    Cursor o = n.query(null, null, "", null, null, null, null);
    if (o!= null) o.moveToFirst();
  }

  private void queryUVMLegacyDbClosedOk() {
    SQLiteQueryBuilder p = new SQLiteQueryBuilder();
    p.setTables("");
    Cursor q = p.query(null, null, "", null, null, null, null);
    if (q!= null) q.close();
  }

  public int completeDownloadClosedOk(DownloadManager downloadManager) {
    DownloadManager.Query r = new DownloadManager.Query();
    Cursor s = (Cursor) null;
    try {
      s = downloadManager.query(r);
      if (s == null) {
        return 0;
      } else {
        return s.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      if (s!= null) s.close();
    }
  }

  public int completeDownloadNotClosedBad(DownloadManager downloadManager) {
    DownloadManager.Query t = new DownloadManager.Query();
    Cursor u = null;
    try {
      u = downloadManager.query(t);
      if (u == null) {
        return 0;
      } else {
        return u.getColumnIndex(DownloadManager.COLUMN_STATUS);
      }
    } finally {
      // u.close();
    }
  }

  private void loadPrefsFromContentProviderClosedOk() {
    ContentProviderClient v = mContentResolver.acquireContentProviderClient("");
    if (v!= null) {
      Cursor w = null;
      try {
        try {
          w = v.query(null, null, null, null, null);
        } catch (RemoteException ex) {
        }
      } finally {
        if (w!= null) {
          w.close();
        }
      }
    }
  }

  private void loadPrefsFromContentProviderNotClosedBad() {
    ContentProviderClient x = mContentResolver.acquireContentProviderClient("");
    if (x == null) return;
    Cursor y = null;
    try {
      try {
        y = x.query(null, null, null, null, null);
      } catch (RemoteException ex) {
      }
    } finally {
      if (y!= null) {
        // y.close();
      }
    }
  }

  class NamedCursor extends CursorWrapper {
    private String z;

    NamedCursor(Cursor cursor, String name) {
      super(cursor);
      z = name;
    }
  }

  public Cursor cursorWrapperReturnedOk(SQLiteDatabase sqLiteDatabase) {
    Cursor aa = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return new NamedCursor(aa, "abc");
  }

  // TODO (#7474990): investigate why is Infer reporting a resource leak here
  //  public void cursorWrapperClosed(SQLiteDatabase sqLiteDatabase) {
  //    Cursor ab = sqLiteDatabase.query("events", null, null, null, null, null, null);
  //    Cursor ac = new NamedCursor(ab, "abc");
  //    ac.close();
  //  }

  native NamedCursor createWrapper(Cursor cursor);

  public NamedCursor cursorAttachedTheWrapperOk(SQLiteDatabase sqLiteDatabase) {
    Cursor ad = sqLiteDatabase.query("events", null, null, null, null, null, null);
    return createWrapper(ad);
  }
}