plugins {
  jacoco
}

jacoco {
  toolVersion = "0.8.2"
}

val jacocoTestReport = tasks.named<JacocoReport>("jacocoTestReport") {
  reports {
    xml.isEnabled = true
    html.isEnabled = true
  }
}
tasks.named("check") { dependsOn(jacocoTestReport) }
