# Vityathri-java
# Intelligent Gastro Health Assistant (Java BYOP Project)

---

## 📘 README

### Project Title

Intelligent Gastro Health Assistant (Java Version)

### Overview

This project is a Java-based healthcare assistant that analyzes user-reported gastrointestinal symptoms and predicts possible conditions along with severity levels. It provides early insights and encourages timely medical consultation.

### Features

* Symptom input via console or GUI
* Condition prediction logic
* Severity classification (Low / Medium / High)
* Rule-based + ML-inspired logic
* Simple and user-friendly interface

### Tech Stack

* Java
* OOP Concepts
* Collections Framework
* (Optional) Java Swing for GUI

### Installation

```bash
# Compile
javac Main.java

# Run
java Main
```

### Usage

1. Run the program
2. Enter symptoms when prompted
3. Get predicted condition and severity

### Future Improvements

* Integrate real ML models using Java libraries (Weka)
* Add GUI using JavaFX/Swing
* Connect to database for patient history
* Improve prediction accuracy

---

## 📄 PROJECT REPORT

### 1. Problem Statement

Many individuals ignore early gastrointestinal symptoms or rely on unreliable internet advice. There is a need for a simple tool that can analyze symptoms and provide preliminary insights.

### 2. Motivation

Students often face digestive issues due to irregular food habits. Early detection helps prevent serious conditions.

### 3. Objective

To develop a Java-based system that predicts possible conditions and severity based on user symptoms.

### 4. Methodology

#### Approach Used

Instead of heavy ML frameworks, this project uses:

* Rule-based classification
* Symptom-condition mapping
* Severity scoring logic

#### Working Logic

* User inputs symptoms
* System matches symptoms with predefined conditions
* Assigns scores based on matches
* Highest score determines condition
* Severity calculated based on symptom intensity/count

#### Example

* Symptoms: stomach pain, nausea
* Output: Gastritis (Medium Severity)

### 5. Results

* Accurate for common conditions
* Fast response time
* Easy to use and understand

### 6. Challenges Faced

* Designing accurate rule logic
* Handling multiple symptoms
* Avoiding incorrect predictions

### 7. Key Decisions

* Chose Java for strong OOP structure
* Used rule-based approach instead of ML for simplicity
* Designed modular classes (Symptom, Condition, Analyzer)

### 8. Learnings

* Applied OOP concepts in real project
* Understood problem-solving approach
* Learned system design and modular coding

### 9. Limitations

* Not as accurate as ML models
* Limited to predefined conditions
* No real-time data learning

### 10. Future Scope

* Integrate ML using Weka
* Build GUI application
* Deploy as desktop app

---

## 📌 Suggested Code Structure

```
project/
│── Main.java
│── Analyzer.java
│── Condition.java
│── Symptom.java
│── DataStore.java
```

---

## 📌 GitHub Notes

* Maintain multiple commits
* Add clear comments in code
* Include sample outputs

---

END OF DOCUMENT
