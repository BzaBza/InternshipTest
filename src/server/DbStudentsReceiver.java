package server;

public class DbStudentsReceiver implements StudentsReceiver {
    private String[] dbResult = {"Andrew Kostenko", "Maria Perechrest", "Julia Veselkina"};

    @Override
    public String[] getStudents() {
        return dbResult;
    }
}
