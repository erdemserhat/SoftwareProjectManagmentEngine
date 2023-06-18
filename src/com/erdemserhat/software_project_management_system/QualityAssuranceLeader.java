package com.erdemserhat.software_project_management_system;

import java.util.Date;
import java.util.ArrayList;
public class QualityAssuranceLeader extends Employee {
    private int teamSize;
    private QualityStandards qualityStandards;
    private ProcessImprovement processImprovement;
    private boolean teamCollaboration;
    private PerformanceEvaluation performanceEvaluation;
    private ProcessDocumentation processDocumentation;
    private QualityAssuranceStrategy qualityAssuranceStrategy;

    /**
     * @param name:                     The first name of the employee.
     * @param surname:                  The last name or surname of the employee.
     * @param employeeNumber:           The unique identification number assigned to the employee within the organization.
     * @param position:                 The job position or title of the employee.
     * @param department:               The department or division in which the employee works.
     * @param email:                    The email address of the employee.
     * @param hireDate:                 The date on which the employee was hired or started working.
     * @param salary:                   The salary or compensation amount earned by the employee.
     * @param skills:                   The skills and qualifications possessed by the employee.
     * @param birthDate:                The date of birth of the employee.
     * @param address:                  The physical address or location of the employee.
     * @param educationStatus:          The current education status or highest level of education attained by the employee.
     * @param experienceLevel:          The level of professional experience or years of experience of the employee.
     * @param terminationDate:          The date on which the employee's employment was terminated, if applicable.
     * @param socialMediaAccount:       The social media account(s) associated with the employee, if any.
     * @param vocationDays:             The number of vacation or paid time off (PTO) days available to the employee.
     * @param teamSize:                 The number of team members or colleagues working with the employee.
     * @param qualityStandards:         The established standards or benchmarks for quality within the organization.
     * @param processImprovement:       Efforts or initiatives aimed at improving work processes or efficiency.
     * @param teamCollaboration:        The ability of the employee to collaborate effectively with team members.
     * @param performanceEvaluation:    The process or method used to evaluate the employee's performance.
     * @param processDocumentation:     The documentation or records related to work processes, procedures, or guidelines.
     * @param qualityAssuranceStrategy: The strategy or approach for ensuring quality in work or deliverables.
     */
    public QualityAssuranceLeader(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, int teamSize, QualityStandards qualityStandards, ProcessImprovement processImprovement, boolean teamCollaboration, PerformanceEvaluation performanceEvaluation, ProcessDocumentation processDocumentation, QualityAssuranceStrategy qualityAssuranceStrategy) {
        super(name, surname, employeeNumber, position, department, email, hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel, terminationDate, socialMediaAccount, vocationDays);
        this.teamSize = teamSize;
        this.qualityStandards = qualityStandards;
        this.processImprovement = processImprovement;
        this.teamCollaboration = teamCollaboration;
        this.performanceEvaluation = performanceEvaluation;
        this.processDocumentation = processDocumentation;
        this.qualityAssuranceStrategy = qualityAssuranceStrategy;
    }

    /**
     * Retrieves the team size of the quality assurance leader.
     *
     * @return The team size.
     */
    public int getTeamSize() {
        return teamSize;
    }

    /**
     * Sets the team size of the quality assurance leader.
     *
     * @param teamSize The team size to be set.
     */
    public void setTeamSize(int teamSize) {
        try {
            this.teamSize = teamSize;
        } catch (Exception e) {
            System.err.println("Error setting team size: " + e.getMessage());
        }
    }

    /**
     * Retrieves the quality standards for the quality assurance leader.
     *
     * @return The quality standards.
     */
    public QualityStandards getQualityStandards() {
        return qualityStandards;
    }

    /**
     * Sets the quality standards for the quality assurance leader.
     *
     * @param qualityStandards The quality standards to be set.
     */
    public void setQualityStandards(QualityStandards qualityStandards) {
        try {
            this.qualityStandards = qualityStandards;
        } catch (Exception e) {
            System.err.println("Error setting quality standards: " + e.getMessage());
        }
    }

    /**
     * Retrieves the process improvement efforts for the quality assurance leader.
     *
     * @return The process improvement efforts.
     */
    public ProcessImprovement getProcessImprovement() {
        return processImprovement;
    }

    /**
     * Sets the process improvement efforts for the quality assurance leader.
     *
     * @param processImprovement The process improvement efforts to be set.
     */
    public void setProcessImprovement(ProcessImprovement processImprovement) {
        try {
            this.processImprovement = processImprovement;
        } catch (Exception e) {
            System.err.println("Error setting process improvement: " + e.getMessage());
        }
    }

    /**
     * Checks if the quality assurance leader has team collaboration skills.
     *
     * @return True if the leader has team collaboration skills, false otherwise.
     */
    public boolean isTeamCollaboration() {
        return teamCollaboration;
    }

    /**
     * Sets the team collaboration skills for the quality assurance leader.
     *
     * @param teamCollaboration The team collaboration skills to be set.
     */
    public void setTeamCollaboration(boolean teamCollaboration) {
        try {
            this.teamCollaboration = teamCollaboration;
        } catch (Exception e) {
            System.err.println("Error setting team collaboration: " + e.getMessage());
        }
    }

    /**
     * Retrieves the performance evaluation process for the quality assurance leader.
     *
     * @return The performance evaluation process.
     */
    public PerformanceEvaluation getPerformanceEvaluation() {
        return performanceEvaluation;
    }

    /**
     * Sets the performance evaluation process for the quality assurance leader.
     *
     * @param performanceEvaluation The performance evaluation process to be set.
     */
    public void setPerformanceEvaluation(PerformanceEvaluation performanceEvaluation) {
        try {
            this.performanceEvaluation = performanceEvaluation;
        } catch (Exception e) {
            System.err.println("Error setting performance evaluation: " + e.getMessage());
        }
    }

    /**
     * Retrieves the process documentation for the quality assurance leader.
     *
     * @return The process documentation.
     */
    public ProcessDocumentation getProcessDocumentation() {
        return processDocumentation;
    }

    /**
     * Sets the process documentation for the quality assurance leader.
     *
     * @param processDocumentation The process documentation to be set.
     */
    public void setProcessDocumentation(ProcessDocumentation processDocumentation) {
        try {
            this.processDocumentation = processDocumentation;
        } catch (Exception e) {
            System.err.println("Error setting process documentation: " + e.getMessage());
        }
    }

    /**
     * Retrieves the quality assurance strategy for the quality assurance leader.
     *
     * @return The quality assurance strategy.
     */
    public QualityAssuranceStrategy getQualityAssuranceStrategy() {
        return qualityAssuranceStrategy;
    }

    /**
     * Sets the quality assurance strategy for the quality assurance leader.
     *
     * @param qualityAssuranceStrategy The quality assurance strategy to be set.
     */
    public void setQualityAssuranceStrategy(QualityAssuranceStrategy qualityAssuranceStrategy) {
        try {
            this.qualityAssuranceStrategy = qualityAssuranceStrategy;
        } catch (Exception e) {
            System.err.println("Error setting quality assurance strategy: " + e.getMessage());
        }
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
