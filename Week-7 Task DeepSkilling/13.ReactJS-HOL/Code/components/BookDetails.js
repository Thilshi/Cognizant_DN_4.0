// src/components/BookDetails.js
import React from "react";

function BookDetails({ visible }) {
  // Conditional Rendering using TERNARY operator
  return visible ? (
    <div style={{ flex: 1 }}>
      <h2>Book Details</h2>
      <h3>Master React</h3>
      <p>670</p>
      <h3>Deep Dive into Angular 11</h3>
      <p>800</p>
      <h3>Mongo Essentials</h3>
      <p>450</p>
    </div>
  ) : null;
}

export default BookDetails;
