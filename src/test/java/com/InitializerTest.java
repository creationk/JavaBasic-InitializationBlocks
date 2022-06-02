package com;

import org.junit.jupiter.api.Test;
import lombok.extern.slf4j.Slf4j;

import static org.junit.jupiter.api.Assertions.fail;

@Slf4j
class StaticInitializerTest {
    @Test
    void test() {
        StaticInitializer i = new StaticInitializer();
        //StaticInitializer i2 = new StaticInitializer();
    }
}