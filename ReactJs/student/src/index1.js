import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';


function Add(props)
{
  let result =parseInt(props.a)+parseInt(props.b);
  return <h1>Addition of {props.a} and {props.b} is {result}</h1>
}

ReactDOM.render(
    <Add a="10" b="20" />,
  document.getElementById('root')
);

// This is the code, but need to run in index.js