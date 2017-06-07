package Hibernate.Lesson8;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="RoleAnnotationsOneToOne")
public class Role {

	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", length=12)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@OneToOne(mappedBy="role")
	private User user;
	
	public Role(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

		
}

