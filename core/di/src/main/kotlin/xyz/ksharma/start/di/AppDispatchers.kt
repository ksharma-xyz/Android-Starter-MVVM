package xyz.ksharma.start.di

import javax.inject.Qualifier

enum class AppDispatchers {
    Default,
    IO,
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val dispatch: AppDispatchers)
