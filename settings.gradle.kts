rootProject.name = "catalog-consumer"


dependencyResolutionManagement {
    versionCatalogs {
        repositories {
            mavenLocal()
        }

        create("sharedLibs") {
            from("in.gore.versioncatalog:catalog:1.0")
        }
        create("globalLibs") {
            from(files("gradle/globalLibs.versions.toml"))
        }
    }
}
