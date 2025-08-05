import React, { useState } from "react";
import "./App.css";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {
  const [count, setCount] = useState(0);

  // Method to increment
  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  // Method to decrement
  const decrement = () => {
    setCount(count - 1);
  };

  // Say Hello method
  const sayHello = () => {
    alert("Hello! Welcome to Event Examples App");
  };

  // Function with argument
  const sayMessage = (msg) => {
    alert(msg);
  };

  // Synthetic event handler
  const handlePress = () => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>Event Examples App</h1>

      {/* Counter */}
      <h2>Counter Value: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <hr />

      {/* Say Welcome */}
      <button onClick={() => sayMessage("Welcome")}>Say Welcome</button>

      <hr />

      {/* Synthetic Event */}
      <button onClick={handlePress}>OnPress</button>

      <hr />

      {/* Currency Converter */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
