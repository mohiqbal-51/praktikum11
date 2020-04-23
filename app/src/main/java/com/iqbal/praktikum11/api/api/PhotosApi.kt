package com.iqbal.praktikum11.api.api

import com.iqbal.praktikum11.api.model.Photo
import io.reactivex.Single
import retrofit2.http.GET

interface PhotosApi {
    @GET("photos")
    fun getPhotos(): Single<List<Photo>>
}