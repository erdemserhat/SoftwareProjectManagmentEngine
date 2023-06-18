package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Represents a tester in a software development organization.
 */
public class Tester extends Employee {

    public List<TestType> testTypeList;
    private int defectCount;
    private TestEnvironmentOption testEnvironmentOption;
    private TestMethod testMethod;
    private double testExecutionTime;
    private TestStrategy testStrategy;
    private String testReport;

    /**
     * Constructs a Tester object with the specified details.
     *
     * @param name                  The first name of the employee.
     * @param surname               The last name or surname of the employee.
     * @param employeeNumber        The unique identification number assigned to the employee within the organization.
     * @param position              The job position or title of the employee.
     * @param department            The department or division in which the employee works.
     * @param email                 The email address of the employee.
     * @param hireDate              The date on which the employee was hired or started working.
     * @param salary                The salary or compensation amount earned by the employee.
     * @param skills                The skills and qualifications possessed by the employee.
     * @param birthDate             The date of birth of the employee.
     * @param address               The physical address or location of the employee.
     * @param educationStatus       The current education status or highest level of education attained by the employee.
     * @param experienceLevel       The level of professional experience or years of experience of the employee.
     * @param terminationDate       The date on which the employee's employment was terminated, if applicable.
     * @param socialMediaAccount    The social media account(s) associated with the employee, if any.
     * @param vocationDays          The number of vacation or paid time off (PTO) days available to the employee.
     * @param testTypeList          The list of test types performed by the employee.
     * @param defectCount           The count of defects or issues identified during testing.
     * @param testEnvironmentOption The option or configuration of the test environment.
     * @param testMethod            The method or approach used for testing.
     * @param testExecutionTime     The time taken for test execution.
     * @param testStrategy          The strategy or plan for testing.
     * @param testReport            The report or documentation of the test results.
     */
    public Tester(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, List<TestType> testTypeList, int defectCount, TestEnvironmentOption testEnvironmentOption, TestMethod testMethod, double testExecutionTime, TestStrategy testStrategy, String testReport) {
        super(name, surname, employeeNumber, position, department, email, hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel, terminationDate, socialMediaAccount, vocationDays);
        this.testTypeList = testTypeList;
        this.defectCount = defectCount;
        this.testEnvironmentOption = testEnvironmentOption;
        this.testMethod = testMethod;
        this.testExecutionTime = testExecutionTime;
        this.testStrategy = testStrategy;
        this.testReport = testReport;
    }

    /**
     * Returns the list of test types performed by the tester.
     *
     * @return The list of test types.
     */
    public List<TestType> getTestTypeList() {
        return testTypeList;
    }

    /**
     * Sets the list of test types performed by the tester.
     *
     * @param testTypeList The list of test types.
     */
    public void setTestTypeList(List<TestType> testTypeList) {
        try {
            this.testTypeList = testTypeList;
        } catch (Exception e) {
            System.err.println("Error setting test type list: " + e.getMessage());
        }
    }

    /**
     * Returns the count of defects or issues identified during testing.
     *
     * @return The defect count.
     */
    public int getDefectCount() {
        return defectCount;
    }

    /**
     * Sets the count of defects or issues identified during testing.
     *
     * @param defectCount The defect count.
     */
    public void setDefectCount(int defectCount) {
        try {
            this.defectCount = defectCount;
        } catch (Exception e) {
            System.err.println("Error setting defect count: " + e.getMessage());
        }
    }

    /**
     * Returns the option or configuration of the test environment.
     *
     * @return The test environment option.
     */
    public TestEnvironmentOption getTestEnvironmentOption() {
        return testEnvironmentOption;
    }

    /**
     * Sets the option or configuration of the test environment.
     *
     * @param testEnvironmentOption The test environment option.
     */
    public void setTestEnvironmentOption(TestEnvironmentOption testEnvironmentOption) {
        try {
            this.testEnvironmentOption = testEnvironmentOption;
        } catch (Exception e) {
            System.err.println("Error setting test environment option: " + e.getMessage());
        }
    }

    /**
     * Returns the method or approach used for testing.
     *
     * @return The test method.
     */
    public TestMethod getTestMethod() {
        return testMethod;
    }

    /**
     * Sets the method or approach used for testing.
     *
     * @param testMethod The test method.
     */
    public void setTestMethod(TestMethod testMethod) {
        try {
            this.testMethod = testMethod;
        } catch (Exception e) {
            System.err.println("Error setting test method: " + e.getMessage());
        }
    }

    /**
     * Returns the time taken for test execution.
     *
     * @return The test execution time.
     */
    public double getTestExecutionTime() {
        return testExecutionTime;
    }

    /**
     * Sets the time taken for test execution.
     *
     * @param testExecutionTime The test execution time.
     */
    public void setTestExecutionTime(double testExecutionTime) {
        try {
            this.testExecutionTime = testExecutionTime;
        } catch (Exception e) {
            System.err.println("Error setting test execution time: " + e.getMessage());
        }
    }

    /**
     * Returns the strategy or plan for testing.
     *
     * @return The test strategy.
     */
    public TestStrategy getTestStrategy() {
        return testStrategy;
    }

    /**
     * Sets the strategy or plan for testing.
     *
     * @param testStrategy The test strategy.
     */
    public void setTestStrategy(TestStrategy testStrategy) {
        try {
            this.testStrategy = testStrategy;
        } catch (Exception e) {
            System.err.println("Error setting test strategy: " + e.getMessage());
        }
    }

    /**
     * Returns the report or documentation of the test results.
     *
     * @return The test report.
     */
    public String getTestReport() {
        return testReport;
    }

    /**
     * Sets the report or documentation of the test results.
     *
     * @param testReport The test report.
     */
    public void setTestReport(String testReport) {
        try {
            this.testReport = testReport;
        } catch (Exception e) {
            System.err.println("Error setting test report: " + e.getMessage());
        }
    }

    /**
     * Runs the tests.
     */
    public void runTest() {
        // Implementing the logic to run tests
        System.out.println("Running tests...");
    }

    /**
     * Analyzes the defects.
     */
    public void analyzeDefects() {
        // Implementing the logic to analyze defects
        System.out.println("Analyzing defects...");
    }

    /**
     * Generates the test metrics.
     */
    public void generateTestMetrics() {
        // Implementing the logic to generate test metrics
        System.out.println("Generating test metrics...");
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
