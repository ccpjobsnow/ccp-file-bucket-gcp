package com.ccp.implementations.file.bucket;

import com.ccp.dependency.injection.CcpModuleExporter;

public class FileBucket implements CcpModuleExporter {

	@Override
	public Object export() {
		return new FileBucketGcp();
	}

}