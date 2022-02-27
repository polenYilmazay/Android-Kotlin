package com.example.kotlinbasics

fun main() {

    var yas = 25
    val isim = "Polen"
    var kat=4

    println("===================")
    println("${yas}'inci yaş günün kutlu olsun") // $ işareti belirttiğimiz parametreleri çağırır.
    println("===================")
    println()

    mumEkle(yas)
    catıEkle(yas)
    katEkle(yas,kat)
    /*
    println(" ''''''''''''''''''''''''' ")
    println(" ||||||||||||||||||||||||| ")
    println("===========================")
    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@")
    println("@@@@@@@@@@@@@@@@@@@@@@@@@@@")
    */
    println()
    print("Nice mutlu yıllara \n - ${isim}") // \n bir alt satıra geçişi sağlar.
}

fun katEkle(yas:Int,kat:Int){
    repeat(kat){
        repeat(yas+2){
            print("@")
        }
        println()
    }

    println()
}


fun catıEkle(yas:Int){
    repeat(yas+2){
        print("=")
    }
    println()
}


fun mumEkle(yas: Int){
    print(" ")
    repeat(yas){
        print("'")
    }
    println()

    print(" ")
    repeat(yas){
        print("|")
    }
    println()

}