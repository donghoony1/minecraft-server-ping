plugins {
    java
    `maven-publish`
}

group = "com.donghoonyoo"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    implementation("dnsjava", "dnsjava", "2.1.8")
    implementation("net.md-5", "bungeecord-chat", "1.12-SNAPSHOT")
}

publishing {
    repositories {
        maven("https://maven.pkg.github.com/donghoony1/minecraft-server-ping") {
            credentials {
                username = properties["github.username"] as String
                password = properties["github.token"] as String
            }
        }
    }
    publications {
        create<MavenPublication>("maven") {
            artifactId = project.name.toLowerCase()
            artifact(tasks.jar.get())
            artifact(tasks.create<Jar>("sourceJar") {
                archiveClassifier.set("sources")
                from(sourceSets.main.get().allSource)
            }) {
                classifier = "sources"
            }
        }
    }
}