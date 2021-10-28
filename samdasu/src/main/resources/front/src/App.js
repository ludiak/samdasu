// import logo from './logo.svg';
import './App.css';
import {useState, useEffect} from 'react';
import axios from 'axios';

function App() {
  const [message, setMessage] = useState("hi");

  useEffect(()=> {
    axios.get("/time")
    .then(response => {
      console.log(response);
      setMessage(response.data);
    })
  }, [])
  return (
    <div className="App">
      <header className="App-header">
        {/* <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a> */}
        <p>hahaha {message}</p>
      </header>
    </div>
  );
}

export default App;
