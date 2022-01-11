import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//class based compnent in react
//props in class based compnent

class Appi extends React.Component
{
  constructor(props){
    super(props);
  }
  render(){
    return <h1>Hello {this.props.name}</h1>;
  }
} 
 ReactDOM.render(
   <Appi name = "Faraaz"/>,
   document.getElementById('root')
 );



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();