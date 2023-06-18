package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a project owner, who is an employee responsible for owning and managing projects.
 */
public class ProjectOwner extends Employee {
    private String companyName;
    private String role;
    private String projects;
    private String expertise;
    private String responsibilities;
    private int budgetAllocation;
    private String collaborationTools;
    private List<StakeHolder> stakeholders;
    private String performanceMetrics;
    private String decisionMakingAuthority;
    private String communicationStrategy;
    private String riskAssessment;
    private String performanceEvaluation;

    /**
     * Constructs a project owner object with the specified details.
     *
     * @param name                    The first name of the employee.
     * @param surname                 The last name or surname of the employee.
     * @param employeeNumber          The unique identification number assigned to the employee within the company.
     * @param position                The job position or title of the employee.
     * @param department              The department or division in which the employee works.
     * @param email                   The email address of the employee.
     * @param hireDate                The date on which the employee was hired or started working.
     * @param salary                  The salary or compensation amount earned by the employee.
     * @param skills                  The skills and qualifications possessed by the employee.
     * @param birthDate               The date of birth of the employee.
     * @param address                 The physical address or location of the employee.
     * @param educationStatus         The current education status or highest level of education attained by the employee.
     * @param experienceLevel         The level of professional experience or years of experience of the employee.
     * @param terminationDate         The date on which the employee's employment was terminated, if applicable.
     * @param socialMediaAccount      The social media account(s) associated with the employee, if any.
     * @param vocationDays            The number of vacation or paid time off (PTO) days available to the employee.
     * @param companyName             The name of the company or organization the employee is associated with.
     * @param role                    The specific role or position of the employee within the company.
     * @param projects                The projects the employee is currently or has previously worked on.
     * @param expertise               The specialized knowledge or expertise possessed by the employee.
     * @param responsibilities        The specific duties, tasks, or responsibilities assigned to the employee.
     * @param budgetAllocation        The allocation of budget or financial resources for the employee's area of responsibility.
     * @param collaborationTools      The tools or software used for collaboration and communication within the company.
     * @param stakeholders            The key stakeholders or individuals affected by the employee's work or projects.
     * @param performanceMetrics      The metrics or key performance indicators (KPIs) used to evaluate the employee's performance.
     * @param decisionMakingAuthority The level of authority or decision-making power held by the employee.
     * @param communicationStrategy   The planned approach or strategy for effective communication within the company.
     * @param riskAssessment          The identification, analysis, and evaluation of potential risks and uncertainties in the employee's area of responsibility.
     * @param performanceEvaluation   The process or method used to evaluate the employee's performance.
     */
    public ProjectOwner(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, String companyName, String role, String projects, String expertise, String responsibilities, int budgetAllocation, String collaborationTools, List<StakeHolder> stakeholders, String performanceMetrics, String decisionMakingAuthority, String communicationStrategy, String riskAssessment, String performanceEvaluation) {
        super(name, surname, employeeNumber, position, department, email, hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel, terminationDate, socialMediaAccount, vocationDays);
        this.companyName = companyName;
        this.role = role;
        this.projects = projects;
        this.expertise = expertise;
        this.responsibilities = responsibilities;
        this.budgetAllocation = budgetAllocation;
        this.collaborationTools = collaborationTools;
        this.stakeholders = stakeholders;
        this.performanceMetrics = performanceMetrics;
        this.decisionMakingAuthority = decisionMakingAuthority;
        this.communicationStrategy = communicationStrategy;
        this.riskAssessment = riskAssessment;
        this.performanceEvaluation = performanceEvaluation;
    }

    /**
     * Creates a new instance of the ProjectOwner class with default values.
     */
    public ProjectOwner() {
        super("", "", "", EmployeePosition.PROJECT_OWNER, Department.IT, "", new Date(), 0, 0, new Date(), new Address(), EducationStatus.NONE, ExperienceLevel.JUNIOR, null, new ArrayList<>(), 0);
        this.companyName = "Sample Company Name";
        this.role = "Sample Role";
        this.projects = "Sample Projects";
        this.expertise = "Sample Expertise";
        this.responsibilities = "Sample Responsibilities";
        this.budgetAllocation = 0;
        this.collaborationTools = "Sample Collaboration Tools";
        this.stakeholders = new ArrayList<>(); // Empty list of stakeholders
        this.performanceMetrics = "Sample Performance Metrics";
        this.decisionMakingAuthority = "Sample Decision Making Authority";
        this.communicationStrategy = "Sample Communication Strategy";
        this.riskAssessment = "Sample Risk Assessment";
        this.performanceEvaluation = "Sample Performance Evaluation";
    }

