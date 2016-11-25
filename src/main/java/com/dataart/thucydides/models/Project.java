package com.dataart.thucydides.models;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class Project {

    private String projectName;
    private String dueDate;
    private String template;

    public Project(String projectName, String dueDate, String template) {
        this.projectName = projectName;
        this.dueDate = dueDate;
        this.template = template;
    }
    // working with project name
    public void setProjectName (String projectName) {
        this.projectName = projectName;
    }
    public String getProjectName() {
        return projectName;
    }

    // working with due date
    private Date date = new GregorianCalendar(2016, 12, 31).getTime();
    public void setDueDate (String date) {
        this.dueDate = date;
    }
    public String getDueDate() {
        return dueDate.toString();
    }

    // working with template
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
