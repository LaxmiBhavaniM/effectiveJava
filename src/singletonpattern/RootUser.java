package singletonpattern;

import java.io.Serializable;

public class RootUser implements Serializable{
	  transient private int UID = 0;
	  transient private int GID = 0;
	  transient private String userName = "root";
	  transient private String name = "Super user";
	  transient private String home = "/root";
	  transient private String shell = "/bin/sh";
	  
	  private static final RootUser SINGLETON = new RootUser();
	  
	  private RootUser(){
	  }
	  
	  public static RootUser getInstance() {
		  return SINGLETON;
	  }
	  
	  // preserve singleton property during deserialization
	  private RootUser readResolve(){
		  return SINGLETON;
	  }
	  
	  @Override
	  public String toString(){
	    return new StringBuilder(userName)
	      .append("(").append(name).append(")")
	      .append(" ").append(UID).append(":").append(GID)
	      .append(" home: ").append(home).append(" ")
	      .append("shell: ").append(shell)
	      .toString();
	  }
}
