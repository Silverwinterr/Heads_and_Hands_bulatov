package com.bulatov.lesson4

class ContentItem : DataInfoItem() {
    fun addListDetailInfoItem(): List<DetailInfoItem> =
        listOf(
            DetailInfoItem("Квитанция", R.drawable.ic_bill, "-40 000"),
            DetailInfoItem("Счетчики", R.drawable.ic_counter, "Подайте показания"),
            DetailInfoItem("Расрочка", R.drawable.ic_installment, "См. платеж 25.02.2018"),
            DetailInfoItem("Страхование", R.drawable.ic_insurance, "Полис до 12.01.2019"),
            DetailInfoItem("Интернет и ТВ", R.drawable.ic_tv, "Баланс 350 руб"),
            DetailInfoItem("Домофон", R.drawable.ic_homephone, "Подключен"),
            DetailInfoItem("Охрана", R.drawable.ic_guard, "Нет"),
            DetailInfoItem("Контакты УК и служб", R.drawable.ic_uk_contacts, ""),
            DetailInfoItem("Мои заявки", R.drawable.ic_request, ""),
            DetailInfoItem("Памятка жителя", R.drawable.ic_about, "")
        )

    fun addListBaseInfoItem(): List<BaseInfoItem> =
        listOf(
            BaseInfoItem("Контакты УК и служб", R.drawable.ic_uk_contacts, ""),
            BaseInfoItem("Мои заявки", R.drawable.ic_request, ""),
            BaseInfoItem("Памятка жителя", R.drawable.ic_about, "")
        )
}