package com.ccp.implementations.file.bucket.gcp;

import java.io.FileInputStream;
import java.util.Base64;

import com.ccp.especifications.file.bucket.CcpFileBucket;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

class GcpFileBucket implements CcpFileBucket {

	@Override
	public String read(String tenant, String bucketName, String fileName) {
		try {
			String getenv = System.getenv("credentials_file");
			FileInputStream fileInputStream = new FileInputStream(getenv);
			Storage service = StorageOptions.newBuilder().setProjectId(tenant)
					.setCredentials(
							GoogleCredentials.fromStream(fileInputStream))
					.build().getService();
			com.google.cloud.storage.Blob blob = service.get(bucketName, fileName);
			byte[] content = blob.getContent();
			String encodeToString = Base64.getEncoder().encodeToString(content);
			return encodeToString;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void remove(String tenant, String bucketName, String fileName) {
		// TODO Auto-generated method stub
		
	}
}
