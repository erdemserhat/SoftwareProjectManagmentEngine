package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;

public class StakeHolder extends Employee {
    private String contactInformation;
    private String influenceLevel;
    private String expectations;
    private String engagementLevel;
    private PriorityLevel priority;
    private String satisfactionLevel;
    private String expectationsAlignment;
    private String communicationStyle;
    private String riskAppetite;
    private String decisionMakingAuthority;
    private String collaborationPreference;
    private String reportingRequirements;
    private boolean availability;
    private String domainKnowledge;
    private boolean feedbackPreference;

    /**
     * Constructs a new StakeHolder object with the specified attributes.
     *
     * @param name                   The first name of the employee.
     * @param surname                The last name or surname of the employee.
     * @param employeeNumber         The unique identification number assigned to the employee within the organization.
     * @param position               The job position or title of the employee.
     * @param department             The department or division in which the employee works.
     * @param email                  The email address of the employee.
     * @param hireDate               The date on which the employee was hired or started working.
     * @param salary                 The salary or compensation amount earned by the employee.
     * @param skills                 The skills and qualifications possessed by the employee.
     * @param birthDate              The date of birth of the employee.
     * @param address                The physical address or location of the employee.
     * @param educationStatus        The current education status or highest level of education attained by the employee.
     * @param experienceLevel        The level of professional experience or years of experience of the employee.
     * @param terminationDate        The date on which the employee's employment was terminated, if applicable.
     * @param socialMediaAccount     The social media account(s) associated with the employee, if any.
     * @param vocationDays           The number of vacation or paid time off (PTO) days available to the employee.
     * @param contactInformation     The contact information or preferred method of contact for the employee.
     * @param influenceLevel         The level of influence or impact the employee has within the organization.
     * @param expectations           The expectations or desired outcomes the employee has for their role or work.
     * @param engagementLevel        The level of engagement or involvement the employee has in their work.
     * @param priority               The priority level assigned to the employee's tasks or responsibilities.
     * @param satisfactionLevel      The level of job satisfaction or contentment experienced by the employee.
     * @param expectationsAlignment  The extent to which the employee's expectations align with the organization's goals or objectives.
     * @param communicationStyle     The preferred style or approach to communication for the employee.
     * @param riskAppetite           The willingness or comfort level with taking risks in work or decision-making.
     * @param decisionMakingAuthority The authority or decision-making power held by the employee.
     * @param collaborationPreference The preference for collaborating or working with others in a team.
     * @param reportingRequirements  The reporting requirements or frequency of reporting for the employee.
     * @param availability           The availability or working hours of the employee.
     * @param domainKnowledge        The knowledge and expertise in a specific domain or field.
     * @param feedbackPreference     The preference or receptiveness to receiving feedback from others.
     */
    public StakeHolder(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, String contactInformation, String influenceLevel, String expectations, String engagementLevel, PriorityLevel priority, String satisfactionLevel, String expectationsAlignment, String communicationStyle, String riskAppetite, String decisionMakingAuthority, String collaborationPreference, String reportingRequirements, boolean availability, String domainKnowledge, boolean feedbackPreference) {
        super(name, surname, employeeNumber, position, department, email, hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel, terminationDate, socialMediaAccount, vocationDays);
        this.contactInformation = contactInformation;
        this.influenceLevel = influenceLevel;
        this.expectations = expectations;
        this.engagementLevel = engagementLevel;
        this.priority = priority;
        this.satisfactionLevel = satisfactionLevel;
        this.expectationsAlignment = expectationsAlignment;
        this.communicationStyle = communicationStyle;
        this.riskAppetite = riskAppetite;
        this.decisionMakingAuthority = decisionMakingAuthority;
        this.collaborationPreference = collaborationPreference;
        this.reportingRequirements = reportingRequirements;
        this.availability = availability;
        this.domainKnowledge = domainKnowledge;
        this.feedbackPreference = feedbackPreference;
    }

