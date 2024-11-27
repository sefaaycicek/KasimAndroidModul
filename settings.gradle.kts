pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "KasimAndroidModul"
include(":app")
include(":util")
include(":feature:credit")
include(":feature:accounts")
include(":domain:accounts")
include(":domain:credit")
include(":data:accounts")
include(":data:credit")
include(":model:common")
include(":model:accounts")
include(":model:credit")
