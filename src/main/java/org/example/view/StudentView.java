package org.example.view;

import org.example.entity.Student;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentView extends JFrame implements ActionListener, ListSelectionListener {
    private static final long serialVersionUID = 1L;
    private JButton addStudentBtn;
    private JButton editStudentBtn;
    private JButton deleteStudentBtn;
    private JButton clearBtn;

    private JButton exitBtn;
    private JButton sortStudentGPABtn;
    private JButton sortStudentNameBtn;
    private JScrollPane jScrollPaneStudentTable;
    private JScrollPane jScrollPaneAddress;
    private JTable studentTable;

    private JLabel idLabel;
    private JLabel firstNameLabel;

    private JLabel lastNameLabel;
    private JLabel contactLabel;
    private JLabel ageLabel;
    private JLabel addressLabel;
    private JLabel gpaLabel;

    private JLabel specializationLabel;

    private JLabel hobbiesLabel;

    private JLabel sportsLabel;

    private JTextField idField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField contactField;
    private JTextField ageField;
    private JTextArea addressTA;
    private JTextField gpaField;
    private JTextField specializationField;
    private JTextField hobbiesField;
    private JTextField sportsField;


    private String [] columnNames = new String [] {
            "ID", "First Name","Last Name", "Age","Contact","Address", "GPA","Specialization","Hobbies","Sports"};

    private Object data = new Object [][] {};
    public StudentView() {
        initComponents();
    }
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // khởi tạo các phím chức năng
        addStudentBtn = new JButton("Save");
        editStudentBtn = new JButton("Edit");
        deleteStudentBtn = new JButton("Delete");
        clearBtn = new JButton("Reset");
        exitBtn = new JButton("Exit");
        sortStudentGPABtn = new JButton("Sort By GPA");
        sortStudentNameBtn = new JButton("Sort By Name");
        // khởi tạo bảng student
        jScrollPaneStudentTable = new JScrollPane();
        studentTable = new JTable();

        // khởi tạo các label
        idLabel = new JLabel("Id");
        firstNameLabel = new JLabel("First Name: ");
        lastNameLabel = new JLabel("Last Name: ");
        ageLabel = new JLabel("Age: ");
        contactLabel = new JLabel("Contact: ");
        addressLabel = new JLabel("Address: ");
        gpaLabel = new JLabel("GPA: ");
        specializationLabel = new JLabel("Specialization: ");
        hobbiesLabel = new JLabel("Hobbies: ");
        sportsLabel = new JLabel("Sport: ");

        // khởi tạo các trường nhập dữ liệu cho student
        idField = new JTextField(6);
        idField.setEditable(false);
        firstNameField = new JTextField(15);
        lastNameField = new JTextField(15);
        contactField = new JTextField(15);
        ageField = new JTextField(6);


        addressTA = new JTextArea();
        addressTA.setColumns(15);
        addressTA.setRows(5);
        jScrollPaneAddress = new JScrollPane();
        jScrollPaneAddress.setViewportView(addressTA);


        gpaField = new JTextField(6);

        specializationField = new JTextField(15);
        hobbiesField = new JTextField(15);
        sportsField = new JTextField(15);
        // cài đặt các cột và data cho bảng student
        studentTable.setModel(new DefaultTableModel((Object[][]) data, columnNames));
        jScrollPaneStudentTable.setViewportView(studentTable);
        jScrollPaneStudentTable.setPreferredSize(new Dimension(680, 300));


        // tạo spring layout
        SpringLayout layout = new SpringLayout();
        // tạo đối tượng panel để chứa các thành phần của màn hình quản lý Student
        JPanel panel = new JPanel();
        panel.setSize(800, 420);
        panel.setLayout(layout);

        panel.add(jScrollPaneStudentTable);

        panel.add(addStudentBtn);
        panel.add(editStudentBtn);
        panel.add(deleteStudentBtn);
        panel.add(clearBtn);
        panel.add(exitBtn);
        panel.add(sortStudentGPABtn);
        panel.add(sortStudentNameBtn);

        panel.add(idLabel);
        panel.add(firstNameLabel);
        panel.add(lastNameLabel);
        panel.add(contactLabel);

        panel.add(ageLabel);
        panel.add(addressLabel);
        panel.add(gpaLabel);

        panel.add(specializationLabel);
        panel.add(hobbiesLabel);
        panel.add(sportsLabel);

        panel.add(idField);
        panel.add(firstNameField);
        panel.add(lastNameField);
        panel.add(contactField);
        panel.add(ageField);
        panel.add(jScrollPaneAddress);
        panel.add(gpaField);
        panel.add(specializationField);
        panel.add(hobbiesField);
        panel.add(sportsField);

        // cài đặt vị trí các thành phần trên màn hình login
        layout.putConstraint(SpringLayout.WEST, idLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, idLabel, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, firstNameLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, firstNameLabel, 40, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, lastNameLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lastNameLabel, 70, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, contactLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, contactLabel, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, ageLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, ageLabel, 130, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, addressLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, addressLabel, 160, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, gpaLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, gpaLabel, 260, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, specializationLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, specializationLabel, 290, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, hobbiesLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, hobbiesLabel, 310, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sportsLabel, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, sportsLabel, 340, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, idField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, idField, 10, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, firstNameField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, firstNameField, 40, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, lastNameField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, lastNameField, 70, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, contactField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, contactField, 100, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, ageField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, ageField, 130, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, jScrollPaneAddress, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, jScrollPaneAddress, 160, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, gpaField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, gpaField, 260, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, specializationField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, specializationField, 290, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, hobbiesField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, hobbiesField, 310, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sportsField, 100, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, sportsField, 340, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, jScrollPaneStudentTable, 300, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, jScrollPaneStudentTable, 10, SpringLayout.NORTH, panel);

        layout.putConstraint(SpringLayout.WEST, addStudentBtn, 20, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, addStudentBtn, 400, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, editStudentBtn, 60, SpringLayout.WEST, addStudentBtn);
        layout.putConstraint(SpringLayout.NORTH, editStudentBtn, 400, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, deleteStudentBtn, 60, SpringLayout.WEST, editStudentBtn);

        layout.putConstraint(SpringLayout.NORTH, clearBtn, 400, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, clearBtn, 80, SpringLayout.WEST, deleteStudentBtn);

        layout.putConstraint(SpringLayout.NORTH, deleteStudentBtn, 400, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sortStudentGPABtn, 500, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, sortStudentGPABtn, 400, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, sortStudentNameBtn, 115, SpringLayout.WEST, sortStudentGPABtn);
        layout.putConstraint(SpringLayout.NORTH, sortStudentNameBtn, 400, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, exitBtn, 290, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, exitBtn, 400, SpringLayout.NORTH, panel);

        this.add(panel);
        this.pack();
        this.setTitle("Student Registration");
        this.setSize(1000, 620);
        this.setLocationRelativeTo(null);
        // disable Edit and Delete buttons
        editStudentBtn.setEnabled(false);
        deleteStudentBtn.setEnabled(false);
        // enable Add button
        addStudentBtn.setEnabled(true);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    /**
     * hiển thị list student vào bảng studentTable
     *
     * @param list
     */
    public void showListStudents(List<Student> list) {
        int size = list.size();
        // với bảng studentTable có 5 cột,
        // khởi tạo mảng 2 chiều students, trong đó:
        // số hàng: là kích thước của list student
        // số cột: là 5
        Object [][] students = new Object[size][10];
        for (int i = 0; i < size; i++) {
            students[i][0] = list.get(i).getId();
            students[i][1] = list.get(i).getFirName();
            students[i][2] = list.get(i).getLastName();
            students[i][3] = list.get(i).getAge();
            students[i][4] = list.get(i).getContact();
            students[i][5] = list.get(i).getAddress();
            students[i][6] = list.get(i).getGpa();
            students[i][7] = list.get(i).getMajor();
            students[i][8] = list.get(i).getHobbies();
            students[i][9] = list.get(i).getSport();
        }
        studentTable.setModel(new DefaultTableModel(students, columnNames));
    }


    public void fillStudentFromSelectedRow() {
        // lấy chỉ số của hàng được chọn
        int row = studentTable.getSelectedRow();
        if (row >= 0) {
            idField.setText(studentTable.getModel().getValueAt(row, 0).toString());
            firstNameField.setText(studentTable.getModel().getValueAt(row, 1).toString());
            lastNameField.setText(studentTable.getModel().getValueAt(row, 2).toString());
            contactField.setText(studentTable.getModel().getValueAt(row, 3).toString());
            ageField.setText(studentTable.getModel().getValueAt(row, 4).toString());
            addressTA.setText(studentTable.getModel().getValueAt(row, 5).toString());
            gpaField.setText(studentTable.getModel().getValueAt(row, 6).toString());
            specializationField.setText(studentTable.getModel().getValueAt(row, 7).toString());
            hobbiesField.setText(studentTable.getModel().getValueAt(row, 8).toString());
            sportsField.setText(studentTable.getModel().getValueAt(row, 9).toString());
            // enable Edit and Delete buttons
            editStudentBtn.setEnabled(true);
            deleteStudentBtn.setEnabled(true);
            // disable Add button
            addStudentBtn.setEnabled(false);
        }
    }

    /**
     * xóa thông tin student
     */
    public void clearStudentInfo() {
        idField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        contactField.setText("");
        ageField.setText("");
        addressTA.setText("");
        gpaField.setText("");
        specializationField.setText("");
        hobbiesField.setText("");
        sportsField.setText("");

        // disable Edit and Delete buttons
        editStudentBtn.setEnabled(false);
        deleteStudentBtn.setEnabled(false);
        // enable Add button
        addStudentBtn.setEnabled(true);
    }

    /**
     * hiện thị thông tin student
     *
     * @param student
     */
    public void showStudent(Student student) {
        idField.setText("" + student.getId());
        firstNameField.setText(student.getFirName());
        lastNameField.setText(student.getLastName());
        contactField.setText(student.getContact());

        ageField.setText("" + student.getAge());
        addressTA.setText(student.getAddress());
        gpaField.setText("" + student.getGpa());
        specializationField.setText("" + student.getMajor());
        hobbiesField.setText("" + student.getHobbies());
        sportsField.setText("" + student.getSport());
        // enable Edit and Delete buttons
        editStudentBtn.setEnabled(true);
        deleteStudentBtn.setEnabled(true);
        // disable Add button
        addStudentBtn.setEnabled(false);
    }

    /**
     * lấy thông tin student
     *
     * @return
     */
    public Student getStudentInfo() {
        // validate student
        if (!validateFirstName()||!validateLastName()||!validateContact() || !validateAge() || !validateAddress() || !validateGPA() || !validateMajor() ||!validateHobbies()||!validateSport()) {
            return null;
        }
        try {
            Student student = new Student();
            if (idField.getText() != null && !"".equals(idField.getText())) {
                student.setId(Integer.parseInt(idField.getText()));
            }
            student.setFirName(firstNameField.getText().trim());
            student.setLastName(lastNameField.getText().trim());
            student.setContact(contactField.getText().trim());
            student.setAge(Byte.parseByte(ageField.getText().trim()));
            student.setAddress(addressTA.getText().trim());
            student.setGpa(Float.parseFloat(gpaField.getText().trim()));
            student.setMajor(specializationField.getText().trim());
            student.setHobbies(hobbiesField.getText().trim());
            student.setSport(sportsField.getText().trim());
            return student;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }

    private boolean validateFirstName() {
        String name = firstNameField.getText();
        if (name == null || "".equals(name.trim())) {
            firstNameField.requestFocus();
            showMessage("First Name không được trống.");
            return false;
        }
        return true;
    }
    private boolean validateLastName() {
        String name = lastNameField.getText();
        if (name == null || "".equals(name.trim())) {
            lastNameField.requestFocus();
            showMessage("Last Name không được trống.");
            return false;
        }
        return true;
    }


    private boolean validateAddress() {
        String address = addressTA.getText();
        if (address == null || "".equals(address.trim())) {
            addressTA.requestFocus();
            showMessage("Address không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateContact() {
        String address = contactField.getText();
        if (address == null || "".equals(address.trim())) {
            contactField.requestFocus();
            showMessage("Address không được trống.");
            return false;
        }
        return true;
    }

    private boolean validateAge() {
        try {
            Byte age = Byte.parseByte(ageField.getText().trim());
            if (age < 0 || age > 100) {
                ageField.requestFocus();
                showMessage("Age không hợp lệ, age nên trong khoảng 0 đến 100.");
                return false;
            }
        } catch (Exception e) {
            ageField.requestFocus();
            showMessage("Age không hợp lệ!");
            return false;
        }
        return true;
    }

    private boolean validateGPA() {
        try {
            Float gpa = Float.parseFloat(gpaField.getText().trim());
            if (gpa < 0 || gpa > 10) {
                gpaField.requestFocus();
                showMessage("GPA không hợp lệ, gpa nên trong khoảng 0 đến 10.");
                return false;
            }
        } catch (Exception e) {
            gpaField.requestFocus();
            showMessage("GPA không hợp lệ!");
            return false;
        }
        return true;
    }

    private boolean validateMajor() {
        String name = specializationField.getText();
        if (name == null || "".equals(name.trim())) {
            specializationField.requestFocus();
            showMessage("Specialization không được trống.");
            return false;
        }
        return true;
    }
    private boolean validateHobbies() {
        String name = hobbiesField.getText();
        if (name == null || "".equals(name.trim())) {
            hobbiesField.requestFocus();
            showMessage("Hobbies không được trống.");
            return false;
        }
        return true;
    }
    private boolean validateSport() {
        String name = sportsField.getText();
        if (name == null || "".equals(name.trim())) {
            sportsField.requestFocus();
            showMessage("Sport không được trống.");
            return false;
        }
        return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
    public void addAddStudentListener(ActionListener listener) {
        addStudentBtn.addActionListener(listener);
    }

    public void addEdiStudentListener(ActionListener listener) {
        editStudentBtn.addActionListener(listener);
    }

    public void addDeleteStudentListener(ActionListener listener) {
        deleteStudentBtn.addActionListener(listener);
    }

    public void addClearListener(ActionListener listener) {
        clearBtn.addActionListener(listener);
    }

    public void addSortStudentGPAListener(ActionListener listener) {
        sortStudentGPABtn.addActionListener(listener);
    }

    public void addSortStudentNameListener(ActionListener listener) {
        sortStudentNameBtn.addActionListener(listener);
    }

    public void addListStudentSelectionListener(ListSelectionListener listener) {
        studentTable.getSelectionModel().addListSelectionListener(listener);
    }
}
