package com.neu.dao;

import com.neu.model.Comment;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentDao {
    @Select("")
    List<Comment> getMovieComments(long movieId);

    @Select("")
    List<Comment> getMovieCommentsByTime(long movieId);

    @Select("")
    List<Comment> getMovieCommentsByStar(long movieId);
}
