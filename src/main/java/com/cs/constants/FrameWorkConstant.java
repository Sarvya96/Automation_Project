package com.cs.constants;

public final class FrameWorkConstant {
	private static final String RESOURCEPATH      = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGMAPFILEPATH = RESOURCEPATH + "/config/config.properties"; 
	
	public static String getResourcepath() {
		return RESOURCEPATH;
	}

	public static String getConfigmapfilepath() {
		return CONFIGMAPFILEPATH;
	}







	private FrameWorkConstant() {}
}
