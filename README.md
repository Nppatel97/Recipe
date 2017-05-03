Recipe Provider Android Application Prototype
==========

Small Note
-----------
This was a group project in a Software Engineering course. The entire app has 4 contributors, but the latest changes with the commit message "Modified to my style", which is a major change in terms of the overall app design, is my work in the design part that I did after the completion of the course in my free time in order to explore and learn the Android Studio and Android Development. 

How to get the code?
-----------
You can clone the repository or download it as a zip file. You should then have a file called recipe. We have used android studio for this application prototype and so you will also need to have android studio installed on your computer to be able to use the application. 

How to run the code?
-----------
You have two choices for running the application. You can either use an emulator, or if you have an android device, you can run the application on it.  
The application will run faster and smoother on an android device than on an emulator.

Run on android device:  
* Connect your device to your computer with a USB cable.
* Enable USB debugging on your device by going to Settings > Developer options.  
Note: On Android 4.2 and newer, Developer options is hidden by default. To make it visible go to Settings > About phone and tap Build number seven times. Return to the previous screen and you will find Developer options.
* In Android Studio, click the app module in the Project window and then select Run > Run or click Run button in the tool bar(a button with a green rectangle).
* In the select deployment area, choose your device, and press ok.  

Run on emulator:
* Click Run button in the tool bar and you will be asked to choose a virtual device. If you don’t have one set up, you will need to create one.  
* In the select deployment, select the “Create New Virtual Device” button.  
* In category select phone,choose the Nexus 5, and press next.  
* Choose the x86 image button and select Jelly Bean, with API Level 16 and press next. (you may need to download it).
* Press finish.  
* You should now see the virtual device you just created in the select deployment area.  
* Select it and press ok. 
* When the emulator starts, you may need to unlock the screen of the virtual device, and the application will be launched a couple of moments later.aa

The emulator may take a couple of minutes to start when first running the app. If the app is slow or laggy, it is due to the emulator and debugger running.  

Login Information
-----------
To login to the application use the following credentials:  
* Email: alan@gmail.com  
* Password: alan123  

Things to take notice of when using this prototype
-----------
* Search function on display recipes doesn’t work
* While this prototype includes the names of many recipes. We only have have 4 specific recipes that we coded pages for.
* When searching for recipes, choose any for ethnicity and any for difficulty. For calories put 500, for price and time put 50. When the results are displayed, sort them from A to Z (A-Z button). Only the first two buttons are programmed. This is to insure that you get taken to the right recipe. You can search for other recipes based on ethnicity, time or any other factors. And all of the sorting options work as well. 
* Like and dislike buttons which add a recipe or remove it from your saved recipes only work for the chicken curry recipe. We didn’t code every like and dislike button for the other recipes.
* In the health tracker page, the graphs are not render in real time. Also the only options from the drop menu that will have a graph displayed are protein intake, sodium intake, Vitamin A intake, and fats intake. 





