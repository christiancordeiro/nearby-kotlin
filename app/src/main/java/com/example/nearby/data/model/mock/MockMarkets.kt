package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Market

val mockMarkets = listOf(
    Market (
        id = "231313123123132321",
        categoryId = "23121313213",
        name = "Sabor Grill",
        description = "Churrascaria dos jack",
        coupons = 10,
        rules = emptyList(),
        latitude = -23.55974230991911,
        longitude = -46.65814845249887,
        address = "Av. Paulista",
        phone = "(55666-66664444)",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market (
        id = "23131312443123132321",
        categoryId = "23121344413213",
        name = "Café Central",
        description = "Café tlg kkk",
        coupons = 10,
        rules = emptyList(),
        latitude = -23.55974230991911,
        longitude = -46.65814845249887,
        address = "Alameda Jaú - Jardim Primavera",
        phone = "(55666-66664444)",
        cover = "https://images.unsplash.com/photo-1551218808-94e220e084d2?w=400&h=300"
    ),
)