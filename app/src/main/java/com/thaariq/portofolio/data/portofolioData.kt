package com.thaariq.portofolio.data

import com.thaariq.portofolio.R

object portofolioData {
    private val title = arrayOf(
        "Chat App",
        "Travel App",
        "Contact App",
        "Food App",
        "Event Organized App",
        "Daily Profile App",
        "Petshop App",
        "Family Plan App",
        "Task Manager App",
        "Office Automation App"
    )

    private val poster = intArrayOf(
        R.drawable.chat,
        R.drawable.travel,
        R.drawable.phoneapp,
        R.drawable.food,
        R.drawable.event,
        R.drawable.dailyprofile,
        R.drawable.petshop,
        R.drawable.familyplan,
        R.drawable.taskmanager,
        R.drawable.office
    )

    private val link = arrayOf(
        "https: //search.muz.li/NMUSMmY5YTM4",
        "https://pin.it/3ttUNfs",
        "nttps://pin.it/77qUdZ7",
        "nttps://pin.it/2RdMJ7Y",
        "nttps://pin.it/2LhIJHX",
        "https: //pin.it/B8Zq5TV",
        "nttps://pin.it/6JUvToT",
        "https: //pin.it/3tWyoxw",
        "nttps://pin.it/6xnCZEw",
        "https://pin.it/7pnO0qvu"
    )

    val listAppAndroid: ArrayList<Portofolio>
        get() {
            val list = arrayListOf<Portofolio>()
            for (position in title.indices){
                val android = Portofolio()
                android.title = title[position]
                android.image = poster[position]
                android.link = link[position]
                list.add(android)
            }
            return list
        }
}