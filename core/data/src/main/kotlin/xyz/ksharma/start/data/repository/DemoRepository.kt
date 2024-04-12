package xyz.ksharma.start.data.repository

import kotlinx.coroutines.flow.Flow
import xyz.ksharma.start.data.model.DemoDataModel

/**
 * The repository for fetching the [DemoDataModel].
 */
interface DemoRepository {

    /**
     * This method will fetch the demo data from the assets and return a cold flow.
     *
     * @return - Returns a flow of [DemoDataModel]
     */
    suspend fun fetchData(): Flow<DemoDataModel>
}