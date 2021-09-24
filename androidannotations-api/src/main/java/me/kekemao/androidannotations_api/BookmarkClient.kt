//package me.kekemao.androidannotations_api
//
//import org.androidannotations.rest.spring.annotations.Get
//import org.androidannotations.rest.spring.annotations.Path
//import org.androidannotations.rest.spring.annotations.Rest
//
//
///**
// * @author kekemao00@gmail.com
// * @date 2021/9/24 4:19 下午
// */
//@Rest(rootUrl = "http://www.bookmarks.com")
//open interface BookmarkClient {
//    @Get("/bookmarks/{userId}?search={search}")
//    fun getBookmarks(@Path search: String?, @Path userId: String?): String?
//}