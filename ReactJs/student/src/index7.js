import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//Create a Calculator component which will perform addition,sub,multi,div
//accept values and operator as props, based on operator show only the desired result
//using class based components and state

  class Appi extends React.Component{
    constructor(props){
      super(props);
      this.a = parseInt(props.a);
      this.b = parseInt(props.b); 
    }
    render(){
      return <>
            <h2>Addition of a and b is {this.a + this.b}</h2>
            <h2>Subtraction of a and b is {this.a - this.b}</h2>
            <h2>Multiplication of a and b is {this.a * this.b}</h2>
            <h2>Division of a and b is {this.a / this.b}</h2>
            </>
    }
  }

  ReactDOM.render(
    <Appi a="10" b="20" />,
    document.getElementById('root')
  );
  


// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
