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

    private val titleExperience :Array<String> = arrayOf(
        "Android Associated Developer",
        "Android Pemula",
        "Memulai Program Bahasa Kotlin",
        "Memulai Bahasa Program Python",
        "Solid Principle"
    )

    private val detailExperience :Array<String> = arrayOf(
        "Sertifikat ini merupakan sertifikat yang diterbitkan Langsung oleh Google untuk developer Android",
        "Android pemula merupakan course yang diadakan oleh dicoding untuk memulai belajar program android",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas kotlin",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas python",
        "solid principle mempeljari tentang oop, clean code, dll"
    )

    private val imageExperience = intArrayOf(
        R.drawable.aad,
        R.drawable.androidcert,
        R.drawable.kotlincert,
        R.drawable.pythoncert,
        R.drawable.solidcert
    )

    val listDataExperience: ArrayList<Portofolio>
        get() {
            val list = arrayListOf<Portofolio>()
            for (position in titleExperience.indices){
                val experience = Portofolio()
                experience.title = titleExperience[position]
                experience.detail = detailExperience[position]
                experience.image = imageExperience[position]
                list.add(experience)
            }
            return list
        }
}