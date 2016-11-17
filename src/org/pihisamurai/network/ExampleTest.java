package org.pihisamurai.network;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void testServerProtocol() throws IOException {
		Example client = new Example();
		ExampleServer server = new ExampleServer();
		
		client.request("Caleb");
		server.respond();
		assertEquals("Hello Caleb!", client.getResponse());
	}

}
