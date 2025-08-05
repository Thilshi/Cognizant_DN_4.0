// src/components/CourseDetails.js
import React from "react";

function CourseDetails({ show }) {
  // Conditional Rendering using IF
  if (!show) return null;

  return (
    <div style={{ flex: 1 }}>
      <h2>Course Details</h2>
      <h3>Angular</h3>
      <p>4/5/2021</p>
      <h3>React</h3>
      <p>6/3/20201</p>
    </div>
  );
}

export default CourseDetails;
