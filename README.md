# CI Demo

A small Java calculator with JUnit tests, used to demo continuous integration with GitHub Actions.

On every push or pull request to `main`, the workflow in `.github/workflows/ci.yml` compiles the code and runs `CalculatorTest`.

## Run locally

```sh
mkdir -p lib out
curl -fsSLo lib/junit-platform-console-standalone.jar \
  https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.13.4/junit-platform-console-standalone-1.13.4.jar
javac -cp lib/junit-platform-console-standalone.jar -d out *.java
java -jar lib/junit-platform-console-standalone.jar execute --class-path out --select-class CalculatorTest
```
