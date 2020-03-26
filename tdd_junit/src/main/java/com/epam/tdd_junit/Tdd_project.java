package com.epam.tdd_junit;

public class Tdd_project {
	public String remove(String s) {
		String result=s;
		int len=s.length();
		if(len>=1) {
		char first=s.charAt(0);
		char second=s.charAt(1);
			if(first=='A' && second=='A') {
				result=s.substring(2,len);
			}
			else if(first=='A') {
				result=s.substring(1,len);
			}
			else if(second=='A') {
				result=first+s.substring(2,len);
			}
		}
	return result;
	}
}
