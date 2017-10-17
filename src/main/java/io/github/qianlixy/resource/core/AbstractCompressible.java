package io.github.qianlixy.resource.core;

import java.io.InputStream;

public abstract class AbstractCompressible<RT extends AbstractResourceType> implements Resource<RT> {

	public abstract InputStream compress(InputStream resource, String key);
	
	public abstract boolean verify(InputStream resource, String key);
	
	public abstract InputStream getResource(String key);
	
}
