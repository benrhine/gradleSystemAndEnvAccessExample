# gradleSystemAndEnvAccessExample

![Java CI with Gradle](https://github.com/benrhine/gradleSystemAndEnvAccessExample/workflows/Java%20CI%20with%20Gradle/badge.svg)

Example of how to access system and environment variables at different points during grails application startup

Add the following environment variables to your `~/.bash_profile`

```
export THE_ANSWER=42
export THE_QUESTION="What is the meaning of life, the universe, and everything?"
export THE_TIME=7500000 
```

optionally you could configure these in your IDE.

Note: When using IntelliJ, if you configured the environment variables in your bash profile
but run the app using IntelliJ, it will not see the variables. For variables configured in 
the bash profile you will need to run the app from the terminal for it to pick them up.

To execute the example

```
./gradlew bootRun
```

You will see the following output
1. System Property access using the BootRunTask
2. System and Environment variable access in application.groovy
3. Environment variable access in runtime.groovy
4. application.groovy and runtime.groovy property access in BootStrap.groovy

``` 
| => ./gradlew bootRun
Starting a Gradle Daemon, 4 stopped Daemons could not be reused, use --status for details
Using Gradle project properties
GRADLE_BUILD_PROPERTY: Gradle Property Test
===== Environment Variables in Gradle Build =====
Environment Var
:compileJava UP-TO-DATE
:compileGroovy UP-TO-DATE
:buildProperties UP-TO-DATE
:processResources
:classes
:findMainClass
:bootRun
**************************************************
Loaded application.groovy

Grails Application not available
**************************************************
##################################################
Loaded runtime.groovy

Grails Application not available
##################################################
What is the meaning of life, the universe, and everything?: 42
How long did it take Deepthought to answer the ultimate question?: 7500000 years
Holders Available? true
Grails application running at http://localhost:8080 in environment: production
```
