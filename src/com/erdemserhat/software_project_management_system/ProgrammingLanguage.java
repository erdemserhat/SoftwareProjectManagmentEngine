package com.erdemserhat.software_project_management_system;

public enum ProgrammingLanguage {
    JAVA("Java Programming Language"),
    PYTHON("Python Programming Language"),
    C_SHARP("C# Programming Language"),
    JAVASCRIPT("JavaScript Programming Language"),
    RUBY("Ruby Programming Language"),
    PHP("PHP Programming Language"),
    GO("GO Programming Language"),
    R("R Programming Language"),
    C_PLUS_PLUS("C++ Language");

    private final String programmingLanguageName;

    /**
     * @param programmingLanguageName: The name or title of the programming language.
     */

    ProgrammingLanguage(String programmingLanguageName) {
        this.programmingLanguageName = programmingLanguageName;
    }

    @Override
    public String toString() {
        return this.programmingLanguageName;
    }
}
