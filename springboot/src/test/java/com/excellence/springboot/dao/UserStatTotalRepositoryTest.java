package com.excellence.springboot.dao;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
    /**
     * 分页查找
     * @throws Exception
     */
    @Test
    public void queryAll() throws Exception {
    	logg.info("执行开始...");
    	Sort sort = new Sort(Direction.ASC, "userStatTotalFK.wbNetworkId");
    	long count = userStatTotlaRepository.count();
    	logg.info("数量是："+count);
    	
    	int limit = 50;
    	int page = (int)count/limit + 1;
    	int start = 0;
    	while(start < page) {
    		PageRequest pagereq = new PageRequest(start, limit, sort);
        	Page<UserStatTotal> pg = userStatTotlaRepository.findAll(pagereq);
        	Iterator<UserStatTotal> ita = pg.iterator();
        	while(ita.hasNext()) {
        		UserStatTotal ust = ita.next();
        		logg.info("结果是：" + JSONObject.fromObject(ust));
        	}
    		start ++;
    	}
    	
    	logg.info("执行结束...");
    }
    
}
