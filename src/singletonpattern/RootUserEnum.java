package singletonpattern;

public enum RootUserEnum {
	SINGLETON;
	private int UID = 0;
	private int GID = 0;
	private String userName = "root";
	private String name = "Super user";
	private String home = "/root";
	private String shell = "/bin/sh";
	
	public String getName() {
		return name;
	}
}
