import React from "react";
import "./App.css";

function App() {
  // Heading element
  const element = "Office Space";

  // Image JSX attribute
  const sr = "https://images.unsplash.com/photo-1505691938895-1758d7feb511?w=600";
  const jsxatt = (
    <img src={sr} width="25%" height="25%" alt="Office Space" />
  );

  // Object with office details
  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  // Conditional color
  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push("textRed");
  } else {
    colors.push("textGreen");
  }

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors}>Rent: Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;
