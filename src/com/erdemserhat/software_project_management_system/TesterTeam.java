package com.erdemserhat.software_project_management_system;

import java.util.List;
import java.util.ArrayList;

/**
 * The `TesterTeam` class represents a team of testers and quality assurance personnel.
 * It extends the `Team` class and adds additional properties and methods specific to testing.
 */
public class TesterTeam extends Team {

    /**
     * List of testers in the team (Aggregation Relationship).
     */
    private List<Tester> testers;

    /**
     * The leader responsible for quality assurance in the team.
     */
    private QualityAssuranceLeader qualityAssuranceLeader;

    /**
     * The status or progress of the testing process.
     */
    private TestingProcessStatus testingProcessStatus;

    /**
     * The count of modules or components tested.
     */
    private int testedModuleCount;

    /**
     * The count of bugs or issues found during testing.
     */
    private int bugCount;

    /**
     * The plan or strategy for testing.
     */
    private String testPlan;

    /**
     * The scenarios or test cases used for testing.
     */
    private List<TestScenario> testScenarios;

    /**
     * The environment or setup for testing.
     */
    private TestEnvironment testEnvironment;

    /**
     * The priority level assigned to bugs or issues.
     */
    private PriorityLevel bugPriorityLevel;

    /**
     * The tools or software used for testing.
     */
    private List<TestTools> testTools;

    /**
     * The reports or documentation of test results.
     */
    private List<String> testReports;

    /**
     * The capability or extent of test automation.
     */
    private boolean testAutomationCapability;

    /**
     * The speed or efficiency of bug fixing.
     */
    private Speed bugFixingSpeed;

    /**
     * The documentation or records of the testing process.
     */
    private String testDocumentation;

    /**
     * The ability to collaborate and work as a team.
     */
    private CollaborationAbility collaborationAbility;

    /**
     * The compatibility tests performed to check compatibility with different platforms or systems.
     */
    private List<CompatibilityTest> compatibilityTests;

    /**
     * The performance tests performed to evaluate performance.
     */
    private List<PerformanceTest> performanceTests;

    /**
     * The GUI tests performed on the graphical user interface (GUI).
     */
    private List<GUITest> guiTests;

    /**
     * The strategies or approaches used for testing.
     */
    private List<TestStrategy> testStrategy;

    /**
     * Constructs a new `TesterTeam` object with the specified properties.
     *
     * @param name                     The name or title of the team.
     * @param employees                The list of employees or team members in the team.
     * @param responsibilities         The responsibilities or roles assigned to the team.
     * @param skills                   The required skills or qualifications for the team.
     * @param meetingSchedule          The schedule or frequency of team meetings.
     * @param testers                  The testers or QA engineers in the team.
     * @param qualityAssuranceLeader   The leader responsible for quality assurance.
     * @param testingProcessStatus     The status or progress of the testing process.
     * @param testedModuleCount        The count of modules or components tested.
     * @param bugCount                 The count of bugs or issues found during testing.
     * @param testPlan                 The plan or strategy for testing.
     * @param testScenarios            The scenarios or test cases used for testing.
     * @param testEnvironment          The environment or setup for testing.
     * @param bugPriorityLevel         The priority level assigned to bugs or issues.
     * @param testTools                The tools or software used for testing.
     * @param testReports              The reports or documentation of test results.
     * @param testAutomationCapability The capability or extent of test automation.
     * @param bugFixingSpeed           The speed or efficiency of bug fixing.
     * @param testDocumentation        The documentation or records of the testing process.
     * @param collaborationAbility     The ability to collaborate and work as a team.
     * @param compatibilityTests       The compatibility tests performed.
     * @param performanceTests         The performance tests performed.
     * @param guiTests                 The GUI tests performed.
     * @param testStrategy             The strategies or approaches used for testing.
     */
    public TesterTeam(String name, ArrayList<Employee> employees, String responsibilities, String skills, int meetingSchedule, List<Tester> testers, QualityAssuranceLeader qualityAssuranceLeader, TestingProcessStatus testingProcessStatus, int testedModuleCount, int bugCount, String testPlan, List<TestScenario> testScenarios, TestEnvironment testEnvironment, PriorityLevel bugPriorityLevel, List<TestTools> testTools, List<String> testReports, boolean testAutomationCapability, Speed bugFixingSpeed, String testDocumentation, CollaborationAbility collaborationAbility, List<CompatibilityTest> compatibilityTests, List<PerformanceTest> performanceTests, List<GUITest> guiTests, List<TestStrategy> testStrategy) {
        super(name, employees, responsibilities, skills, meetingSchedule);
        this.testers = testers;
        this.qualityAssuranceLeader = qualityAssuranceLeader;
        this.testingProcessStatus = testingProcessStatus;
        this.testedModuleCount = testedModuleCount;
        this.bugCount = bugCount;
        this.testPlan = testPlan;
        this.testScenarios = testScenarios;
        this.testEnvironment = testEnvironment;
        this.bugPriorityLevel = bugPriorityLevel;
        this.testTools = testTools;
        this.testReports = testReports;
        this.testAutomationCapability = testAutomationCapability;
        this.bugFixingSpeed = bugFixingSpeed;
        this.testDocumentation = testDocumentation;
        this.collaborationAbility = collaborationAbility;
        this.compatibilityTests = compatibilityTests;
        this.performanceTests = performanceTests;
        this.guiTests = guiTests;
        this.testStrategy = testStrategy;
    }

