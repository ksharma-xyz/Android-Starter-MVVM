package xyz.ksharma.start.domain.mapper

import xyz.ksharma.start.data.model.DemoDataModel
import xyz.ksharma.start.model.DemoData
import xyz.ksharma.start.model.Item

internal fun DemoDataModel.toDomainModel() = DemoData(
    list = this.data.map { it.toItemModel() }
)

private fun xyz.ksharma.start.data.model.Item.toItemModel(): Item = Item(value = value, id = id)

private inline fun <reified T : Enum<T>> safeValueOf(type: String): T? =
    runCatching { java.lang.Enum.valueOf(T::class.java, type) }.getOrNull()
