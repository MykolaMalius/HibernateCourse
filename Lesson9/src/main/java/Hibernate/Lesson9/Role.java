package Hibernate.Lesson9;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users = new HashSet<User>();//Now one Role can have many Users
	
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

