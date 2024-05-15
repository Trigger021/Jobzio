package com.example.jobzio.models

class Services {
    var servicename:String = ""
    var quantity:String = ""
    var price:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, quantity: String, price: String, imageUrl: String, id: String) {
        this.servicename = name
        this.quantity = quantity
        this.price = price
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}