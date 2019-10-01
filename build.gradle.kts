import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  `java-gradle-plugin`
  `kotlin-dsl`
  `maven-publish`
  //id("jacoco-convention") version "1.0"
}

repositories {
  jcenter()
}

dependencies {
  implementation(gradleApi())
}

tasks.withType<KotlinCompile> {
  kotlinOptions.allWarningsAsErrors = true
}
