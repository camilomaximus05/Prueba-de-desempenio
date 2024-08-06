package RiwiAcademy.Models;

import RiwiAcademy.Entities.Student;
import RiwiAcademy.Persistence.IModel.ICourseModel;

import java.util.ArrayList;

public class ICourseImpl implements ICourseModel {
    @Override
    public boolean create(Student student) {
        return false;
    }

    @Override
    public boolean delete(Student student) {
        return false;
    }

    @Override
    public ArrayList<Student> readAll() {
        return null;
    }
}
