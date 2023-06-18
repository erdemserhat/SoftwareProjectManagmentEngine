package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a project manager, who is an employee responsible for managing projects.
 */
public class ProjectManager extends Employee {
    private String milestoneList;
    private String clientFeedback;
    private String riskAssessment;
    private String taskProgress;
    private int budgetUsed;

    /**
     * Constructs a project manager object with the specified details.
     *
     * @param name               The name of the employee.
     * @param surname            The surname of the employee.
     * @param employeeNumber     The unique employee number.
     * @param position           The job position of the employee.
     * @param department         The department in which the employee works.
     * @param email              The email address of the employee.
     * @param hireDate           The date when the employee was hired.
     * @param salary             The salary of the employee.
     * @param skills             The skills possessed by the employee.
     * @param birthDate          The date of birth of the employee.
     * @param address            The address of the employee.
     * @param educationStatus    The education status of the employee.
     * @param experienceLevel    The level of experience of the employee.
     * @param terminationDate    The date when the employee's employment terminated.
     * @param socialMediaAccount The social media account of the employee.
     * @param vocationDays       The number of vacation days the employee has.
     * @param milestoneList      The list of milestones achieved by the employee.
     * @param clientFeedback     The feedback received from clients for the employee's work.
     * @param riskAssessment     The assessment of risks associated with the employee's work.
     * @param taskProgress       The progress of tasks assigned to the employee.
     * @param budgetUsed         The amount of budget utilized by the employee for assigned tasks.
     */
    public ProjectManager(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, String milestoneList, String clientFeedback, String riskAssessment, String taskProgress, int budgetUsed) {
        super(name, surname, employeeNumber, position, department, email, hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel, terminationDate, socialMediaAccount, vocationDays);
        this.milestoneList = milestoneList;
        this.clientFeedback = clientFeedback;
        this.riskAssessment = riskAssessment;
        this.taskProgress = taskProgress;
        this.budgetUsed = budgetUsed;
    }

    /**
     * Creates a new instance of the ProjectManager class with default values.
     */
    public ProjectManager() {
        super("", "", "", EmployeePosition.PROJECT_MANAGER, Department.IT, "", new Date(), 0, 0, new Date(), new Address(), EducationStatus.NONE, ExperienceLevel.JUNIOR, null, new ArrayList<>(), 0);
        this.milestoneList = "Sample Milestone List";
        this.clientFeedback = "Sample Client Feedback";
        this.riskAssessment = "Sample Risk Assessment";
        this.taskProgress = "Sample Task Progress";
        this.budgetUsed = 0;
    }
    /**
     * Gets the milestone list of the project manager.
     *
     * @return The milestone list of the project manager.
     */
    public String getMilestoneList() {
        return milestoneList;
    }

    /**
     * Sets the milestone list for the project manager.
     *
     * @param milestoneList The milestone list to be set.
     */
    public void setMilestoneList(String milestoneList) {
        try {
            this.milestoneList = milestoneList;
        } catch (Exception e) {
            System.err.println("Error setting milestone list: " + e.getMessage());
        }
    }

    /**
     * Gets the client feedback for the project manager.
     *
     * @return The client feedback for the project manager.
     */
    public String getClientFeedback() {
        return clientFeedback;
    }

    /**
     * Sets the client feedback for the project manager.
     *
     * @param clientFeedback The client feedback to be set.
     */
    public void setClientFeedback(String clientFeedback) {
        try {
            this.clientFeedback = clientFeedback;
        } catch (Exception e) {
            System.err.println("Error setting client feedback: " + e.getMessage());
        }
    }

    /**
     * Gets the risk assessment for the project manager.
     *
     * @return The risk assessment for the project manager.
     */
    public String getRiskAssessment() {
        return riskAssessment;
    }

    /**
     * Sets the risk assessment for the project manager.
     *
     * @param riskAssessment The risk assessment to be set.
     */
    public void setRiskAssessment(String riskAssessment) {
        try {
            this.riskAssessment = riskAssessment;
        } catch (Exception e) {
            System.err.println("Error setting risk assessment: " + e.getMessage());
        }
    }

    /**
     * Gets the task progress for the project manager.
     *
     * @return The task progress for the project manager.
     */
    public String getTaskProgress() {
        return taskProgress;
    }

    /**
     * Sets the task progress for the project manager.
     *
     * @param taskProgress The task progress to be set.
     */
    public void setTaskProgress(String taskProgress) {
        try {
            this.taskProgress = taskProgress;
        } catch (Exception e) {
            System.err.println("Error setting task progress: " + e.getMessage());
        }
    }

    /**
     * Gets the budget used by the project manager.
     *
     * @return The budget used by the project manager.
     */
    public int getBudgetUsed() {
        return budgetUsed;
    }

    /**
     * Sets the budget used by the project manager.
     *
     * @param budgetUsed The budget used to be set.
     */
    public void setBudgetUsed(int budgetUsed) {
        try {
            this.budgetUsed = budgetUsed;
        } catch (Exception e) {
            System.err.println("Error setting budget used: " + e.getMessage());
        }
    }

    /**
     * Assigns a task to the project manager.
     */
    public void assignTask() {
        System.out.println("Assigning task.");
    }

    /**
     * Updates the progress of tasks assigned to the project manager.
     */
    public void updateProgress() {
        System.out.println("Updating progress.");
    }

    /**
     * Schedules a meeting for the project manager.
     */
    public void scheduleMeeting() {
        System.out.println("Scheduling meeting.");
    }

    /**
     * Generates a report for the project manager.
     */
    public void generateReport() {
        System.out.println("Generating report.");
    }

    /**
     * Handles risks associated with the project manager's work.
     */
    public void handleRisk() {
        System.out.println("Handling risk.");
    }

    /**
     * Reviews client feedback received for the project manager's work.
     */
    public void reviewClientFeedback() {
        System.out.println("Reviewing client feedback.");
    }

    @Override
    public double calculateSalary() {
        // Calculate the salary based on specific logic
        double salary = 5000.0;
        return salary;
    }

    @Override
    public Date getNextPaymentDate() {
        // Retrieve the next payment date based on specific logic
        Date nextPaymentDate = new Date();
        return nextPaymentDate;
    }

    @Override
    public void processPayment() {
        // Perform the payment processing operations
        System.out.println("Processing payment for the employee...");
        System.out.println("Payment processed successfully.");
    }
}
