package com.neu.dao;

import com.neu.model.Movie;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MovieDao {
    @Insert("")
    void insert(Movie movie);

    @Delete("")
    void delete(long id);

    @Update("")
    void update(long id);

    @Select("")
    Movie selectById(long id);

}
