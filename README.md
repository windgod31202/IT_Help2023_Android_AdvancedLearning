# IT_Help2023_Android_AdvancedLearning
2023ITHelp_Repository

This is my `iThome鐵人賽` Day04 Daily writings for **Android Studio** advenced learning.

This Article is for Dagger2 Using on `Dagger2 version:"2.47"`
- My Version Specification：
    - Android Studio version：**Android Studio Giraffe | 2022.3.1**
    - Dagger2 version：**2.47**
    - Gradle JDK version：**JetBrains Runtime version 17.0.6**
    - Android Gradle Plugin version：**8.1.1**
    - Gradle version：**8.0**
    - Compile Sdk version：**33 (API33("Tiramisu";Android13.0))**
## Dependencies on Android Studio gradle
- build.gradle (Module:app)
```gradle=
    //dagger2_dependencies
    implementation 'com.google.dagger:dagger:2.47'
    annotationProcessor 'com.google.dagger:dagger-compiler:2.47'
```
- build.gradle.kts (Module:app)
```gradel=
    //dagger2_dependencies
    implementation("com.google.dagger:dagger:2.47")
    annotationProcessor ("com.google.dagger:dagger-compiler:2.47")
```
some Article Detail on my `iThome鐵人賽` page

look some in my `iThome鐵人賽_Day04 Articles`： [Android Studio 30天進階學習-DAY04_Dagger2_02(架構實作_上)](https://ithelp.ithome.com.tw/articles/10318003)
