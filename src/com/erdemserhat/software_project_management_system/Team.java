package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;

/**
 * Represents a team within an organization.
 */
public abstract class Team {
    private String name;
    private ArrayList<Employee> employees;
    private String responsibilities;
    private String skills;
    private int meetingSchedule;



    /**
     * Constructs a new Team object.
     *
     * @param name             The name or title of the team.
     * @param employees        The list of employees or team members in the team.
     * @param responsibilities The responsibilities or roles assigned to the team.
     * @param skills           The required skills or qualifications for the team.
     * @param meetingSchedule  The schedule or frequency of team meetings.
     */
    public Team(String name, ArrayList<Employee> employees, String responsibilities, String skills, int meetingSchedule) {
        this.name = name;
        this.employees = employees;
        this.responsibilities = responsibilities;
        this.skills = skills;
        this.meetingSchedule = meetingSchedule;
    }

    /**
     * Returns the name of the team.
     *
     * @return The name of the team.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the team.
     *
     * @param name The name of the team.
     */
    public void setName(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            System.err.println("Error setting name: " + e.getMessage());
        }
    }

    /**
     * Returns the list of employees or team members in the team.
     *
     * @return The list of employees or team members.
     */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    /**
     * Sets the list of employees or team members in the team.
     *
     * @param employees The list of employees or team members.
     */
    public void setEmployees(ArrayList<Employee> employees) {
        try {
            this.employees = employees;
        } catch (Exception e) {
            System.err.println("Error setting employees: " + e.getMessage());
        }
    }

    /**
     * Returns the responsibilities or roles assigned to the team.
     *
     * @return The responsibilities or roles of the team.
     */
    public String getResponsibilities() {
        return responsibilities;
    }

    /**
     * Sets the responsibilities or roles assigned to the team.
     *
     * @param responsibilities The responsibilities or roles of the team.
     */
    public void setResponsibilities(String responsibilities) {
        try {
            this.responsibilities = responsibilities;
        } catch (Exception e) {
            System.err.println("Error setting responsibilities: " + e.getMessage());
        }
    }

    /**
     * Returns the required skills or qualifications for the team.
     *
     * @return The required skills or qualifications.
     */
    public String getSkills() {
        return skills;
    }

    /**
     * Sets the required skills or qualifications for the team.
     *
     * @param skills The required skills or qualifications.
     */
    public void setSkills(String skills) {
        try {
            this.skills = skills;
        } catch (Exception e) {
            System.err.println("Error setting skills: " + e.getMessage());
        }
    }

    /**
     * Returns the schedule or frequency of team meetings.
     *
     * @return The meeting schedule of the team.
     */
    public int getMeetingSchedule() {
        return meetingSchedule;
    }

    /**
     * Sets the schedule or frequency of team meetings.
     *
     * @param meetingSchedule The meeting schedule of the team.
     */
    public void setMeetingSchedule(int meetingSchedule) {
        try {
            this.meetingSchedule = meetingSchedule;
        } catch (Exception e) {
            System.err.println("Error setting meeting schedule: " + e.getMessage());
        }
    }

    /**
     * Calculates the workload of the team.
     */
    public void calculateWorkload() {
        // Implementing the logic to calculate the workload of the team
        System.out.println("Calculating workload...");
    }

    /**
     * Evaluates the performance of the team.
     */
    public void evaluateTeamPerformance() {
        // Implementing the logic to evaluate the performance of the team
        System.out.println("Evaluating team performance...");
    }

    /**
     * Generates a report for the team.
     */
    public void generateTeamReport() {
        // Implementing the logic to generate a report for the team
        System.out.println("Generating team report...");
    }

    /**
     * Communicates with another team.
     *
     * @param team The team to communicate with.
     */
    public void communicate(Team team) {
        System.out.println(team.getName() + " is communicating with " + this.name);
    }
}
