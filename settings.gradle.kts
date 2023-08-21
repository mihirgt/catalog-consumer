rootProject.name = "catalog-consumer"


dependencyResolutionManagement {
    versionCatalogs {
        repositories {
            mavenLocal()
        }

        create("globalLibs") {
            from("in.gore.versioncatalog:catalog:1.0")
        }
    }
}
