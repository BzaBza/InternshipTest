package server;

public class FileStudentsReceiver implements StudentsReceiver {
    private String[] fileResult = {"Arthur Boshkof", "Igor Boshkof", "Ignat Boshkof"};

    @Override
    public String[] getStudents() {
        return fileResult;
    }
}
