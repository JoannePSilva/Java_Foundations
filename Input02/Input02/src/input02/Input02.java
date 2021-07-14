package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Oi, clique ok",
                "Title",
                0);

        String input1 = (String)JOptionPane.showInputDialog(null,
                "Digite algo",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");


        String[] acceptableValues = {"Yes", "No", "Maybe"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Quer perguntar algo?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

        System.out.println(input1 + input2);
    }
}
