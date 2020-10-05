package ru.iliya;

import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
	
	
	
	public static void main(String [] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Music tmusicClassic = context.getBean("classicMusic", ClassicMusic.class);
		TestBean ts = context.getBean("testBean", TestBean.class);
		
		for(int l = 0;l<3;l++) {
			ts.addmus(context.getBean("rockMusic",Music.class));
			ts.getArrmus().get(l).pampam(l);
		}
		
		for(int l = 3;l<6;l++) {
			ts.addmus(context.getBean("classicMusic",Music.class));
			ts.getArrmus().get(l).pampam(l);
		}
		
		Random r = new Random();
		int r1 = r.nextInt(7);
		
		String ss1 = "";
		
		switch(r1) {
		case 0: ss1 = ts.getArrmus().get(0).bram();
		break;
		case 1: ss1 = ts.getArrmus().get(1).bram();
		break;
		case 2: ss1 = ts.getArrmus().get(2).bram();
		break;
		case 3: ss1 = ts.getArrmus().get(3).bram();
		break;
		case 4: ss1 = ts.getArrmus().get(4).bram();
		break;
		case 5: ss1 = ts.getArrmus().get(5).bram();
		break;
		}
		
		System.out.println(ss1);
		
		
		
		
		//TestBean ts = new TestBean(testBean);
		
		System.out.println(ts.getSong());
		System.out.println();
		
		context.close();
	
	}
	
	
	
}
