package com.erdemserhat.software_project_management_system;

import java.util.Date;
import java.util.ArrayList;

/**
 * Represents an employee within the Project.
 */
public abstract class Employee implements Payable {
    private String name;
    private String surname;
    private String employeeNumber;
    private EmployeePosition position;
    private Department department;
    private String email;
    private Date hireDate;
    private int salary;
    private int skills;
    private Date birthDate;
    private Address address;
    private EducationStatus educationStatus;
    private ExperienceLevel experienceLevel;
    private Date terminationDate;
    private ArrayList<SocialMediaAccount> socialMediaAccount;
    private int vocationDays;

    /**
     * Constructs an Employee object with the specified information.
     *
     * @param name               The first name of the employee.
     * @param surname            The last name or surname of the employee.
     * @param employeeNumber     The unique identification number assigned to the employee within the organization.
     * @param position           The job position or title of the employee.
     * @param department         The department or division in which the employee works.
     * @param email              The email address of the employee.
     * @param hireDate           The date on which the employee was hired or started working.
     * @param salary             The salary or compensation amount earned by the employee.
     * @param skills             The skills and qualifications possessed by the employee.
     * @param birthDate          The date of birth of the employee.
     * @param address            The physical address or location of the employee.
     * @param educationStatus    The current education status or highest level of education attained by the employee.
     * @param experienceLevel    The level of professional experience or years of experience of the employee.
     * @param terminationDate    The date on which the employee's employment was terminated, if applicable.
     * @param socialMediaAccount The social media account(s) associated with the employee, if any.
     * @param vocationDays       The number of vacation or paid time off (PTO) days available to the employee.
     */
    public Employee(String name, String surname, String employeeNumber, EmployeePosition position,
                    Department department, String email, Date hireDate, int salary, int skills,
                    Date birthDate, Address address, EducationStatus educationStatus,
                    ExperienceLevel experienceLevel, Date terminationDate,
                    ArrayList<SocialMediaAccount> socialMediaAccount, int vocationDays) {
        this.name = name;
        this.surname = surname;
        this.employeeNumber = employeeNumber;
        this.position = position;
        this.department = department;
        this.email = email;
        this.hireDate = hireDate;
        this.salary = salary;
        this.skills = skills;
        this.birthDate = birthDate;
        this.address = address;
        this.educationStatus = educationStatus;
        this.experienceLevel = experienceLevel;
        this.terminationDate = terminationDate;
        this.socialMediaAccount = socialMediaAccount;
        this.vocationDays = vocationDays;
    }
    /**
     * Retrieves the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() {
        try {
            return name;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the name.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the name of the employee.
     *
     * @param name The name of the employee.
     */
    public void setName(String name) {
        try {
            this.name = name;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the name.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the surname of the employee.
     *
     * @return The surname of the employee.
     */
    public String getSurname() {
        try {
            return surname;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the surname.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the surname of the employee.
     *
     * @param surname The surname of the employee.
     */
    public void setSurname(String surname) {
        try {
            this.surname = surname;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the surname.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the employee number of the employee.
     *
     * @return The employee number of the employee.
     */
    public String getEmployeeNumber() {
        try {
            return employeeNumber;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the employee number.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the employee number of the employee.
     *
     * @param employeeNumber The employee number of the employee.
     */
    public void setEmployeeNumber(String employeeNumber) {
        try {
            this.employeeNumber = employeeNumber;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the employee number.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the position of the employee.
     *
     * @return The position of the employee.
     */
    public EmployeePosition getPosition() {
        try {
            return position;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the employee position.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the position of the employee.
     *
     * @param position The position of the employee.
     */
    public void setPosition(EmployeePosition position) {
        try {
            this.position = position;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the employee position.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the department of the employee.
     *
     * @return The department of the employee.
     */
    public Department getDepartment() {
        try {
            return department;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the department.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the department of the employee.
     *
     * @param department The department of the employee.
     */
    public void setDepartment(Department department) {
        try {
            this.department = department;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the department.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the email of the employee.
     *
     * @return The email of the employee.
     */
    public String getEmail() {
        try {
            return email;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the email.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the email address of the employee.
     *
     * @param email The email address of the employee.
     */
    public void setEmail(String email) {
        try {
            this.email = email;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the email.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the hire date of the employee.
     *
     * @return The hire date of the employee.
     */
    public Date getHireDate() {
        try {
            return hireDate;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the hire date.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the hire date of the employee.
     *
     * @param hireDate The hire date of the employee.
     */
    public void setHireDate(Date hireDate) {
        try {
            this.hireDate = hireDate;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the hire date.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the salary of the employee.
     *
     * @return The salary of the employee.
     */
    public int getSalary() {
        try {
            return salary;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the salary.");
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary The salary of the employee.
     */
    public void setSalary(int salary) {
        try {
            this.salary = salary;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the salary.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the skills of the employee.
     *
     * @return The skills of the employee.
     */
    public int getSkills() {
        try {
            return skills;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the skills.");
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Sets the skills of the employee.
     *
     * @param skills The skills of the employee.
     */
    public void setSkills(int skills) {
        try {
            this.skills = skills;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the skills.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the birth date of the employee.
     *
     * @return The birth date of the employee.
     */
    public Date getBirthDate() {
        try {
            return birthDate;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the birth date.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the birth date of the employee.
     *
     * @param birthDate The birth date of the employee.
     */
    public void setBirthDate(Date birthDate) {
        try {
            this.birthDate = birthDate;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the birth date.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the address of the employee.
     *
     * @return The address of the employee.
     */
    public Address getAddress() {
        try {
            return address;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the address.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the address of the employee.
     *
     * @param address The address of the employee.
     */
    public void setAddress(Address address) {
        try {
            this.address = address;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the address.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the education status of the employee.
     *
     * @return The education status of the employee.
     */
    public EducationStatus getEducationStatus() {
        try {
            return educationStatus;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the education status.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the education status of the employee.
     *
     * @param educationStatus The education status of the employee.
     */
    public void setEducationStatus(EducationStatus educationStatus) {
        try {
            this.educationStatus = educationStatus;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the education status.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the experience level of the employee.
     *
     * @return The experience level of the employee.
     */
    public ExperienceLevel getExperienceLevel() {
        try {
            return experienceLevel;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the experience level.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the experience level of the employee.
     *
     * @param experienceLevel The experience level of the employee.
     */
    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        try {
            this.experienceLevel = experienceLevel;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the experience level.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the termination date of the employee's employment.
     *
     * @return The termination date of the employee's employment.
     */
    public Date getTerminationDate() {
        try {
            return terminationDate;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the termination date.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the termination date of the employee's employment.
     *
     * @param terminationDate The termination date of the employee's employment.
     */
    public void setTerminationDate(Date terminationDate) {
        try {
            this.terminationDate = terminationDate;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the termination date.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the social media accounts associated with the employee.
     *
     * @return The social media accounts associated with the employee.
     */
    public ArrayList<SocialMediaAccount> getSocialMediaAccount() {
        try {
            return socialMediaAccount;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the social media accounts.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the social media accounts associated with the employee.
     *
     * @param socialMediaAccount The social media accounts associated with the employee.
     */
    public void setSocialMediaAccount(ArrayList<SocialMediaAccount> socialMediaAccount) {
        try {
            this.socialMediaAccount = socialMediaAccount;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the social media accounts.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the number of vocation days available to the employee.
     *
     * @return The number of vocation days available to the employee.
     */
    public int getVocationDays() {
        try {
            return vocationDays;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the vocation days.");
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Sets the number of vocation days available to the employee.
     *
     * @param vocationDays The number of vocation days available to the employee.
     */
    public void setVocationDays(int vocationDays) {
        try {
            this.vocationDays = vocationDays;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the vocation days.");
            e.printStackTrace();
        }
    }


}
