package sudoku;
/*
Step 3:  Create another new class called HelpMenuControl. This class contains
the commands to be executed for each menu item, and often referred to as the
"control" layer because it controls what happens for each menu item selected.
It must contain one or more functions that define the actions to be taken for
each each menu item. 
 */

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */

public class HelpMenuControl {
    
    //default constructor
    public HelpMenuControl () {
        
    }
    
    //menu option displayBoardHelp
    //Josiah to code this
    public void displayBoardHelp() {
        
    }
    
    //menu option displayNumbersHelp
    //Daniel to code this
    public void displayNumbersHelp() {
        
    }
    
    //menu option displayPlayerHelp
    //Jessie to code this
    public void displayPlayerHelp() {
        
    }
    
    //menu option displayStatisticsHelp
    //Keith to code this
    public void displayStatisticsHelp() {
        displayHelpBorder();
        System.out.println("\t\tStatistics Help");
        System.out.println("\n\tThe statistics show how many numbers are \n" +
                "currently correct and how many numbers are currently \n" +
                "incorrect.  They also calculate and show the percentage \n" +
                "of correct numbers.\n");
        displayHelpBorder();
    }
    
    //menu option displayEndGameHelp    
    //Jae to code this
    public void displayEndGameHelp() {
        
    }
    
    //menu option displayReturnToMainMenu
    public void displayReturnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput();
    }
    
    public void displayHelpBorder() {
        System.out.println(
                "------------------------------------------------------------");
    }
}
