package ru.iliya;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Component
public class TestBean {
	private ArrayList <Music> arrmus = new ArrayList <Music> ();
	private String name;
	private int bit;
	
	
	public TestBean() {
	} 
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBit() {
		return bit;
	}


	public void setBit(int bit) {
		this.bit = bit;
	}
	
	public void addmus(Music mus) {
		arrmus.add(mus);
	}
	


	public ArrayList<Music> getArrmus() {
		return arrmus;
	}


	public String getSong () {
		bit = arrmus.size();
		StringBuffer str1 = new StringBuffer();
		for(int i = 0;i<arrmus.size(); i++) {
			bit=arrmus.size()-i;
			str1.append(arrmus.get(i).bram()+" :"+bit+"\n");
		}
		return str1.toString() ; 
				
	}
	
	public void initMyMusic() {
		System.out.println("Инициализация");
	}
	
	public void destMyMusic () {
		System.out.println("fghfg");
	}
	
	
}
