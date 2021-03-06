package com.citius.models;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private String token;

	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

}
