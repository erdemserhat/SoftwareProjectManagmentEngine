package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;

/**
 * The `SoftwareArchitect` class represents a software architect, who is responsible for designing and overseeing the
 * architecture of software systems.
 */
public class SoftwareArchitect extends Employee {
    private String specializedArea;
    private String certifications;
    private String responsibilities;
    private String designSkills;
    private String communicationSkills;
    private String projectsCompleted;
    private String technologyStack;
    private String leadershipExperience;
    private String industryKnowledge;

    /**
     * Creates a new `SoftwareArchitect` object with the specified details.
     *
     * @param name                 The first name of the employee.
     * @param surname              The last name or surname of the employee.
     * @param employeeNumber       The unique identification number assigned to the employee within the organization.
     * @param position             The job position or title of the employee.
     * @param department           The department or division in which the employee works.
     * @param email                The email address of the employee.
     * @param hireDate             The date on which the employee was hired or started working.
     * @param salary               The salary or compensation amount earned by the employee.
     * @param skills               The skills and qualifications possessed by the employee.
     * @param birthDate            The date of birth of the employee.
     * @param address              The physical address or location of the employee.
     * @param educationStatus      The current education status or highest level of education attained by the employee.
     * @param experienceLevel      The level of professional experience or years of experience of the employee.
     * @param terminationDate      The date on which the employee's employment was terminated, if applicable.
     * @param socialMediaAccount   The social media account(s) associated with the employee, if any.
     * @param vocationDays         The number of vacation or paid time off (PTO) days available to the employee.
     * @param specializedArea      The specialized area or domain of expertise of the employee.
     * @param certifications       The certifications or qualifications obtained by the employee.
     * @param responsibilities     The specific duties, tasks, or responsibilities assigned to the employee.
     * @param designSkills         The design skills or proficiency of the employee.
     * @param communicationSkills  The communication skills or proficiency of the employee.
     * @param projectsCompleted    The number of projects successfully completed by the employee.
     * @param technologyStack      The technology stack or set of technologies used by the employee.
     * @param leadershipExperience The experience or ability to take on leadership roles.
     * @param industryKnowledge    The knowledge and understanding of the industry in which the employee works.
     */
    public SoftwareArchitect(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, String specializedArea, String certifications, String responsibilities, String designSkills, String communicationSkills, String projectsCompleted, String technologyStack, String leadershipExperience, String industryKnowledge) {
        super(name, surname, employeeNumber, position, department, email, hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel, terminationDate, socialMediaAccount, vocationDays);
        this.specializedArea = specializedArea;
        this.certifications = certifications;
        this.responsibilities = responsibilities;
        this.designSkills = designSkills;
        this.communicationSkills = communicationSkills;
        this.projectsCompleted = projectsCompleted;
        this.technologyStack = technologyStack;
        this.leadershipExperience = leadershipExperience;
        this.industryKnowledge = industryKnowledge;
    }

    /**
     * Default Constructor for testing..
     */
    public SoftwareArchitect() {
        super("", "", "", EmployeePosition.SOFTWARE_ENGİNEER, Department.IT, "", new Date(), 0, 0, new Date(), new Address(), EducationStatus.NONE, ExperienceLevel.JUNIOR, null, new ArrayList<>(), 0);
        this.specializedArea = "Sample Specialized Area";
        this.certifications = "Sample Certifications";
        this.responsibilities = "Sample Responsibilities";
        this.designSkills = "Sample Design Skills";
        this.communicationSkills = "Sample Communication Skills";
        this.projectsCompleted = "Sample Projects Completed";
        this.technologyStack = "Sample Technology Stack";
        this.leadershipExperience = "Sample Leadership Experience";
        this.industryKnowledge = "Sample Industry Knowledge";
    }

    /**
     * Retrieves the specialized area or domain of expertise of the software architect.
     *
     * @return The specialized area of the software architect.
     */
    public String getSpecializedArea() {
        return specializedArea;
    }

    /**
     * Sets the specialized area or domain of expertise of the software architect.
     *
     * @param specializedArea The specialized area of the software architect to be set.
     */
    public void setSpecializedArea(String specializedArea) {
        try {
            this.specializedArea = specializedArea;
        } catch (Exception e) {
            System.err.println("Error setting specialized area: " + e.getMessage());
        }
    }

    /**
     * Retrieves the certifications or qualifications obtained by the software architect.
     *
     * @return The certifications of the software architect.
     */
    public String getCertifications() {
        return certifications;
    }

    /**
     * Sets the certifications or qualifications obtained by the software architect.
     *
     * @param certifications The certifications of the software architect to be set.
     */
    public void setCertifications(String certifications) {
        try {
            this.certifications = certifications;
        } catch (Exception e) {
            System.err.println("Error setting certifications: " + e.getMessage());
        }
    }

