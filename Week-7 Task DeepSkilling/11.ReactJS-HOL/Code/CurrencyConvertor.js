import React, { useState } from "react";

function CurrencyConvertor() {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    // Conversion rate (example: 1 INR = 0.011 EUR)
    const convertedValue = (rupees * 0.011).toFixed(2);
    setEuro(convertedValue);
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
        <button type="submit">Convert</button>
      </form>
      {euro && <p>{rupees} INR = {euro} EUR</p>}
    </div>
  );
}

export default CurrencyConvertor;
