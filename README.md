# Android-WS3-Moodle-Mobile

Android-WS3-Moodle-Mobile is an Android application designed to interact with Moodle, a popular learning management system. This app allows users to log in, retrieve course information, and display it in a user-friendly interface.

## Features

- **Login Functionality**: Secure login to Moodle using user credentials.
- **Course List**: Displays a list of courses and their respective teachers.
- **Responsive UI**: Designed with Material Design principles for a modern look and feel.

## Requirements

- **Android Studio**: Latest version recommended.
- **Java Development Kit (JDK)**: Version 11 or higher.
- **Gradle**: Version 8.11.1 (configured in the project).
- **Android SDK**: Compile SDK version 35, minimum SDK version 24.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd Android-WS3-Moodle-Mobile
   ```

2. **Open in Android Studio**:
   - Open Android Studio.
   - Select "Open an Existing Project" and navigate to the project directory.

3. **Sync Gradle**:
   - Allow Android Studio to sync Gradle files automatically.
   - Ensure all dependencies are resolved.

4. **Run the App**:
   - Connect an Android device or start an emulator.
   - Click the "Run" button in Android Studio.

## Project Structure

- **`app/src/main`**: Contains the main source code, resources, and layouts.
  - `java/com/example/android_ws3_moodle_mobile`: Java source files.
  - `res/layout`: XML layout files for UI design.
  - `res/values`: Resource values like strings and themes.
- **`gradle`**: Gradle wrapper and configuration files.
- **`settings.gradle.kts`**: Project settings and module inclusion.

## Key Files

- **`MainActivity.java`**: Handles user login and interaction with Moodle.
- **`CourseListActivity.java`**: Displays the list of courses and teachers.
- **`build.gradle.kts`**: Module-level Gradle configuration.
- **`AndroidManifest.xml`**: Application manifest file.

## Dependencies

The project uses the following libraries:
- **AndroidX AppCompat**: For backward-compatible UI components.
- **Material Components**: For modern UI design.
- **ConstraintLayout**: For flexible UI layouts.
- **JUnit**: For unit testing.
- **Espresso**: For UI testing.
