# How to use

This is a template project for using Scala with Processing.

```
sbt update
sbt compile
sbt run
```

## Common problems when using Processing with Scala

- You _must_ use Java 8 (aka jdk 1.8) with Processing. Java 9 and 10 are not supported. (Processing 4 will support Java 11.)
- Because this is outside the Processing Development Environment (PDE), you can't use functions like `size` from the `setup` method.
- The most recent version of Processing, 3.5.4, is not available via SBT yet. So this project currently uses 3.3.7.

Note: I've only tested this on my own computer, i.e. on OS X. It might not work for you! I'm using IntelliJ for this, so I don't know the right commands for persuading SBT to use JDK 1.8...
