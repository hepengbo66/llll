package com.hepengbo.txt;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hepengbo.mapper.FilmMapper;
import com.hepengbo.pojo.User;

import utils.IOUtils;
import utils.StringUtil;

public class FileText {
	
	public static void main(String[] args) {
		
		File file = new File("file.txt");
		
		List<Object[]> list = IOUtils.readFile("file.txt", "\\|t");
		
		for (Object[] objects : list) {
			
			User user = new User(Integer.parseInt(objects[0]+""), objects[1]+"", objects[2]+"", objects[3]+"", StringUtil.isEmpty(objects[4]+"")?0:Integer.parseInt(objects[4]+""));
			System.out.println(user);
			
			//数据的持久操作
			/*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			FilmMapper mapper = ac.getBean("filmMapper",FilmMapper.class);
			
			mapper.adduser(user);*/
			
		}
		
		
		
	}
	
}
