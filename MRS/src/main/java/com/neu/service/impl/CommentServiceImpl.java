package com.neu.service.impl;

import com.neu.dao.CommentDao;
import com.neu.model.Comment;
import com.neu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> getMovieComments(long movieId) {
        return commentDao.getMovieComments(movieId);
    }

    @Override
    public List<Comment> showCommentByTimeOrStar(long movieId, String order) {
        return null;
    }

    @Override
    public List<Comment> moreComment(long movieId, int page) {
        return null;
    }

    @Override
    public int addStarToComment(long userId, long commentId, long userToCommentId) {
        return 0;
    }
}
