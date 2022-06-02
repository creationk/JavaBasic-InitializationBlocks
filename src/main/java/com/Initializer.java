package com;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticInitializer {
    static int i;
    int j;

    {
        log.info("\n_______________________________\nInside the non-static block\n_______________________________");
        log.info("Being called when the object is created");
        j = 100;
        log.info("static i = {}, non static j = {}", i, j);
    }

    static {
        log.info("\n_______________________________\nInside the static block\n_______________________________");
        log.info("Being called when the class is loaded");
        log.info("Only static variables can be accessed");
        i = 90;
        log.info("Initializing i to 90: {}",i);
    }


    public StaticInitializer() {
        log.info("\n_______________________________\nInside the constructor\n_______________________________");
        log.info("static i = {}, non static j = {}", i, j);
    }


}