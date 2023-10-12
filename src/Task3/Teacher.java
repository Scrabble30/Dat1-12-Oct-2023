package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    private final ArrayList<String> canTeach;
    private final ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);

        this.currentCourses = new ArrayList<>();
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course) {
        if (!canTeach.contains(course)) {
            return false;
        }

        currentCourses.add(course);
        return true;
    }
}
