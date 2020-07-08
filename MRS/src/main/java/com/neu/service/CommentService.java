package com.neu.service;

import com.neu.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getMovieComments(long movieId);            //获取comment
    List<Comment> showCommentByTimeOrStar(long movieId, String order);           //按时间排序
    List<Comment> moreComment(long movieId, int page);                 //更多comment
    int addStarToComment(long userId, long commentId, long userToCommentId);//comment点赞
}
