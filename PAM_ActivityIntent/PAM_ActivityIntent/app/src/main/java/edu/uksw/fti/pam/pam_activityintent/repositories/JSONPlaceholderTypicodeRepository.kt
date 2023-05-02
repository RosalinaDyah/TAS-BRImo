package edu.uksw.fti.pam.pam_activityintent.repositories

import edu.uksw.fti.pam.pam_activityintent.models.TodosModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface JSONPlaceholderTypicodeRepository {
    @GET("user")
    suspend  fun getTodos(): List<TodosModel>

    companion object {
        var _apiClient : JSONPlaceholderTypicodeRepository? = null

         fun getClient(): JSONPlaceholderTypicodeRepository {
            if (_apiClient == null) {
                _apiClient = Retrofit.Builder()
                    .baseUrl("http://192.168.1.15:3000/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(JSONPlaceholderTypicodeRepository::class.java)

            }
            return _apiClient!!;
        }
    }
}