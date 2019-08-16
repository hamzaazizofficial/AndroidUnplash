package com.kc.unsplash.api

enum class Order private constructor(val order: String) {

    LATEST("latest"),
    OLDEST("oldest"),
    POPULAR("popular")
}
