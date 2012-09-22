package tyhh.learn.git.hello.entity;

/**
 * HelloEntity
 * 
 * @author tyhh
 *
 */
public class HelloEntity {

    /**
     * name of people who will received the message
     */
    String name;
    
    /**
     * the message want to send
     */
    String message;
    
    /**
     * default constructor
     */
    public HelloEntity() {
	
    }
    
    /**
     * full constructor
     * @param name
     * @param message
     */
    public HelloEntity(String name, String message) {
	this.name = name;
	this.message = message;
    }
    
    /**
     * send message for person who has name
     * 
     * @return the message
     */
    public String getMessage() {
	return "message : " + message + ", for : " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
