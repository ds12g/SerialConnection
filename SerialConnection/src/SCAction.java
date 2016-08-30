import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
public class SCAction implements ActionListener{

  SCLeftPanel leftPanel;
  SCRightPanel rightPanel;

  public SCAction(SCLeftPanel left, SCRightPanel right){
      this.leftPanel = left;
      this.rightPanel = right;
  }

  public void actionPerformed(ActionEvent e){

    System.out.println(e.getActionCommand());

    if(e.getActionCommand().equals("connect")){
      this.rightPanel.getTestLabel().setText("Works!");
      JLabel test = new JLabel("test");

      String[] array = {"1","2", "3"};

      JLabel[] labelArray = new JLabel[array.length];

      this.rightPanel.getLabelPanel().add(test);
      System.out.println("test");
      for (int i = 0; i < array.length; i++){
        //labelArray[i].setText(array[i]);
         //this.rightPanel.getLabelPanel().add(labelArray[i]);
         //System.out.println(labelArray[i]);
        System.out.println(array[i]);
        this.rightPanel.getLabelPanel().add(new JLabel(array[i]));
      }

    }
  }


}
