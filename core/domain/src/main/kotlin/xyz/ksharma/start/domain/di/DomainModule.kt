package  xyz.ksharma.start.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import xyz.ksharma.start.domain.DemoUseCase
import xyz.ksharma.start.domain.DemoUseCaseImpl

@InstallIn(SingletonComponent::class)
@Module
abstract class DomainModule {

    @Binds
    abstract fun bindDemoUseCase(impl: DemoUseCaseImpl): DemoUseCase
}
