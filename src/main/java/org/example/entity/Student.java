package org.example.entity;

import org.example.utils.enums.MajorType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String FirName;

    private String LastName;

    private String contact;
    private byte age;
    private String address;


    private float gpa; /// Hghest Qualification

    private MajorType major;

    private String hobbies;

    private String sport;
    public Student() {
    }

    public Student(int id, String firName, String lastName, String contact, byte age, String address, float gpa, MajorType major, String hobbies, String sport) {
        this.id = id;
        FirName = firName;
        LastName = lastName;
        this.contact = contact;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
        this.major = major;
        this.hobbies = hobbies;
        this.sport = sport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirName() {
        return FirName;
    }

    public void setFirName(String firName) {
        FirName = firName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public MajorType getMajor() {
        return major;
    }

    public void setMajor(MajorType major) {
        this.major = major;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
