package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;

/**
 * The BusinessAnalysts class represents a business analyst employee who possesses domain knowledge, requirements gathering skills,
 * data analysis skills, problem-solving ability, communication skills, documentation skills, stakeholder management ability,
 * business process mapping ability, requirement prioritization, user acceptance testing ability, and business requirements documentation skills.
 * It extends the Employee class and inherits its attributes and behaviors.
 */
public class BusinessAnalysts extends Employee {
    private String domainKnowledge;
    private String requirementsGatheringSkills;
    private String dataAnalysisSkills;
    private boolean problemSolvingAbility;
    private String communicationSkills;
    private String documentationSkills;
    private String stakeholderManagement;
    private String businessProcessMapping;
    private PriorityLevel requirementPrioritization;
    private boolean userAcceptanceTesting;
    private String businessRequirementsDocumentation;

    /**
     * Constructs a BusinessAnalysts object with the specified attributes.
     *
     * @param name                              The name of the employee.
     * @param surname                           The surname of the employee.
     * @param employeeNumber                    The unique employee number.
     * @param position                          The job position of the employee.
     * @param department                        The department in which the employee works.
     * @param email                             The email address of the employee.
     * @param hireDate                          The date when the employee was hired.
     * @param salary                            The salary of the employee.
     * @param skills                            The skills possessed by the employee.
     * @param birthDate                         The date of birth of the employee.
     * @param address                           The address of the employee.
     * @param educationStatus                   The education status of the employee.
     * @param experienceLevel                   The level of experience of the employee.
     * @param terminationDate                   The date when the employee's employment terminated.
     * @param socialMediaAccount                The social media accounts of the employee.
     * @param vocationDays                      The number of vacation days the employee has.
     * @param domainKnowledge                   The knowledge of the employee in a specific domain.
     * @param requirementsGatheringSkills       The skills of the employee in gathering requirements.
     * @param dataAnalysisSkills                The skills of the employee in data analysis.
     * @param problemSolvingAbility             The ability of the employee in problem-solving.
     * @param communicationSkills               The communication skills of the employee.
     * @param documentationSkills               The skills of the employee in documentation.
     * @param stakeholderManagement             The ability of the employee in stakeholder management.
     * @param businessProcessMapping            The ability of the employee in mapping business processes.
     * @param requirementPrioritization         The ability of the employee in prioritizing requirements.
     * @param userAcceptanceTesting             The ability of the employee in user acceptance testing.
     * @param businessRequirementsDocumentation The documentation skills of the employee for business requirements.
     */
    public BusinessAnalysts(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, String domainKnowledge, String requirementsGatheringSkills, String dataAnalysisSkills, boolean problemSolvingAbility, String communicationSkills, String documentationSkills, String stakeholderManagement, String businessProcessMapping, PriorityLevel requirementPrioritization, boolean userAcceptanceTesting, String businessRequirementsDocumentation) {
        super(name, surname, employeeNumber, position, department, email, hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel, terminationDate, socialMediaAccount, vocationDays);
        this.domainKnowledge = domainKnowledge;
        this.requirementsGatheringSkills = requirementsGatheringSkills;
        this.dataAnalysisSkills = dataAnalysisSkills;
        this.problemSolvingAbility = problemSolvingAbility;
        this.communicationSkills = communicationSkills;
        this.documentationSkills = documentationSkills;
        this.stakeholderManagement = stakeholderManagement;
        this.businessProcessMapping = businessProcessMapping;
        this.requirementPrioritization = requirementPrioritization;
        this.userAcceptanceTesting = userAcceptanceTesting;
        this.businessRequirementsDocumentation = businessRequirementsDocumentation;
    }

    /**
     * Creates a new instance of the BusinessAnalysts class with default values.
     */
    public BusinessAnalysts() {
        super("", "", "", EmployeePosition.UNKNOWN, null, "", new Date(), 0, 0, new Date(), null, EducationStatus.MASTER, ExperienceLevel.SENIOR, null, new ArrayList<>(), 0);
        this.domainKnowledge = "Sample Domain Knowledge";
        this.requirementsGatheringSkills = "Sample Requirements Gathering Skills";
        this.dataAnalysisSkills = "Sample Data Analysis Skills";
        this.problemSolvingAbility = false;
        this.communicationSkills = "Sample Communication Skills";
        this.documentationSkills = "Sample Documentation Skills";
        this.stakeholderManagement = "Sample Stakeholder Management";
        this.businessProcessMapping = "Sample Business Process Mapping";
        this.requirementPrioritization = PriorityLevel.MEDIUM;
        this.userAcceptanceTesting = false;
        this.businessRequirementsDocumentation = "Sample Business Requirements Documentation";
    }

    /**
     * Retrieves the domain knowledge of the business analyst.
     *
     * @return The domain knowledge of the business analyst.
     */
    public String getDomainKnowledge() {
        return domainKnowledge;
    }

