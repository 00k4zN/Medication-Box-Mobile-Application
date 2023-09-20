SUMMARY

This report introduces a mobile medication reminder application developed using the Java programming language. The application includes features for adding, deleting, and setting medication reminders. Users can view their medications on the main page and perform deletion and reminder operations. The application aims to help users remember their medications regularly.

INTRODUCTION

I developed this project because the regular and memorable use of medication is important. People often struggle to remember to take their medications, which can lead to health issues. The medication reminder application aims to solve this problem by providing users with the ability to remember and manage their medications regularly. This application is especially beneficial for groups that require consistency and memorability in medication use, such as individuals with chronic illnesses, those undergoing medication therapy, and the elderly. Users can track their medications regularly and receive reminders by using the medication addition, deletion, and reminder features. The primary goal of this project is to facilitate medication use to improve health and quality of life. Through the medication reminder application, users can effectively manage their treatment processes by taking medications at the right time and regularly.

This report describes how a mobile medication reminder application was developed using the Java programming language and explains its core functions. Users can add and save medications on the main page of the application. The saved medications are listed on the main page, and users have options to delete or set reminders for them. The report elaborates on the structural features of the application. Firstly, there is a button on the main page that users can use to add medications. On the medication addition page, users can enter the medication name and type. When the "Save" button is pressed, the medication is saved to the main page, and users can view the medications saved there. On the main page, when users long-press on each saved medication, they can see options to delete or set reminders. Clicking the "Delete" button removes the medication from the list, allowing users to remove it without further reminders. Clicking the "Set Reminder" button redirects users to a page where they can select the time for medication reminder and save the reminder time by clicking the "Set Reminder" button.

While describing the core functions of the application, the report emphasizes that the application provides users with the convenience of regularly remembering and managing their medications. Based on this information, development efforts can be made to enhance the user experience and facilitate the medication reminder process.

MAIN PAGE

The main page initially appears empty, with only the "Add Medication" button on the screen. Clicking the button opens a second page, where medications can be added, and they are then listed on the main page when added.

![Ana Sayfa](https://github.com/ozkanyav/ilac-kutusu-mobil-uygulama/blob/main/Anasayfa.png)


 
PAGE 1

On this page, there is a medication registration form. When the user clicks the "Add Medication" button on the main page, they are directed to this page. In this form, the user can enter the Medication Name and select the Medication Type. When the user clicks the "Save" button, the data from the form is sent to the main page.

![Page 1](https://github.com/ozkanyav/ilac-kutusu-mobil-uygulama/blob/main/1-sayfa.png)

 
PAGE 2

On this page, when a user clicks on any of the medications listed on the main page, two buttons appear: "Delete" and "Set Reminder".
The "Delete" button is used to remove the selected medication from the list on the main page. Clicking this button deletes the medication without further reminders.
The "Set Reminder" button serves the reminder function. When clicked, it redirects the user to the "Set Reminder" page (Page 3).
In Page 3, users can choose the desired time in two separate interfaces for hours and minutes. After selecting the time, clicking the "Set Reminder" button sets a reminder for the selected medication.
 

![Page 2](https://github.com/ozkanyav/ilac-kutusu-mobil-uygulama/blob/main/2-sayfa.png)




CONCLUSION

In this project, we have successfully developed a medication reminder application that assists users in remembering and managing their medications regularly. The application includes features for adding, deleting, and setting reminders for medications, making it easier for users to keep track of their medications. However, for the application to fully function as a reminder, users need to grant permissions on their phones. Without these permissions, the reminder function cannot be fully realized. This limitation may restrict users from utilizing the reminder feature to its full capacity.

In conclusion, the medication reminder application provides significant support for establishing a regular medication routine. However, obtaining permissions on the phone is essential for the full functionality of the reminder feature. Future developments may focus on improving the user experience and making the permission-granting process more user-friendly.
