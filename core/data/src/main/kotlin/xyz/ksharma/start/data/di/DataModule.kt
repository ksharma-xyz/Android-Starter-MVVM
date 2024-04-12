package  xyz.ksharma.start.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import xyz.ksharma.start.data.repository.DemoRepository
import xyz.ksharma.start.data.repository.DemoRepositoryImpl

@InstallIn(SingletonComponent::class)
@Module
abstract class DataModule {

    @Binds
    abstract fun bindDemoRepository(impl: DemoRepositoryImpl): DemoRepository
}
