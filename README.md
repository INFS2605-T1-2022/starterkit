# INFS2605 FX Starter Kit

## What is this?
This is a starter kit for INFS2605 students. It will set you up to develop JavaFX applications on the Java 11 platform using NetBeans 12, OpenJDK 11 and OpenJFX 11.

UNSW students taking INFS2605 should feel free to base their program off this codebase. This codebase is licensed under the MIT License. For more information please see [LICENSE](LICENSE).

## System Requirements
For macOS:
- macOS **10.15 Catalina** or **macOS 11 Big Sur**, on an Intel processor. I have not tested these instructions on Apple Silicon (M1).
- Older versions of macOS might not work properly. If your computer does not support at least macOS 10.15 Catalina, it may be too old to run the required software anyway.
- It is always best practice to keep your computer updated with the latest updates from Apple. This is important not only for compatibility with new software, but also to receive security patches.

For Windows:
- Windows 10, **build 1903 (May 2019 update)** or newer.
- All Windows 10 computers can update to the latest build using the **Windows 10 Update Assistant**: https://support.microsoft.com/en-au/help/3159635/windows-10-update-assistant
- Windows 8/8.1 will probably work, but we cannot assist with your setup unless you are running Windows 10.
- Windows 7 will probably work, but we cannot assist with your setup unless you are running Windows 10. On Windows 7, you will need to install PowerShell 3: https://www.microsoft.com/en-au/download/details.aspx?id=34595
- It is always best practice to keep your computer updated with the latest updates from Microsoft. This is important not only for compatibility with new software, but also to receive security patches.

## Setup Instructions for macOS
1. Install Homebrew: https://brew.sh/
2. Copy and paste this into Terminal and hit the `ENTER` key on your keyboard to execute the command:
    ```
    brew tap AdoptOpenJDK/openjdk; brew install --cask adoptopenjdk11 netbeans github scenebuilder
    ```
    - While the command is executing, you will see lines of information appear on the Terminal. This is diagnostic information, it is not problematic.
    - You may be required to enter your administrator password. If prompted to do so, enter it. You will not see any dots appear to represent the hidden characters of your password, only the blinking terminal cursor staying at the same spot on the screen, but fear not - your password is being entered!
    - The command has finished executing once no more lines of information continue to appear in the Terminal and you just have the same prompt you had when you first opened the Terminal.
    
    
3. Open the Finder program on your Mac, and use the keyboard shortcut Command + SHIFT + G to open the "Go to Folder" pop-up.

4. Copy and paste the following path:

    ```
    /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home
    ```

5. Now you are in a folder with items `bin`, `bundle`, `conf`, ... `man`, `release`. Open the folder called `jmods`. You will now see that it contains a lot of files that all end with the file extension `.jmod`.

6. Go to https://gluonhq.com/products/javafx/ and download the "Product" called **JavaFX Mac OS X jmods** (version 11.0.2). You will get a ZIP file - extract it by double-clicking it. You can see it contains 7 files that end with the file extension `.jmod`. Copy this into the folder from step 5.

7. Clone this repository (https://github.com/blairw/infs2605fxstarterkit) using **GitHub Desktop** (you installed this in step 2). You can see where, in your computer, the repository was cloned to by going to GitHub Desktop and hovering over the repository name.

8. Open **Apache NetBeans 12**. On the first time you open it, you might receive a message asking if you want to import settings or configuration from NetBeans version 8 (if you previously had it installed). Do **not** allow NetBeans 12 to import these settings or configuration from NetBeans 8.  (If you have accidentally allowed NetBeans 12 to import settings or configuration from NetBeans 8, you can reinstall NetBeans 12 with the command `brew remove --cask netbeans; brew install --cask netbeans`.)

9. In NetBeans 12, click on **Help &rarr; About** and confirm that the versions for **Java** and **Runtime** are both version 11. If you see anything like "1.8", you will need to configure your NetBeans to use JDK 11.

10. Open this repository in NetBeans 12. You may be invited to install the `nb-javac` Java editing support library. If so, please let this install before proceeding.

11. Click on **Run &rarr; Clean and Build**. You will see that it compiles to a working JavaFX app.

12. If prompted to do so, please allow `sh` to capture keystrokes.



## Setup Instructions for Windows
1. Open the Windows Start Menu and type `cmd`. Right click the **Command Prompt** menu item and select **Run as administrator**. Copy and paste this into Command Prompt and hit the `ENTER` key on your keyboard to execute the command:
    ```
    @"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "[System.Net.ServicePointManager]::SecurityProtocol = 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
    ```
    - While the command is executing, you will see lines of information appear on the Command Prompt. This is diagnostic information, it is not problematic.
    - The command has finished executing once no more lines of information continue to appear in the Command Prompt and you just have the same prompt you had when you first opened the Command Prompt: `C:\Windows\system32>`.
    - If the command seems to be stuck, try hitting the `ENTER` key a few times to push it along... :)

2. Close the previous command prompt and open a new one: open the Windows Start Menu and type `cmd`. Right click the **Command Prompt** menu item and select **Run as administrator**. Copy and paste this into Command Prompt and hit the `ENTER` key on your keyboard to execute the command:
    ```
    cinst -y adoptopenjdk11 apache-netbeans.portable github-desktop
    ```

