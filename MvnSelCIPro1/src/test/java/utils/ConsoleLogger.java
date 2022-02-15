package utils;

import org.testng.annotations.Test;

public class ConsoleLogger {
	
	public static void log(String msg,Object obj) {
		System.out.println(String.format(msg+" %s", obj));
	}

}
