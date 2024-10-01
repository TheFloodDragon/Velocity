plugins {
    checkstyle
}

extensions.configure<CheckstyleExtension> {
    configFile = rootProject.file("config/checkstyle/checkstyle.xml")
    maxErrors = 100
    maxWarnings = 100
    toolVersion = libs.checkstyle.get().version.toString()
}
