package com.bulatov.lesson4

open class DataInfoItem {
    data class BaseInfoItem (
        var title: String,
        var imageCard: Int,
        var content: String
    )
    data class DetailInfoItem(
        var title: String,
        var imageCard: Int,
        var content: String
    )
}