package com.erdemserhat.software_project_management_system;

import java.util.Date;

public interface Payable {
    /**
     * Calculates the salary of the payable entity.
     *
     * @return The calculated salary.
     */
    double calculateSalary();

    /**
     * Retrieves the next payment date for the payable entity.
     *
     * @return The next payment date.
     */
    Date getNextPaymentDate();

    /**
     * Processes the payment for the payable entity.
     * Implementations should handle any necessary payment operations.
     */
    void processPayment();
}