3. Go to `C:\Program Files\AdoptOpenJDK\` in Windows Explorer and open the folder inside it that is named along the lines of `jdk-11` (your version number might be higher, this is OK).

4. Now you are in a folder with items `bin`, `bundle`, `conf`, ... `man`, `release`. Open the folder called `jmods`. You will now see that it contains a lot of files that all end with the file extension `.jmod`.

5. Go to https://gluonhq.com/products/javafx/ and download the "Product" called **JavaFX Windows jmods**. You will get a ZIP file - extract it. You can see it contains 7 files that end with the file extension `.jmod`. Copy this into the folder from step 4.

6. Go to https://gluonhq.com/products/scene-builder/ - download and install **Scene Builder for Java 11**.

7. Clone this repository using **GitHub Desktop** (you installed this in step 2). You can see where, in your computer, the repository was cloned to by going to GitHub Desktop and hovering over the repository name.

8. Open **Apache NetBeans 12** (search for netbeans64.exe). If you receive a `Cannot find Java` error, follow the steps under `Configuring NetBeans 12 to use JDK 11` and then re-open Netbeans. On the first time you open it, you might receive a message asking if you want to import settings or configuration from NetBeans version 8 (if you previously had it installed). Do **not** allow NetBeans 11 to import these settings or configuration from NetBeans 8. (If you have accidentally allowed NetBeans 11 to import settings or configuration from NetBeans 8, you can uninstall NetBeans 11 with the command `choco uninstall -y apache-netbeans.portable` and then repeat step 2.)

9. In NetBeans 12, click on **Help &rarr; About** and confirm that the versions for **Java** and **Runtime** are both version 11. If you see anything like "1.8", you will need to configure your NetBeans to use JDK 11.

10. Open this repository in NetBeans 12. You may be invited to install the `nb-javac` Java editing support library. If so, please let this install before proceeding.

11. Click on **Run &rarr; Clean and Build**. You will see that it compiles to a working JavaFX app.

## Configuring NetBeans 12 to use JDK 11

1. Open the folder in which NetBeans 12 configuration lives:
    - On macOS, that is `/Applications/NetBeans/Apache NetBeans 12.2.app/Contents/Resources/NetBeans/netbeans/etc`, you can navigate there using similar technique to Step 4 in the Setup Instructions for macOS.
    - On Windows, that is `C:\ProgramData\chocolatey\lib\apache-netbeans.portable\App\netbeans\etc`.
    
2. Open the file `netbeans.conf` for editing:
    - On macOS, you can edit the file by just opening it using `TextEdit.app`, which is built into macOS.
    - On Windows, you can't just use Notepad (it will render the file poorly). You can install Notepad++ (`cinst -y notepadplusplus.install`) and then open Notepad++ **as administrator** to edit the file.
    
3. Search for "netbeans_jdkhome". On that line, remove the `#` at the start of the line.

4. Replace `/path/to/jdk` with the actual path for JDK 11:
    - On macOS, this is the path from Step 4 of the Setup Instructions for macOS.
    - On Windows, you discovered the full path in Step 3 in the Setup Instructions for macOS. Be sure the include the final part of the path also, i.e., do not drop the part with `jdk-11.0.10.9-hotspot` (your version number might be higher, this is OK).

5. That line now looks something like on Mac:

    ```
    netbeans_jdkhome="/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home"
    ```
	Or on Windows:
	```
    netbeans_jdkhome="C:\Program Files\AdoptOpenJDK\jdk-11.0.10.9-hotspot"
    ```
    
6. Save the `netbeans.conf` file.

7. Repeat step 9 of the Setup Instructions for your platform to confirm you are now using JDK 11.

## Known Issues

- There is a known issue where this repository does not work properly if it is stored in a folder whose name has a spacebar (e.g. `/Users/Alice/INFS2605 2020/infs2605fxstarterkit`). The solution is to ensure that the full path does not, at any point,  contain the spacebar character (e.g. consider renaming to: `/Users/Alice/INFS2605-2020/infs2605fxstarterkit`). The root cause of this issue is relating to how the build system, Maven, interprets addresses to maintain backwards compatibility with systems going all the way back to the 1980s! See: https://stackoverflow.com/questions/18724226/why-shouldnt-i-put-spaces-in-my-maven-path-in-windows

- There is a known issue on Windows where Chocolatey only partially downloads a file (such as the ZIP file for NetBeans) and then is unable to use the file. If re-attempting the Chocolatey installation step doesn't work, you can download the file directly from the URL shown in the Command Prompt, and then place it into the Chocolatey "temp" directory specified in the Command Prompt.

## Acknowledgements

- These instructions were written by [Blair Wang](www.blair.wang) for INFS2605 at UNSW Business School
- The starter kit codebase is adapted from instructions at https://dzone.com/articles/adoptopenjdk-11-openjfx-netbeans
- Thanks to the following INFS2605 (Term 1, 2020) tutors for testing: Kathy Xu, Aaron Ting, Jacob Meyerowitz, Phoebe Zhou, Matthew Perry.
