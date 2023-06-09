package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.UserService;


@SpringBootTest
@RunWith(SpringRunner.class)
class TkMybatisTest {

    @Autowired
    private UserService userService;

    @Test
    public void tets_() {
//        log.info("----------当前顺序----------");
        userService.getAll();
//        log.info("将 3 号挪到 7 号后面");
        userService.move(3L, 7L, false);
//        log.info("----------移动后的顺序----------");
        userService.getAll();
//        log.info("将 4 号挪到 8 号前面");
        userService.move(4L, 8L, true);
//        log.info("----------移动后的顺序----------");
        userService.getAll();
//        log.info("将 9 号挪到 2 号前面");
        userService.move(9L, 2L, true);
//        log.info("----------移动后的顺序----------");
        userService.getAll();
//        log.info("将 10 号挪到 1 号后面");
        userService.move(10L, 1L, false);
//        log.info("----------移动后的顺序----------");
        userService.getAll();

    }
}
