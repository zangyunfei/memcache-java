package com.zyf.memcached.google;

public class ErrorTest {
	public static String value = "11111111111111111111111111111111111111111111111111111111";
	private static SockIOPool pool;
	static String key = "win_0E3D0B82339ECC23-992BA88F-855B-4CB8-AEE0-659116BD7DD6";
	static MemCachedClient mc = new MemCachedClient("test");
	static {
		String[] serverlist = { "127.0.0.1:11211" };
		pool = SockIOPool.getInstance("test");
		pool.setServers(serverlist);
		pool.initialize();

		System.out.println("start set key:" + mc.set(key, value));
	}

	public static void main(String[] args) {
		System.out
				.println("====================get key========================");
		System.out.println(mc.get(key));
	}
}
