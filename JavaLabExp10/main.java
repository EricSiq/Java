int main() {
    int choice;
    
    while(1) {
        printf("\n--- Student Data Entry Menu ---\n");
        printf("1. Add Student\n");
        printf("2. Display Students\n");
        printf("3. Search Student by ID\n");
        printf("4. Delete Student\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        
        if (scanf("%d", &choice) != 1) {
            throwException("InputException", "Invalid choice entered.");
            while(getchar() != '\n');
            continue;
        }
        
        switch(choice) {
            case 1:
                addStudent();
                break;
            case 2:
                displayStudents();
                break;
            case 3:
                searchStudent();
                break;
            case 4:
                deleteStudent();
                break;
            case 5:
                printf("Exiting application. Goodbye!\n");
                exit(0);
            default:
                throwException("InvalidChoiceException", "Please enter a valid option from the menu.");
        }
    }
    
    return 0;
}
