package br.com.jsonparse.model;

import java.util.List;

public class Request {
	
	
	private String body;
	private String method;
	
	private List<Key> header;
	private List<Key> path;
	private List<Key> query;
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public List<Key> getHeader() {
		return header;
	}
	public void setHeader(List<Key> header) {
		this.header = header;
	}
	public List<Key> getPath() {
		return path;
	}
	public void setPath(List<Key> path) {
		this.path = path;
	}
	public List<Key> getQuery() {
		return query;
	}
	public void setQuery(List<Key> query) {
		this.query = query;
	}
	
	
	

}
