/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Guest123
 */
@Entity
@Table(name = "registration", catalog = "studentmanagement", schema = "")
@NamedQueries({
    @NamedQuery(name = "Registration_1.findAll", query = "SELECT r FROM Registration_1 r")
    , @NamedQuery(name = "Registration_1.findById", query = "SELECT r FROM Registration_1 r WHERE r.id = :id")
    , @NamedQuery(name = "Registration_1.findByAddress", query = "SELECT r FROM Registration_1 r WHERE r.address = :address")
    , @NamedQuery(name = "Registration_1.findByBatch", query = "SELECT r FROM Registration_1 r WHERE r.batch = :batch")
    , @NamedQuery(name = "Registration_1.findByCourse", query = "SELECT r FROM Registration_1 r WHERE r.course = :course")
    , @NamedQuery(name = "Registration_1.findByFirstname", query = "SELECT r FROM Registration_1 r WHERE r.firstname = :firstname")
    , @NamedQuery(name = "Registration_1.findByGender", query = "SELECT r FROM Registration_1 r WHERE r.gender = :gender")
    , @NamedQuery(name = "Registration_1.findByLastname", query = "SELECT r FROM Registration_1 r WHERE r.lastname = :lastname")
    , @NamedQuery(name = "Registration_1.findByNic", query = "SELECT r FROM Registration_1 r WHERE r.nic = :nic")
    , @NamedQuery(name = "Registration_1.findByTelephone", query = "SELECT r FROM Registration_1 r WHERE r.telephone = :telephone")})
public class Registration_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "address")
    private String address;
    @Column(name = "batch")
    private String batch;
    @Column(name = "course")
    private String course;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "gender")
    private String gender;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "nic")
    private String nic;
    @Column(name = "telephone")
    private String telephone;

    public Registration_1() {
    }

    public Registration_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        String oldBatch = this.batch;
        this.batch = batch;
        changeSupport.firePropertyChange("batch", oldBatch, batch);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        String oldNic = this.nic;
        this.nic = nic;
        changeSupport.firePropertyChange("nic", oldNic, nic);
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        String oldTelephone = this.telephone;
        this.telephone = telephone;
        changeSupport.firePropertyChange("telephone", oldTelephone, telephone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registration_1)) {
            return false;
        }
        Registration_1 other = (Registration_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StudentManagement.Registration_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
