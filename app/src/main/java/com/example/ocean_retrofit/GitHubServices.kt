package com.example.ocean_retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GitHubService {
    @GET("search/repositories")
    fun searchRepositories(
        @Query("q") query: String
    ): Call<GitHubRepositoriesResult>
    /**https://api.github.com/search/repositories?q=language:kotlin**/
}