import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;

Counter(){
  JFrame frame = new JFrame("Lets Count");
  frame.setLayout(new FlowLayout());
  frame.setSize(200, 100);

  JButton left = new JButton("Left");
  JButton right = new JButton("Right");

  left.addActionListener(this);
  right.addActionListener(this);

  frame.add(left);
  frame.add(right);

  leftCount = 0;
  rightCount = 0;

  leftLabel = new JLabel("Count: " + leftCount);
  rightLabel = new JLabel("Count: " + rightCount);

  frame.add(leftLabel);
  frame.add(rightLabel);

  JButton reset = new JButton("Reset");

  frame.add(reset);

  reset.addActionListener(this);

  frame.setVisible(true);
}

public void actionPerformed(ActionEvent actev) {
  if(actev.getActionCommand().equals("Left")){
    leftLabel.setText("Count: " +leftCount++);
  }
  else if(actev.getActionCommand().equals("Right")){
    rightLabel.setText("Count: " +rightCount++);
  }
  else if(actev.getActionCommand().equals("Reset")){
    leftCount= 0;
    rightCount = 0;
    leftLabel.setText("Count: " + leftCount);
    rightLabel.setText("Count: " + rightCount);
  }


  }

}