    /**
     * Gets the name of the company associated with the project owner.
     *
     * @return The name of the company.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the name of the company associated with the project owner.
     *
     * @param companyName The name of the company to be set.
     */
    public void setCompanyName(String companyName) {
        try {
            this.companyName = companyName;
        } catch (Exception e) {
            System.err.println("Error setting company name: " + e.getMessage());
        }
    }

    /**
     * Gets the role or position of the project owner within the company.
     *
     * @return The role of the project owner.
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the role or position of the project owner within the company.
     *
     * @param role The role to be set.
     */
    public void setRole(String role) {
        try {
            this.role = role;
        } catch (Exception e) {
            System.err.println("Error setting role: " + e.getMessage());
        }
    }

    /**
     * Gets the projects the project owner is currently or has previously worked on.
     *
     * @return The projects of the project owner.
     */
    public String getProjects() {
        return projects;
    }

    /**
     * Sets the projects the project owner is currently or has previously worked on.
     *
     * @param projects The projects to be set.
     */
    public void setProjects(String projects) {
        try {
            this.projects = projects;
        } catch (Exception e) {
            System.err.println("Error setting projects: " + e.getMessage());
        }
    }

    /**
     * Gets the expertise or specialized knowledge possessed by the project owner.
     *
     * @return The expertise of the project owner.
     */
    public String getExpertise() {
        return expertise;
    }

    /**
     * Sets the expertise or specialized knowledge possessed by the project owner.
     *
     * @param expertise The expertise to be set.
     */
    public void setExpertise(String expertise) {
        try {
            this.expertise = expertise;
        } catch (Exception e) {
            System.err.println("Error setting expertise: " + e.getMessage());
        }
    }

    // Add Javadoc for the remaining getter and setter methods.

    /**
     * Gets the specific responsibilities or duties assigned to the project owner.
     *
     * @return The responsibilities of the project owner.
     */
    public String getResponsibilities() {
        return responsibilities;
    }

    /**
     * Sets the specific responsibilities or duties assigned to the project owner.
     *
     * @param responsibilities The responsibilities to be set.
     */
    public void setResponsibilities(String responsibilities) {
        try {
            this.responsibilities = responsibilities;
        } catch (Exception e) {
            System.err.println("Error setting responsibilities: " + e.getMessage());
        }
    }

    /**
     * Gets the allocation of budget or financial resources for the project owner's area of responsibility.
     *
     * @return The budget allocation for the project owner.
     */
    public int getBudgetAllocation() {
        return budgetAllocation;
    }

    /**
     * Sets the allocation of budget or financial resources for the project owner's area of responsibility.
     *
     * @param budgetAllocation The budget allocation to be set.
     */
    public void setBudgetAllocation(int budgetAllocation) {
        try {
            this.budgetAllocation = budgetAllocation;
        } catch (Exception e) {
            System.err.println("Error setting budget allocation: " + e.getMessage());
        }
    }

    /**
     * Gets the collaboration tools or software used by the project owner for communication and collaboration.
     *
     * @return The collaboration tools used by the project owner.
     */
    public String getCollaborationTools() {
        return collaborationTools;
    }

    /**
     * Sets the collaboration tools or software used by the project owner for communication and collaboration.
     *
     * @param collaborationTools The collaboration tools to be set.
     */
    public void setCollaborationTools(String collaborationTools) {
        try {
            this.collaborationTools = collaborationTools;
        } catch (Exception e) {
            System.err.println("Error setting collaboration tools: " + e.getMessage());
        }
    }

    /**
     * Gets the list of stakeholders or individuals affected by the project owner's work or projects.
     *
     * @return The stakeholders of the project owner.
     */
    public List<StakeHolder> getStakeholders() {
        return stakeholders;
    }

    /**
     * Sets the list of stakeholders or individuals affected by the project owner's work or projects.
     *
     * @param stakeholders The stakeholders to be set.
     */
    public void setStakeholders(List<StakeHolder> stakeholders) {
        try {
            this.stakeholders = stakeholders;
        } catch (Exception e) {
            System.err.println("Error setting stakeholders: " + e.getMessage());
        }
    }

