package Hibernate.Lesson7;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Role")
public class Role {

	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", length=12)
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@OneToMany(mappedBy="role")//Here we have one User for many Roles
	private Set<User> users = new HashSet<User>();
	
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

		
}

