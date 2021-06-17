package com.ming.brain.mapperInterface;

import java.util.HashMap;

public interface UserMapper {
	public void insertMember(HashMap map) throws Exception;
	public HashMap selectLoginID(HashMap map) throws Exception;
}
