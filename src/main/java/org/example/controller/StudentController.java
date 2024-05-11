package org.example.controller;

import org.example.dao.StudentDAO;
import org.example.entity.Student;
import org.example.view.StudentView;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentController {

    private StudentDAO studentDao;
    private StudentView studentView;

    public StudentController(StudentView view) {
        this.studentView = view;
        studentDao = new StudentDAO();

        view.addAddStudentListener(new AddStudentListener());
        view.addEdiStudentListener(new EditStudentListener());
        view.addDeleteStudentListener(new DeleteStudentListener());
        view.addClearListener(new ClearStudentListener());
        view.addSortStudentGPAListener(new SortStudentGPAListener());
        view.addSortStudentNameListener(new SortStudentNameListener());
        view.addListStudentSelectionListener(new ListStudentSelectionListener());
    }
    public void showStudentView() {
        List<Student> studentList = studentDao.getListStudents();
        studentView.setVisible(true);
        studentView.showListStudents(studentList);
    }
    class AddStudentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.add(student);
                studentView.showStudent(student);
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Thêm thành công!");
            }
        }
        }
    class EditStudentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.edit(student);
                studentView.showStudent(student);
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Cập nhật thành công!");
            }
        }
    }

    class DeleteStudentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Student student = studentView.getStudentInfo();
            if (student != null) {
                studentDao.delete(student);
                studentView.clearStudentInfo();
                studentView.showListStudents(studentDao.getListStudents());
                studentView.showMessage("Xóa thành công!");
            }
        }
    }

    class ClearStudentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            studentView.clearStudentInfo();
        }
    }

    class SortStudentGPAListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            studentDao.sortStudentByGPA();
            studentView.showListStudents(studentDao.getListStudents());
        }
    }

    class SortStudentNameListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            studentDao.sortStudentByName();
            studentView.showListStudents(studentDao.getListStudents());
        }
    }
    class ListStudentSelectionListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            studentView.fillStudentFromSelectedRow();
        }
    }

}
