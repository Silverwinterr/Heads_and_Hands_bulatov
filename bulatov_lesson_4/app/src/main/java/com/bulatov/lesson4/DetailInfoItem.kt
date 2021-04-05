package com.bulatov.lesson4

data class DetailInfoItem(
    override var title: String,
    override var imageCard: Int,
    override var content: String
) : BaseInfoItem(title, imageCard, content)