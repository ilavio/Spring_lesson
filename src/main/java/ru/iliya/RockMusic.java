package ru.iliya;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component    
@Scope("prototype")   
public class RockMusic implements Music {
	private String s1 = "ROCK";
	
	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = this.s1 +" "+ s1;
	}

	public String bram() {
		String s = s1;
		return s;
	}

	public void pampam (int s) {
		this.s1 = this.s1 +" "+ s;
	}
	
}
