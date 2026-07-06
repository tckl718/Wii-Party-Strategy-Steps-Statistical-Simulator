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
* **"Only Pick 1" Win Rate:** `1.1%`
* **"Only Pick 3" Win Rate:** `6.1%`
* **"Only Pick 5" Win Rate:** `91%`
* **Key Finding:** depite being greedy, picking 5 everytime leads the highest win rate to 3 randomized cpu

---

## 🛠️ Features & Architecture

This application was engineered using strict **Object-Oriented Programming (OOP)** principles to ensure high decoupling and scalability.

* **Deterministic Game Engine:** Accurately models the exact ruleset of the original game
* **Monte Carlo Simulation Runner:** A high-throughput simulation module capable of executing tens of thousands of full game cycles in seconds to gather statistically significant datasets.



