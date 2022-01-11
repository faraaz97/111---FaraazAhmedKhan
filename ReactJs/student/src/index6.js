import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//class based components in React
class Appi extends React.Component{
    render(){
      return (
        <div>
          <h1>Hello World!!!!</h1>
          <h1>Hello World!!!!</h1>
        </div>    
      );
    }
  }
  
  ReactDOM.render(  
    <Appi /> ,
  document.getElementById('root')
  );

  // If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
