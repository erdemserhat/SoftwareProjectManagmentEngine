package com.erdemserhat.software_project_management_system;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a programmer who is an employee within an organization.
 */
public class Programmer extends Employee {
    private ProgrammingLanguage programmingLanguage;
    private int projectCount;
    private String specialization;
    private String certification;
    private String preferredIDE;
    private String workingDays;
    private boolean remoteWorkAvailability;
    private String codeQualityRating;
    private String problemSolvingSkills;
    private boolean teamCollaboration;

    /**
     * Creates a new Programmer object with the specified employee details and additional programmer-specific attributes.
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
     * @param programmingLanguage    The programming language(s) in which the employee has expertise.
     * @param projectCount           The number of projects the employee has worked on.
     * @param specialization         The specialized area or domain in which the employee has focused expertise.
     * @param certification          Any relevant certifications or qualifications held by the employee.
     * @param preferredIDE           The preferred Integrated Development Environment (IDE) for the employee's coding work.
     * @param workingDays            The number of days per week the employee works.
     * @param remoteWorkAvailability The availability or preference for remote work.
     * @param codeQualityRating      The rating or assessment of the employee's code quality.
     * @param problemSolvingSkills   The employee's proficiency in problem-solving.
     * @param teamCollaboration      The employee's ability to collaborate effectively with team members.
     */
    public Programmer(String name, String surname, String employeeNumber, EmployeePosition position, Department department, String email, Date hireDate, int salary, int skills, Date birthDate, Address address, EducationStatus educationStatus, ExperienceLevel experienceLevel, Date terminationDate, ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays, ProgrammingLanguage programmingLanguage, int projectCount, String specialization, String certification, String preferredIDE, String workingDays, boolean remoteWorkAvailability, String codeQualityRating, String problemSolvingSkills, boolean teamCollaboration) {
        super(name, surname, employeeNumber, position, department, email,  hireDate, salary, skills, birthDate, address, educationStatus, experienceLevel,  terminationDate, socialMediaAccount, vocationDays);
        this.programmingLanguage = programmingLanguage;
        this.projectCount = projectCount;
        this.specialization = specialization;
        this.certification = certification;
        this.preferredIDE = preferredIDE;
        this.workingDays = workingDays;
        this.remoteWorkAvailability = remoteWorkAvailability;
        this.codeQualityRating = codeQualityRating;
        this.problemSolvingSkills = problemSolvingSkills;
        this.teamCollaboration = teamCollaboration;
    }

