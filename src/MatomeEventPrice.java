package src;
/*Author details
  CLASS GROUP  :GROUP 9
  ASSIGNMENT 3 :MatomeEventPrice Project
  GROUP LEADER :SAM SIFISO MNDEBELE
  DATE         :24 APRIL 2023
Our program generated 4 .class files and the image file 'background.png' is part of the project.
  GUI Catering Application
 */

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;

public class MatomeEventPrice extends JFrame {
    private static final double PRICE_PER_GUEST = 25.0;

    //Application icon byte array
    private static final byte[] logoBytes = {-119,80,78,71,13,10,26,10,0,0,0,13,73,72,68,82,0,0,0,37,0,0,0,37,8,6,0,0,0,-59,-98,32,3,0,0,7,91,73,68,65,84,120,94,-51,-104,-39,83,83,119,20,-57,125,-88,34,-39,-56,30,118,112,-87,90,119,-83,-75,79,-2,3,-114,-81,-99,97,-90,90,-111,37,44,97,115,65,17,49,10,-88,-59,-67,85,90,81,-95,-83,-83,-118,18,-78,-77,104,0,9,-118,-118,58,-75,104,43,46,-120,68,68,69,16,117,-32,-63,-16,116,-6,-5,-3,114,111,72,126,-9,-122,-88,79,62,124,25,7,48,-9,-29,-25,-100,-100,115,-30,36,0,-104,-12,-71,-123,124,-111,100,-40,87,74,-46,44,23,-62,50,108,78,105,38,-118,-50,-18,-108,101,-39,-99,-14,108,38,58,107,-103,-8,-69,74,41,-3,-105,63,38,17,-7,117,-21,-93,10,47,56,3,37,34,-65,-66,-116,-3,-35,73,-30,100,99,-126,36,-61,54,38,61,-12,24,-28,63,-11,-128,-14,-24,19,80,-1,-46,11,-31,21,46,-120,56,-15,20,-94,-86,-6,32,-30,-64,29,80,100,-37,6,52,-37,90,-29,-24,-121,5,11,-2,-57,-88,117,-58,-98,-39,39,58,-31,-37,43,-17,2,6,-1,92,-109,107,57,-57,66,117,-120,-9,117,67,-40,-63,-57,32,59,-36,3,-118,35,79,64,85,-34,11,-102,99,8,-20,-72,11,34,79,62,-123,-24,-33,-6,32,-26,100,47,-56,82,13,61,-12,67,-125,37,124,-67,-75,109,-111,-55,-59,-127,-32,75,-36,46,-89,-117,64,-119,82,45,78,-47,-34,71,32,-39,-33,13,-76,45,77,-59,-72,-83,-104,-33,-97,65,-8,-18,27,-96,-56,-78,-82,-89,31,28,40,-86,44,-45,-118,105,-5,-82,-70,-23,-121,7,-118,31,-108,-16,-57,71,64,108,29,96,108,-3,-116,-64,-54,17,-40,-81,-2,-74,98,-1,120,70,-54,-8,-95,-3,-91,-39,96,127,-68,-44,49,-56,121,120,-96,-116,67,-91,88,-100,-126,61,15,65,84,-58,-40,58,-24,-79,69,-54,-120,109,29,99,108,85,122,108,69,31,123,4,-14,12,83,27,13,64,71,-99,99,41,-97,85,-7,31,44,107,125,11,-53,47,115,1,-8,-30,-123,18,34,-88,-48,93,15,-127,-40,-38,-117,109,117,-125,12,-105,17,-37,-62,101,-60,-74,42,24,91,-72,-116,-56,-106,-70,-80,-43,45,-45,26,86,-48,32,108,-80,-55,-120,45,-115,-93,75,-102,-122,-31,-21,75,111,-32,27,-25,91,14,0,95,-58,-95,-110,45,-50,-87,-91,15,64,-80,-101,-79,-59,-37,-12,-56,-42,-15,-89,16,89,-55,52,125,101,47,-18,-83,62,26,-58,107,41,-49,-42,49,-41,-48,7,-117,29,-61,-80,-76,-7,13,-78,-11,6,-106,-73,5,7,-13,66,9,16,84,72,-15,3,32,-74,80,25,-59,1,-102,-34,119,68,-32,50,70,30,-66,11,-14,116,83,57,13,-92,-54,-79,38,-60,-106,93,127,-65,-96,97,8,22,93,120,13,-60,86,11,99,43,72,25,-57,-95,-110,-52,-50,41,59,-17,-61,-44,18,-58,22,-89,-23,25,91,124,77,-97,87,63,74,55,-67,50,-53,60,52,-49,54,8,-13,-21,-122,96,97,-29,107,88,124,-15,53,-78,53,12,-53,112,25,-125,-40,-14,-125,-102,-68,-29,62,-124,20,-33,71,-74,30,16,91,116,-45,43,-23,-90,103,108,-59,84,116,-125,92,103,-23,96,-127,20,-103,-90,115,-45,42,-18,-63,92,-53,43,-104,103,31,-124,5,-11,-2,-74,-106,57,39,110,122,63,-88,47,-74,119,-127,-81,45,-34,17,-63,54,61,101,75,83,-36,-114,-63,18,-108,57,-10,-123,-31,-37,91,-33,-51,54,14,-64,28,-13,43,-104,107,125,-123,108,13,34,91,67,94,91,-92,-23,39,-80,-59,-127,-102,-84,-17,34,-74,72,-45,-13,-40,-30,27,17,-47,-65,35,-80,83,-49,64,-75,-91,9,-44,5,-51,48,-29,-12,83,-104,101,120,9,-77,77,3,-16,21,101,-117,52,61,-74,69,70,-60,91,-104,95,-35,13,-53,-102,-121,38,-122,34,-74,112,25,75,-104,-90,47,-66,11,-30,116,59,72,54,-75,122,-102,-98,103,68,-112,50,34,91,113,127,-10,-61,-76,51,-49,97,70,-11,11,-8,-78,-26,37,-52,-86,-59,-74,6,-58,109,-31,-90,71,-74,-26,-101,-48,-100,-37,-47,50,-94,-55,-77,-74,69,23,57,-118,84,-70,90,123,-4,-98,-53,3,19,66,97,91,-92,-116,-56,-106,112,-21,77,16,-89,-104,-86,-60,73,6,61,-70,34,-58,-72,35,-62,-27,29,17,-40,86,-4,95,-3,48,-3,-20,115,-104,121,14,-127,97,91,70,-58,-106,-51,99,43,102,-41,21,-73,58,-41,-38,-58,121,99,-92,-41,108,98,119,35,47,20,-79,85,-40,9,-62,84,27,8,-74,-35,6,-111,-42,54,38,94,103,-48,-77,96,19,-19,69,98,-21,-12,115,-104,-114,108,-51,60,-1,2,-39,122,9,115,76,30,91,17,-37,-102,71,34,10,46,-90,-8,-62,-80,-63,-112,-45,15,92,11,2,-107,127,11,-124,-21,-116,85,-94,-75,53,14,97,17,2,75,67,96,73,30,-80,-80,-20,70,-73,103,68,-16,55,61,-74,69,-54,-120,109,-43,120,108,-123,111,109,26,81,100,24,3,78,127,53,90,-38,-20,89,-61,-127,-102,92,-16,15,-96,63,15,-121,-28,-75,-125,32,-59,58,38,74,-84,-47,19,-80,-19,-73,65,-52,-128,73,80,-92,-123,87,-71,35,-126,-39,-117,113,-89,-6,33,-2,52,83,70,100,43,66,-17,116,107,-14,27,121,13,-79,9,-33,104,-73,44,-83,127,-50,15,53,85,-41,2,-94,-17,-49,-84,18,-82,-82,110,15,-55,113,-126,-112,5,75,68,96,122,4,-106,-114,-64,126,56,-69,74,-110,82,-37,38,-33,115,-121,-45,-12,-20,94,100,-101,62,-66,10,-11,-96,-50,60,-31,-30,-58,-91,67,87,-25,104,-64,70,-97,92,120,23,-124,107,-50,-115,-94,-84,-64,96,83,115,-3,-63,-60,-70,70,32,101,68,47,-124,78,-25,1,-18,-120,-16,111,122,-43,-26,-117,35,116,83,-45,-63,-115,-65,-56,-42,-17,-35,-117,28,40,62,-80,-48,-36,54,-44,-12,8,44,-55,-104,-128,30,16,-49,-66,-104,68,107,46,-109,-107,-4,-51,-79,-59,-114,-120,-40,-86,94,-112,-89,25,29,52,-124,111,84,-39,102,-3,-76,67,55,-58,-81,-120,-53,1,-96,56,96,107,-86,-37,5,-24,-99,-120,109,-7,-66,32,54,16,-106,-43,48,-62,57,-99,25,91,-111,-121,-18,-128,60,-45,-110,64,-125,-80,65,-5,81,-113,-34,-115,99,-98,43,98,-40,123,69,4,-124,-14,-126,37,26,-34,-95,11,98,-91,-81,33,-33,-96,15,27,61,-127,70,-124,106,-21,37,119,-96,-46,41,117,-26,-14,-56,-94,22,55,-33,21,49,33,20,-101,80,109,-99,91,-72,-74,-122,124,-62,-96,35,73,-82,109,-109,-19,127,-56,92,17,-2,35,66,-102,106,-32,-36,90,-54,92,-5,66,121,-102,-95,39,-2,-24,29,-104,-21,-67,34,-4,-9,98,108,105,107,112,40,-100,41,27,-81,-125,48,-55,52,32,76,54,-97,21,-83,62,-77,-118,125,-120,88,107,94,40,-55,106,116,-45,123,81,89,116,5,100,-23,102,82,58,121,-90,57,1,-97,-50,-54,-36,-70,-82,-56,-46,-10,-9,51,-49,-10,-111,-127,74,-17,-59,37,-52,94,-116,45,-7,64,40,54,33,104,-46,11,54,93,5,97,122,-3,-120,8,127,44,-61,-17,-62,116,-37,-111,-80,-83,-19,-34,-67,-88,-48,95,3,105,-118,-63,-95,-40,-46,18,39,75,51,117,105,118,117,112,-10,-30,108,-78,23,125,-82,-120,6,-113,45,92,-58,-104,-113,-123,-14,-35,-117,-126,-110,123,32,78,60,63,42,78,69,-74,16,-104,36,-43,-44,17,-90,69,73,-87,37,-91,-106,-23,108,-61,-111,21,61,31,-68,23,23,-31,99,16,-39,-118,41,-2,72,40,2,70,-114,65,-26,-118,40,-19,2,-79,-42,-46,69,-9,-114,108,-125,-29,-120,-86,-12,22,-17,94,-60,-74,-24,-67,56,31,-105,-111,105,-6,-24,79,-127,-62,-15,61,6,-59,-103,13,110,26,10,-39,-22,-28,59,-99,89,91,100,47,-78,-74,-52,30,91,-20,-23,28,-67,-13,-46,-89,65,-7,-98,-50,-94,20,116,52,81,80,-46,-115,-51,85,-118,-30,-101,-68,87,4,-39,-117,-43,-98,-67,-24,107,-117,52,61,-78,21,-67,-29,19,-95,112,-80,45,65,-50,37,16,101,54,-28,-47,80,-24,116,-106,-122,101,90,-121,-7,-82,-120,56,-98,43,2,-37,-14,-116,-120,65,-120,-14,66,37,-42,118,-48,15,13,22,-78,23,-75,-10,74,26,-120,-115,36,-87,102,5,106,-4,119,-22,-93,-113,-3,-82,8,-46,-12,62,87,4,125,58,71,-23,-67,80,-58,42,60,-117,-24,7,7,74,104,-6,5,-73,96,-99,-47,-5,127,73,-127,66,-64,-110,107,70,-43,-5,-1,-3,-96,-45,121,-114,-95,31,-108,58,83,39,-127,-62,95,-16,-44,14,-43,-42,-69,-126,5,91,21,38,-42,6,-36,105,116,-16,44,-109,102,-39,-113,-56,-78,-21,122,20,27,47,-70,20,-101,28,46,101,-66,-61,-91,-38,-36,-28,82,23,52,-71,52,5,-51,46,77,97,-77,43,124,91,-77,11,125,60,-21,-116,42,-71,28,-25,-123,-6,-36,-62,-7,-58,-25,-112,-1,1,75,-14,-94,100,-85,-39,1,114,0,0,0,0,73,69,78,68,-82,66,96,-126};
    private static final ImageIcon logoImage = new ImageIcon(logoBytes); //Application image icon from byte array
    private static final ImageIcon backgroundImage = new ImageIcon("background.png"); //Background image from 'background.png' file

