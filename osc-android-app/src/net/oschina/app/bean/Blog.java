package net.oschina.app.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author HuangWenwei
 * 
 * @date 2014年9月29日
 */
@SuppressWarnings("serial")
@XStreamAlias("blog")
public class Blog extends Entity {
	
	@XStreamAlias("title")
	private String title;

	@XStreamAlias("url")
	private String url;

	@XStreamAlias("where")
	private String where;

	@XStreamAlias("commentcount")
	private int commentCount;

	@XStreamAlias("body")
	private String body;

	@XStreamAlias("authorname")
	private String authorname;

	@XStreamAlias("authoruid")
	private int authoruid;

	@XStreamAlias("documenttype")
	private int documentType;

	@XStreamAlias("pubdate")
	private String pubDate;

	@XStreamAlias("favorite")
	private int favorite;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAuthor() {
		return authorname;
	}

	public void setAuthor(String author) {
		this.authorname = author;
	}

	public int getAuthorId() {
		return authoruid;
	}

	public void setAuthorId(int authorId) {
		this.authoruid = authorId;
	}

	public int getDocumenttype() {
		return documentType;
	}

	public void setDocumenttype(int documenttype) {
		this.documentType = documenttype;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public int getFavorite() {
		return favorite;
	}

	public void setFavorite(int favorite) {
		this.favorite = favorite;
	}
}