    /**
     * Default constructor for testing
     */
    public TesterTeam() {

        super("", new ArrayList<>(), "", "", 0);
        this.testers = new ArrayList<>();
        this.qualityAssuranceLeader = null;
        this.testingProcessStatus = null;
        this.testedModuleCount = 0;
        this.bugCount = 0;
        this.testPlan = "";
        this.testScenarios = new ArrayList<>();
        this.testEnvironment = null;
        this.bugPriorityLevel = null;
        this.testTools = new ArrayList<>();
        this.testReports = new ArrayList<>();
        this.testAutomationCapability = false;
        this.bugFixingSpeed = null;
        this.testDocumentation = "";
        this.collaborationAbility = null;
        this.compatibilityTests = new ArrayList<>();
        this.performanceTests = new ArrayList<>();
        this.guiTests = new ArrayList<>();
        this.testStrategy = new ArrayList<>();
    }

    /**
     * Returns the list of testers in the team.
     *
     * @return The list of testers in the team.
     */
    public List<Tester> getTesters() {
        return testers;
    }

    /**
     * Sets the list of testers in the team.
     *
     * @param testers The list of testers to be set.
     */
    public void setTesters(List<Tester> testers) {
        try {
            this.testers = testers;
        } catch (Exception e) {
            System.err.println("Error setting testers: " + e.getMessage());
        }
    }

    /**
     * Returns the leader responsible for quality assurance in the team.
     *
     * @return The quality assurance leader.
     */
    public QualityAssuranceLeader getQualityAssuranceLeader() {
        return qualityAssuranceLeader;
    }

    /**
     * Sets the leader responsible for quality assurance in the team.
     *
     * @param qualityAssuranceLeader The quality assurance leader to be set.
     */
    public void setQualityAssuranceLeader(QualityAssuranceLeader qualityAssuranceLeader) {
        try {
            this.qualityAssuranceLeader = qualityAssuranceLeader;
        } catch (Exception e) {
            System.err.println("Error setting quality assurance leader: " + e.getMessage());
        }
    }

    /**
     * Returns the status or progress of the testing process.
     *
     * @return The testing process status.
     */
    public TestingProcessStatus getTestingProcessStatus() {
        return testingProcessStatus;
    }

    /**
     * Sets the status or progress of the testing process.
     *
     * @param testingProcessStatus The testing process status to be set.
     */
    public void setTestingProcessStatus(TestingProcessStatus testingProcessStatus) {
        try {
            this.testingProcessStatus = testingProcessStatus;
        } catch (Exception e) {
            System.err.println("Error setting testing process status: " + e.getMessage());
        }
    }

    /**
     * Returns the count of modules or components tested.
     *
     * @return The count of tested modules or components.
     */
    public int getTestedModuleCount() {
        return testedModuleCount;
    }

    /**
     * Sets the count of modules or components tested.
     *
     * @param testedModuleCount The count of tested modules or components to be set.
     */
    public void setTestedModuleCount(int testedModuleCount) {
        try {
            this.testedModuleCount = testedModuleCount;
        } catch (Exception e) {
            System.err.println("Error setting tested module count: " + e.getMessage());
        }
    }

    /**
     * Returns the count of bugs or issues found during testing.
     *
     * @return The count of bugs or issues found.
     */
    public int getBugCount() {
        return bugCount;
    }

    /**
     * Sets the count of bugs or issues found during testing.
     *
     * @param bugCount The count of bugs or issues found to be set.
     */
    public void setBugCount(int bugCount) {
        try {
            this.bugCount = bugCount;
        } catch (Exception e) {
            System.err.println("Error setting bug count: " + e.getMessage());
        }
    }

    /**
     * Returns the list of test reports generated by the team.
     *
     * @return The list of test reports.
     */
    public List<String> getTestReports() {
        return testReports;
    }

    /**
     * Sets the list of test reports generated by the team.
     *
     * @param testReports The list of test reports to be set.
     */
    public void setTestReports(List<String> testReports) {
        try {
            this.testReports = testReports;
        } catch (Exception e) {
            System.err.println("Error setting test reports: " + e.getMessage());
        }
    }

