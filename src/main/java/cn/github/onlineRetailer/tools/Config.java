package cn.github.onlineRetailer.tools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;  

@Component
public class Config {
	
	private static String redisIP;

	private static int redisPort;
	
	@Value("${redis.ip}") 
	public void setRedisIP(String redisIP) {
		Config.redisIP = redisIP;
	}
	@Value("${redis.port}") 
	public void setRedisPort(int redisPort) {
		Config.redisPort = redisPort;
	}
	public static String getRedisIP() {
		return redisIP;
	}
	public static int getRedisPort() {
		return redisPort;
	}
	
}
