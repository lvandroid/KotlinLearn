package com.example.kotlinlearn

data class WallpaperInfo(val imgId: String, val url:String, val title: String?)
//单行
fun singleStr(str1: String, str2: String, wallpaperInfo: WallpaperInfo?): String? {
    return "str1:"+str1 + ",str2:" + str2 + ",wallpaperInfo:" + wallpaperInfo +",wallpaperImgId:" + wallpaperInfo?.imgId
}

//多行

//fun multiStr():String{
//    return """
//        fun main() {
//            println(multiStr())
//        }
//    """
//}
