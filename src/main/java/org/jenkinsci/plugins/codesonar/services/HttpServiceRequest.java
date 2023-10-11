package org.jenkinsci.plugins.codesonar.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.jenkinsci.plugins.codesonar.CodeSonarPluginException;


/** Provides extended properties for a CodeSonar hub request. */
public class HttpServiceRequest {
    private URI uri;
    private String uriString;
    private String httpMethod = "GET";
    private Collection<Map.Entry<String,String>> headers;

    public HttpServiceRequest(URI uri) throws CodeSonarPluginException {
        if (uri == null) {
            throw new CodeSonarPluginException("URI cannot be null");
        }
        this.uri = uri;
        this.uriString = uri.toString();
        this.headers = new ArrayList<Map.Entry<String,String>>(4);
    }

    public HttpServiceRequest(String uri) throws CodeSonarPluginException {
        if (uri == null) {
            throw new CodeSonarPluginException("URI cannot be null");
        }
        try {
            this.uri = new URI(uri);
        } catch (URISyntaxException ex) {
            throw new CodeSonarPluginException("Could not parse URI", ex);
        }
        this.uriString = uri;
        this.headers = new ArrayList<Map.Entry<String,String>>(4);
    }

    public String getURIString() {
        return this.uriString;
    }

    public URI getURI() {
        return this.uri;
    }

    public String getHTTPMethod() {
        return this.httpMethod;
    }

    public HttpServiceRequest setHTTPMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    public Collection<Map.Entry<String,String>> getHeaderCollection() {
        return this.headers;
    }

    public HttpServiceRequest addHeader(String name, String value) {
        this.headers.add(new AbstractMap.SimpleEntry<String,String>(name, value));
        return this;
    }
}
