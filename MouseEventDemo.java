import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener {

    public MouseEventDemo() {
        // Set the initial size and title of the frame
        setSize(400, 300);
        setTitle("Mouse Event Demo");
        setLayout(new FlowLayout());

        // Add a label to display the instructions
        Label label = new Label("Interact with the frame using the mouse.");
        add(label);

        // Add mouse listener to the frame
        addMouseListener(this);

        // Set the frame to invisible initially
        setVisible(true);

        // Close the frame when the user clicks the close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle mouse click event
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    // Handle mouse entered event
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered the frame.");
        setVisible(true); // Make the frame visible when the mouse enters
    }

    // Handle mouse exited event
    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited the frame.");
        setVisible(false); // Make the frame invisible when the mouse exits
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Not used in this example
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Not used in this example
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        new MouseEventDemo();
    }
}
