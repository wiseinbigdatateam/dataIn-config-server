package com.wiseinc.dataIn.config.server;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DataInConfigServerTest {
    @Test
    public void contextLoads(){
        System.out.println("test contextLoads");
    }
}
