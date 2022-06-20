package com.ccp.implementations.file.bucket;

import com.ccp.dependency.injection.CcpEspecification.DefaultImplementationProvider;

public class ImplementationProvider extends DefaultImplementationProvider {

	@Override
	public Object getImplementation() {
		return new FileBucketGcp();
	}

}
