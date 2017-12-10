package com.pattern.factory;
public class OSFactory {
	public static OS getInstance(String str){
		if("Open".equals(str)){
			return new Android();
		}
		else if("secured".equals(str)){
			return new IOS();
		}
		else{
			return new Windows();
		}
	}
}
