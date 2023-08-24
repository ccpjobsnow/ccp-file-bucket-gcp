package com.ccp.implementations.file.bucket.gcp;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class FileBucket implements CcpInstanceProvider {

	@Override
	public Object getInstance() {
		return new FileBucketGcp();
	}

}
