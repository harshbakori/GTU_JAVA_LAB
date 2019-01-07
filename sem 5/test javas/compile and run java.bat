echo off
:start
cls
color 0A
echo java compile
set /p a="user input :-  "

javac %a%.java
echo "compiled succesfull if line is empty"
echo "press 1 if succes press 2 if not susses "
set /p b=
if %b%==2 ( echo "faild"
goto start: )
timeout /t 2
java %a%
echo "end java"
echo "press 3 if you want to redo the compilation process press 4 to exit"
set /p b=
if %b%==3 (
echo "going to first"
goto start:   )
echo "debug"
if %b%==4 (
echo "exiting"
goto exit: )
:exit
exit
