# Solution 

*** How to run. ***

!!! Tested on win 10 console !!!

Just copy Java_Drawing_APP.jar to some folder on your pc.
Open console and type: java -jar _path_to_/Java_Drawing_APP.jar
Then type h - to open help in console or follow instructions tips in console.


*** Draft architecture description. *** 

__Design patterns that was used__: 

__Singleton__ - Canvas creation. Only one canvas object can exist during user session.
__Command__  - To encapsulate drawing, quit,  help etc command and decouple them from main app logic.
           For future if you want to add other command. You just create a new one of command folder and add it description to DrawingActions

__Strategy__ - DrawingActions uses this pattern to connect command and their execution with main app logic.
           Additional benefit  - avoid using switch with lot of cases or long if else tree.

__AbstractFactory__ - Added for future. Help us to separate different GUI. In our case we use console as output. 
                  Factory will allow easy to add MacGui or WidGui as output.   

__entities folder__ - Added for moving from x, y to more concrete DAO in drawing - not implemented yet.

__errors, exceptions, messages__ - partly supported.

__utils__ - partly supported command parsing and validation.



# Java_drawing_app

*** The Problem ***

__Description__

You're given the task of writing a simple console version of a drawing program. 
At this time, the functionality of the program is quire limited but this might change in the future. 
In a nutshell, the program should work as follows:
 1. Create a new canvas
 2. Start drawing on the canvas by issuing various commands
 3. Quit


commands.Command 		Description
C w h           Should create a new canvas of width w and height h.
L x1 y1 x2 y2   Should create a new line from (x1,y1) to (x2,y2). Currently only
                horizontal or vertical lines are supported. Horizontal and vertical lines
                will be drawn using the 'x' character.
R x1 y1 x2 y2   Should create a new rectangle, whose upper left corner is (x1,y1) and
                lower right corner is (x2,y2). Horizontal and vertical lines will be drawn
                using the 'x' character.
B x y c         Should fill the entire area connected to (x,y) with "colour" c. The
                behaviour of this is the same as that of the "bucket fill" tool in paint
                programs.
Q               Should quit the program.

__Sample I/O__

Below is a sample run of the program. User input is prefixed with enter command:

enter command: C 20 4
----------------------
|                    |
|                    |
|                    |
|                    |
----------------------

enter command: L 1 2 6 2
----------------------
|                    |
|xxxxxx              |
|                    |
|                    |
----------------------

enter command: L 6 3 6 4
----------------------
|                    |
|xxxxxx              |
|     x              |
|     x              |
----------------------

enter command: R 14 1 18 3
----------------------
|             xxxxx  |
|xxxxxx       x   x  |
|     x       xxxxx  |
|     x              |
----------------------

enter command: 
----------------------B 10 3 o
|oooooooooooooxxxxxoo|
|xxxxxxooooooox   xoo|
|     xoooooooxxxxxoo|
|     xoooooooooooooo|
----------------------

enter command: Q