    /**
     * Creates a new instance of the StakeHolder class with default values.
     */
    public StakeHolder() {
        super("", "", "", EmployeePosition.UNKNOWN, null, "", new Date(), 0, 0, new Date(), null, EducationStatus.HIGH_SCHOOL, ExperienceLevel.LEAD, null, new ArrayList<>(), 0);
        this.contactInformation = "Sample Contact Information";
        this.influenceLevel = "Sample Influence Level";
        this.expectations = "Sample Expectations";
        this.engagementLevel = "Sample Engagement Level";
        this.priority = PriorityLevel.HIGH;
        this.satisfactionLevel = "Sample Satisfaction Level";
        this.expectationsAlignment = "Sample Expectations Alignment";
        this.communicationStyle = "Sample Communication Style";
        this.riskAppetite = "Sample Risk Appetite";
        this.decisionMakingAuthority = "Sample Decision-Making Authority";
        this.collaborationPreference = "Sample Collaboration Preference";
        this.reportingRequirements = "Sample Reporting Requirements";
        this.availability = false;
        this.domainKnowledge = "Sample Domain Knowledge";
        this.feedbackPreference = false;
    }

    /**
     * Returns the contact information or preferred method of contact for the stakeholder.
     *
     * @return The contact information of the stakeholder.
     */
    public String getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the contact information or preferred method of contact for the stakeholder.
     *
     * @param contactInformation The contact information of the stakeholder.
     */
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    /**
     * Returns the level of influence or impact the stakeholder has within the organization.
     *
     * @return The influence level of the stakeholder.
     */
    public String getInfluenceLevel() {
        return influenceLevel;
    }

    /**
     * Sets the level of influence or impact the stakeholder has within the organization.
     *
     * @param influenceLevel The influence level of the stakeholder.
     */
    public void setInfluenceLevel(String influenceLevel) {
        this.influenceLevel = influenceLevel;
    }

    /**
     * Returns the expectations or desired outcomes the stakeholder has for their role or work.
     *
     * @return The expectations of the stakeholder.
     */
    public String getExpectations() {
        return expectations;
    }

    /**
     * Sets the expectations or desired outcomes the stakeholder has for their role or work.
     *
     * @param expectations The expectations of the stakeholder.
     */
    public void setExpectations(String expectations) {
        this.expectations = expectations;
    }

    /**
     * Returns the level of engagement or involvement the stakeholder has in their work.
     *
     * @return The engagement level of the stakeholder.
     */
    public String getEngagementLevel() {
        return engagementLevel;
    }

    /**
     * Sets the level of engagement or involvement the stakeholder has in their work.
     *
     * @param engagementLevel The engagement level of the stakeholder.
     */
    public void setEngagementLevel(String engagementLevel) {
        this.engagementLevel = engagementLevel;
    }

    /**
     * Returns the priority level assigned to the stakeholder's tasks or responsibilities.
     *
     * @return The priority level of the stakeholder.
     */
    public PriorityLevel getPriority() {
        return priority;
    }

    /**
     * Sets the priority level assigned to the stakeholder's tasks or responsibilities.
     *
     * @param priority The priority level of the stakeholder.
     */
    public void setPriority(PriorityLevel priority) {
        this.priority = priority;
    }

    /**
     * Returns the level of job satisfaction or contentment experienced by the stakeholder.
     *
     * @return The satisfaction level of the stakeholder.
     */
    public String getSatisfactionLevel() {
        return satisfactionLevel;
    }

    /**
     * Sets the level of job satisfaction or contentment experienced by the stakeholder.
     *
     * @param satisfactionLevel The satisfaction level of the stakeholder.
     */
    public void setSatisfactionLevel(String satisfactionLevel) {
        this.satisfactionLevel = satisfactionLevel;
    }

    /**
     * Returns the extent to which the stakeholder's expectations align with the organization's goals or objectives.
     *
     * @return The expectations alignment of the stakeholder.
     */
    public String getExpectationsAlignment() {
        return expectationsAlignment;
    }

