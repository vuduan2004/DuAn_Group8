package duanvdph37524.fpoly.techstore_group8.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "TechStore", null, 31);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableDienThoai = "CREATE TABLE DienThoai(maDT INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", tenDienThoai STRING NOT NULL," +
                "hinhAnh STRING NOT NULL," +
                "giaTien INTEGER NOT NULL)";
        db.execSQL(createTableDienThoai);
        db.execSQL("insert into DienThoai values(1,'Realme 11 Pro 5G 8GB-256GB'," +
                "'https://cdn-amz.woka.io/images/I/71l0zudEC9L.SS400.jpg'" +
                ",11990000)," +
                "(2,'iPhone 15 Pro Max 256GB','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Fdtiphone.png?alt=media&token=1eea6465-c85a-4f7a-b40b-33d70611eb8a',34990000)" +
                ",(3,'Samsung Galaaxy S20  FR 256GB','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Fdtsamsung.png?alt=media&token=224b2707-eff3-4901-908a-424be2b9ca50',1449000)" +
                ",(4,'OPPO Find N3 Flip 5G 12GB-256GB','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Fdtoppo.jpg?alt=media&token=00ee1a3c-2bd2-47ce-b2cb-ef5c07a07568',11990000)");
//        String createTableLoaiSanPham = "CREATE TABLE LoaiSanPham(maLoai STRING PRIMARY KEY" +
//                ", tenLoai STRING NOT NULL" +
//                ",hinhAnhLoai STRING NOT NULL)";
//        db.execSQL(createTableLoaiSanPham);
//        db.execSQL("INSERT INTO LoaiSanPham VALUES ('1','Điện thoại','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2FatvPhone%201.png?alt=media&token=b0690012-09a0-4302-a843-c2c668125a1f')" +
//                ",('2','Máy tính','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Fdongho1.png?alt=media&token=03c2d3cd-d051-478f-af77-bff6c9390773')" +
//                ",('3','Đồng hồ','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Flaptop2.png?alt=media&token=dbe82c27-f6a0-4eb3-b01a-9f82be897a15')");
//
//        String createTableSanPham = "CREATE TABLE SanPham(maSanPham INTEGER PRIMARY KEY AUTOINCREMENT," +
//                "maLoai STRING REFERENCES LoaiSanPham(maLoai)," +
//                "tenSanPham STRING NOT NULL," +
//                "hinhAnh STRING NOT NULL," +
//                "giaTien INTEGER NOT NULL)";
//        db.execSQL(createTableSanPham);
//        db.execSQL("INSERT INTO SanPham VALUES(1,'1','Realme 11 Pro 5G 8GB-256GB','https://cdn-amz.woka.io/images/I/71l0zudEC9L.SS400.jpg',11990000)" +
//                ",(2,'1','iPhone 15 Pro Max 256GB','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Fdtiphone.png?alt=media&token=1eea6465-c85a-4f7a-b40b-33d70611eb8a',34990000)" +
//                ",(3,'2','MacBook Pro 14 inch M1 Pro 2021','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Fmacbook.jpg?alt=media&token=16490d01-a09c-4c61-9c6d-1b62bb5096cf',47490000)" +
//                ",(4,'3','Apple Watch Series 6 GPS 44mm','https://firebasestorage.googleapis.com/v0/b/teststore-1660c.appspot.com/o/imageDienThoai%2Fsmw.jpg?alt=media&token=bdb882ed-46b4-4944-a99a-97cc07461e7e',12490000)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        if (i !=i1){
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS NGUOIDUNG");
        }

    }
}
