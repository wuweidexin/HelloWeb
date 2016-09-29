package com.excellence.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.excellence.springboot.model.UserStatTotal;
import com.excellence.springboot.model.UserStatTotalFK;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserStatTotalRepositoryTest {
	Logger logg = LoggerFactory.getLogger(UserStatTotalRepositoryTest.class);
	@Autowired
    private MockMvc mockMvc;
	@Autowired
	UserStatTotalRepository userStatTotlaRepository;
    @Test
    public void queryForOne() throws Exception {
    	UserStatTotalFK fk = new UserStatTotalFK();
    	fk.setWbNetworkId("101");
    	fk.setLongNumber("0!");
    	UserStatTotal t = userStatTotlaRepository.findOne(fk);
    	logg.info("结果是："+JSONObject.fromObject(t).toString());
    	
    }
}
