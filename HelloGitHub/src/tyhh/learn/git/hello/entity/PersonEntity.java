package tyhh.learn.git.hello.entity;

import java.util.Date;

/**
 * person entity
 * 
 * @author tyhh
 *
 */
public class PersonEntity extends GenericEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 3003271556598725574L;
    
    private String name;
    private int age;
    private String email;
    private String address;
    
    /**
     * Default constructor
     */
    public PersonEntity() {
	super();
	this.createdDate = new Date();
	this.modifiedDate = new Date(); 
    }
    
    /**
     * medium constructor
     * 
     * @param name
     * @param email
     */
    public PersonEntity(String name, String email) {
	super();
	this.createdDate = new Date();
	this.modifiedDate = new Date();
	this.name = name;
	this.email = email;
    }
    
    /**
     * full constructor
     * 
     * @param name
     * @param age
     * @param email
     * @param address
     */
    public PersonEntity(String name, int age, String email, String address) {
	super();
	this.createdDate = new Date();
	this.modifiedDate = new Date();
	this.name = name;
	this.email = email;
	this.age = age;
	this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString() {
	return "[" + super.id + ", " + name + ", " + email + "]";
    }
}
