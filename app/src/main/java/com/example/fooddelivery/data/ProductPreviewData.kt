package com.androidlead.fooddeliveryapp.data

import androidx.annotation.DrawableRes
import com.example.fooddelivery.R

data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType {
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "M.Subhan",
    @DrawableRes val productImg: Int = R.drawable.img_burger,
    val highlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Cheesy Shroom",
            type = ProductHighlightType.SECONDARY
        ),
        ProductHighlightState(
            text = "Hot Seller",
            type = ProductHighlightType.PRIMARY
        )
    )
)