    /**
     * Gets the performance metrics or key performance indicators (KPIs) used to evaluate the project owner's performance.
     *
     * @return The performance metrics of the project owner.
     */
    public String getPerformanceMetrics() {
        return performanceMetrics;
    }

    /**
     * Sets the performance metrics or key performance indicators (KPIs) used to evaluate the project owner's performance.
     *
     * @param performanceMetrics The performance metrics to be set.
     */
    public void setPerformanceMetrics(String performanceMetrics) {
        try {
            this.performanceMetrics = performanceMetrics;
        } catch (Exception e) {
            System.err.println("Error setting performance metrics: " + e.getMessage());
        }
    }

    /**
     * Gets the level of authority or decision-making power held by the project owner.
     *
     * @return The decision-making authority of the project owner.
     */
    public String getDecisionMakingAuthority() {
        return decisionMakingAuthority;
    }

    /**
     * Sets the level of authority or decision-making power held by the project owner.
     *
     * @param decisionMakingAuthority The decision-making authority to be set.
     */
    public void setDecisionMakingAuthority(String decisionMakingAuthority) {
        try {
            this.decisionMakingAuthority = decisionMakingAuthority;
        } catch (Exception e) {
            System.err.println("Error setting decision-making authority: " + e.getMessage());
        }
    }

    /**
     * Gets the planned approach or strategy for effective communication within the company.
     *
     * @return The communication strategy of the project owner.
     */
    public String getCommunicationStrategy() {
        return communicationStrategy;
    }

    /**
     * Sets the planned approach or strategy for effective communication within the company.
     *
     * @param communicationStrategy The communication strategy to be set.
     */
    public void setCommunicationStrategy(String communicationStrategy) {
        try {
            this.communicationStrategy = communicationStrategy;
        } catch (Exception e) {
            System.err.println("Error setting communication strategy: " + e.getMessage());
        }
    }

    /**
     * Gets the identification, analysis, and evaluation of potential risks and uncertainties in the project owner's area of responsibility.
     *
     * @return The risk assessment of the project owner.
     */
    public String getRiskAssessment() {
        return riskAssessment;
    }

    /**
     * Sets the identification, analysis, and evaluation of potential risks and uncertainties in the project owner's area of responsibility.
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
     * Gets the process or method used to evaluate the project owner's performance.
     *
     * @return The performance evaluation of the project owner.
     */
    public String getPerformanceEvaluation() {
        return performanceEvaluation;
    }

    /**
     * Sets the process or method used to evaluate the project owner's performance.
     *
     * @param performanceEvaluation The performance evaluation to be set.
     */
    public void setPerformanceEvaluation(String performanceEvaluation) {
        try {
            this.performanceEvaluation = performanceEvaluation;
        } catch (Exception e) {
            System.err.println("Error setting performance evaluation: " + e.getMessage());
        }
    }

    /**
     * Assigns a project to the project owner.
     */
    public void assignProject() {
        System.out.println("Assigning project.");
    }

    /**
     * Updates the status of a project.
     */
    public void updateProjectStatus() {
        System.out.println("Updating project status.");
    }

    /**
     * Reviews the budget of a project.
     */
    public void reviewProjectBudget() {
        System.out.println("Reviewing project budget.");
    }

    /**
     * Communicates with stakeholders regarding the project.
     */
    public void communicateWithStakeholders() {
        System.out.println("Communicating with stakeholders.");
    }

    /**
     * Evaluates the performance of a project.
     */
    public void evaluateProjectPerformance() {
        System.out.println("Evaluating project performance.");
    }

    /**
     * Makes decisions related to the project.
     */
    public void makeProjectDecisions() {
        System.out.println("Making project decisions.");
    }

    /**
     * Coordinates team members involved in the project.
     */
    public void coordinateTeamMembers() {
        System.out.println("Coordinating team members.");
    }

    /**
     * Monitors risks associated with the project.
     */
    public void monitorProjectRisks() {
        System.out.println("Monitoring project risks.");
    }

    /**
     * Conducts reviews of the project progress.
     */
    public void conductProjectReviews() {
        System.out.println("Conducting project reviews.");
    }

    /**
     * Approves changes to the project.
     */
    public void approveProjectChanges() {
        System.out.println("Approving project changes.");


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
