package com.YuHao.jobtracker.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "job_db", schema = "job")
public class Application{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private Integer application_id;

    @Column(name = "application_date")
    private LocalDate application_date;

    @Column(name = "status")
    private String status;

    @Column(name = "note")
    private String note;

    @Column(name = "skill")
    private String skill;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String company;

    @Column(name = "interview")
    private String interview;

    @Column(name = "deadline")
    private LocalDate deadline;

    @Column(name = "user_id")
    private Integer user_id;

    //Getters and Setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getApplication_id() {
        return application_id;
    }

    public void setApplication_id(Integer application_id) {
        this.application_id = application_id;
    }

    public LocalDate getApplication_date() {
        return application_date;
    }

    public void setApplication_date(LocalDate application_date) {
        this.application_date = application_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getInterview() {
        return interview;
    }

    public void setInterview(String interview) {
        this.interview = interview;
    }
}