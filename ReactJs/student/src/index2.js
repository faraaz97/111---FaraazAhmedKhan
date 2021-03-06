import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

//Create a react component which is performing addition, take values as props.

function Calculator(props){
    let result =parseInt(props.a)+parseInt(props.b);
    let result1 =parseInt(props.a)-parseInt(props.b);
    let result2 =parseInt(props.a)*parseInt(props.b);
    let result3 =parseInt(props.a)/parseInt(props.b);
    return <h1>Calculation of {props.a} and {props.b}  add = {result} sub ={result1} mul = {result2} div = {result3}</h1>
  }
  
  ReactDOM.render(
   
      <Calculator a="10" b="20" />,
   
    document.getElementById('root')
  );
 
  // Actual requirement

  function Calc(props)
{
  let a = parseInt(props.a);
  let b= parseInt(props.b);
  var operator={

    "+":function (a,b){return a+b},
    "-":function (a,b){return a-b},
    "*":function (a,b){return a*b},
    "/":function (a,b){return a/b},

  };
  
  return <>
  <h1>Addition of {a} and {b} is {operator[props.add](a,b)}</h1>
  <h1>Subtraction of {a} and {b} is {operator[props.sub](a,b)}</h1>
  <h1>Multiplication of {a} and {b} is {operator[props.mul](a,b)}</h1>
  <h1>Division of {a} and {b} is {operator[props.div](a,b)}</h1>
  </>

  
}
ReactDOM.render(
    
      <Calc a="10" b="20" add="+" sub="-" mul="*" div="/" />
     ,
    document.getElementById('root')
  );
