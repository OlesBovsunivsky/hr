package ua.netcracker.hr_system.model.entity;

/**
 * Created by Nikita on 28.04.2016.
 */
public enum Status {
    NEW(1, "NEW"), READY(2, "READY"), INTERVIEW(3, "INTERVIEW"), NO_INTERVIEW(4, "NO INTERVIEW"), INTERVIEW_DATED(5, "INTERVIEW_DATED"),
    INTERVIEW_IN_PROCESS(6, "INTERVIEW_IN_PROCESS"), INTERVIEW_PASSED(7, "INTERVIEW_PASSED"), JOB_ACCEPTED(8, "JOB_ACCEPTED"),
    TRAINEE_ACCEPTED(8, "TRAINEE_ACCEPTED"), REJECTED(9, "REJECTED");

    int id;
    String status;

    Status(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return status;
    }
}