    /**
     * Sets the extent to which the stakeholder's expectations align with the organization's goals or objectives.
     *
     * @param expectationsAlignment The expectations alignment of the stakeholder.
     */
    public void setExpectationsAlignment(String expectationsAlignment) {
        this.expectationsAlignment = expectationsAlignment;
    }

    /**
     * Returns the preferred style or approach to communication for the stakeholder.
     *
     * @return The communication style of the stakeholder.
     */
    public String getCommunicationStyle() {
        return communicationStyle;
    }

    /**
     * Sets the preferred style or approach to communication for the stakeholder.
     *
     * @param communicationStyle The communication style of the stakeholder.
     */
    public void setCommunicationStyle(String communicationStyle) {
        this.communicationStyle = communicationStyle;
    }

    /**
     * Returns the willingness or comfort level with taking risks in work or decision-making for the stakeholder.
     *
     * @return The risk appetite of the stakeholder.
     */
    public String getRiskAppetite() {
        return riskAppetite;
    }

    /**
     * Sets the willingness or comfort level with taking risks in work or decision-making for the stakeholder.
     *
     * @param riskAppetite The risk appetite of the stakeholder.
     */
    public void setRiskAppetite(String riskAppetite) {
        this.riskAppetite = riskAppetite;
    }

    /**
     * Returns the authority or decision-making power held by the stakeholder.
     *
     * @return The decision-making authority of the stakeholder.
     */
    public String getDecisionMakingAuthority() {
        return decisionMakingAuthority;
    }

    /**
     * Sets the authority or decision-making power held by the stakeholder.
     *
     * @param decisionMakingAuthority The decision-making authority of the stakeholder.
     */
    public void setDecisionMakingAuthority(String decisionMakingAuthority) {
        this.decisionMakingAuthority = decisionMakingAuthority;
    }

    /**
     * Returns the preference for collaborating or working with others in a team for the stakeholder.
     *
     * @return The collaboration preference of the stakeholder.
     */
    public String getCollaborationPreference() {
        return collaborationPreference;
    }

    /**
     * Sets the preference for collaborating or working with others in a team for the stakeholder.
     *
     * @param collaborationPreference The collaboration preference of the stakeholder.
     */
    public void setCollaborationPreference(String collaborationPreference) {
        this.collaborationPreference = collaborationPreference;
    }

    /**
     * Returns the reporting requirements or frequency of reporting for the stakeholder.
     *
     * @return The reporting requirements of the stakeholder.
     */
    public String getReportingRequirements() {
        return reportingRequirements;
    }

    /**
     * Sets the reporting requirements or frequency of reporting for the stakeholder.
     *
     * @param reportingRequirements The reporting requirements of the stakeholder.
     */
    public void setReportingRequirements(String reportingRequirements) {
        this.reportingRequirements = reportingRequirements;
    }

    /**
     * Returns the availability or working hours of the stakeholder.
     *
     * @return The availability of the stakeholder.
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * Sets the availability or working hours of the stakeholder.
     *
     * @param availability The availability of the stakeholder.
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * Returns the knowledge and expertise in a specific domain or field for the stakeholder.
     *
     * @return The domain knowledge of the stakeholder.
     */
    public String getDomainKnowledge() {
        return domainKnowledge;
    }

    /**
     * Sets the knowledge and expertise in a specific domain or field for the stakeholder.
     *
     * @param domainKnowledge The domain knowledge of the stakeholder.
     */
    public void setDomainKnowledge(String domainKnowledge) {
        this.domainKnowledge = domainKnowledge;
    }

    /**
     * Returns the preference or receptiveness to receiving feedback from others for the stakeholder.
     *
     * @return The feedback preference of the stakeholder.
     */
    public boolean isFeedbackPreference() {
        return feedbackPreference;
    }

    /**
     * Sets the preference or receptiveness to receiving feedback from others for the stakeholder.
     *
     * @param feedbackPreference The feedback preference of the stakeholder.
     */
    public void setFeedbackPreference(boolean feedbackPreference) {
        this.feedbackPreference = feedbackPreference;
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
