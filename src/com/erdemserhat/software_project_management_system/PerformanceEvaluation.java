package com.erdemserhat.software_project_management_system;

import java.util.Date;
import java.util.List;

/**
 * Represents a performance evaluation conducted on employees.
 */
public class PerformanceEvaluation {
    private Date evaluationDate;
    private List<Employee> evaluatedEmployees;
    private String evaluationFeedback;

    /**
     * Creates a new performance evaluation with the specified evaluation date, evaluated employees, and evaluation feedback.
     *
     * @param evaluationDate     The date on which the evaluation is conducted.
     * @param evaluatedEmployees The employees being evaluated.
     * @param evaluationFeedback The feedback or assessment provided to the evaluated employees.
     */
    public PerformanceEvaluation(Date evaluationDate, List<Employee> evaluatedEmployees, String evaluationFeedback) {
        this.evaluationDate = evaluationDate;
        this.evaluatedEmployees = evaluatedEmployees;
        this.evaluationFeedback = evaluationFeedback;
    }

    /**
     * Retrieves the evaluation date of the performance evaluation.
     *
     * @return The evaluation date.
     */
    public Date getEvaluationDate() {
        try {
            return evaluationDate;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the evaluation date.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the evaluation date of the performance evaluation.
     *
     * @param evaluationDate The new evaluation date.
     */
    public void setEvaluationDate(Date evaluationDate) {
        try {
            this.evaluationDate = evaluationDate;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the evaluation date.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the employees who were evaluated in the performance evaluation.
     *
     * @return The evaluated employees.
     */
    public List<Employee> getEvaluatedEmployees() {
        try {
            return evaluatedEmployees;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the evaluated employees.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the employees who were evaluated in the performance evaluation.
     *
     * @param evaluatedEmployees The new evaluated employees.
     */
    public void setEvaluatedEmployees(List<Employee> evaluatedEmployees) {
        try {
            this.evaluatedEmployees = evaluatedEmployees;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the evaluated employees.");
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the evaluation feedback provided to the evaluated employees.
     *
     * @return The evaluation feedback.
     */
    public String getEvaluationFeedback() {
        try {
            return evaluationFeedback;
        } catch (Exception e) {
            System.out.println("An error occurred while retrieving the evaluation feedback.");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets the evaluation feedback provided to the evaluated employees.
     *
     * @param evaluationFeedback The new evaluation feedback.
     */
    public void setEvaluationFeedback(String evaluationFeedback) {
        try {
            this.evaluationFeedback = evaluationFeedback;
        } catch (Exception e) {
            System.out.println("An error occurred while setting the evaluation feedback.");
            e.printStackTrace();
        }
    }
}
