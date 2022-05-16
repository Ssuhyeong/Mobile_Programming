package org.techtown.samplecustomadapter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION=9;

    public DBHelper(Context context){
        super(context, "datadb", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String driverTable="create table tb_drive ("+
                "_id integer primary key autoincrement," +
                "title," +
                "date," +
                "type)";
        db.execSQL(driverTable);
        db.execSQL("insert into tb_drive (title, date, type) values ('리그오브레전드','최종 수정 날짜 : 4월 6일', 'doc')");
        db.execSQL("insert into tb_drive (title, date, type) values ('엘든링','최종 수정 날짜 : 3월 16일', 'file')");
        db.execSQL("insert into tb_drive (title, date, type) values ('엘더스크롤6','최종 수정 날짜 : 4월 8일', 'doc')");
        db.execSQL("insert into tb_drive (title, date, type) values ('스물하나스물다섯','최종 수정 날짜 : 3월 1일', 'img')");
        db.execSQL("insert into tb_drive (title, date, type) values ('나는듀엣','최종 수정 날짜 : 2월 24일', 'file')");
        db.execSQL("insert into tb_drive (title, date, type) values ('쭈꾸미게임','최종 수정 날짜 : 11월 6일', 'doc')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion == DATABASE_VERSION){
            db.execSQL("drop table tb_drive");
            onCreate(db);
        }
    }
}
