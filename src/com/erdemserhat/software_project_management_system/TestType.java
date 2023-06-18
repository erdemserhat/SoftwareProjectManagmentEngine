package com.erdemserhat.software_project_management_system;

/**
 * The `TestType` enum represents different types of tests that can be performed in software testing.
 */
public enum TestType {
    UNIT_TEST("Unit Test"),
    INTEGRATION_TEST("Integration Test"),
    ACCEPTANCE_TEST("Acceptance Test"),
    PERFORMANCE_TEST("Performance Test"),
    SECURITY_TEST("Security Test");

    private final String typeName;

    /**
     * Constructs a `TestType` enum constant with the specified type name.
     *
     * @param typeName The name of the test type.
     */
    TestType(String typeName) {
        this.typeName = typeName;
    }

    /**
     * Returns the name of the test type.
     *
     * @return The name of the test type.
     */
    @Override
    public String toString() {
        return typeName;
    }
}
