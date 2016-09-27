package com.excellence.springboot.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BaseDaoImplTest {
	@Autowired
    private MockMvc mockMvc;
	@Autowired
	BaseDao baseDao;
    @Test
    public void queryAll() throws Exception {
    	long count = baseDao.countAll();
    	System.out.println(count);
    }
}
