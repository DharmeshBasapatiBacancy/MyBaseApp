plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.mybaseapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mybaseapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val coroutinesFlowVersion = "1.7.1"
    val coilVersion = "2.0.0-rc03"
    val daggerHiltVersion = "2.48"
    val hiltCompilerVersion = "1.1.0"
    val lifecycleViewModelKTXVersion="2.6.2"
    val sdpVersion = "1.0.6"
    val sspVersion = "1.0.6"
    val retrofitVersion = "2.9.0"
    val okhttpVersion = "4.9.3"
    val kotlinVersion = "1.9.0"
    val roomVersion = "2.6.0"

    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")

    //Coroutines & Flow
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesFlowVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesFlowVersion")

    //For using "by viewModels()"
    implementation("androidx.fragment:fragment-ktx:1.6.2")

    //Coil
    implementation("io.coil-kt:coil:$coilVersion")

    //hilt
    implementation("com.google.dagger:hilt-android:$daggerHiltVersion")
    kapt("com.google.dagger:hilt-compiler:$daggerHiltVersion")
    kapt("androidx.hilt:hilt-compiler:$hiltCompilerVersion")

    //Lifecycle related
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleViewModelKTXVersion")

    //For using kotlin extensions of LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    //SDP and SSP for responsive design
    implementation("com.intuit.sdp:sdp-android:$sdpVersion")
    implementation("com.intuit.ssp:ssp-android:$sspVersion")

    //Retrofit & okhttp
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    implementation("com.squareup.okhttp3:okhttp:$okhttpVersion")
    implementation("com.squareup.okhttp3:logging-interceptor:$okhttpVersion")

    //Room Database
    implementation("androidx.room:room-runtime:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")
}