import React, { useState } from "react";
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";

function App() {
  const [showCourse, setShowCourse] = useState(true);
  const [showBook, setShowBook] = useState(true);
  const [showBlog, setShowBlog] = useState(true);

  return (
    <div style={{ display: "flex", justifyContent: "space-around", padding: "20px" }}>
      <CourseDetails show={showCourse} />
      <BookDetails visible={showBook} />
      <BlogDetails display={showBlog} />
    </div>
  );
}

export default App;
