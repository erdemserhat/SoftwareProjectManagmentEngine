package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a project with its relevant details and teams.
 */
public class Project {
    private String name;
    private String description;
    private Status status;
    private Date startDate;
    private Date deadline;
    private int budget;
    private PriorityLevel projectPriorityLevel;
    private String successCriteria;
    private String resources;
    private String risks;
    private String dependencies;
    private List<Note> projectNotes;
    private TesterTeam testerTeam;
    private DevelopmentTeam developmentTeam;
    private ManagementTeam managementTeam;

    /**
     * Creates a new project with the specified details and teams.
     *
     * @param name                 The name or title of the project.
     * @param description          A description or summary of the project, providing details about its purpose, objectives, or scope.
     * @param status               The current status or progress of the project.
     * @param startDate            The start date of the project.
     * @param deadline             The deadline or target completion date for the project.
     * @param budget               The allocated budget or financial resources for the project.
     * @param projectPriorityLevel The priority level assigned to the project.
     * @param successCriteria      The criteria or metrics used to determine the success or completion of the project.
     * @param resources            The resources required for the project.
     * @param risks                The potential risks or uncertainties associated with the project.
     * @param dependencies         The dependencies or relationships with other projects or tasks.
     * @param projectNotes         Additional notes or comments related to the project.
     * @param testerTeam           The team responsible for testing and quality assurance activities within the project.
     * @param developmentTeam      The team responsible for development and implementation activities within the project.
     * @param managementTeam       The team responsible for project management and coordination.
     */
    public Project(String name, String description, Status status, Date startDate, Date deadline, int budget, PriorityLevel projectPriorityLevel,
                   String successCriteria, String resources, String risks, String dependencies, List<Note> projectNotes,
                   TesterTeam testerTeam, DevelopmentTeam developmentTeam, ManagementTeam managementTeam) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.startDate = startDate;
        this.deadline = deadline;
        this.budget = budget;
        this.projectPriorityLevel = projectPriorityLevel;
        this.successCriteria = successCriteria;
        this.resources = resources;
        this.risks = risks;
        this.dependencies = dependencies;
        this.projectNotes = projectNotes;
        this.testerTeam = testerTeam;
        this.developmentTeam = developmentTeam;
        this.managementTeam = managementTeam;
    }

    /**
     * Default constructor for initial values.
     */
    public Project(){
        this.name = "Example Project";
        this.description = "Example Project Description";
        this.status = Status.STARTED;
        this.startDate = new Date();
        this.deadline = new Date();
        this.budget = 0;
        this.projectPriorityLevel = PriorityLevel.LOW;
        this.successCriteria = "Example Success Criteria";
        this.resources = "Example Resources";
        this.risks = "Example Risks";
        this.dependencies = "Example Dependencies";
        this.projectNotes = new ArrayList<>();
        this.testerTeam = new TesterTeam();
        this.developmentTeam = new DevelopmentTeam();
        this.managementTeam = new ManagementTeam();

    }

    /**
     * Gets the name of the project.
     *
     * @return The name of the project.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the project.
     *
     * @param name The name of the project.
     */
    public void setName(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            System.err.println("Error setting name: " + e.getMessage());
        }
    }

    /**
     * Gets the description of the project.
     *
     * @return The description of the project.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the project.
     *
     * @param description The description of the project.
     */
    public void setDescription(String description) {
        try {
            this.description = description;
        } catch (Exception e) {
            System.err.println("Error setting description: " + e.getMessage());
        }
    }

    /**
     * Gets the current status of the project.
     *
     * @return The current status of the project.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the current status of the project.
     *
     * @param status The current status of the project.
     */
    public void setStatus(Status status) {
        try {
            this.status = status;
        } catch (Exception e) {
            System.err.println("Error setting status: " + e.getMessage());
        }
    }

    /**
     * Gets the start date of the project.
     *
     * @return The start date of the project.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date of the project.
     *
     * @param startDate The start date of the project.
     */
    public void setStartDate(Date startDate) {
        try {
            this.startDate = startDate;
        } catch (Exception e) {
            System.err.println("Error setting start date: " + e.getMessage());
        }
    }

    /**
     * Gets the deadline of the project.
     *
     * @return The deadline of the project.
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * Sets the deadline of the project.
     *
     * @param deadline The deadline of the project.
     */
    public void setDeadline(Date deadline) {
        try {
            this.deadline = deadline;
        } catch (Exception e) {
            System.err.println("Error setting deadline: " + e.getMessage());
        }
    }

    /**
     * Gets the budget of the project.
     *
     * @return The budget of the project.
     */
    public int getBudget() {
        return budget;
    }

    /**
     * Sets the budget of the project.
     *
     * @param budget The budget of the project.
     */
    public void setBudget(int budget) {
        try {
            this.budget = budget;
        } catch (Exception e) {
            System.err.println("Error setting budget: " + e.getMessage());
        }
    }

    /**
     * Gets the priority level of the project.
     *
     * @return The priority level of the project.
     */
    public PriorityLevel getProjectPriorityLevel() {
        return projectPriorityLevel;
    }

    /**
     * Sets the priority level of the project.
     *
     * @param projectPriorityLevel The priority level of the project.
     */
    public void setProjectPriorityLevel(PriorityLevel projectPriorityLevel) {
        try {
            this.projectPriorityLevel = projectPriorityLevel;
        } catch (Exception e) {
            System.err.println("Error setting project priority level: " + e.getMessage());
        }
    }

    /**
     * Gets the success criteria of the project.
     *
     * @return The success criteria of the project.
     */
    public String getSuccessCriteria() {
        return successCriteria;
    }

    /**
     * Sets the success criteria of the project.
     *
     * @param successCriteria The success criteria of the project.
     */
    public void setSuccessCriteria(String successCriteria) {
        try {
            this.successCriteria = successCriteria;
        } catch (Exception e) {
            System.err.println("Error setting success criteria: " + e.getMessage());
        }
    }

    /**
     * Gets the resources required for the project.
     *
     * @return The resources required for the project.
     */
    public String getResources() {
        return resources;
    }

    /**
     * Sets the resources required for the project.
     *
     * @param resources The resources required for the project.
     */
    public void setResources(String resources) {
        try {
            this.resources = resources;
        } catch (Exception e) {
            System.err.println("Error setting resources: " + e.getMessage());
        }
    }

    /**
     * Gets the risks associated with the project.
     *
     * @return The risks associated with the project.
     */
    public String getRisks() {
        return risks;
    }

    /**
     * Sets the risks associated with the project.
     *
     * @param risks The risks associated with the project.
     */
    public void setRisks(String risks) {
        try {
            this.risks = risks;
        } catch (Exception e) {
            System.err.println("Error setting risks: " + e.getMessage());
        }
    }

    /**
     * Gets the dependencies of the project.
     *
     * @return The dependencies of the project.
     */
    public String getDependencies() {
        return dependencies;
    }

    /**
     * Sets the dependencies of the project.
     *
     * @param dependencies The dependencies of the project.
     */
    public void setDependencies(String dependencies) {
        try {
            this.dependencies = dependencies;
        } catch (Exception e) {
            System.err.println("Error setting dependencies: " + e.getMessage());
        }
    }

    /**
     * Gets the notes associated with the project.
     *
     * @return The notes associated with the project.
     */
    public List<Note> getProjectNotes() {
        return projectNotes;
    }

    /**
     * Sets the notes associated with the project.
     *
     * @param projectNotes The notes associated with the project.
     */
    public void setProjectNotes(List<Note> projectNotes) {
        try {
            this.projectNotes = projectNotes;
        } catch (Exception e) {
            System.err.println("Error setting project notes: " + e.getMessage());
        }
    }

    /**
     * Gets the tester team assigned to the project.
     *
     * @return The tester team assigned to the project.
     */
    public TesterTeam getTesterTeam() {
        return testerTeam;
    }

    /**
     * Sets the tester team for the project.
     *
     * @param testerTeam The tester team to be assigned to the project.
     */
    public void setTesterTeam(TesterTeam testerTeam) {
        try {
            this.testerTeam = testerTeam;
        } catch (Exception e) {
            System.err.println("Error setting tester team: " + e.getMessage());
        }
    }

    /**
     * Gets the development team assigned to the project.
     *
     * @return The development team assigned to the project.
     */
    public DevelopmentTeam getDevelopmentTeam() {
        return developmentTeam;
    }

    /**
     * Sets the development team for the project.
     *
     * @param developmentTeam The development team to be assigned to the project.
     */
    public void setDevelopmentTeam(DevelopmentTeam developmentTeam) {
        try {
            this.developmentTeam = developmentTeam;
        } catch (Exception e) {
            System.err.println("Error setting development team: " + e.getMessage());
        }
    }

    /**
     * Gets the management team assigned to the project.
     *
     * @return The management team assigned to the project.
     */
    public ManagementTeam getManagementTeam() {
        return managementTeam;
    }

    /**
     * Sets the management team for the project.
     *
     * @param managementTeam The management team to be assigned to the project.
     */
    public void setManagementTeam(ManagementTeam managementTeam) {
        try {
            this.managementTeam = managementTeam;
        } catch (Exception e) {
            System.err.println("Error setting management team: " + e.getMessage());
        }
    }



}

