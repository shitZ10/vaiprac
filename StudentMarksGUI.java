import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentMarksGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Student Marks Input");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        // Create labels and text fields for subject marks input
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField();

        JLabel subject1Label = new JLabel("Subject 1 Marks:");
        JTextField subject1Field = new JTextField();

        JLabel subject2Label = new JLabel("Subject 2 Marks:");
        JTextField subject2Field = new JTextField();

        JLabel subject3Label = new JLabel("Subject 3 Marks:");
        JTextField subject3Field = new JTextField();

        JLabel subject4Label = new JLabel("Subject 4 Marks:");
        JTextField subject4Field = new JTextField();

        JLabel subject5Label = new JLabel("Subject 5 Marks:");
        JTextField subject5Field = new JTextField();

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(subject1Label);
        frame.add(subject1Field);
        frame.add(subject2Label);
        frame.add(subject2Field);
        frame.add(subject3Label);
        frame.add(subject3Field);
        frame.add(subject4Label);
        frame.add(subject4Field);
        frame.add(subject5Label);
        frame.add(subject5Field);

        JButton submitButton = new JButton("Submit");
        frame.add(new JLabel()); // Empty space for alignment
        frame.add(submitButton);

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
        
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int marks1 = Integer.parseInt(subject1Field.getText());
                int marks2 = Integer.parseInt(subject2Field.getText());
                int marks3 = Integer.parseInt(subject3Field.getText());
                int marks4 = Integer.parseInt(subject4Field.getText());
                int marks5 = Integer.parseInt(subject5Field.getText());

                int total = marks1 + marks2 + marks3 + marks4 + marks5;
                double average = total / 5.0;
                String result = average >= 40 ? "Pass" : "Fail";

                // Display the result in a new window
                JFrame resultFrame = new JFrame("Student Result");
                resultFrame.setSize(300, 200);
                resultFrame.setLayout(new GridLayout(0, 1, 10, 10));

                resultFrame.add(new JLabel("Student Name: " + name));
                resultFrame.add(new JLabel("Total Marks: " + total));
                resultFrame.add(new JLabel("Average Marks: " + String.format("%.2f", average)));
                resultFrame.add(new JLabel("Result: " + result));

                resultFrame.setVisible(true);
            }
        });

        frame.setVisible(true);
    }
}