    //Colors
    private static final Color appColor = new Color(20, 35, 52);
    private static final Color backgroundColor = new Color(54, 72, 98, 179);
    private static final Color buttonBackgroundColor = new Color(13, 85, 156, 255);
    private static final Color buttonHovorColor = new Color(3, 123, 212, 255);
    private static final Color textColor = new Color(206, 240, 255);

    //Fonts
    private static final Font labelFont = new Font("Impact",Font.PLAIN, 15);
    private static final Font buttonFont = new Font("Impact",Font.PLAIN, 14);
    private static final Font mottoFont = new Font("Impact",Font.ITALIC, 24);
    private static final Font resultsFont = new Font("Impact",Font.PLAIN, 20);

    //Views
    private static JLabel displayMotto;
    private static JList<String> resultsList;
    private static JList<String> labelsList;

    MatomeEventPrice() {
        setTitle("Matome's Catering Meals for Parties and Special Occasions"); //Set the title for this frame.
        setIconImage(logoImage.getImage());
        setResizable(false); //Sets this frame not resizable by the user.
        setSize(640, 300); //The size of the Window.
        setLocationRelativeTo(null); //Set the location of the window in the center of the screen.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(getPanel()); //Append the panel to the window.
        setVisible(true); //Show this Window
    }

    //Panel is a container that organize components on to a window
    private static JPanel getPanel() {
        JPanel panel = new JPanel(){
            //Override the application background and set a background image
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0,0,null);
            }
        };
        panel.setLayout(null);
        panel.setBackground(appColor);

        //Enter the Number of Guests Label and Styling
        JLabel numOfGuestsLabel = new JLabel("Enter the Number of Guests: ");
        numOfGuestsLabel.setForeground(textColor);
        numOfGuestsLabel.setFont(labelFont);
        numOfGuestsLabel.setBounds(20, 23, 200, 24);
        panel.add(numOfGuestsLabel);

        //Enter the Number of Guests Text Field and Styling
        JTextField numOfGuestsField = new JTextField();
        numOfGuestsField.setForeground(textColor);
        numOfGuestsField.setCaretColor(textColor);
        numOfGuestsField.setFont(labelFont);
        numOfGuestsField.setOpaque(false);
        numOfGuestsField.setBounds(210, 21,160, 28);
        panel.add(numOfGuestsField);

        //Compute the Total Price Button and Styling
        JButton computeButton = new JButton("Compute the Total Price");
        computeButton.setFont(buttonFont);
        computeButton.setBackground(buttonBackgroundColor);
        computeButton.setForeground(textColor);
        computeButton.addMouseListener(new MouseAdapter() {
            //Set hover of the button when mouse on top of the button.
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                computeButton.setBackground(buttonHovorColor);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                computeButton.setBackground(buttonBackgroundColor);
            }
        });
        computeButton.setBorderPainted(false);
        computeButton.setBounds(400, 20, 200, 30);
        computeButton.setFocusable(false);
        panel.add(computeButton);

        //Motto Label and Styling
        displayMotto = new JLabel(" Always Fresh. Always delicious".toUpperCase());
        displayMotto.setForeground(textColor);
        displayMotto.setFont(mottoFont);
        displayMotto.setIcon(logoImage);
        displayMotto.setBounds(20, 70, 600, 30);
        displayMotto.setVisible(false);
        panel.add(displayMotto);

        //Results Labels List and Styling
        labelsList = new JList<>();
        labelsList.setBounds(20, 110, 200, 120);
        labelsList.setBackground(backgroundColor);
        labelsList.setForeground(textColor);
        labelsList.setSelectionBackground(backgroundColor);
        labelsList.setOpaque(false);
        labelsList.setFocusable(false);
        labelsList.setFont(resultsFont);
        DefaultListModel<String> labelsModel = new DefaultListModel<>();
        labelsModel.addElement("  Number Of Guest");
        labelsModel.addElement("  Price Per Guest");
        labelsModel.addElement("  Total Price");
        labelsModel.addElement("  Is Large Event");
        labelsList.setModel(labelsModel);
        labelsList.setVisible(false);
        panel.add(labelsList);

        //Results List and Styling
        resultsList = new JList<>();
        resultsList.setBounds(220, 110, 380, 120);
        resultsList.setBackground(backgroundColor);
        resultsList.setSelectionBackground(backgroundColor);
        resultsList.setOpaque(false);
        resultsList.setFocusable(false);
        resultsList.setForeground(textColor);
        resultsList.setFont(resultsFont);
        resultsList.setVisible(false);
        panel.add(resultsList);

        //Add Compute button key listener to calculate the results
        computeButton.addActionListener(_ -> calculateResultsAndDisplay(numOfGuestsField));
        //Add 'Enter' button key listener to calculate the results without clicking Compute on-screen button
        numOfGuestsField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    calculateResultsAndDisplay(numOfGuestsField);
                }
            }
        });

        return panel;
    }

    //A methode to calculate the results and redisplay if are valid
    private static void calculateResultsAndDisplay(@NotNull JTextField numOfGuestsField) {
        String numOfGuestsText = numOfGuestsField.getText();
        int numOfGuests;
        try {
            //Parses the string argument as an unsigned integer otherwise its throws NumberFormatException
            numOfGuests = Integer.parseUnsignedInt(numOfGuestsText);
        } catch(NumberFormatException ex) {
            new JOptionPane("Please enter  the (positive)number of guests going to attend the event." , JOptionPane.WARNING_MESSAGE)
                    .createDialog(numOfGuestsField, "Number of guests invalid").setVisible(true);
            return;
        }

        double totalPrice = (numOfGuests * PRICE_PER_GUEST);

        DefaultListModel<String> model = new DefaultListModel<>();
        resultsList.setModel(model);

        model.addElement(STR.": \{numOfGuests}");
        model.addElement(STR.": \{toRand(PRICE_PER_GUEST)}");
        model.addElement(STR.": \{toRand(totalPrice)}");
        model.addElement((STR.": \{numOfGuests >= 25}").toUpperCase());

        displayMotto.setVisible(true);
        labelsList.setVisible(true);
        resultsList.setVisible(true);
    }

    //A methode to convert a floating double to rands with 2 decimal places
    private static String toRand(double number) {
        NumberFormat nFormat = NumberFormat.getInstance();
        nFormat.setMaximumFractionDigits(2);
        nFormat.setMinimumFractionDigits(2);
        return STR."R \{nFormat.format(number)}";
    }

    public static void main(String[] args) {
        //This makes the window to match the pc looks
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());} catch (Exception ignored) {}

        //Creates a new MatomeEventPrice
        new MatomeEventPrice();
    }
}