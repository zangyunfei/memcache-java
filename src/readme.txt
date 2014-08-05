https://github.com/gwhalin/Memcached-Java-Client/downloads 
  
 init:
 
 static {
		String[] serverlist = { "127.0.0.1:11211" };
		pool = SockIOPool.getInstance("test");
		pool.setServers(serverlist);
		pool.initialize();
	}
	
run:

	MemCachedClient mc = new MemCachedClient("test");
	String key = "win_0E3D0B82339ECC23-992BA88F-855B-4CB8-AEE0-659116BD7DD6";
	mc.set(key, value);		
	mc.get(key);

