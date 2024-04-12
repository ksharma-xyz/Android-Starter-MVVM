plugins {
    alias(libs.plugins.start.android.library.compose)
    alias(libs.plugins.cash.paparazzi)
}

android {
    namespace = "xyz.ksharma.start.design.system"
}

dependencies {
    api(platform(libs.compose.bom))
    api(libs.ui)
    api(libs.ui.graphics)
    api(libs.ui.tooling.preview)
    api(libs.material3)
    api(libs.compose.navigation)

    androidTestImplementation(platform(libs.compose.bom))
    debugApi(libs.ui.tooling)
    debugApi(libs.ui.test.manifest)
}