    /**
     * Retrieves the specific duties, tasks, or responsibilities assigned to the software architect.
     *
     * @return The responsibilities of the software architect.
     */
    public String getResponsibilities() {
        return responsibilities;
    }

    /**
     * Sets the specific duties, tasks, or responsibilities assigned to the software architect.
     *
     * @param responsibilities The responsibilities of the software architect to be set.
     */
    public void setResponsibilities(String responsibilities) {
        try {
            this.responsibilities = responsibilities;
        } catch (Exception e) {
            System.err.println("Error setting responsibilities: " + e.getMessage());
        }
    }

    /**
     * Retrieves the design skills or proficiency of the software architect.
     *
     * @return The design skills of the software architect.
     */
    public String getDesignSkills() {
        return designSkills;
    }

    /**
     * Sets the design skills or proficiency of the software architect.
     *
     * @param designSkills The design skills of the software architect to be set.
     */
    public void setDesignSkills(String designSkills) {
        try {
            this.designSkills = designSkills;
        } catch (Exception e) {
            System.err.println("Error setting design skills: " + e.getMessage());
        }
    }

    /**
     * Retrieves the communication skills or proficiency of the software architect.
     *
     * @return The communication skills of the software architect.
     */
    public String getCommunicationSkills() {
        return communicationSkills;
    }

    /**
     * Sets the communication skills or proficiency of the software architect.
     *
     * @param communicationSkills The communication skills of the software architect to be set.
     */
    public void setCommunicationSkills(String communicationSkills) {
        try {
            this.communicationSkills = communicationSkills;
        } catch (Exception e) {
            System.err.println("Error setting communication skills: " + e.getMessage());
        }
    }

    /**
     * Retrieves the number of projects successfully completed by the software architect.
     *
     * @return The number of projects completed by the software architect.
     */
    public String getProjectsCompleted() {
        return projectsCompleted;
    }

    /**
     * Sets the number of projects successfully completed by the software architect.
     *
     * @param projectsCompleted The number of projects completed by the software architect to be set.
     */
    public void setProjectsCompleted(String projectsCompleted) {
        try {
            this.projectsCompleted = projectsCompleted;
        } catch (Exception e) {
            System.err.println("Error setting projects completed: " + e.getMessage());
        }
    }

    /**
     * Retrieves the technology stack or set of technologies used by the software architect.
     *
     * @return The technology stack of the software architect.
     */
    public String getTechnologyStack() {
        return technologyStack;
    }

    /**
     * Sets the technology stack or set of technologies used by the software architect.
     *
     * @param technologyStack The technology stack of the software architect to be set.
     */
    public void setTechnologyStack(String technologyStack) {
        try {
            this.technologyStack = technologyStack;
        } catch (Exception e) {
            System.err.println("Error setting technology stack: " + e.getMessage());
        }
    }

    /**
     * Retrieves the experience or ability to take on leadership roles of the software architect.
     *
     * @return The leadership experience of the software architect.
     */
    public String getLeadershipExperience() {
        return leadershipExperience;
    }

    /**
     * Sets the experience or ability to take on leadership roles of the software architect.
     *
     * @param leadershipExperience The leadership experience of the software architect to be set.
     */
    public void setLeadershipExperience(String leadershipExperience) {
        try {
            this.leadershipExperience = leadershipExperience;
        } catch (Exception e) {
            System.err.println("Error setting leadership experience: " + e.getMessage());
        }
    }

    /**
     * Retrieves the knowledge and understanding of the industry in which the software architect works.
     *
     * @return The industry knowledge of the software architect.
     */
    public String getIndustryKnowledge() {
        return industryKnowledge;
    }

    /**
     * Sets the knowledge and understanding of the industry in which the software architect works.
     *
     * @param industryKnowledge The industry knowledge of the software architect to be set.
     */
    public void setIndustryKnowledge(String industryKnowledge) {
        try {
            this.industryKnowledge = industryKnowledge;
        } catch (Exception e) {
            System.err.println("Error setting industry knowledge: " + e.getMessage());
        }
    }

    /**
     * Creates an architecture plan.
     */
    public void createArchitecturePlan() {
        System.out.println("Creating architecture plan.");
    }

    /**
     * Reviews code.
     */
    public void reviewCode() {
        System.out.println("Reviewing code.");
    }

    /**
     * Provides technical guidance.
     */
    public void provideTechnicalGuidance() {
        System.out.println("Providing technical guidance.");
    }

    /**
     * Evaluates technology options.
     */
    public void evaluateTechnologyOptions() {
        System.out.println("Evaluating technology options.");
    }

    /**
     * Conducts architecture review.
     */
    public void conductArchitectureReview() {
        System.out.println("Conducting architecture review.");
    }

    /**
     * Collaborates with stakeholders.
     */
    public void collaborateWithStakeholders() {
        System.out.println("Collaborating with stakeholders.");
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
