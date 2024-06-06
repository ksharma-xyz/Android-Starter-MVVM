package xyz.ksharma.start.data.model

import com.google.gson.annotations.SerializedName
import dev.zacsweers.redacted.annotations.Redacted
import kotlinx.serialization.Serializable

// Data Model
@Serializable
data class DemoDataModel(

    @SerializedName("data")
    val data: List<Item>,
)

// Data Model
@Serializable
data class Item(
    @Redacted
    val value: String,
    val id: String,
)
