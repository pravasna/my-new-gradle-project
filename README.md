# gradle-server
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](http://www.opensource.org/licenses/MIT)
[![CI](https://github.com/pravasna/gradle-server/actions/workflows/CI.yml/badge.svg)](https://github.com/pravasna/gradle-server/actions/workflows/CI.yml)
[![Appveyor build status](https://ci.appveyor.com/api/projects/status/github/pravasna/gradle-server?svg=true)](https://ci.appveyor.com/project/pravasna/gradle-server)
[![codecov](https://codecov.io/gh/pravasna/gradle-server/branch/master/graph/badge.svg)](https://codecov.io/gh/pravasna/gradle-server)

### About



Features:
* Feature 1
* Feature 2

##### Summary

* Configuration: `server`
* Tasks:
    - `task1` - brief task description       

### Setup


[![Gradle Plugin Portal](https://img.shields.io/maven-metadata/v/https/plugins.gradle.org/m2/org.ucsc.devops/server/org.ucsc.devops.server.gradle.plugin/maven-metadata.xml.svg?colorB=007ec6&label=plugins%20portal)](https://plugins.gradle.org/plugin/org.ucsc.devops.server)

```groovy
plugins {
    id 'org.ucsc.devops.server' version '0.1.0'
}
```

OR

```groovy
buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath 'org.ucsc.devops:gradle-server:0.1.0'
    }
}
apply plugin: 'org.ucsc.devops.server'
``` 

### Usage

---
[![gradle plugin generator](http://img.shields.io/badge/Powered%20by-%20Gradle%20plugin%20generator-green.svg?style=flat-square)](https://github.com/xvik/generator-gradle-plugin)
