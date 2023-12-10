package com.example.kotlinlearn















// in 和 out限制

//interface Cache<T>{
//    fun get(key: String): T?
//    fun set(key: String, value: T)
//}
//
//class MemoryCache<T>: Cache<T>{
//    private val cacheMap = mutableMapOf<String, T>()
//    override fun get(key: String): T? {
//        return cacheMap[key]
//    }
//
//    override fun set(key: String, value: T) {
//        cacheMap[key] = value
//    }
//
//    fun <T> cacheData(src: Cache<T>, des: Cache<T>, keys: List<String>){
//        for (key in keys){
//            val data = src.get(key)
//            data?.let { des.set(key, data) }
//        }
//    }
//}

//interface CacheIn<in T>{
//    fun get(key: String): @UnsafeVariance T?
//    fun set(key: String, value: T)
//}
//
//interface CacheOut<out T>{
//    fun get(key: String): T?
//    fun set(key: String, value: @UnsafeVariance T)
//}