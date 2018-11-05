# idea-gradle-composite-build-bug
Reproduction of the IDEA Gradle Composite Build bug

To reproduce:
1. Open IntelliJ IDEA
1. `File` -> `Open`
1. Select the `trunk` directory
1. Run the `App` configuration

Observe:
* The classpath contains `commons-math3-3.0.jar` even though this has been excluded from the dependencies in `plugin/build.gradle`.
* This then results in an `InvocationTargetException` as the version `3.0` classes are loaded instead of the `3.1` classes.

I suspect that there is something to do with the particular way in which the modules are setup which causes this, possibly the module groups.

We know that excludes do work as expected as a simple setup does not include `3.0` on the classpath.
