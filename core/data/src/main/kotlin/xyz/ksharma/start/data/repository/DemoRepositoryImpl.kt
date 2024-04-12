package xyz.ksharma.start.data.repository

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import xyz.ksharma.start.data.model.DemoDataModel
import xyz.ksharma.start.data.util.parseJsonToDataModel
import xyz.ksharma.start.data.util.readJsonFromAssets
import xyz.ksharma.start.di.AppDispatchers
import xyz.ksharma.start.di.Dispatcher
import javax.inject.Inject

class DemoRepositoryImpl @Inject constructor(
    @ApplicationContext val context: Context,
    @Dispatcher(AppDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
) : DemoRepository {

    override suspend fun fetchData(): Flow<DemoDataModel> =
        withContext(ioDispatcher) {
            val jsonString = context.readJsonFromAssets(fileName = "demo.json")
            return@withContext flow { emit(jsonString.parseJsonToDataModel()) }
        }
}
