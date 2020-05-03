package ajayvikka.projects.gunni.model;

public enum RolesEnum {

    PROJECT_MANAGER("Manages the project and employees working on the project"),
    DEVELOPER("Resolves bugs"),
    TESTER("Tests bugs"),
    CODE_REVIEWER("Reviews the code written by the Developer"),
    DEV_OPS("Handles builds and deployments");

    private String description;

    RolesEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
