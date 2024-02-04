package com.ccp.implementations.file.bucket.gcp;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class CcpGcpFileBucket implements CcpInstanceProvider {

	
	public Object getInstance() {
		return new GcpFileBucket();
	}

}
