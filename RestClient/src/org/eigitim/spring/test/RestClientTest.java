package org.eigitim.spring.test;

import org.eigitim.spring.client.RestClient;
import org.junit.jupiter.api.Test;

class RestClientTest {

	@Test
	void testServiceKisiTumListe() {
		RestClient restClient = new RestClient();
		
		restClient.serviceKisiTumListe();
	}

}
