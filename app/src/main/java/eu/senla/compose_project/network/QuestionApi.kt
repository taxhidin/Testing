package eu.senla.compose_project.network

import eu.senla.compose_project.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("posts")
    suspend fun getAllQuestions(): Question
}