package cn.github.onlineRetailer.tools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;  

@Component
public class Config {
	
	private static String redisIP;

	private static int redisPort;
	
	private static int timeout;
	
	private static String password;
	
	@Value("${redis.ip}") 
	public void setRedisIP(String redisIP) {
		Config.redisIP = redisIP;
	}
	@Value("${redis.port:6379}") 
	public void setRedisPort(int redisPort) {
		Config.redisPort = redisPort;
	}
	@Value("${redis.timeout:2000}") 
	public static void setTimeout(int timeout) {
		Config.timeout = timeout;
	}
	@Value("${redis.password}") 
	public static void setPassword(String password) {
		Config.password = password;
	}
	public static String getRedisIP() {
		return redisIP;
	}
	public static int getRedisPort() {
		return redisPort;
	}
	public static int getTimeout() {
		return timeout;
	}
	public static String getPassword() {
		return password;
	}
	
}
