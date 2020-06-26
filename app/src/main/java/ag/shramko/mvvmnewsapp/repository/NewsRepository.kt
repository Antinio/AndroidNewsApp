package ag.shramko.mvvmnewsapp.repository

import ag.shramko.mvvmnewsapp.api.RetrofitInstance
import ag.shramko.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}