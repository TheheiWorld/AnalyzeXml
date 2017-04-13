package com.juststand.xml.messagevo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/13.
 */
public class KeyPerson {

    private String Role;
    private String PartyName;
    private String Sex;
    private String ContactPhone;
    private String Title;
    private String Alias;
    private String Birthday;
    private String Memorial;
    private String Mate;
    private String Secretary;
    private String School;
    private String ClassMates;
    private String Hobby;
    private String Leader;
    private String LeaderDept;
    private String Vassal;
    private String Intercourse;

    @XmlElement(name = "Role")
    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @XmlElement(name = "PartyName")
    public String getPartyName() {
        return PartyName;
    }

    public void setPartyName(String partyName) {
        PartyName = partyName;
    }

    @XmlElement(name = "Sex")
    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @XmlElement(name = "ContactPhone")
    public String getContactPhone() {
        return ContactPhone;
    }

    public void setContactPhone(String contactPhone) {
        ContactPhone = contactPhone;
    }

    @XmlElement(name = "Title")
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @XmlElement(name = "Alias")
    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    @XmlElement(name = "Birthday")
    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    @XmlElement(name = "Memorial")
    public String getMemorial() {
        return Memorial;
    }

    public void setMemorial(String memorial) {
        Memorial = memorial;
    }

    @XmlElement(name = "Mate")
    public String getMate() {
        return Mate;
    }

    public void setMate(String mate) {
        Mate = mate;
    }

    @XmlElement(name = "Secretary")
    public String getSecretary() {
        return Secretary;
    }

    public void setSecretary(String secretary) {
        Secretary = secretary;
    }

    @XmlElement(name = "School")
    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @XmlElement(name = "ClassMates")
    public String getClassMates() {
        return ClassMates;
    }

    public void setClassMates(String classMates) {
        ClassMates = classMates;
    }

    @XmlElement(name = "Hobby")
    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }

    @XmlElement(name = "Leader")
    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    @XmlElement(name = "LeaderDept")
    public String getLeaderDept() {
        return LeaderDept;
    }

    public void setLeaderDept(String leaderDept) {
        LeaderDept = leaderDept;
    }

    @XmlElement(name = "Vassal")
    public String getVassal() {
        return Vassal;
    }

    public void setVassal(String vassal) {
        Vassal = vassal;
    }

    @XmlElement(name = "Intercourse")
    public String getIntercourse() {
        return Intercourse;
    }

    public void setIntercourse(String intercourse) {
        Intercourse = intercourse;
    }

    @Override
    public String toString() {
        return "KeyPerson{" +
                "Role='" + Role + '\'' +
                ", PartyName='" + PartyName + '\'' +
                ", Sex='" + Sex + '\'' +
                ", ContactPhone='" + ContactPhone + '\'' +
                ", Title='" + Title + '\'' +
                ", Alias='" + Alias + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", Memorial='" + Memorial + '\'' +
                ", Mate='" + Mate + '\'' +
                ", Secretary='" + Secretary + '\'' +
                ", School='" + School + '\'' +
                ", ClassMates='" + ClassMates + '\'' +
                ", Hobby='" + Hobby + '\'' +
                ", Leader='" + Leader + '\'' +
                ", LeaderDept='" + LeaderDept + '\'' +
                ", Vassal='" + Vassal + '\'' +
                ", Intercourse='" + Intercourse + '\'' +
                '}';
    }
}
