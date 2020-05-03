package ajayvikka.projects.gunni.exceptions;

public class GunniExceptionFormat {

    private String message;

    public GunniExceptionFormat() { }

    public GunniExceptionFormat(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