    /**
     * Returns the capability of the team to perform test automation.
     *
     * @return `true` if the team has test automation capability, `false` otherwise.
     */
    public boolean isTestAutomationCapability() {
        return testAutomationCapability;
    }

    /**
     * Sets the capability of the team to perform test automation.
     *
     * @param testAutomationCapability The test automation capability to be set.
     */
    public void setTestAutomationCapability(boolean testAutomationCapability) {
        try {
            this.testAutomationCapability = testAutomationCapability;
        } catch (Exception e) {
            System.err.println("Error setting test automation capability: " + e.getMessage());
        }
    }

    /**
     * Returns the speed at which bugs or issues are fixed by the team.
     *
     * @return The bug fixing speed.
     */
    public Speed getBugFixingSpeed() {
        return bugFixingSpeed;
    }

    /**
     * Sets the speed at which bugs or issues are fixed by the team.
     *
     * @param bugFixingSpeed The bug fixing speed to be set.
     */
    public void setBugFixingSpeed(Speed bugFixingSpeed) {
        try {
            this.bugFixingSpeed = bugFixingSpeed;
        } catch (Exception e) {
            System.err.println("Error setting bug fixing speed: " + e.getMessage());
        }
    }

    /**
     * Returns the documentation related to the testing process.
     *
     * @return The test documentation.
     */
    public String getTestDocumentation() {
        return testDocumentation;
    }

    /**
     * Sets the documentation related to the testing process.
     *
     * @param testDocumentation The test documentation to be set.
     */
    public void setTestDocumentation(String testDocumentation) {
        try {
            this.testDocumentation = testDocumentation;
        } catch (Exception e) {
            System.err.println("Error setting test documentation: " + e.getMessage());
        }
    }

    /**
     * Returns the ability of the team to collaborate with others.
     *
     * @return The collaboration ability.
     */
    public CollaborationAbility getCollaborationAbility() {
        return collaborationAbility;
    }

    /**
     * Sets the ability of the team to collaborate with others.
     *
     * @param collaborationAbility The collaboration ability to be set.
     */
    public void setCollaborationAbility(CollaborationAbility collaborationAbility) {
        try {
            this.collaborationAbility = collaborationAbility;
        } catch (Exception e) {
            System.err.println("Error setting collaboration ability: " + e.getMessage());
        }
    }

    /**
     * Returns the list of compatibility tests performed by the team.
     *
     * @return The list of compatibility tests.
     */
    public List<CompatibilityTest> getCompatibilityTests() {
        return compatibilityTests;
    }

    /**
     * Sets the list of compatibility tests performed by the team.
     *
     * @param compatibilityTests The list of compatibility tests to be set.
     */
    public void setCompatibilityTests(List<CompatibilityTest> compatibilityTests) {
        try {
            this.compatibilityTests = compatibilityTests;
        } catch (Exception e) {
            System.err.println("Error setting compatibility tests: " + e.getMessage());
        }
    }

    /**
     * Returns the list of performance tests performed by the team.
     *
     * @return The list of performance tests.
     */
    public List<PerformanceTest> getPerformanceTests() {
        return performanceTests;
    }

    /**
     * Sets the list of performance tests performed by the team.
     *
     * @param performanceTests The list of performance tests to be set.
     */
    public void setPerformanceTests(List<PerformanceTest> performanceTests) {
        try {
            this.performanceTests = performanceTests;
        } catch (Exception e) {
            System.err.println("Error setting performance tests: " + e.getMessage());
        }
    }

    /**
     * Returns the list of GUI (Graphical User Interface) tests performed by the team.
     *
     * @return The list of GUI tests.
     */
    public List<GUITest> getGuiTests() {
        return guiTests;
    }

    /**
     * Sets the list of GUI (Graphical User Interface) tests performed by the team.
     *
     * @param guiTests The list of GUI tests to be set.
     */
    public void setGuiTests(List<GUITest> guiTests) {
        try {
            this.guiTests = guiTests;
        } catch (Exception e) {
            System.err.println("Error setting GUI tests: " + e.getMessage());
        }
    }

    /**
     * Returns the list of test strategies employed by the team.
     *
     * @return The list of test strategies.
     */
    public List<TestStrategy> getTestStrategy() {
        return testStrategy;
    }

    /**
     * Sets the list of test strategies employed by the team.
     *
     * @param testStrategy The list of test strategies to be set.
     */
    public void setTestStrategy(List<TestStrategy> testStrategy) {
        try {
            this.testStrategy = testStrategy;
        } catch (Exception e) {
            System.err.println("Error setting test strategy: " + e.getMessage());
        }
    }

}
