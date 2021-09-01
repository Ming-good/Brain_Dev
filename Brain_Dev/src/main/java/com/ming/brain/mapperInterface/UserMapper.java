package com.ming.brain.mapperInterface;

import java.util.HashMap;

public interface UserMapper {
	public int insertMember(HashMap map) throws Exception;
	public HashMap selectLoginID(HashMap map) throws Exception;
	public HashMap selectCiCheck(HashMap map) throws Exception;
}
