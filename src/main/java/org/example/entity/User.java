package org.example.entity;

import org.example.utils.enums.GenderType;
import org.example.utils.enums.MajorType;
import org.example.utils.enums.Role;

public class User {

    private Long id;
    private String userName;
    private String password;

    private  String firstName;

    private String lastName;

    private GenderType gender;

    private MajorType major;

    private String skill;

    private Role role;


    public User() {
    }

    public static class UserBuilder {
        private User user;

        public UserBuilder() {
            user = new User();
        }

        public UserBuilder withId(Long id) {
            user.id = id;
            return this;
        }

        public UserBuilder withUserName(String userName) {
            user.userName = userName;
            return this;
        }

        public UserBuilder withFirstName(String firstName) {
            user.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            user.lastName = lastName;
            return this;
        }

        public UserBuilder withPassword(String password) {
            user.password = password;
            return this;
        }

        public UserBuilder withGender(GenderType gender) {
            user.gender = gender;
            return this;
        }

        public UserBuilder withMajor(MajorType major) {
            user.major = major;
            return this;
        }

        public UserBuilder withSkill(String skill) {
            user.skill = skill;
            return this;
        }

        public UserBuilder withRole(Role role) {
            user.role = role;
            return this;
        }

        public User build() {
            return user;
        }
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public MajorType getMajor() {
        return major;
    }

    public void setMajor(MajorType major) {
        this.major = major;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
