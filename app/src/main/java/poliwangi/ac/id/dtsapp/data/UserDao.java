package poliwangi.ac.id.dtsapp.data;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;


public interface UserDao {
    @Query("Select * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE username IN (:usernameList)")
    List<User> loadAllByIds(String[] usernameList);

    @Query("SELECT * FROM user LIMIT 1")
    User selectOne();



}
