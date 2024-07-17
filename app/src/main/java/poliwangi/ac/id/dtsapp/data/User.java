package poliwangi.ac.id.dtsapp.data;

import android.support.annotation.NonNull;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import  android.arch.persistence.room.ColumnInfo;



@Entity
public class User {

    @PrimaryKey
    @NonNull
    public String username ;

    @ColumnInfo(name = "password")
    public  String password;

    @ColumnInfo(name = "email")
    public  String email;

    @ColumnInfo(name = "phone_number")
    public  String phoneNumber;

}
