package tyhh.learn.git.hello.entity;

import java.util.Date;

public abstract class GenericEntity implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -566901855678805191L;
    
    protected String id;
    protected Date createdDate;
    protected Date modifiedDate;
 
    /**
     * default constructor
     */
    public GenericEntity() {
	
    }

    protected String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected Date getCreatedDate() {
        return createdDate;
    }

    protected void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    protected Date getModifiedDate() {
        return modifiedDate;
    }

    protected void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public abstract String toString();
}
