# AI Inbox Triage Assistant

An AI-powered Gmail productivity extension that helps users manage emails intelligently using Generative AI. This project integrates a Chrome Extension with a Spring Boot backend and Google's Gemini API to automate email understanding, summarization, categorization, and smart reply generation.

The extension injects AI-powered actions directly into the Gmail interface, allowing users to interact with intelligent email workflows directly inside Gmail.

---

## ✨ Features

### ✅ Current Features
- AI-generated email replies
- Tone-based response generation
- Gmail compose window integration
- Chrome Extension support (Manifest V3)
- Spring Boot REST API backend
- Gemini API integration
- React-based testing interface

---

### 🚀 Planned Advanced Features
- Smart email categorization
- Urgency detection
- Thread summarization
- Task extraction from emails
- Follow-up reminders
- Auto-label suggestions
- Context-aware reply generation

---

## 🛠️ Tech Stack

### Backend
- Spring Boot
- Java
- REST APIs
- Maven

### Frontend
- React
- JavaScript
- Axios

### Browser Extension
- Chrome Extension (Manifest V3)
- Content Scripts
- Mutation Observers
- DOM Manipulation

### AI Integration
- Google Gemini API

---

## 🧠 How It Works

```text
User Opens Gmail
       ↓
Chrome Extension Detects Compose Window
       ↓
AI Reply Button Injected Into Gmail UI
       ↓
Email Content Sent To Spring Boot Backend
       ↓
Backend Calls Gemini API
       ↓
AI Response Generated
       ↓
Response Injected Back Into Gmail

##📂 Project Structure

ai-inbox-triage-assistant/
│
├── backend/                 # Spring Boot Backend
│   ├── controller/
│   ├── service/
│   ├── dto/
│   └── config/
│
├── frontend/                # React Testing UI
│
├── chrome-extension/        # Gmail Chrome Extension
│   ├── content.js
│   ├── background.js
│   ├── manifest.json
│   └── styles/
│
└── README.md
