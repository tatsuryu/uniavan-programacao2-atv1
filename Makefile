MAKEFLAGS += silent

SHELL = /bin/bash

.DEFAULT_GOAL := build

src/br/uniavan/Atv1.class:
	@cd src; javac br/edu/uniavan/Atv1.java

.PHONY: build
build: src/br/uniavan/Atv1.class

run: build
	@cd src; java br.edu.uniavan.Atv1

clean:
	@git clean -Xdf
