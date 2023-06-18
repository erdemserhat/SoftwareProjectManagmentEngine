package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * The ManagementTeam class represents a team responsible for managing a project. It extends the Team class.
 */
public class ManagementTeam extends Team {

    // Attributes specific to ManagementTeam
    private String performanceMetrics;
    private String strategicPlanning;
    private String taskDistribution;
    private int resourceAllocation;
    private String stakeholderManagement;
    private String riskAssessment;
    private boolean decisionMaking;
    private String trainingAndDevelopment;
    private String communicationStrategy;

    // Aggregation Relationships
    private SoftwareArchitect softwareArchitect;
    private List<StakeHolder> stakeHolders;
    private List <BusinessAnalysts> businessAnalysts;
    private ProjectOwner projectOwner;
    private ProjectManager projectManager;

    /**
     * Constructs a new ManagementTeam object with the specified parameters.
     *
     * @param name                  The name or title of the project or team.
     * @param employees             The list of employees or team members working on the project or within the team.
     * @param responsibilities      The specific duties, tasks, or roles assigned to each team member.
     * @param skills                The skills and qualifications required for the project or team members to successfully carry out their responsibilities.
     * @param meetingSchedule       The schedule or frequency of team meetings to discuss project progress, updates, and challenges.
     * @param performanceMetrics    The metrics or key performance indicators (KPIs) used to assess the performance and progress of the project or team.
     * @param strategicPlanning     The process of developing and implementing strategic plans to achieve project goals and objectives.
     * @param taskDistribution      The allocation and distribution of tasks and responsibilities among team members.
     * @param resourceAllocation    The allocation of resources, such as budget, equipment, and personnel, to support the project or team's activities.
     * @param stakeholderManagement The process of identifying, engaging, and managing stakeholders to ensure their needs and expectations are addressed.
     * @param riskAssessment        The identification, analysis, and evaluation of potential risks and uncertainties that may impact the project's success.
     * @param decisionMaking        The process of making informed decisions based on available information and considering the project's objectives and constraints.
     * @param trainingAndDevelopment The provision of training and development opportunities to enhance the skills and knowledge of team members.
     * @param communicationStrategy The planned approach or strategy for effective communication within the team and with stakeholders.
     * @param softwareArchitect     The role responsible for designing and overseeing the software architecture of the project.
     * @param stakeHolders          The key stakeholders involved in or affected by the project, such as clients, customers, or regulatory bodies.
     * @param businessAnalysts      The role responsible for analyzing business processes, gathering requirements, and facilitating communication between business stakeholders and the project team.
     * @param projectOwner          The individual or entity that owns or sponsors the project and has the authority to make decisions and allocate resources.
     * @param projectManager        The individual responsible for planning, organizing, and managing the project's activities, resources, and team members.
     */
    public ManagementTeam(String name, ArrayList<Employee> employees, String responsibilities, String skills, int meetingSchedule, String performanceMetrics, String strategicPlanning, String taskDistribution, int resourceAllocation, String stakeholderManagement, String riskAssessment, boolean decisionMaking, String trainingAndDevelopment, String communicationStrategy, SoftwareArchitect softwareArchitect, List<StakeHolder> stakeHolders, List<BusinessAnalysts> businessAnalysts, ProjectOwner projectOwner, ProjectManager projectManager) {
        super(name, employees, responsibilities, skills, meetingSchedule);
        this.performanceMetrics = performanceMetrics;
        this.strategicPlanning = strategicPlanning;
        this.taskDistribution = taskDistribution;
        this.resourceAllocation = resourceAllocation;
        this.stakeholderManagement = stakeholderManagement;
        this.riskAssessment = riskAssessment;
        this.decisionMaking = decisionMaking;
        this.trainingAndDevelopment = trainingAndDevelopment;
        this.communicationStrategy = communicationStrategy;
        this.softwareArchitect = softwareArchitect;
        this.stakeHolders = stakeHolders;
        this.businessAnalysts = businessAnalysts;
        this.projectOwner = projectOwner;
        this.projectManager = projectManager;
    }

