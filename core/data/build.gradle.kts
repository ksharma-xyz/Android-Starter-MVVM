plugins {
    alias(libs.plugins.start.android.library)
    alias(libs.plugins.start.android.hilt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.redacted)
}

android {
    namespace = "xyz.ksharma.start.data"
}

dependencies {
    api(projects.core.di)

    implementation(libs.retrofit.converter.gson)
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.serialization.json)

    testImplementation(libs.turbine)
    testImplementation(libs.google.truth)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.kotlinx.coroutines.test)
}
