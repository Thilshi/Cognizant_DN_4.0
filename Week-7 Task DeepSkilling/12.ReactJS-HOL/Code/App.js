import React, { useState } from "react";
import "./App.css";

function LoginButton(props) {
  return (
    <button onClick={props.onClick}>
      Login
    </button>
  );
}

function LogoutButton(props) {
  return (
    <button onClick={props.onClick}>
      Logout
    </button>
  );
}

function UserGreeting() {
  return <h1>Welcome back</h1>;
}

function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
  };

  return (
    <div className="App">
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn ? (
        <>
          <LogoutButton onClick={handleLogoutClick} />
          <h2>Flight Details</h2>
          <p>Flight No: AI202 | From: Chennai | To: Delhi | Price: ₹4500</p>
          <button>Book Ticket</button>
        </>
      ) : (
        <>
          <LoginButton onClick={handleLoginClick} />
          <h2>Browse Flights</h2>
          <p>Flight No: AI202 | From: Chennai | To: Delhi | Price: ₹4500</p>
          <p>(Login to book tickets)</p>
        </>
      )}
    </div>
  );
}

export default App;
