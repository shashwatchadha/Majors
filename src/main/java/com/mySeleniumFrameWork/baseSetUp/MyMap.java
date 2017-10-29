package com.mySeleniumFrameWork.baseSetUp;

import java.util.HashMap;

public class MyMap {
	
	
	
	
	
	
	
	
	
	public static ThreadLocal<HashMap<String,String>> mapLocal = new  ThreadLocal<HashMap<String,String>>();
	
	
	public static HashMap<String,String> hash ;
	
	
	
	
	

	public static HashMap<String, String> getMapLocal() {
		return mapLocal.get();
	}

	public static void setMapLocal(HashMap<String, String> map) {
		mapLocal.set(map);
	}
	
	
	public static void initiateMap()
	{
		hash= new HashMap<String, String>();
		MyMap.setMapLocal(hash);
	}
	
	

}
