package com.springBoot.mapper;

import com.springBoot.HelloApplication;
import com.springBoot.pojo.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class UserMapperTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("userMapper test running!");
        System.out.println("====================");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("userMapper test over!");
        System.out.println("====================");
    }

    @Test
    public void testFindAll() {
        List<User> list =userMapper.findAll();
        System.out.println("====================");
        System.out.println(list);
    }

    @Autowired
    private UserMapper userMapper;
}