package com.example.data.source.local

import com.example.data.model.SearchedUser
import com.example.data.room.FavoriteDao
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

class UserLocalDataSourceImpl(
    private val favoriteDao: FavoriteDao
) : UserLocalDataSource {

    override fun addFavoriteUser(favoriteUser: SearchedUser): Completable {
        return favoriteDao.setFavoriteMark(favoriteUser)
    }

    override fun deleteFavoriteUser(deletedFavoriteUser: SearchedUser): Completable {
        return favoriteDao.deleteFavoriteUser(deletedFavoriteUser.id)
    }

    //즐겨찾기 목록 모두 가져옴.
    override fun getFavoriteUsers(): Single<List<SearchedUser>> =
        favoriteDao.getFavoriteGitUsers(true)
}