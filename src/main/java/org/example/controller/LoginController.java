package org.example.controller;

import org.example.dao.UserDAO;
import org.example.entity.User;
import org.example.view.LoginView;
import org.example.view.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private UserDAO userDao;
    private LoginView loginView;
    private StudentView studentView;

    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDao = new UserDAO();
        view.addLoginListener(new LoginListener());
    }
    public void showLoginView() {
        loginView.setVisible(true);
    }
    class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if (userDao.checkUser(user)) {
                // nếu đăng nhập thành công, mở màn hình quản lý sinh viên
                studentView = new StudentView();
                StudentController studentController = new StudentController(studentView);
                studentController.showStudentView();
                loginView.setVisible(false);
            } else {
                loginView.showMessage("username hoặc password không đúng.");
            }
        }
    }


}
