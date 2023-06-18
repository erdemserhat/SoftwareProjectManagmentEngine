package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.List;

/**
 * The DevelopmentTeam class represents a team of developers working on projects.
 * It extends the Team class and adds additional attributes and methods specific to development teams.
 */
public class DevelopmentTeam extends Team {

    // Private attributes
    private int projectCount;
    private List<ProgrammingLanguage> programmingLanguageList;
    private String technologyStack;
    private SoftwareArchitect softwareArchitect;
    private Status projectStatus;
    private int developerCount;
    private String expertiseAreas;
    private String communicationChannels;
    private int workSpeed;

    /**
     * Constructs a new DevelopmentTeam object.
     *
     * @param name                   The name of the development team.
     * @param employees              The list of employees working in the team.
     * @param responsibilities       The responsibilities of the development team.
     * @param skills                 The skills possessed by the team.
     * @param meetingSchedule        The meeting schedule period for the team.
     * @param projectCount           The number of projects the team is working on.
     * @param programmingLanguageList The list of programming languages known by the team members.
     * @param technologyStack        The technology stack used by the team.
     * @param softwareArchitect      The software architect leading the team.
     * @param projectStatus          The status of the projects being worked on by the team.
     * @param developerCount         The number of developers in the team.
     * @param expertiseAreas         The areas of expertise of the team members.
     * @param communicationChannels  The communication channels used by the team.
     * @param workSpeed              The working speed of the team.
     */
    public DevelopmentTeam(String name, ArrayList<Employee> employees, String responsibilities, String skills, int meetingSchedule, int projectCount, List<ProgrammingLanguage> programmingLanguageList, String technologyStack, SoftwareArchitect softwareArchitect, Status projectStatus, int developerCount, String expertiseAreas, String communicationChannels, int workSpeed) {
        super(name, employees, responsibilities, skills, meetingSchedule);
        this.projectCount = projectCount;
        this.programmingLanguageList = programmingLanguageList;
        this.technologyStack = technologyStack;
        this.softwareArchitect = softwareArchitect;
        this.projectStatus = projectStatus;
        this.developerCount = developerCount;
        this.expertiseAreas = expertiseAreas;
        this.communicationChannels = communicationChannels;
        this.workSpeed = workSpeed;
    }

    /**
     * Creates a new instance of the DevelopmentTeam class with default values.
     */
    public DevelopmentTeam() {
        super("", new ArrayList<>(), "", "", 0);
        this.projectCount = 0;
        this.programmingLanguageList = new ArrayList<>(); // Empty list of programming languages
        this.technologyStack = "Sample Technology Stack";
        this.softwareArchitect = new SoftwareArchitect(); // Example SoftwareArchitect object
        this.projectStatus = Status.NOT_STARTED; // Example project status
        this.developerCount = 0;
        this.expertiseAreas = "Sample Expertise Areas";
        this.communicationChannels = "Sample Communication Channels";
        this.workSpeed = 0;
    }

    /**
     * Returns the number of projects the team is working on.
     *
     * @return The project count.
     */
    public int getProjectCount() {
        return projectCount;
    }

    /**
     * Sets the number of projects the team is working on.
     *
     * @param projectCount The project count.
     */
    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    /**
     * Returns the list of programming languages known by the team members.
     *
     * @return The programming language list.
     */
    public List<ProgrammingLanguage> getProgrammingLanguageList() {
        return programmingLanguageList;
    }

    /**
     * Sets the list of programming languages known by the team members.
     *
     * @param programmingLanguageList The programming language list.
     */
    public void setProgrammingLanguageList(List<ProgrammingLanguage> programmingLanguageList) {
        this.programmingLanguageList = programmingLanguageList;
    }

    /**
     * Returns the technology stack used by the team.
     *
     * @return The technology stack.
     */
    public String getTechnologyStack() {
        return technologyStack;
    }

    /**
     * Sets the technology stack used by the team.
     *
     * @param technologyStack The technology stack.
     */
    public void setTechnologyStack(String technologyStack) {
        this.technologyStack = technologyStack;
    }

    /**
     * Returns the software architect leading the team.
     *
     * @return The software architect.
     */
    public SoftwareArchitect getSoftwareArchitect() {
        return softwareArchitect;
    }

    /**
     * Sets the software architect leading the team.
     *
     * @param softwareArchitect The software architect.
     */
    public void setSoftwareArchitect(SoftwareArchitect softwareArchitect) {
        this.softwareArchitect = softwareArchitect;
    }

    /**
     * Returns the status of the projects being worked on by the team.
     *
     * @return The project status.
     */
    public Status getProjectStatus() {
        return projectStatus;
    }

    /**
     * Sets the status of the projects being worked on by the team.
     *
     * @param projectStatus The project status.
     */
    public void setProjectStatus(Status projectStatus) {
        this.projectStatus = projectStatus;
    }

    /**
     * Returns the number of developers in the team.
     *
     * @return The developer count.
     */
    public int getDeveloperCount() {
        return developerCount;
    }

    /**
     * Sets the number of developers in the team.
     *
     * @param developerCount The developer count.
     */
    public void setDeveloperCount(int developerCount) {
        this.developerCount = developerCount;
    }

    /**
     * Returns the areas of expertise of the team members.
     *
     * @return The expertise areas.
     */
    public String getExpertiseAreas() {
        return expertiseAreas;
    }

    /**
     * Sets the areas of expertise of the team members.
     *
     * @param expertiseAreas The expertise areas.
     */
    public void setExpertiseAreas(String expertiseAreas) {
        this.expertiseAreas = expertiseAreas;
    }

    /**
     * Returns the communication channels used by the team.
     *
     * @return The communication channels.
     */
    public String getCommunicationChannels() {
        return communicationChannels;
    }

    /**
     * Sets the communication channels used by the team.
     *
     * @param communicationChannels The communication channels.
     */
    public void setCommunicationChannels(String communicationChannels) {
        this.communicationChannels = communicationChannels;
    }

    /**
     * Returns the working speed of the team.
     *
     * @return The work speed.
     */
    public int getWorkSpeed() {
        return workSpeed;
    }

    /**
     * Sets the working speed of the team.
     *
     * @param workSpeed The work speed.
     */
    public void setWorkSpeed(int workSpeed) {
        this.workSpeed = workSpeed;
    }
}
