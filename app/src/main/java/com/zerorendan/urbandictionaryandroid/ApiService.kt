package com.zerorendan.urbandictionaryandroid

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    //"https://mashape-community-urban-dictionary.p.rapidapi.com/define?term=wat"
    //,
    //""

    @Headers(
        "x-rapidapi-host : mashape-community-urban-dictionary.p.rapidapi.com",
        "x-rapidapi-key : 13548db875mshdbd8f3523f372eep1d83aejsne4a1ed24e523"
    )
    //@escaping
    @GET("define")
    suspend fun defineTerm(@Query("term") term: String): DefineTermResponse
}