package models;

import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "organizationcategories")
public class OrganizationCategory extends Model {

    @Id
    public String id = UUID.randomUUID().toString().replaceAll("-", "");
    private String reference;
    private String name;
    private String label;
    @ManyToMany( mappedBy = "categories", cascade = CascadeType.ALL )
    public List< Organization > organizations;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    public static int count = 0;

    public OrganizationCategory(){
         setReference( "org-cat-" + count++ );
         setCreateTime( new Date() );
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String toString(){
        return "Org Category: " + getName() + " " + getLabel() + " " + getReference() ;
    }
}
