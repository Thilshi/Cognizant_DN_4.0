// src/components/BlogDetails.js
import React from "react";

function BlogDetails({ display }) {
  // Conditional Rendering using && operator
  return (
    <>
      {display && (
        <div style={{ flex: 1 }}>
          <h2>Blog Details</h2>
          <h3>React Learning</h3>
          <strong>Stephen Biz</strong>
          <p>Welcome to learning React!</p>
          <h3>Installation</h3>
          <strong>Schwezd enier</strong>
          <p>You can install React from npm.</p>
        </div>
      )}
    </>
  );
}

export default BlogDetails;
