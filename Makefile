#----------------------------------------------------------------------
# Makefile for CS421P Assignment 3
#----------------------------------------------------------------------

JFLAGS = -g
JC = javac
JCC = javacc

.SUFFIXES: .jj .java .class

.PRECIOUS: %.java

.jj.java:
	$(JCC) $*.jj

.java.class:
	$(JC) $(JFLAGS) $*.java

all:	parser

parser: ast/Ast.class Parser.class

clean:	
	rm *.java *.class
