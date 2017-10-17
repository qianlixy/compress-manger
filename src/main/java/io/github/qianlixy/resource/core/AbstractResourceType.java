package io.github.qianlixy.resource.core;

public abstract class AbstractResourceType {
	
	protected String suffix;
	
	public AbstractResourceType(String suffix) {
		this.suffix = suffix;
	}
	
	public abstract String suffix();
	
	final class IMAGE extends AbstractResourceType {

		public IMAGE(String suffix) {
			super(suffix);
		}

		@Override
		public String suffix() {
			return suffix;
		}
	}
	
	final class STATIC extends AbstractResourceType {

		public STATIC(String suffix) {
			super(suffix);
		}

		@Override
		public String suffix() {
			return suffix;
		}
	}
	
	
	
}
