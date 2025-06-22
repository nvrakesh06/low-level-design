SRC_DIR=src
MAIN_CLASS=com.parkinglot.Main
JAVA=java
JAVAC=javac

SOURCES := $(shell find $(SRC_DIR) -name "*.java")

all: run clean

compile:
	$(JAVAC) $(SOURCES)

run: compile
	$(JAVA) -cp $(SRC_DIR) $(MAIN_CLASS)

clean:
	find $(SRC_DIR) -name "*.class" -delete