    /**
     * Returns the programming language(s) in which the employee has expertise.
     *
     * @return The programming language(s) as a ProgrammingLanguage object.
     */
    public ProgrammingLanguage getProgrammingLanguage() {
        try {
            return programmingLanguage;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the programming language.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the programming language(s) in which the employee has expertise.
     *
     * @param programmingLanguage The programming language(s) as a ProgrammingLanguage object.
     */
    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
        try {
            this.programmingLanguage = programmingLanguage;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the programming language.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the number of projects the employee has worked on.
     *
     * @return The number of projects.
     */
    public int getProjectCount() {
        try {
            return projectCount;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the project count.");
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Sets the number of projects the employee has worked on.
     *
     * @param projectCount The number of projects.
     */
    public void setProjectCount(int projectCount) {
        try {
            this.projectCount = projectCount;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the project count.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the specialized area or domain in which the employee has focused expertise.
     *
     * @return The specialization.
     */
    public String getSpecialization() {
        try {
            return specialization;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the specialization.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the specialized area or domain in which the employee has focused expertise.
     *
     * @param specialization The specialization.
     */
    public void setSpecialization(String specialization) {
        try {
            this.specialization = specialization;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the specialization.");
            e.printStackTrace();
        }
    }

    /**
     * Returns any relevant certifications or qualifications held by the employee.
     *
     * @return The certification.
     */
    public String getCertification() {
        try {
            return certification;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the certification.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets any relevant certifications or qualifications held by the employee.
     *
     * @param certification The certification.
     */
    public void setCertification(String certification) {
        try {
            this.certification = certification;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the certification.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the preferred Integrated Development Environment (IDE) for the employee's coding work.
     *
     * @return The preferred IDE.
     */
    public String getPreferredIDE() {
        try {
            return preferredIDE;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the preferred IDE.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the preferred Integrated Development Environment (IDE) for the employee's coding work.
     *
     * @param preferredIDE The preferred IDE.
     */
    public void setPreferredIDE(String preferredIDE) {
        try {
            this.preferredIDE = preferredIDE;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the preferred IDE.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the number of days per week the employee works.
     *
     * @return The number of working days.
     */
    public String getWorkingDays() {
        try {
            return workingDays;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the working days.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the number of days per week the employee works.
     *
     * @param workingDays The number of working days.
     */
    public void setWorkingDays(String workingDays) {
        try {
            this.workingDays = workingDays;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the working days.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the availability or preference for remote work.
     *
     * @return true if remote work is available, false otherwise.
     */
    public boolean isRemoteWorkAvailability() {
        try {
            return remoteWorkAvailability;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the remote work availability.");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Sets the availability or preference for remote work.
     *
     * @param remoteWorkAvailability true if remote work is available, false otherwise.
     */
    public void setRemoteWorkAvailability(boolean remoteWorkAvailability) {
        try {
            this.remoteWorkAvailability = remoteWorkAvailability;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the remote work availability.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the rating or assessment of the employee's code quality.
     *
     * @return The code quality rating.
     */
    public String getCodeQualityRating() {
        try {
            return codeQualityRating;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the code quality rating.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the rating or assessment of the employee's code quality.
     *
     * @param codeQualityRating The code quality rating.
     */
    public void setCodeQualityRating(String codeQualityRating) {
        try {
            this.codeQualityRating = codeQualityRating;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the code quality rating.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the employee's proficiency in problem-solving.
     *
     * @return The problem-solving skills.
     */
    public String getProblemSolvingSkills() {
        try {
            return problemSolvingSkills;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the problem-solving skills.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the employee's proficiency in problem-solving.
     *
     * @param problemSolvingSkills The problem-solving skills.
     */
    public void setProblemSolvingSkills(String problemSolvingSkills) {
        try {
            this.problemSolvingSkills = problemSolvingSkills;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the problem-solving skills.");
            e.printStackTrace();
        }
    }

    /**
     * Returns the employee's ability to collaborate effectively with team members.
     *
     * @return true if the employee can collaborate effectively, false otherwise.
     */
    public boolean isTeamCollaboration() {
        try {
            return teamCollaboration;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the team collaboration status.");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Sets the employee's ability to collaborate effectively with team members.
     *
     * @param teamCollaboration true if the employee can collaborate effectively, false otherwise.
     */
    public void setTeamCollaboration(boolean teamCollaboration) {
        try {
            this.teamCollaboration = teamCollaboration;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the team collaboration status.");
            e.printStackTrace();
        }
    }

    /**
     * Writes code.
     */
    public void writeCode() {
        System.out.println("Writing code.");
    }

    /**
     * Debugs code.
     */
    public void debugCode() {
        System.out.println("Debugging code.");
    }

    /**
     * Tests code.
     */
    public void testCode() {
        System.out.println("Testing code.");
    }

    /**
     * Collaborates with the team.
     */
    public void collaborateWithTeam() {
        System.out.println("Collaborating with the team.");
    }

    /**
     * Updates skills.
     */
    public void updateSkills() {
        System.out.println("Updating skills.");
    }

    /**
     * Optimizes code.
     */
    public void optimizeCode() {
        System.out.println("Optimizing code.");
    }

    /**
     * Attends meetings.
     */
    public void attendMeetings() {
        System.out.println("Attending meetings.");
    }

    /**
     * Documents code.
     */
    public void documentCode() {
        System.out.println("Documenting code.");
    }

    /**
     * Mentors junior developers.
     */
    public void mentorJuniorDevelopers() {
        System.out.println("Mentoring junior developers.");
    }

    /**
     * Conducts code reviews.
     */
    public void conductCodeReviews() {
        System.out.println("Conducting code reviews.");
    }

    /**
     * Researches new technologies.
     */
    public void researchNewTechnologies() {
        System.out.println("Researching new technologies.");
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



