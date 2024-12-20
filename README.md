# Inventory Management System

A simple Inventory Management System built in Java. This program allows users to manage an inventory, add items, update their quantities, and view the current stock of items.

## Features

- **Add Item**: Add new items to the inventory and specify their quantity.
- **View Inventory**: View the current list of items in the inventory with their quantities.
- **Update Item Quantity**: Update the quantity of an existing item in the inventory.
- **Exit**: Exit the program.

## Requirements

- **Java Version**: Java 8 or higher
- **IDE**: Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, or command line)

## Usage

1. Clone or download the repository to your local machine.
2. Open the project in your favorite IDE or text editor.
3. Compile and run the `InventoryManagementSystem.java` file.

### Menu Options:

- **1. Add Item**: This option allows you to add a new item to the inventory. You will be prompted to enter the item name and its quantity.
- **2. View Inventory**: This option displays the list of all items currently in the inventory along with their quantities.
- **3. Update Item Quantity**: This option allows you to update the quantity of an existing item. If the item is not in the inventory, an error message will be displayed.
- **4. Exit**: Exits the program.

### Example Interaction:

Welcome to the Inventory Management System

Add Item   
View Inventory  
Update Item Quantity  
Exit
Choose an option:1

Enter item name to add: Apple 

Enter quantity of the item: 10 

Item added successfully: Apple (Quantity: 10)


Press Enter to continue...


## Code Breakdown

- **Main Menu**: The main menu is displayed continuously until the user chooses to exit.
- **clearScreen()**: Clears the console screen to keep the interface clean and easy to navigate.
- **addItem()**: Adds a new item to the inventory or updates the quantity of an existing item.
- **viewInventory()**: Displays all items in the inventory with their current quantities.
- **updateItemQuantity()**: Updates the quantity of an existing item in the inventory.
- **pressEnterToContinue()**: Pauses the program until the user presses the Enter key to continue.

## Future Enhancements

- Implement saving inventory data to a file so it persists between program runs.
- Add user authentication to restrict access to the system.
- Support for deleting items from the inventory.


