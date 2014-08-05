package com.zyf.memcached.google;

public class ErrorTest {
	public static String value = "11111111111111111111111111111111111111111111111111111111";
	private static SockIOPool pool;
	static {
		String[] serverlist = { "127.0.0.1:11211" };
		pool = SockIOPool.getInstance("test");
		pool.setServers(serverlist);
		pool.initialize();
	}

	public static void main(String[] args) {
		MemCachedClient mc = new MemCachedClient("test");
		String key = "win_0E3D0B82339ECC23-992BA88F-855B-4CB8-AEE0-659116BD7DD6";
		// System.out.println(mc.set(key, value));
		System.out.println("=====================");
		System.out.println(mc.get(key));
	}
}
