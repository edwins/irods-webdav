/**
 * 
 */
package org.irods.jargon.webdav.config;

import org.irods.jargon.core.connection.AuthScheme;

/**
 * @author Mike Conway - DICE Config object wired by Spring
 * 
 */
public class WebDavConfig {

	private String host = "";
	private String zone = "";
	private int port = 0;
	private String defaultStorageResource = "";
	private String authScheme = AuthScheme.STANDARD.getTextValue();
	private String realm = "irods";

	/**
	 * 
	 */
	public WebDavConfig() {
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the zone
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * @param zone
	 *            the zone to set
	 */
	public void setZone(String zone) {
		this.zone = zone;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the defaultStorageResource
	 */
	public String getDefaultStorageResource() {
		return defaultStorageResource;
	}

	/**
	 * @param defaultStorageResource
	 *            the defaultStorageResource to set
	 */
	public void setDefaultStorageResource(String defaultStorageResource) {
		this.defaultStorageResource = defaultStorageResource;
	}

	/**
	 * @return the authScheme
	 */
	public String getAuthScheme() {
		return authScheme;
	}

	/**
	 * @param authScheme
	 *            the authScheme to set
	 */
	public void setAuthScheme(String authScheme) {
		this.authScheme = authScheme;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WebDavConfig [");
		if (host != null) {
			builder.append("host=");
			builder.append(host);
			builder.append(", ");
		}
		if (zone != null) {
			builder.append("zone=");
			builder.append(zone);
			builder.append(", ");
		}
		builder.append("port=");
		builder.append(port);
		builder.append(", ");
		if (defaultStorageResource != null) {
			builder.append("defaultStorageResource=");
			builder.append(defaultStorageResource);
			builder.append(", ");
		}
		if (authScheme != null) {
			builder.append("authScheme=");
			builder.append(authScheme);
			builder.append(", ");
		}
		if (realm != null) {
			builder.append("realm=");
			builder.append(realm);
		}
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the realm
	 */
	public String getRealm() {
		return realm;
	}

	/**
	 * @param realm
	 *            the realm to set
	 */
	public void setRealm(String realm) {
		this.realm = realm;
	}

}
