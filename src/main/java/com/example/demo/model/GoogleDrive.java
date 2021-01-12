package com.example.demo.model;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;

public class GoogleDrive {
	@Autowired
	private GoogleCredential googleCredential;

	@Bean
	public Drive getService() throws GeneralSecurityException, IOException {
		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		return new Drive.Builder(HTTP_TRANSPORT, JacksonFactory.getDefaultInstance(), googleCredential).build();
	}

	@Bean
	public GoogleCredential googleCredential() throws GeneralSecurityException, IOException {
		Collection<String> elenco = new ArrayList<String>();
		elenco.add("https://www.googleapis.com/auth/drive");
		HttpTransport httpTransport = new NetHttpTransport();
		JacksonFactory jsonFactory = new JacksonFactory();
		return new GoogleCredential.Builder().setTransport(httpTransport).setJsonFactory(jsonFactory)
				.setServiceAccountId("manga-service@gifted-chimera-301107.iam.gserviceaccount.com")
				.setServiceAccountScopes(elenco)
				.setServiceAccountPrivateKeyFromP12File(new File("/MangaSpringAPI/src/main/resources/Key/gifted-chimera-301107-1986d93a7536.p12")).build();
	}
}
