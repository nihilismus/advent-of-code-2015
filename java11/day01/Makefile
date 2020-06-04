clean:
	mvn clean

compile: clean
	mvn compile

run: compile
	mvn exec:java -Dexec.args="../../inputs/day01/input.txt"

test:
	mvn test

verify:
	mvn verify

format:
	mvn spotless:apply

package: clean
	mvn package

.PHONY: run test verify

.DEFAULT_GOAL := run
