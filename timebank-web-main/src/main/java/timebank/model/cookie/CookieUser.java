package timebank.model.cookie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import timebank.model.user.User;


/**
 * cookie for user
 * @author Calvin Chen
 * @createTime Apr 13, 2012
 */
@Entity
@Table(name = "cookie_user")
public class CookieUser {
	
	/**
	 * cookie user id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cookie_id", nullable = false, unique = true)
	private int cookieUserId;
	
	/**
	 * owner of the cookie is a user.
	 */
	@ManyToOne
	@JoinColumn(name = "cookie_user_id", nullable = false, unique = false)
	private User cookieOwner;
	
	/**
	 * session id content of the cookie
	 */
	@Column(name = "session_id_content", nullable = false, unique = false)
	private String sessionIdContent;

	public int getCookieUserId() {
		return cookieUserId;
	}

	public void setCookieUserId(int cookieUserId) {
		this.cookieUserId = cookieUserId;
	}

	public User getCookieOwner() {
		return cookieOwner;
	}

	public void setCookieOwner(User cookieOwner) {
		this.cookieOwner = cookieOwner;
	}

	public String getSessionIdContent() {
		return sessionIdContent;
	}

	public void setSessionIdContent(String sessionIdContent) {
		this.sessionIdContent = sessionIdContent;
	}
}