# Wii Party "Strategy Steps" Statistical Simulator

A Java-based simulation engine designed to replicate the mechanics of the *Strategy Steps* game from  Wii Party. This project utilizes automated game logic and Monte Carlo simulation principles to analyze win-rate probabilities under specific, constrained player strategies.

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

---

## 📊 The Core Experiment & Results

The primary objective of this project was to answer a specific game-theory question: 
> **What is the best strategy for a player to consistenly win?**

### Executive Summary of Results
After running **[e.g., 100,000]** simulated games pitting the "Always Pick 1" strategy against [e.g., standard randomized CPU behavior], the data yielded the following insights:
* **"Always Pick 1" Win Rate:** `1.1%`
* **"Always Pick 3" Win Rate:** `6.1%`
* **"Always Pick 5" Win Rate:** `91%`
* **Average Game Length:** `XX` turns
* **Key Finding:** [depite being greedu, picking 5 everytime leads the highest win rate to 3 randomized cpu]

---

## 🛠️ Features & Architecture

This application was engineered using strict **Object-Oriented Programming (OOP)** principles to ensure high decoupling and scalability.

* **Deterministic Game Engine:** Accurately models the exact ruleset of the original game, including turn orders, board spaces, hazards, and multi-turn penalties.
* **Monte Carlo Simulation Runner:** A high-throughput simulation module capable of executing tens of thousands of full game cycles in seconds to gather statistically significant datasets.
* **Modular Strategy Pattern:** Built to easily swap out player AI behaviors (e.g., comparing the "Always 1" strategy against "Always 3", "Randomized", or "Risk-Averse" algorithms).

### System Design Overview
* `Main.java`: Where to Run
* `StrategyStepsLogic`: Recreates the game logic.
* `Player.java` / `RandomPlayer.java` / '  `GreedyPlayer.java` : Encapsulates decision-making logic, separating player state from behavioral choices.


---

## 🚀 Getting Started

### Prerequisites
* **Java Development Kit (JDK) 17** or higher
* **Maven** or **Gradle** (Optional, if used for dependency management)

### Installation & Execution
1. Clone the repository:
   ```bash
   git clone [https://github.com/yourusername/strategy-steps-simulator.git](https://github.com/yourusername/strategy-steps-simulator.git)
   cd strategy-steps-simulator