    /**
     * Sets the domain knowledge of the business analyst.
     *
     * @param domainKnowledge The domain knowledge to set.
     */
    public void setDomainKnowledge(String domainKnowledge) {
        try {
            this.domainKnowledge = domainKnowledge;
        } catch (Exception e) {
            System.err.println("Error setting domain knowledge: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the requirements gathering skills of the business analyst.
     *
     * @return The requirements gathering skills of the business analyst.
     */
    public String getRequirementsGatheringSkills() {
        return requirementsGatheringSkills;
    }

    /**
     * Sets the requirements gathering skills of the business analyst.
     *
     * @param requirementsGatheringSkills The requirements gathering skills to set.
     */
    public void setRequirementsGatheringSkills(String requirementsGatheringSkills) {
        try {
            this.requirementsGatheringSkills = requirementsGatheringSkills;
        } catch (Exception e) {
            System.err.println("Error setting requirements gathering skills: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the data analysis skills of the business analyst.
     *
     * @return The data analysis skills of the business analyst.
     */
    public String getDataAnalysisSkills() {
        return dataAnalysisSkills;
    }

    /**
     * Sets the data analysis skills of the business analyst.
     *
     * @param dataAnalysisSkills The data analysis skills to set.
     */
    public void setDataAnalysisSkills(String dataAnalysisSkills) {
        try {
            this.dataAnalysisSkills = dataAnalysisSkills;
        } catch (Exception e) {
            System.err.println("Error setting data analysis skills: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the problem-solving ability of the business analyst.
     *
     * @return The problem-solving ability of the business analyst.
     */
    public boolean isProblemSolvingAbility() {
        return problemSolvingAbility;
    }

    /**
     * Sets the problem-solving ability of the business analyst.
     *
     * @param problemSolvingAbility The problem-solving ability to set.
     */
    public void setProblemSolvingAbility(boolean problemSolvingAbility) {
        try {
            this.problemSolvingAbility = problemSolvingAbility;
        } catch (Exception e) {
            System.err.println("Error setting problem-solving ability: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the communication skills of the business analyst.
     *
     * @return The communication skills of the business analyst.
     */
    public String getCommunicationSkills() {
        return communicationSkills;
    }

    /**
     * Sets the communication skills of the business analyst.
     *
     * @param communicationSkills The communication skills to set.
     */
    public void setCommunicationSkills(String communicationSkills) {
        try {
            this.communicationSkills = communicationSkills;
        } catch (Exception e) {
            System.err.println("Error setting communication skills: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the documentation skills of the business analyst.
     *
     * @return The documentation skills of the business analyst.
     */
    public String getDocumentationSkills() {
        return documentationSkills;
    }

    /**
     * Sets the documentation skills of the business analyst.
     *
     * @param documentationSkills The documentation skills to set.
     */
    public void setDocumentationSkills(String documentationSkills) {
        try {
            this.documentationSkills = documentationSkills;
        } catch (Exception e) {
            System.err.println("Error setting documentation skills: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the stakeholder management ability of the business analyst.
     *
     * @return The stakeholder management ability of the business analyst.
     */
    public String getStakeholderManagement() {
        return stakeholderManagement;
    }

    /**
     * Sets the stakeholder management ability of the business analyst.
     *
     * @param stakeholderManagement The stakeholder management ability to set.
     */
    public void setStakeholderManagement(String stakeholderManagement) {
        try {
            this.stakeholderManagement = stakeholderManagement;
        } catch (Exception e) {
            System.err.println("Error setting stakeholder management: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the business process mapping ability of the business analyst.
     *
     * @return The business process mapping ability of the business analyst.
     */
    public String getBusinessProcessMapping() {
        return businessProcessMapping;
    }

    /**
     * Sets the business process mapping ability of the business analyst.
     *
     * @param businessProcessMapping The business process mapping ability to set.
     */
    public void setBusinessProcessMapping(String businessProcessMapping) {
        try {
            this.businessProcessMapping = businessProcessMapping;
        } catch (Exception e) {
            System.err.println("Error setting business process mapping: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the requirement prioritization ability of the business analyst.
     *
     * @return The requirement prioritization ability of the business analyst.
     */
    public PriorityLevel getRequirementPrioritization() {
        return requirementPrioritization;
    }

    /**
     * Sets the requirement prioritization ability of the business analyst.
     *
     * @param requirementPrioritization The requirement prioritization ability to set.
     */
    public void setRequirementPrioritization(PriorityLevel requirementPrioritization) {
        try {
            this.requirementPrioritization = requirementPrioritization;
        } catch (Exception e) {
            System.err.println("Error setting requirement prioritization: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the user acceptance testing ability of the business analyst.
     *
     * @return The user acceptance testing ability of the business analyst.
     */
    public boolean isUserAcceptanceTesting() {
        return userAcceptanceTesting;
    }

    /**
     * Sets the user acceptance testing ability of the business analyst.
     *
     * @param userAcceptanceTesting The user acceptance testing ability to set.
     */
    public void setUserAcceptanceTesting(boolean userAcceptanceTesting) {
        try {
            this.userAcceptanceTesting = userAcceptanceTesting;
        } catch (Exception e) {
            System.err.println("Error setting user acceptance testing: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the business requirements documentation skills of the business analyst.
     *
     * @return The business requirements documentation skills of the business analyst.
     */
    public String getBusinessRequirementsDocumentation() {
        return businessRequirementsDocumentation;
    }

    /**
     * Sets the business requirements documentation skills of the business analyst.
     *
     * @param businessRequirementsDocumentation The business requirements documentation skills to set.
     */
    public void setBusinessRequirementsDocumentation(String businessRequirementsDocumentation) {
        try {
            this.businessRequirementsDocumentation = businessRequirementsDocumentation;
        } catch (Exception e) {
            System.err.println("Error setting business requirements documentation skills: " + e.getMessage());
            e.printStackTrace();
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
