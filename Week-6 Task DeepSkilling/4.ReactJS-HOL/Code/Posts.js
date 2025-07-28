import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  constructor(props) {
    super(props);
    // Initialize state
    this.state = {
      posts: [],
      error: null
    };
  }

  // Arrow function syntax
  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        // Convert data into Post objects
        const postObjects = data.map(
          item => new Post(item.id, item.title, item.body)
        );
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        this.setState({ error: error.message });
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  // Error boundary
  componentDidCatch(error, info) {
    alert(`Error: ${error.toString()}`);
    console.error(info);
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <h3>Error: {error}</h3>;
    }

    return (
      <div>
        <h2>Blog Posts</h2>
        {posts.map(post => (
          <div
            key={post.id}
            style={{
              border: '1px solid gray',
              margin: '10px',
              padding: '10px'
            }}
          >
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
