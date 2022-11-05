package com.ccp.implementations.file.bucket;

import com.ccp.dependency.injection.CcpImplementationProvider;

public class ImplementationProvider implements CcpImplementationProvider {

	@Override
	public Object getImplementation() {
		return new FileBucketGcp();
	}

}