    /**
     * Creates a new instance of the ManagementTeam class with default values.
     */
    public ManagementTeam() {
        super("", new ArrayList<>(), "", "", 0);
        this.performanceMetrics = "Sample Performance Metrics";
        this.strategicPlanning = "Sample Strategic Planning";
        this.taskDistribution = "Sample Task Distribution";
        this.resourceAllocation = 10;
        this.stakeholderManagement = "Sample Stakeholder Management";
        this.riskAssessment = "Sample Risk Assessment";
        this.decisionMaking = true;
        this.trainingAndDevelopment = "Sample Training and Development";
        this.communicationStrategy = "Sample Communication Strategy";
        this.softwareArchitect = new SoftwareArchitect(); // Create an instance of the SoftwareArchitect class
        this.stakeHolders = new ArrayList<>(Collections.singleton(new StakeHolder())); // Create an instance of the StakeHolder class list
        this.businessAnalysts = new ArrayList<>(Collections.singleton( new BusinessAnalysts())); // Create an instance of the BusinessAnalysts class list
        this.projectOwner = new ProjectOwner(); // Create an instance of the ProjectOwner class
        this.projectManager = new ProjectManager(); // Create an instance of the ProjectManager class
    }

    /**
     * Retrieves the performance metrics of the management team.
     *
     * @return The performance metrics, or null if an error occurs.
     */
    public String getPerformanceMetrics() {
        try {
            return performanceMetrics;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the performance metrics.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the performance metrics of the management team.
     *
     * @param performanceMetrics The performance metrics to set.
     */
    public void setPerformanceMetrics(String performanceMetrics) {
        try {
            this.performanceMetrics = performanceMetrics;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the performance metrics.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the strategic planning of the management team.
     *
     * @return The strategic planning, or null if an error occurs.
     */
    public String getStrategicPlanning() {
        try {
            return strategicPlanning;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the strategic planning.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the strategic planning of the management team.
     *
     * @param strategicPlanning The strategic planning to set.
     */
    public void setStrategicPlanning(String strategicPlanning) {
        try {
            this.strategicPlanning = strategicPlanning;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the strategic planning.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the task distribution of the management team.
     *
     * @return The task distribution, or null if an error occurs.
     */
    public String getTaskDistribution() {
        try {
            return taskDistribution;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the task distribution.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the task distribution of the management team.
     *
     * @param taskDistribution The task distribution to set.
     */
    public void setTaskDistribution(String taskDistribution) {
        try {
            this.taskDistribution = taskDistribution;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the task distribution.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the resource allocation of the management team.
     *
     * @return The resource allocation, or 0 if an error occurs.
     */
    public int getResourceAllocation() {
        try {
            return resourceAllocation;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the resource allocation.");
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Sets the resource allocation of the management team.
     *
     * @param resourceAllocation The resource allocation to set.
     */
    public void setResourceAllocation(int resourceAllocation) {
        try {
            this.resourceAllocation = resourceAllocation;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the resource allocation.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the stakeholder management of the management team.
     *
     * @return The stakeholder management, or null if an error occurs.
     */
    public String getStakeholderManagement() {
        try {
            return stakeholderManagement;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the stakeholder management.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the stakeholder management of the management team.
     *
     * @param stakeholderManagement The stakeholder management to set.
     */
    public void setStakeholderManagement(String stakeholderManagement) {
        try {
            this.stakeholderManagement = stakeholderManagement;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the stakeholder management.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the risk assessment of the management team.
     *
     * @return The risk assessment, or null if an error occurs.
     */
    public String getRiskAssessment() {
        try {
            return riskAssessment;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the risk assessment.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the risk assessment of the management team.
     *
     * @param riskAssessment The risk assessment to set.
     */
    public void setRiskAssessment(String riskAssessment) {
        try {
            this.riskAssessment = riskAssessment;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the risk assessment.");
            e.printStackTrace();
        }
    }

    /**
     * Checks if the decision making flag is enabled for the management team.
     *
     * @return True if decision making is enabled, false if an error occurs.
     */
    public boolean isDecisionMaking() {
        try {
            return decisionMaking;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the decision making flag.");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Sets the decision making flag for the management team.
     *
     * @param decisionMaking The decision making flag to set.
     */
    public void setDecisionMaking(boolean decisionMaking) {
        try {
            this.decisionMaking = decisionMaking;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the decision making flag.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the training and development information of the management team.
     *
     * @return The training and development information, or null if an error occurs.
     */
    public String getTrainingAndDevelopment() {
        try {
            return trainingAndDevelopment;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the training and development information.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the training and development information of the management team.
     *
     * @param trainingAndDevelopment The training and development information to set.
     */
    public void setTrainingAndDevelopment(String trainingAndDevelopment) {
        try {
            this.trainingAndDevelopment = trainingAndDevelopment;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the training and development information.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the communication strategy of the management team.
     *
     * @return The communication strategy, or null if an error occurs.
     */
    public String getCommunicationStrategy() {
        try {
            return communicationStrategy;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the communication strategy.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the communication strategy of the management team.
     *
     * @param communicationStrategy The communication strategy to set.
     */
    public void setCommunicationStrategy(String communicationStrategy) {
        try {
            this.communicationStrategy = communicationStrategy;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the communication strategy.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the software architect of the management team.
     *
     * @return The software architect, or null if an error occurs.
     */
    public SoftwareArchitect getSoftwareArchitect() {
        try {
            return softwareArchitect;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the software architect.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the software architect of the management team.
     *
     * @param softwareArchitect The software architect to set.
     */
    public void setSoftwareArchitect(SoftwareArchitect softwareArchitect) {
        try {
            this.softwareArchitect = softwareArchitect;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the software architect.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the list of stakeholders associated with the project.
     *
     * @return The list of stakeholders, or null if an error occurs.
     */
    public List<StakeHolder> getStakeHolders() {
        try {
            return stakeHolders;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the stakeholder list.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the list of stakeholders associated with the project.
     *
     * @param stakeHolders The list of stakeholders to set.
     */
    public void setStakeHolders(List<StakeHolder> stakeHolders) {
        try {
            this.stakeHolders = stakeHolders;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the stakeholder list.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the list of business analysts associated with the project.
     *
     * @return The list of business analysts, or null if an error occurs.
     */
    public List<BusinessAnalysts> getBusinessAnalysts() {
        try {
            return businessAnalysts;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the business analyst list.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the list of business analysts associated with the project.
     *
     * @param businessAnalysts The list of business analysts to set.
     */
    public void setBusinessAnalysts(List<BusinessAnalysts> businessAnalysts) {
        try {
            this.businessAnalysts = businessAnalysts;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the business analyst list.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the project owner.
     *
     * @return The project owner, or null if an error occurs.
     */
    public ProjectOwner getProjectOwner() {
        try {
            return projectOwner;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the project owner.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the project owner.
     *
     * @param projectOwner The project owner to set.
     */
    public void setProjectOwner(ProjectOwner projectOwner) {
        try {
            this.projectOwner = projectOwner;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the project owner.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the project manager.
     *
     * @return The project manager, or null if an error occurs.
     */
    public ProjectManager getProjectManager() {
        try {
            return projectManager;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the project manager.");
            e.printStackTrace();
            return null;
        }
    }
    /**
     * Assigns the project to a team.
     */
    public void assignProject() {
        System.out.println("Project assigned.");
    }

    /**
     * Conducts a team meeting.
     */
    public void conductTeamMeeting() {
        System.out.println("Conducting team meeting.");
    }

    /**
     * Provides feedback to the team.
     */
    public void provideFeedback() {
        System.out.println("Providing feedback.");
    }

    /**
     * Sets the goals for the team.
     */
    public void setTeamGoals() {
        System.out.println("Team goals set.");
    }


}