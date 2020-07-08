package com.neu.service;

public interface UserAndMovieStatusService {
    //用户是否在看，想看，看过电影
    int movieAndUserRelationShip(long userId, long movieId, int relationship);
}
